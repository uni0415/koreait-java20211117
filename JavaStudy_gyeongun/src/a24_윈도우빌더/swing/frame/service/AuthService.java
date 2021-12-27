package a24_���������.swing.frame.service;

import a24_���������.swing.frame.domain.user.User;
import a24_���������.swing.frame.domain.user.UserDao;
import a24_���������.swing.frame.domain.user.UserDaoImpl;
import a24_���������.swing.frame.swing.dto.SigninDto;

public class AuthService {
	private UserDao userDao;
	
	public AuthService() {
		userDao = new UserDaoImpl();
	}
	
	public int signin(SigninDto signinDto) {
		User userEntity = signinDto.toEntity();
		return userDao.signinByUsernameAndPassword(userEntity);
	}
}
