package a22_�����ͺ��̽�;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	private LocalDateTime reate_date;
	private LocalDateTime update_date;
	
}
