package a20_�÷���;

import java.util.HashMap;
import java.util.Map;

public class TestController {
	public static void main(String[] args) {
		int flag = 1;
		
		if(flag == 1) {
			System.out.println("���� ���� �޼��� ����");
			Message<String> msg = new Message<String>();
			msg.setCode(200);
			msg.setData("�����Ͽ����ϴ�.");
			System.out.println(msg);
		}else {
			System.out.println("���� ���� �޼��� ����");
			Message<Map<Integer, String>> msg = new Message<Map<Integer, String>>();
			Map<Integer, String> error = new HashMap<Integer, String>();
			error.put(3, "������ �����ϴ�.");
			msg.setCode(400);
			msg.setData(error);
			System.out.println(msg);
		}
	}
}
