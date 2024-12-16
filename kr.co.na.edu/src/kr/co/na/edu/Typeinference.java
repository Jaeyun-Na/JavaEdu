package kr.co.na.edu;

public class Typeinference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var i = 10;
		var j = 10.0;
		var str = "Hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;	//str 변수는 string형으로 먼저 사용 되었기 때문에 정수 값을 넣을수 없음.(오류 확인 후 주석처리)
		
	}

}
