package �����ڷ���;

public class WrapperClass {
//jshell���� ����
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
// 	2147483647(�ش� Ŭ�󽺰� ������ ���� �ִ밪)
	Integer.MIN_VALUE;
//	-2147483647(�ش� Ŭ�󽺰� ������ ���� �ּҰ�)	
	Integer.SIZE
//	32
	Integer.BYTE
//	4
}
