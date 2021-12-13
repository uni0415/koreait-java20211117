package a18_lombok;

public class LombokTest {
	public static void main(String[] args) {
		User user = new User();
		User user2 = new User("ruddns","1234","±è°æ¿î","rudd1242@naver.com");
		
		user.setUsername("ruddns12");
		
		user.equals(user2);
		System.out.println(user.hashCode());
		System.out.println(user.getUsername());
		System.out.println(user);
		System.out.println(user2);
		
		
	}
}
