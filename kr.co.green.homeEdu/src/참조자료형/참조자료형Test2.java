package 참조자료형;

public class 참조자료형Test2 {
	public boolean hasConsecutiveDuplicates(String str) {
		// 문자열 길이 확인
		if (str.length() <= 1) {
			return false;
		}

		// 연속된 동일한 문자 확인
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return true;
			}
		}

		return false;
	}
}

/*
코딩 예제: 문자열에 2개의 연속된 동일한 문자가 있는지 검사하기
여러분의 과제는 StringMagic클래스 안에서 hasConsecutiveDuplicates메서드를 완성하는 것입니다. 이 메서드는 주어진 문자열에 2개의 연속된 동일한 문자가 있는지 검사해야 합니다.

이 메서드의 시그니처는 다음과 같습니다.

public boolean hasConsecutiveDuplicates(String str);
여기에서

str은 길이가 n인 문자열입니다(0 ≤ n ≤ 1000). 이 문자열에는 프린트 가능한 ASCII 문자가 포함되어 있을 수 있습니다.

이 메서드는 문자열에 2개의 연속된 동일한 문자가 있는 경우에는 true를, 그렇지 않은 경우에는 false를 리턴해야 합니다.

예시

다음은 hasConsecutiveDuplicates 메서드의 동작을 보여주는 몇 가지 예입니다.

가령 문자열 “Hello”가 있다면 문자 ‘l’이 2개 연속 있으므로 여러분의 메서드는 true를 리턴해야 합니다.

가령 문자열 “World”가 있다면 2개의 연속된 동일한 문자가 없으므로 여러분의 메서드는 false를 리턴해야 합니다.

가령 비어 있는 문자열 ""가 있다면, 여러분의 메서드는 false를 리턴해야 합니다.

가령 단일 문자 "H"로 된 문자열이 있다면 여러분의 메서드는 false를 리턴해야 합니다.

다수의 동일한 문자가 있는 문자열 "HHH"가 있다면 연속된 문자 ‘H’가 여럿 있으므로 여러분의 메서드는 true를 리턴해야 합니다.
*/