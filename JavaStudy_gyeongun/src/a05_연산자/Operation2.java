package a05_������;

public class Operation2 {
	public static void main(String[] args) {
		/**
		 * <�� ������> �� �Ǵ� ���� boolean
		 * AND����(&&)	=	��
		 * OR����(||)	=	��
		 * NOT����(!)	=	����
		 * 
		 * true(1)
		 * false(0)
		 * 
		 * -AND-
		 * true && false => false
		 * true && true => true
		 * false && false => false
		 * 
		 * -OR-
		 * true || false =>true
		 * true || true => true
		 * false || false => false
		 * 
		 * !true => false
		 * !false => true
		 * 
		 * !(true && true) => false
		 * !(false || false) => true
		 */
		System.out.println(!(true && true));
		
		/**
		 * ����(����)������
		 * boolean trueAndFalse = ���� ? ���(��) : ���(����);
		 */
		
		
		boolean trueAndFalse = (10 < 20) ? true : false;
		String grade = (59 < 60) ? "F���" : "F�� �ƴմϴ�.";
		System.out.println(trueAndFalse);
		System.out.println(grade);
		System.out.println("\"�ȳ�\"");
	}
}

















