package a15_�������̽�;

public class RemoteControlTest {

	public static void main(String[] args) {
		LGRemoteControl lgRemoteControl = new LGRemoteControl();
		
		lgRemoteControl.powerButtonController();
		lgRemoteControl.volumeButtonController(1);
		lgRemoteControl.volumeButtonController(2);
		lgRemoteControl.powerButtonController();
	}

}
