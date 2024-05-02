package 참조자료형;

public class WrapperClass {
//jshell에서 실행
	int i = 5;
	
	Integer integer = new Integer(5);
//	integer => 5
	Integer integer1 = new Integer(5);
//	 integer1 => 5
	Integer integer = Integer.valueOf(5);
//	integer => 5
	Integer integer1 = Integer.valueOf(5);
//	integer1 => 5
	Integer integer = new Integer("5234");
//	integer =>5234
	
	Integer i1 = new Integer(5);
//	i1 => 5
	Integer i2 = new Integer(5);
//	i2 => 5
	Integer i3 = Integer.valueOf(5)
//	i3 => 5
	Integer i4 = Integer.valueOf(5)
//	i4 => 5	
	
	i1 == i2
//	false	
	i3 == i4
//	true
	
//	AutoBoxing
	Integer seven = Integer.valueOf(7);
//	seven =>7
	Integer seven = 7;
//	seven => 7
	Integer sevenAgain = 7
//	sevenAgain => 7
	seven == sevenAgain;
//	true
	Integer.MAX_VALUE;
// 	2147483647(해당 클라스가 가지는 정수 최대값)
	Integer.MIN_VALUE;
//	-2147483647(해당 클라스가 가지는 정수 최소값)	
	Integer.SIZE
//	32
	Integer.BYTE
//	4
	
// LocalDate , LocalDateTime, LocalTime (기존에 없던 자바의 기능 이 3가지 클래스로 인해 날짜와 시간 다루기가 쉬워짐)
	
	LocalDate now = LocalDate.now();	//jshell에서 실행했을때는 바로 나오지 않음(LocalDate를 import 시켜줘야함)
	
//	import java.time.*(java Time에 관련한 모든 값을 가져온/jshell에서 할떄 import해줘야함)
/*	jshell에서 실습
	now.getYear() 연도
	now.getDayOf() 관련 메소드 알려줌
	getDayOfMounth(월)	getDayOfWeek(요일)	getDayOfYear(올해 1년중 몇번쨰 날인지)
	
	Wrapper: Boolean, Byte, Character, Double, Float, Integer, Long, Short
	Primitive: boolean, byte, char, double, float, int, long, short
	
	Wrapper Class란?
		기본 자료형을 참조형 자료형처럼 사용하기 위한 클래스.
		이름에서도 알 수 있듯, wrapper 클래스는 감싸는 클래스이다.
		그럼 무엇을 감싸는가? 에 대한 답은 기본 자료형이다.
		즉, 기본 자료형의 값을 감싸 객체형태로 만든 것이 바로 wrapper 클래스이다.
		wrapper 클래스의 경우 string 과 같이 불변성을 갖고 있다. 따라서 wrapper 클래스 안에 객체의 값은 변경 불가능하다.
	
*/	
}
