package kr.co.na.edu;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX_NUM = 100;	//선언과 동시에 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0;				//사용하기 전에 초기화. 초기화 하지않으면 오류 발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;				//오류 발생. 상수는 값을 변경할수 없다.
	}

}
