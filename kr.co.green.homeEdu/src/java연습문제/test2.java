package java연습문제;

/*
 * 코딩 예제: 두 번째로 큰 요소 찾기
이번 프로그래밍 챌린지에서는 ArrayMagic 클래스 안의 findSecondLargestElement(int[] array)라는 미완성된 Java 메서드가 제공되어 있습니다.

이 메서드는 정수 배열을 받아서 그 배열에서 두 번째로 큰 요소를 리턴합니다.

배열에 있는 고유한 요소가 2개보다 적으면 메서드는 -1을 리턴해야 합니다.

예를 들어 만일 모든 요소가 같거나 배열에 요소가 1개만 있어서 두 번째로 큰 요소가 없으면 메서드는 -1을 리턴해야 합니다.

지침

먼저 findSecondLargestElement(int[] array) 메서드의 기존 구조를 이해합니다. 이 메서드는 정수 배열을 인수로서 받고 리턴 타입이 정수인 것을 알 수 있습니다.

배열에서 두 번째로 큰 숫자를 구하는 논리를 구현해야 합니다. 만일 두 번째로 큰 숫자가 없다면 -1을 리턴합니다(예를 들어 모든 요소가 같거나 배열에 있는 요소가 2개 미만인 경우).

구분되는 요소가 2개 이상 있다면 여러분은 두 번째로 큰 요소를 찾아야 합니다. 그렇게 하려면 배열을 반복하고 각각의 요소를 현재의 가장 큰 요소 및 두 번째로 큰 요소와 비교합니다. 잊지 말고 그 2개의 추적 변수를 적절히 초기화하십시오.

마지막으로 두 번째로 큰 요소를 리턴하거나 두 번째로 큰 요소가 없다면 -1을 리턴합니다.

다음과 같은 엣지 케이스를 고려하십시오.

예를 들어, 배열의 모든 요소가 같다면 어떻게 될까요?

배열에 요소가 2개 미만이라면 어떻게 될까요?

예시

예 1:

입력: [5, 7, 9, 2, 4, 9]

출력: 7

예 2:

입력: [1, 1, 1, 1]

출력: -1

예 3:

입력: [7]

출력: -1

팁: 코딩은 문제를 관리 가능한 부분들로 나누는 과정입니다. 침착하게 계속 하세요!

고려할 사항

여러분은 해답을 구현할 때 다음의 상황들을 고려해야 합니다.

배열에는 중복된 요소들이 있을 수 있습니다.

배열은 양수 또는 음수 또는 0이 포함될 수 있습니다.

배열에 고유한 요소가 2개 미만이면 “두 번째로 큰” 요소가 없습니다. 그 경우에 여러분의 메서드는 -1을 리턴해야 합니다.


 */
public class test2 {
	// 나의 답
//	public int findSecondLargestElement(int[] array) {
//        //TODO: Write your code here
//        if (array.length < 2) {
//        return -1;
//        }
//        int first = array[0];
//        int second = Integer.MIN_VALUE;
//        for(int i = 1; i<array.length; i++) {
//        	if(first < array[i]) {
//        		second = first;
//        		first = array[i];
//        	}else if(array[i] != first && second < array[i]){
//        		second = array[i];
//        	}
//        }
//        if(second == Integer.MIN_VALUE) {
//        	return -1;
//        }
//        
//		return second;
//        
//        
//    }
	// 정답
	public int findSecondLargestElement(int[] array) {
		 
        if (array.length < 2) {
            return -1;  // Return -1 if the array has less than 2 elements.
        }
 
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
 
        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest && element != largest) {
                secondLargest = element;
            }
        }
 
        // If there is no second largest element (all elements in the array are the same), return -1
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
 
        return secondLargest;
    }
}
//차이점 
/*
 * 2번 코드는 for-each 반복문을 사용하여 배열을 순회하지만, 2번 코드는 일반적인 for 반복문을 사용합니다. 2번 코드는
 * largest와 secondLargest 변수를 사용하여 최대값과 두 번째 최대값을 추적하지만, 1번 코드는 first와 second
 * 변수를 사용합니다. 1번 코드는 첫 번째 요소를 first에 저장하고, 이후 요소를 비교하여 first와 second를 업데이트합니다.
 * 장단점:
 * 
 * 2번 코드는 더 일반적인 접근 방식을 사용하며, 배열의 모든 요소를 한 번씩 확인합니다. 이는 배열의 크기가 크더라도 안정적으로
 * 동작합니다. 1번 코드는 첫 번째 요소를 first에 저장하고, 이후 요소를 비교하여 first와 second를 업데이트합니다. 이는 첫
 * 번째 요소가 가장 큰 경우 효율적으로 동작할 수 있습니다. 1번 코드는 코드가 더 간결하고 가독성이 좋습니다. 더 나은 코드: 두 코드
 * 모두 정확하게 동작하지만, 1번 코드가 더 일반적이고 안정적인 접근 방식을 사용하므로 더 나은 코드라고 볼 수 있습니다. 하지만 특정
 * 상황에서는 1번 코드의 접근 방식이 더 효율적일 수 있습니다.
 * 
 * 결론적으로, 2번 코드가 더 나은 코드이지만, 상황에 따라 1번 코드도 적절할 수 있습니다. 코드의 가독성, 효율성, 안정성 등을 고려하여
 * 상황에 맞는 코드를 선택하는 것이 중요합니다.
 */