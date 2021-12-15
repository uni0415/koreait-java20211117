package a20_�÷���;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserArrayList {

	private Scanner in;
	private List<User> users;

	public UserArrayList() {
		in = new Scanner(System.in);
		users = new ArrayList<User>();
	}

	public User deleteUserByUsername(String username) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(username)) {
				return users.remove(i);
			}
		}
		return null;
	}

	public void deleteUserAll() {
		users.clear();
	}

	public User getUserByUsername(String username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	public void getUserAll() {
		System.out.println(users);
	}
	
	public void updatePassword(User user) {
		System.out.print("�����Ͻ� ��й�ȣ�� �Է��� �ּ���: ");
		user.setPassword(in.nextLine());
		System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.\n");
	}
	
	public void updateName(User user) {
		System.out.println("�����Ͻ� �̸��� �Է��� �ּ���: ");
		user.setName(in.nextLine());
		System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void updateEmail(User user) {
		System.out.println("�����Ͻ� �̸����� �Է��� �ּ���: ");
		user.setEmail(in.nextLine());
		System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void updateUserDtl(User user) {
		while(true) {
			System.out.println("["+ user.getName() + " ����� ���� ����]");
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("b. �ڷΰ���");
			System.out.print("����� ������ �ּ���: ");
			String select = in.nextLine();
			
			if(select.equals("1")) {
				updatePassword(user);
			}else if(select.equals("2")) {
				updateName(user);
			}else if(select.equals("3")) {
				updateEmail(user);
			}else if(select.equals("b")) {
				break;
			}else {
				System.out.println("����� �� ���� ����Դϴ�.\n");
			}
		}
	}

	public void updateUser() {
		System.out.println("[����� ����]");
		System.out.println("������ ������� ���̵� �Է��� �ּ���: ");
		String username = in.nextLine();
		updateUserDtl(getUserByUsername(username));
	}
	
	public void deleteUser() {
		while (true) {
			System.out.println("[����� ����]");
			System.out.println("1. ���̵�� ����");
			System.out.println("2. ��ü����");
			System.out.println("b. �ڷΰ���");
			System.out.print("����� ������ �ּ���: ");
			String select = in.nextLine();

			if (select.equals("1")) {
				System.out.println("[���̵�� ����� ���� ����]");
				System.out.print("�����Ͻ� ����� ���̵� �Է��� �ּ���: ");
				String username = in.nextLine();
				User user = deleteUserByUsername(username);
				if (user == null) {
					System.out.println("�ش� ���̵� ����ϴ� ����ڸ� ã�� �� �����ϴ�.");
				} else {
					System.out.println(user);
					System.out.println("����ڸ� �����Ͽ����ϴ�.");
				}
			} else if (select.equals("2")) {
				deleteUserAll();
			} else if (select.equals("b")) {
				break;
			} else {
				System.out.println("[ ����� �Է��� �Ϸ�Ǿ����ϴ�. ]\n");
			}
		}

	}

	public void selectUser() {
		while (true) {
			System.out.println("[����� ��ȸ]");
			System.out.println("1. ���̵�� ã��");
			System.out.println("2. ��ü��ȸ");
			System.out.println("b. �ڷΰ���");
			System.out.print("����� ������ �ּ���: ");
			String select = in.nextLine();

			if (select.equals("1")) {
				System.out.println("[���̵�� ����� ���� ��ȸ]");
				System.out.print("ã���� ����� ���̵� �Է��� �ּ���: ");
				String username = in.nextLine();
				User user = getUserByUsername(username);
				if (user == null) {
					System.out.println("�ش� ���̵� ����ϴ� ����ڸ� ã�� �� �����ϴ�.");
				} else {
					System.out.println(user);
				}
			} else if (select.equals("2")) {
				getUserAll();
			} else if (select.equals("b")) {
				break;
			} else {
				System.out.println("[ ����� �Է��� �Ϸ�Ǿ����ϴ�. ]\n");
			}
		}
	}

	public User insertUser() {
		User user = new User();
		System.out.println("[����� �߰�]");

		System.out.println("���̵�: ");
		user.setUsername(in.nextLine());
		System.out.println("��й�ȣ: ");
		user.setPassword(in.nextLine());
		System.out.println("�̸�: ");
		user.setName(in.nextLine());
		System.out.println("�̸���: ");
		user.setEmail(in.nextLine());

		System.out.println("[ ����� �Է��� �Ϸ�Ǿ����ϴ�. ]\n");
		return user;
	}

	public void displayController() {
		while (true) {
			System.out.println("1. ����� �Է�");
			System.out.println("2. �����  ��ȸ");
			System.out.println("3. ����� ����");
			System.out.println("4. ����� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� ������ �ּ���: ");
			String cmd = in.nextLine();

			if (cmd.equals("1")) {
				users.add(insertUser());
			} else if (cmd.equals("2")) {
				selectUser();
			} else if (cmd.equals("3")) {
				deleteUser();
			} else if(cmd.equals("4")) {
				updateUser();
			} else if (cmd.equals("q")) {
				System.out.println("���α׷� ������...\n");
				break;
			} else {
				System.out.println("����� �� ���� ����Դϴ�.\n");
			}
		}
	}

	public static void main(String[] args) {
		UserArrayList ual = new UserArrayList();

		ual.displayController();

		System.out.println("���α׷� ����.");

	}

}
