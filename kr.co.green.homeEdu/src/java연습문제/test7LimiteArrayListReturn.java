package java연습문제;

import java.util.ArrayList;
import java.util.List;

public class test7LimiteArrayListReturn {
	public List<Integer> determineMultiples(int number, int limit) {

        List<Integer> multiples = new ArrayList<>();
        // TODO: Write your code here
        if (number <= 0 || limit <= 0) {
            return multiples;
        }

        // number의 배수를 limit 미만으로 찾기
        for (int i = number; i < limit; i += number) {
            multiples.add(i);
        }

        return multiples;
    }

}

/*문제
 * 코딩 예제: 지정된 한계 안에서 주어진 숫자의 배수들이 담긴 ArrayList 리턴하기
여러분에게는 일부 완성된 NumberMagic 클래스가 제공되어 있습니다.

그 클래스에는 지정된 한계 안에서 주어진 숫자의 배수들로 된 리스트를 리턴하는 determineMultiples(int number, int limit) 메서드가 포함되어 있습니다.

여러분의 과제는 그 메서드의 구현을 완료하는 것입니다.

메서드의 시그니처는 다음과 같습니다.

public List<Integer> determineMultiples(int number, int limit)
입력

메서드는 정수 인수 2개를 받습니다.

number : 배수를 구할 숫자

limit : 배수의 상방 한계

출력

메서드는 limit 미만에서 주어진 number의 모든 배수가 포함된 List<Integer>를 리턴해야 합니다.

만일 number또는 limit가 0보다 작거나 같다면 메서드는 빈 리스트를 리턴해야 합니다.



예시

예 1

number를 3으로, limit를 20으로 넣습니다. 리턴된 리스트는 [3, 6, 9, 12, 15, 18]이어야 합니다.

예 2

number를 5로, limit를 1로 넣습니다. 메서드는 빈 리스트 []를 리턴해야 합니다.

 */


/*코드 설명

1.determineMultiples(int number, int limit) 메서드는 두 개의 정수 인수 number와 limit을 받아서, limit 미만의 number의 모든 배수를 찾아 List<Integer> 형태로 반환.
2.먼저 number 또는 limit가 0 이하인 경우 빈 리스트를 반환.
3.for 루프를 사용하여 number부터 시작하여 limit 미만까지 number를 더해가며 반복. 이때 i는 number의 배수.
4.각 배수를 multiples 리스트에 추.
5.반복이 끝난 후, 완성된 multiples 리스트를 반환.
예시 실행

예시 1: number = 3, limit = 20

multiples = [3, 6, 9, 12, 15, 18]
메서드는 [3, 6, 9, 12, 15, 18]을 반환.

예시 2: number = 5, limit = 1

multiples = []
메서드는 빈 리스트 []을 반환합니다.
이렇게 구현된 NumberMagic 클래스는 주어진 숫자의 배수를 지정된 한계 내에서 찾아 List<Integer> 형태로 반환하는 기능을 제공.

추가로, 이 문제는 배수 찾기 문제의 기본적인 예시이며, 이를 응용하여 더 복잡한 문제를 해결할 수 있습니다. 예를 들어, 특정 범위 내에서 배수의 개수 구하기, 배수의 합 구하기 등의 문제를 해결

*/


/*답
 * 이제 해답 코드를 한 단계씩 나눠서 살펴보겠습니다.

그럼 함수 호출 determineMultiples(3, 20)을 예로 들어 여기 포함된 단계들을 이해해 볼까요?

1단계: 엣지 케이스 검사하기

if (number <= 0 || limit <= 0) {
    return new ArrayList<>();
}
메서드는 먼저 주어진 number 또는 limit가 0보다 작거나 같은지 검사합니다. 만일 그렇다면 우리는 양수가 아닌 숫자의 배수나 양수가 아닌 한계보다 작은 배수를 찾을 수 없기 때문에 함수는 즉시 비어 있는 리스트를 리턴합니다. 예에서 number = 3이고 limit = 20이므로 이 단계에서 우리는 리턴하지 않습니다.

2단계: 배수 리스트 초기화하기

List<Integer> multiples = new ArrayList<>();
메서드는 number의 배수들을 저장하기 위해, 비어 있는 ArrayList multiples를 초기화합니다.

3단계: 배수를 찾아 리스트에 추가하기

for (int i = 1; i * number < limit; i++) {
    multiples.add(i * number);
}
이어서 메서드는 1에서 시작하여i * number가 limit보다 작은 한 계속되는 반복문에 진입합니다. 반복할 때마다 배수 i * number가 리스트 multiples에 추가됩니다.

우리의 예(number = 3 및 limit = 20)에서 이 반복문이 어떻게 진행되는지 볼까요?

첫 번째 반복(i=1): 1 * 3은 3과 같고, 20보다 작으므로 3이 리스트에 추가되고 multiples은 [3]이 됩니다.

두 번째 반복(i=2): 2 * 3은 6과 같고 20보다 작으므로 6이 리스트에 추가되고 multiples은 [3, 6]이 됩니다.

이러한 과정이 7번째 반복, 즉 7 * 3이 21과 같을 때까지 반복되고, 21은 20보다 작지 않기 때문에 반복이 중단됩니다.

4단계: 배수 리스트 리턴하기

return multiples;
마지막으로 메서드는 multiples리스트를 리턴합니다. 우리 예에서는 [3, 6, 9, 12, 15, 18]입니다.

요약하자면 메서드 determineMultiples는 엣지 케이스를 검사하고 비어 있는 리스트를 초기화한 다음 1 부터 limit/number까지 반복하여 number의 배수 중 limit보다 작은 배수를 구합니다. 각각의 배수를 리스트에 추가하고 마지막으로 배수 리스트를 리턴합니다.

전체 해답 코드:
 
public class NumberMagic {

    public List<Integer> determineMultiples(int number, int limit) {
 
        if (number <= 0 || limit <= 0) {
            return new ArrayList<>();
        }
 
        List<Integer> multiples = new ArrayList<>();
 

        for (int i = 1; i * number < limit; i++) {
            multiples.add(i * number);
        }
 
        return multiples;
    }
}
*/
