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
		
		marks2.length ->�Ӽ� �޼ҵ尡 �ƴ�, �迭������ �Ӽ����� ���
		
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
		
		for(int number:numbers){
			system.out.println(marks);
		} ���� �߻� --> ���� ��ΰ� ��Ÿ��
		
		for(int number:numbers){
		system.out.println(Arrats.toStrong(marks));
		}
		output - [1,2,3,4,5]
		
		int[] numbers = {1,2,3,4,5};
		
		for(int number:numbers){
			System.outprint(number);
		}
		output - 12345
		
		
		240523
		
		��� for loop��
		�迭�� ������ �������� �ѹ��� �ٲٱ�
		�迭�� �����ϰ� ���ϱ�
		
		
		int[] marks = {100,99,95,96,100}
		marks -> int[5] {100,99,95,96,100}
		
		1��
		for(int marks:marks){
			System.out.println(mark);
			}
		output 	->  100
					99
					95
					96
					100
		2��
		for(int i=0; i<marks.length; i++){
			System.out.println(marks[i]);
			}
		output 	->  100
					99
					95
					96
					100
		1���� 2�� ��� �迭�� �������� ���ϴ� �ż���
		
		int[] array1 = {1,2,3}
		array1 -> int[3]{1,2,3}
		
		int[] array2 = {1,2,3}
		array2 -> int[3]{1,2,3}
		
		Arrays.equals(array1,array2)
		-> true
		
		int[] array3 = {3,2,3}
		array3 -> int[3]{3,2,3}
		
		Arrays.euals(array1,array3)
		
		-> fales
		
		Array.sort(array3)
		array3
		output -> array3 -> int[3] {2,3,3}
		
		*Array.sort() ��?
		*�迭�� �������� �����ϴ� �޼�����
		*���� comparator�� �������� �ʴ� �ٸ� �⺻������ ������������ ���ĵȴ�
		*(��, comparator�� ����Ϸ��� ��ü�� ������Ÿ������ �����ؾ��Ѵ�)
		
		����
		Student student = new Student(name. list of marks);
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		
		Ǯ��
		@introduction-to-array-and-arraylist ������Ʈ
		
*/		
	}
}
