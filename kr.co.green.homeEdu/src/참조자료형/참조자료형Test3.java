package 참조자료형;

public class 참조자료형Test3 {
	public int getRightmostDigit(String str) {

        // TODO: Write your code here
         // 문자열이 비어있는 경우 -1 반환
        if (str.isEmpty()) {
            return -1;
        }

        // 문자열을 오른쪽부터 왼쪽으로 순회
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            // 현재 문자가 숫자인 경우
            if (Character.isDigit(ch)) {
                // 숫자를 정수로 변환하여 반환
                return Character.getNumericValue(ch);
            }
        }

        // 숫자를 찾지 못한 경우 -1 반환
        return -1;
        
    }
}
/*
	문제:
	코딩 예제: 문자열의 가장 오른쪽에 있는 숫자 구하기
여러분의 과제는 StringMagic클래스 안에서 getRightmostDigit메서드를 완성하는 것입니다. 이 메서드는 문자열을 인수로 받고 문자열의 가장 오른쪽에 있는 숫자를 리턴해야 합니다.

지침

getRightmostDigit메서드는 문자열 str을 인수로 받습니다. 이 문자열에는 숫자, 글자, 특수문자 등 모든 문자가 담길 수 있습니다.

여러분의 과제는 문자열을 오른쪽부터 왼쪽으로 반복하여 각 문자를 검사하여 그것이 숫자인지 확인하는 것입니다.

숫자를 만나면 즉시 그것을 정수로서 리턴해야 합니다. 숫자는 문자열에서 문자로 표현되어 있으므로 그것을 리턴하기 전에 정수로 변환해야 한다는 점에 주의하시기 바랍니다.

문자열에 있는 모든 문자를 검사했지만 숫자를 찾지 못했다면 -1을 리턴해야 합니다.

엣지 케이스: 문자열이 비어 있는 경우에도 -1을 리턴해야 합니다.

Java의 Character클래스에 있는 유용한 메서드를 몇 개 소개해 드립니다.

Character.isDigit(c): 이 메서드는 문자 c를 인수로 받아서 만일 c가 숫자(0~9)이면 true를 리턴하고 그렇지 않으면 false를 리턴합니다.

Character.getNumericValue(c): 이 메서드는 문자 c를 인수로 받고 만일 그것이 숫자이면 c의 숫자 값을 리턴합니다. 만일 c가 숫자가 아니면 이 메서드는 숫자가 아닌 값을 리턴합니다(우리는 숫자에만 관심이 있으므로 그 값은 이 문제에서 무시할 수 있습니다).

예시

다음은 이 문제를 설명하기 위한 몇 가지 예입니다.

만일 입력 문자열이 "I bought 5 apples, 4 bananas, and 3 oranges"라면 메서드는 3을 리턴해야 합니다. 왜냐면 3은 문자열의 맨 오른쪽에 있는 숫자이기 때문입니다.

만일 입력 문자열이 "There are no numbers in this string"이라면 메서드는 -1을 리턴해야 합니다. 왜냐면 문자열에 숫자가 없기 때문입니다.
	
*/