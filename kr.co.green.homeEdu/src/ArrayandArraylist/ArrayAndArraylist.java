package ArrayandArraylist;

public class ArrayAndArraylist {
	public static void main(String[] args) {
		
//		Student student = new Student(name, list of Marks);
//
//		int number = student.getNumberOfMarks();
//		int sum = student.getNumberOfMarks();
//		int maximumMark = student.getNumberOfMarks();
//		int minimumMark = student.getNumberOfMarks();
//		BigDecimal average = student.getNumberOfMarks();
//		student.addNewMark(35);
//		student.removeMarkAtIndex(5);
		
		
/*
		jshell
		
		���� mark�� ���� �������־� ���ε��� ����

		int mark;
		mark1 = 100;
		int  mark2 = 75
		int  mark3 = 60
		int sum = mark1+mark2+mark3;
		int  mark4 = 56
		
		sum = mark1+mark2+mark3+mark4;
		
		�迭 marks�� ������ ���� ����
		
		int[] marks = {75, 60, 56}
		-> int[3] {75, 60, 56}
		int sum = 0
		for(int mark:marks){
			sum = sum + mark;
		}
		sum
		-> 191
		
		240521
		-jshell-
		int[�迭 ���� ���� �� ��ġ] �̸� = {�迭 ��(��)/������}
		
		int[] mark = {1,2,3}
		->	int[3] {1,2,3}
		int[] marks2 = {1,2,3,4,5}
		->	int[5]{1,2,3,4,5}
		int[]marks2 = {1}
		->	int[1]{1}
		int[] marks2 = {}
		->	int[0] { }
		
		�迭 ���� �����
		int[] mark = {1,2,3}
		�迭 ���� ����
		int [] marks3 = new int[5];
		-> int[5] {0,0,0,0,0}
		
		marks3[0] = 10
		-> marks3�� 0�� �ڸ��� 10�� ���� �ְڴ�.
		
		marks3[0] = 1
		marks3[1] = 2
		marks3[2] = 3
		marks3[3] = 4
		marks3[4] = 5
		
		marks3
		->	int[5]{1,2,3,4,5}
		
		marks2.length ->�Ӽ� �޼ҵ尡 �ƴ�, �迭������ �Ӽ������� ���
		
		����: 8���� ���� ���� �迭�� ����, ��� ���� ��Ÿ����
		
		Ǯ�� - int[] marks = {1,2,3,4,5,6,7,8}
			  for(int i = 0; i < marks.length; i++){
			  	System.out.plintln(marks[i]);
			  }
		- marks.length : marks�� ����, ���� �����ִ� ����
		
		240522
		�迭 �ʱ�ȭ
		
		int[] marks = new int[5]
		marks -> int[5] {0,0,0,0,0}
		
		double[] values = new double[5]
		valies -> double[5] {0.0,0.0,0.0,0.0,0.0}
		
		boolean[] test new boolean[5]
		test -> boolean[5] {false,false,false,false,false}
		
		class Person{
			}
		Person[] persons = new Person[5]
		persons -> Person[5] {null,null,null,null,null}
		
		int[5] marks;
			���� �߻� : �迭�� ���� �Ҷ�, �����ϴ� ��(������ ����)���� ����� ������ �ü� ����
		
		int[] marks = new int[];
			���� �߻� : �迭�� �Ը� �˼� ���� ����. �ݵ��� �迭�� ����� ���������
		
		int[] marks = new int[5];
		marks -> int[5] {0,0,0,0,0}
		
		int[] marks = {1,2,3,4.0};
			���� �߻� : Ÿ�Կ� �´� �迭���� �Է� ����(int ����Ÿ���̱� ������ 4.0 �Ұ�)
		
		int[] marks = {1,2,3,4,5};
		marks -> int[5] {1,2,3,4,5}
		
		system.out.println(marks);
		 ���� ��ΰ� ��Ÿ��
		system.out.println(Arrats.toStrong(marks));
		 [1,2,3,4,5]
		
*/		
	}
}
