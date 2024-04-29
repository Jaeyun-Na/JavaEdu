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
}
