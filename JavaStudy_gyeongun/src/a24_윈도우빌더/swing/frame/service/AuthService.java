package a24_孺紫辦網渦.swing.frame.service;

import a24_孺紫辦網渦.swing.frame.domain.user.User;
import a24_孺紫辦網渦.swing.frame.domain.user.UserDao;
import a24_孺紫辦網渦.swing.frame.domain.user.UserDaoImpl;
import a24_孺紫辦網渦.swing.frame.swing.dto.SigninDto;

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
