package a13_���;

public class Animal {
	private String ����;
	private String �̸�;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String ����, String �̸�) {
		
		this.���� = ����;
		this.�̸� = �̸�;
	}
	
	public void move() {
		System.out.println(�̸� + "(" + ���� + ")��(��) �����Դϴ�.");
		System.out.println();
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	
}
