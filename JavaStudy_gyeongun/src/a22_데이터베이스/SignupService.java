package a22_�����ͺ��̽�;

public class SignupService {
	private Input input;
	private UserDao userDao;
	
	public SignupService() {
		input = new Input();
		userDao = new UserDaoImpl();
	}
	
	
	public boolean signup() {
		SignupDto signupDto = input.signupInsert();
		User userEntity = signupDto.toEntity();
		int result = userDao.insertUser(userEntity);
		if(result == 1) {
			return true;
		}else {
			return false;
		}
	}
}
