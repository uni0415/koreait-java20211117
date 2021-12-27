package a22_�����ͺ��̽�.service;

import a22_�����ͺ��̽�.domain.user.User;
import a22_�����ͺ��̽�.domain.user.UserDao;
import a22_�����ͺ��̽�.domain.user.UserDaoImpl;
import a22_�����ͺ��̽�.dto.SigninDto;
import a22_�����ͺ��̽�.dto.SignupDto;
import a22_�����ͺ��̽�.session.Principal;
import a22_�����ͺ��̽�.view.Input;

public class AuthService {
	private Input input;
	private UserDao userDao;
	private Principal principal;
	
	public AuthService() {
		input = new Input();
		userDao = new UserDaoImpl();
		principal = Principal.getInstance();
	}
	
	
	public boolean signup() {
		SignupDto signupDto = input.signupInsert(this);
		User userEntity = signupDto.toEntity();
		int result = userDao.insertUser(userEntity);
		if(result == 1) {
			return true;
		}else {
			return false;
		}
	}
	public int signin() {
		SigninDto signinDto = input.signinInsert();
		User userEntity = signinDto.toEntity();
		int result = userDao.signinByUsernameAndPassword(userEntity);
		if(result == 2) {
			userEntity = userDao.getUserByUsername(signinDto.getUsername());
			principal.setLoginUser(userEntity);
		}
		return result;
	}
	public void logout() {
		principal.setLoginUser(null);
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		System.out.println();
	}
	
	public int checkUsername(String username) {
		return userDao.checkUsernameByUsername(username);
	}
}
