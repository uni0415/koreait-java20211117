package a17_���ڿ�;

/**
 * 
 * subString(startIndex, endIndex) �޼ҵ�
 * startIndex���� endIndex������ ���ڿ��� �߶��ִ� �޼ҵ��̴�.
 * 
 * indexOf(���ڿ�) �޼ҵ�
 * �ش� ���ڿ��� index ��ġ�� ã���ش�.
 *
 */

public class SubString {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���. �ݰ����ϴ�.";
		System.out.println(str.substring(0, 6));
		
		String data = "# �ȳ��ϼ���. �ݰ����ϴ�.";
		int index = data.indexOf(" ");
		String cmd = data.substring(0, data.indexOf(" "));
		data = data.substring(index + 1);
		System.out.println("cmd: " + cmd);
		System.out.println("data: " + data);
		
		index = data.indexOf(" ");
		cmd = data.substring(0, data.indexOf(" "));
		data = data.substring(index + 1);
		System.out.println("cmd: " + cmd);
		System.out.println("data: " + data);
		
		
		String number = "123456789";
		String result = number.substring(0, number.length());
		System.out.println(result);
		
		
		for(int i=0; i<number.length();i++) {
			result = number.substring(i,i+1);
			System.out.println(result);
		}
		
		int size = number.length();
		for(int i = 0; i< size; i++) {
			result = number.substring(0,1);
			number = number.substring(1);
			System.out.println(result);
		}
		
		
	}
}
