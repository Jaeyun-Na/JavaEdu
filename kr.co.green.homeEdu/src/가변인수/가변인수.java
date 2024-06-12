package 가변인수;

public class 가변인수 {

	/*
	 * jshell
	 * 
	 * int sum(int 1,int j){ return i+j; }
	 * 
	 * sum(1,2) => 3
	 * 
	 * sum(1,2,3) => 에러 발생 sum은 변수를 2개 까지만 갖을수 있음 3개의 변수를 갖기 위해서는 새로운 메소드를 만들어야함
	 * 
	 * int sum (int i, int j, int k){ return i + j + k; }
	 * 
	 * 새로운 메소드를 생성하지 않고 변수의 갯수를 다르게 할수 있다?? --> 가변 인수
	 * 
	 * 일반 적으로 void print(int i) -> 으로 생성하지만, 다양한 숫자를 argument하고 싶은 경우 void
	 * print(int... values)로 작성
	 * 
	 * void print(int... values){ System.out.println(Arrays.toString(values)); } 위와
	 * 같이 작성 후 values의 값을 다르게 적으면, 각각의 다른 값을 갖는 배열을 생성함
	 * 
	 * int sum(int... values){ ...> int sum = 0; ...> for(int value:values){ ...>
	 * sum += value; ...> } ...> return sum; ...> }
	 * 
	 * jshell> sum(1,2,3) $6 ==> 6
	 * 
	 * jshell> sum(1,1) $7 ==> 2
	 * 
	 * jshell> sum(1,22,33,444,55) $8 ==> 555
	 * 
	 * void print (int... value, String name){ } --> 생성 되지 않은 가변 인수는 마지막에 위치해야함
	 * 
	 * jshell> Person[] person = new Person[5]; person ==> Person[5] { null, null,
	 * null, null, null }
	 * 
	 * jshell> person[1] = new Person(); $4 ==> Person@6a41eaa2
	 * 
	 * jshell> person person ==> Person[5] { null, Person@6a41eaa2, null, null, null
	 * }
	 * 
	 * ========================================================================================
	 * 240612
	 * 
	 * 배열 만들기
	 * jshell> int[] mark = {12,34,45} 
	 * mark ==> int[3] { 12, 34, 45 } 
	 * 
	 * 배열에 자리 추가
	 * jshell> int[] newMarks = new int[mark.length+1]
	 * newMarks ==> int[4] { 0, 0, 0, 0 }
	 *
	 * 배열에 자리 삭제
	 * jshell> int[] newMarksWithOneDeleted = new int[mark.length-1]
	 * newMarksWithOneDeleted ==> int[2] { 0, 0 }
	 * 
	 * 기존의 배열을 만들었다면 자리를 추가하거나, 삭제 하는 방법은 없음.
	 * 기존 배열을 베이스로 새로운 배열을 만들어야함.
	 * 
	 * 
	 * 
	 */
}
