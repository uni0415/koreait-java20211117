package a13_���;

public class ExtendsTest2 {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human("����");
		animals[1] = new Tiger("ȣ����");
		animals[2] = new Eagle("������");
		int i=0;
		for(Animal animal : animals) {
			
			if(i==0) {
				i++;
				continue;
			}
			
			System.out.println("�̸�: " + animal.get�̸�());
			System.out.println("����: " + animal.get����()); 
		if(animal instanceof Human) {
			Human h = (Human)animal;
			System.out.println("����: "+h.get����());
		}else if(animal instanceof Tiger) {
			Tiger t = (Tiger)animal;
			System.out.println("��ɴɷ�: "+ t.get��ɴɷ�());
			
		}else if(animal instanceof Eagle) {
			Eagle e = (Eagle)animal;
			System.out.println("��������: "+ e.get��������());
		}
			
		}
		
		
	}
}
