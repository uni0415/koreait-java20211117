package a21_static;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
	private int serialNum;
	private String model;
	
	public void carInfo() {
		System.out.println("���� �ø��� ��ȣ: " + serialNum);
		System.out.println("���� ��: " + model);
	}
}
