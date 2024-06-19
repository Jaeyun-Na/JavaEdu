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
		
		각각 mark의 값을 지정해주어 따로따로 저장

		int mark;
		mark1 = 100;
		int  mark2 = 75
		int  mark3 = 60
		int sum = mark1+mark2+mark3;
		int  mark4 = 56
		
		sum = mark1+mark2+mark3+mark4;
		
		배열 marks에 각각의 수를 저장
		
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
		int[배열 값의 갯수 및 위치] 이름 = {배열 값(들)/컨텐츠}
		
		int[] mark = {1,2,3}
		->	int[3] {1,2,3}
		int[] marks2 = {1,2,3,4,5}
		->	int[5]{1,2,3,4,5}
		int[]marks2 = {1}
		->	int[1]{1}
		int[] marks2 = {}
		->	int[0] { }
		
		배열 선언 쉬운것
		int[] mark = {1,2,3}
		배열 선언 정석
		int [] marks3 = new int[5];
		-> int[5] {0,0,0,0,0}
		
		marks3[0] = 10
		-> marks3의 0번 자리에 10의 값을 주겠다.
		
		marks3[0] = 1
		marks3[1] = 2
		marks3[2] = 3
		marks3[3] = 4
		marks3[4] = 5
		
		marks3
		->	int[5]{1,2,3,4,5}
		
		marks2.length ->속성 메소드가 아님, 배열에서만 속성으로 취급
		
		문제: 8개의 값을 갖는 배열을 생성, 모든 값을 나타내기
		
		풀이 - int[] marks = {1,2,3,4,5,6,7,8}
			  for(int i = 0; i < marks.length; i++){
			  	System.out.plintln(marks[i]);
			  }
		- marks.length : marks에 길이, 값을 갖고있는 수량
		
		240522
		배열 초기화
		
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
			에러 발생 : 배열을 선언 할떼, 선언하는 쪽(구문의 왼쪽)에는 요소의 갯구가 올수 없다
		
		int[] marks = new int[];
			에러 발생 : 배열의 규모를 알수 없기 떄문. 반듯이 배열의 사이즈를 정해줘야함
		
		int[] marks = new int[5];
		marks -> int[5] {0,0,0,0,0}
		
		int[] marks = {1,2,3,4.0};
			에러 발생 : 타입에 맞는 배열값만 입력 가능(int 정수타입이기 떄문에 4.0 불가)
		
		int[] marks = {1,2,3,4,5};
		marks -> int[5] {1,2,3,4,5}
		
		for(int number:numbers){
			system.out.println(marks);
		} 에러 발생 --> 저장 경로가 나타람
		
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
		
		향상괸 for loop문
		배열의 콘텐츠 여러개를 한번에 바꾸기
		배열을 정열하고 비교하기
		
		
		int[] marks = {100,99,95,96,100}
		marks -> int[5] {100,99,95,96,100}
		
		1번
		for(int marks:marks){
			System.out.println(mark);
			}
		output 	->  100
					99
					95
					96
					100
		2번
		for(int i=0; i<marks.length; i++){
			System.out.println(marks[i]);
			}
		output 	->  100
					99
					95
					96
					100
		1번과 2번 모두 배열의 콘텐츠를 구하는 매서드
		
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
		
		*Array.sort() 란?
		*배열의 컨텐츠를 정렬하는 메서드임
		*따로 comparator를 지정하지 않는 다면 기본적으로 오름차순으로 정렬된다
		*(단, comparator를 사용하려면 객체형 데이터타입으로 선언해야한다)
		
		문제
		Student student = new Student(name. list of marks);
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		
		풀이
		@introduction-to-array-and-arraylist 프로젝트
		
*/		
	}
}
