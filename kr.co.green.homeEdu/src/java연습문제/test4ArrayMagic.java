package java연습문제;

/*
 * 여러분에게 ArrayMagic 클래스 안의 미완성된 Java 메서드인 isSorted()가 제공됩니다.

그 메서드는 정수 배열을 입력값으로 받고 만일 배열이 오름차순으로 정렬되어 있다면 true를 리턴하고 그렇지 않다면 false를 리턴할 것입니다.

그 메서드는 다음과 같은 엣지 케이스를 처리해야 합니다.

배열이 비어 있거나 요소가 하나만 있다면 그런 배열들은 정렬된 것으로 간주되므로 메서드는 true를 리턴해야 합니다.

배열에 음수와 0이 포함될 수 있습니다.

배열에 중복된 요소들이 포함될 수 있습니다.

예시

배열 [1, 2, 3, 4, 5]를 예로 들어 살펴볼까요? 이 배열을 우리의 isSorted() 메서드에 제공하면 배열이 오름차순으로 정렬되어 있으므로 true를 리턴해야 합니다.

이제 요소가 [5, 4, 3, 2, 1]인 배열을 생각해 보겠습니다. 이 배열의 요소들은 내림차순입니다. 그러므로 만일 우리가 이 배열을 우리의 isSorted() 메서드에 제공하면 false를 리턴해야 합니다.


 */

public class test4ArrayMagic {

	/**
	 * This method checks if the input array is sorted in ascending order.
	 * 
	 * @param array the array to check
	 * @return true if the array is sorted, false otherwise
	 */
	public boolean isSorted(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}

		return true;
		// TODO: Write code here
	}
}

/*
 * 해답 코드(설명 포함) 
 * 
 * 1단계: 엣지 케이스 처리하기
 * 
 * 배열이 정렬되어 있는지에 대한 검사를 시작하기에 앞서 우리는 몇 가지 엣지 케이스를 처리해야 합니다.
 * 배열의 길이가 1보다 작거나 같은 경우가 있습니다. 
 * 순서를 벗어난 요소들의 개수가 적으므로 그러한 경우에는 배열이 정렬되어 있는 것으로 간주합니다.
 * 다음과 같이 그러한 사례들을 처리합니다.
 * 
 * if (array.length <= 1) { 
 * 		return true; 
 * 		} 
 * 
 * 2단계: 배열 반복하기
 * 
 * 해답의 주요한 부분은 배열을 반복하고 각각의 요소와 그 이전 요소를 비교하는 부분입니다. 
 * 두 번째 요소(인덱스 1)부터 시작해서 배열의 끝까지 가는 for 반복문을 사용하면 됩니다.
 * 
 * for (int i = 1; i < array.length; i++) {
 *  // ... 
 *  } 
 *  
 *  3단계: 각각의 요소를 이전 요소와 비교하기
 * 
 * for 반복문 안에서 우리는 각각의 요소를 그 이전 요소와 비교합니다. 
 * 만일 현재의 요소가 이전 요소보다 작다면 그 배열은 오름차순으로 정렬된 게 아닙니다. 
 * 그러한 경우에 우리는 즉시 false를 리턴합니다.
 * 
 * if (array[i] < array[i - 1]) {
 * 	 return false; 
 * } 
 * 
 * 4단계: 순서를 벗어난 요소가 없다면 true 리턴하기
 * 
 * 우리가 false를 리턴하지 않고 for 반복문을 마치면 그건 순서를 벗어난 요소가 없다는 의미입니다. 
 * 그러므로 그 배열은 오름차순으로 정렬되어 있고, 우리는 true를 리턴합니다.
 * 
 * return true; 전체 해답
 * 
 * 위의 모든 부분을 모으면 다음과 같은 전체 해답이 나옵니다.
 * 
 * public class ArrayMagic {
 * 
 * public boolean isSorted(int[] array) {
 * 
 * 	if (array.length <= 1) { 
 * 		return true; 
 * 		}
 * 
 * 	for (int i = 1; i < array.length; i++) { 
 * 			if (array[i] < array[i - 1]) {
 * 			return false; 
 * 		}
 * 	 }
 * 			return true; 
 * 		} 
 * 	}
 *
 */
