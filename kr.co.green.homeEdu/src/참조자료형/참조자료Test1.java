package 참조자료형;

public class 참조자료Test1 {
	public int countUppercaseLetters(String str) {
		참조자료Test1 stringMagic = new 참조자료Test1();
		int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
		
		if (str.length() == 0) {
	            return 0;
	        }

	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            // 각 문자가 대문자인지 확인
	            if (Character.isUpperCase(str.charAt(i))) {
	                count++;
	            }
	        }

	        return count;
	    }
}

/*
코딩 예제: 문자열의 대문자 개수 세기
여러분의 과제는 countUppercaseLetters라는 이름의 Java 메서드를 완성하는 것입니다. 이 메서드는 문자열을 입력값으로 받아서 그 문자열에 있는 대문자의 개수를 리턴합니다. 이 메서드는 StringMagic클래스의 일부분입니다.



잊지 말고 다음과 같은 엣지 케이스를 고려하시기 바랍니다.

문자열이 비어 있을 경우, 메서드는 0을 리턴해야 합니다.

문자열에 대문자가 없을 경우에도 메서드는 0을 리턴해야 합니다.



다음은 여러분에게 제공된 시작 코드입니다.

public class StringMagic {
    
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
    }
}


문제 풀이에 도움이 되는 메서드 소개

String 클래스의 charAt(int index) 메서드를 사용하면 특정한 인덱스에 있는 문자를 받을 수 있습니다.

Character 클래스의 정적 메서드인 isUpperCase(char ch)를 사용하면 어떤 문자가 대문자인지 검사할 수 있습니다.

예시

이 예에서 문자열 "Hello WORLd"에는 대문자가 5개 있습니다("H", "W", "O", "R", "L"). 그러므로 countUppercaseLetter 메서드는 5를 리턴합니다.



StringMagic stringMagic = new StringMagic();
int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
System.out.println(uppercaseLetters); // This will print 5
*/