package a08_นÝบน;

public class Loop {
	public static void main(String[] args) {
		
		int result=0;
		int num=1;
		while(true) {
			result+=num++;
			if(num==101) break;
		}
		System.out.println(result);
	}
}
