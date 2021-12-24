package a22_�����ͺ��̽�.view;

import java.util.Scanner;

import a22_�����ͺ��̽�.dto.SigninDto;
import a22_�����ͺ��̽�.dto.SignupDto;
import a22_�����ͺ��̽�.service.AuthService;

public class Input {
	private Scanner scanner;
	private AuthService authService;
	
	public Input() {
		scanner = new Scanner(System.in);
		authService = new AuthService();
	}
	public String cmdInput() {
		System.out.print("����� �Է��ϼ���: ");
		return scanner.nextLine();
	}
	public void cmdErrorMessage() {
		System.out.println("�߸��� ����Դϴ�.");
		System.out.println();
	}
	
	public String checkUsername() {
		String username = null;
		while(true) {
			username = input();
			int result = authService.checkUsername(username);
			if(result == 0) {
				break;
			}else {
				System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
			}
		}
		return username;
	}
	
	public boolean isEmpty(String data) {
		if(data.equals("") || data == null) {
			return true;
		}else {
			return false;
		}
	}
	public String input() {
		String data = null;
		while(true) {
			data = scanner.nextLine();
			if(!isEmpty(data)) {
				break;
			}
			System.out.println("�� ���� �Է��� �� �����ϴ�.");
		}
		return data;
	}
	
	public SignupDto signupInsert() {
		System.out.println("���̵�: ");
		String username = checkUsername();
		
		System.out.println("��й�ȣ: ");
		String password = input();
		System.out.println("�̸�: ");
		String name = input();
		System.out.println("�̸���: ");
		String email = input();
		
		SignupDto signupDto = new SignupDto(username, password, name, email);
		return signupDto;
	}
	
	public SigninDto signinInsert() {
		System.out.print("���̵�: ");
		String username = input();
		System.out.println("��й�ȣ: ");
		String password = input();
		
		
		SigninDto signinDto = new SigninDto(username, password);
		return signinDto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
