package a19_제네릭;

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
		Message<?> m = new Message<String>(200, "전송성공");
		System.out.println(m);
		
		Message<?> m2 = new Message<Error>(400, new Error(3, "경로에 접근 할 권한이 없습니다."));
		System.out.println(m2);
		
		ErrorMessage<? extends Error> em = new ErrorMessage<WebError>(400, new WebError("웹주소 오류"));
		System.out.println(em);
		
		
		
	}
}
