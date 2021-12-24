package a22_�����ͺ��̽�;

import a22_�����ͺ��̽�.service.AuthService;
import a22_�����ͺ��̽�.session.Principal;
import a22_�����ͺ��̽�.view.Display;
import a22_�����ͺ��̽�.view.Input;

public class Controller {
	private Display display;
	private Input input;
	private AuthService authService;
	private Principal principal;
	
	public Controller() {
		display = new Display();
		input = new Input();
		authService = new AuthService();
		principal = Principal.getInstance();
	}
	
	public boolean mainMenu() {
		boolean returnFlag = false;
		String cmd = null;
		
		display.mainDisplay();
		cmd = input.cmdInput();
		
		if(cmd.equals("1")) {
			display.signupDisplay();
			display.signupMessage(authService.signup());
			
		}else if(cmd.equals("2")) {
			if(principal.getLoginUser() != null) {
				authService.logout();
			}else {
				display.signinDisplay();
				display.signinMessage(authService.signin());
			}
		}else if(cmd.equals("q")) {
			System.out.println("���α׷� ������...");
			returnFlag =true;
		}else {
			input.cmdErrorMessage();
		}
		return returnFlag;
	}
	

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		while(true) {
			if(controller.mainMenu()) {
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
