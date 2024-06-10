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
	 * 
	 * 
	 * 
	 */
}
