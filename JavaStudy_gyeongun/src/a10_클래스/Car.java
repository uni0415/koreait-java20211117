package a10_Ŭ����;

public class Car {
	// ���۷��� ����(���� ����)
	private String company; // ������
	private String model;   // ���� ��
	private String color;	// ���� ����
	private int year;		// ����
	
	// getter(�����ö�) && setter(���� ����) 
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void carInfo() {
		System.out.println(company + ", "+ model + ", "+ color + ", "+ year);
	}
}
