package a22_�����ͺ��̽�.domain.user;

public interface UserDao {
	public int insertUser(User user);
	public int checkUsernameByUsername(String username);
	public int signinByUsernameAndPassword(User user);
	public User getUserByUsername(String username);
	
}
