package a20_�÷���;

import lombok.Data;


@Data
public class Message<T> {
	private int code;
	private T data;
}
