package a20_�÷���;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor	//��ü ������
@AllArgsConstructor	//�⺻ ������
@Data	//getter, setter, toString, Equals, HashCode

public class User {
	private String username;
	private String password;
	private String name;
	private String email;

	
}
