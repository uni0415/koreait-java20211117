package a14_�߻�;

/**
 * 
 * �������̵�(@Override)
 * �����Ǹ� �ϱ� ����.
 * @ -> ������̼�
 *
 */
class Human extends Animal{
	@Override 
	public void move() {
		System.out.println("����� �����Դϴ�.");
	}
}

class Tiger extends Animal{
	@Override 
	public void move() {
		System.out.println("ȣ���̰� �����Դϴ�.");
	}
}


public class AbstractTest {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[2];
		animals[0] = new Human();
		animals[1] = new Tiger();
		
		for(Animal animal : animals) {
			animal.move();
		}
	}
}
