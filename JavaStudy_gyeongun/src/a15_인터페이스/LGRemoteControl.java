package a15_�������̽�;

public class LGRemoteControl {
	private Button powerButton = new PowerButton();
	private Button volumeUpButton = new VolumeUp();
	private Button volumeDownButton = new VolumeDown();
	
	private boolean powerStatus = false;
	
	public LGRemoteControl() {
		
	}
	
	public void powerButtonController() {
		powerButton.����();
		if(powerStatus == false) {
			System.out.println("������ �մϴ�.");
			powerStatus = true;
		}else {
			System.out.println("������ ���ϴ�.");
			powerStatus = false;
		}
	}
	
	public void volumeButtonController(int flag) {
		if(flag == 1) {
			//������
			volumeUpButton.����();
		}else if(flag == 2){
			//�����ٿ�
			volumeDownButton.����();
		}else {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
	}
}
