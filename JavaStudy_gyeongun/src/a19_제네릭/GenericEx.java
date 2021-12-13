package a19_���׸�;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Error{
	private int errorNumber;
	private String msg;
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class WebError extends Error{
	private String msgDtl;
	
}

@NoArgsConstructor
@AllArgsConstructor
@Data

class ErrorMessage<T extends Error>{
	private int code;
	private T msg;
}

@NoArgsConstructor
@AllArgsConstructor
@Data

class Message<T>{
	private int code;
	private T msg;
}

public class GenericEx {
	public static void main(String[] args) {
		Message<?> m = new Message<String>(200, "���ۼ���");
		System.out.println(m);
		
		Message<?> m2 = new Message<Error>(400, new Error(3, "��ο� ���� �� ������ �����ϴ�."));
		System.out.println(m2);
		
		ErrorMessage<? extends Error> em = new ErrorMessage<WebError>(400, new WebError("���ּ� ����"));
		System.out.println(em);
		
		
		
	}
}
