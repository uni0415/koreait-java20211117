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
		while(true) {
			System.out.println("1. ����� �Է�");
			System.out.println("2. �����  ��ȸ");
			System.out.println("3. ����� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� ������ �ּ���: ");
			String cmd = in.nextLine();
			
			if(cmd.equals("1")) {
				users.add(insertUser());
			}else if(cmd.equals("2")) {
				System.out.println(users + "\n");
				
			}else if(cmd.equals("3")) {
				
			}else if(cmd.equals("q")) {
				System.out.println("���α׷� ������...\n");
				break;
			}else {
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
