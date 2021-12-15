package a20_�÷���;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, User> userMap = new HashMap<String, User>();
		userMap.put("junil1", new User("junil1","1234","������1","skjil1218@gmail.com"));
		userMap.put("junil2", new User("junil2","1234","������2","skjil1218@gmail.com"));
		userMap.put("junil3", new User("junil3","1234","������3","skjil1218@gmail.com"));
		userMap.put("junil4", new User("junil4","1234","������4","skjil1218@gmail.com"));
		userMap.put("junil5", new User("junil5","1234","������5","skjil1218@gmail.com"));
		userMap.put("junil1", new User("junil2","4321","������2","skjil1218@gmail.com"));
		
		userMap.replace("junil5", new User("junil4","1234","������4","skjil1218@gmail.com"));
		
		String username = "junil2";
		
		Set<String> keySet = userMap.keySet();
		System.out.println(keySet);
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {
			User user = userMap.get(ir.next());
			
			if(user.getUsername().equals(username)) {
				System.out.println(user);
			}
		}
		
		System.out.println(userMap);
	}
}

