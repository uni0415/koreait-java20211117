package a22_�����ͺ��̽�.dto;

import a22_�����ͺ��̽�.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupDto {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
	}
}
