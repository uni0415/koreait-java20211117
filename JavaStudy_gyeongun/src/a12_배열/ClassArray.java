package a12_�迭;

public class ClassArray {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		for(int i=0; i<students.length; i++) {
			students[i] = new Student("������" + i, i);
		}
		
		for(Student student : students) {
			System.out.println("�л��̸�: "+student.getName());
			System.out.println("�л��г�: "+student.getYear());
		}
		
		for(int i=0; i<students.length; i++) {
			System.out.println("�л��̸�: "+students[i].getName()
					);
			System.out.println("�л��г�: "+students[i].getYear());
		}
	}
}
