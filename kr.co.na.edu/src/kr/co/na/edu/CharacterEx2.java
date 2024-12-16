package kr.co.na.edu;

public class CharacterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//한글 유니코드, 16진수 사용, 16진수 숫자 하나가 4비트를 사용함으로 한글 '한'글자를 표현하는 데 4비트 4개, 2바이트를 사용.
		
		char ch1 = '한';
		char ch2 = '\uD55c';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66;	//문자형 변수에 음수를 넣으면 오류 발생(확인 후 주석처리함)
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
	}

}
