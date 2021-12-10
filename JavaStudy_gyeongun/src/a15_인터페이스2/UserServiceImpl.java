package a15_�������̽�2;

import java.util.Scanner;

public class UserServiceImpl implements UserService{
	private User[] users;
	private Scanner in;
	
	public UserServiceImpl(int userCount) {
		in = new Scanner(System.in);
		users = new User[userCount];
	}
	
	@Override
	public void createUser() {
		boolean loopFlag = true;
		
		while(loopFlag) {
			System.out.print("���̵�: ");
			String id = in.nextLine();
			System.out.print("��й�ȣ: ");
			String password = in.nextLine();
			System.out.print("�̸�: ");
			String name = in.nextLine();
			System.out.print("�̸���: ");
			String email = in.nextLine();
			
			do {
				System.out.print("��� ������ ����Ͻðڽ��ϱ�?(y/n)");
				String continueFlag = in.nextLine();
				if(continueFlag.equals("n") || continueFlag.equals("N")) {
					loopFlag = false;
					break;
				}else if(continueFlag.equals("y") || continueFlag.equals("Y")) {
					loopFlag = true;
					break;
				}else {
					System.out.println("�߸��� ����Դϴ�.");
				}
			}while(true);
			
			User user = new User();
			user.setId(id);
			user.setPassword(password);
			user.setName(name);
			user.setEmail(email);
			
			insertUser(user);
			
		}
		
	}

	@Override
	public void insertUser(User user) {
		int index = 0;
		
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				index = i;
				break;
			}
		}
		users[index] = user;
	}
	
	@Override
	public User getUser(String id) {
		for(int i = 0; i< users.length; i++) {
			if(users[i] == null || !users[i].getId().equals(id)) {
				continue;
			}
			return users[i];
		}
		
		return null;
	}

	@Override
	public void printUsers() {
		for(User user : users) {
			if(user == null) {
				continue;
			}
			System.out.println(user);
		}
	}

	@Override
	public void searchUser() {
		System.out.println("����� ���� �˻�");
		System.out.print("ã�����ϴ� ���̵� �Է�: ");
		String searchId = in.nextLine();
		
		User user = getUser(searchId);
		
		if(user == null) {
			System.out.println("�ش� ���̵��� ����ڸ� ã�� �� �����ϴ�.");
		}else {
			System.out.println("ã�� ����� ����");
			System.out.println(user);
		}
		
	}

	
	
}
