package a15_�������̽�2;

public class UserController {

	public static void main(String[] args) {
		int userCount = 10;
		UserService userService = new UserServiceImpl(userCount);
		userService.createUser();
		
		System.out.println("��ü ���� ���� ��� -> ");
		userService.printUsers();
		
		userService.searchUser();
		
	}
}






