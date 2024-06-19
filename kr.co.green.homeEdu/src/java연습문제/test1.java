package java연습문제;

public class test1 {

	/*
	 * 코딩 예제: 더 큰 요소가 있는지 검사하기 이번 예제에서 여러분은 ArrayMagic 클래스에서
	 * doesHaveElementGreaterThan() 메서드를 구현해야 합니다.
	 * 
	 * 이 메서드는 정수 배열과 숫자를 입력값으로 받고 만일 주어진 숫자보다 큰 요소가 배열 안에 있으면 true를 리턴합니다.
	 * 
	 * 그런 요소가 없으면 false를 리턴할 것입니다.
	 * 
	 * 여러분이 구현해야 할 메서드의 시그니처는 다음과 같습니다.
	 * 
	 * public boolean doesHaveElementGreaterThan(int[] array, int number) 지침
	 * 
	 * 여러분의 과제는 주어진 배열을 반복하고 각각의 요소가 주어진 숫자보다 큰지 검사하는 것입니다.
	 * 
	 * 주어진 숫자보다 큰 요소를 찾으면 여러분은 즉시 true를 리턴해야 합니다.
	 * 
	 * 배열 전체를 반복했지만 주어진 숫자보다 큰 요소를 찾지 못했으면 false를 리턴해야 합니다.
	 * 
	 * 입력된 배열이 비어 있으면 여러분의 메서드는 false를 리턴해야 합니다.
	 * 
	 * Java에 관한 참고사항
	 * 
	 * Java에서는 for-each 반복문을 사용하여 배열 또는 컬렉션 요소들을 반복합니다. for-each 반복문의 장점은 버그가 발생할
	 * 가능성이 사라지고 코드의 가독성이 높아진다는 점입니다. 다음은 일반적인 형태의 for-each 반복문입니다.
	 * 
	 * for (type var : array) { // code block to be executed } 예시
	 * 
	 * 그럼 이 메서드가 어떻게 작동하는지 알아보기 위해 예를 살펴볼까요?
	 * 
	 * 예1:
	 * 
	 * int[] array = {1, 2, 3, 4, 5}; int number = 3; 여기서 여러분의 메서드는 true를 리턴해야 합니다.
	 * 
	 * 예2:
	 * 
	 * int[] array = {1, 2, 3}; int number = 4; 이 경우에 여러분의 메서드는 false를 리턴해야 합니다.
	 */

	public boolean doesHaveElementGreaterThan(int[] array, int number) {
		// TODO: Write your code

// 오답
//		int[] array1 = { 1, 2, 3, 4, 5 };
//		int number1 = 3;
//		boolean hasElementGreaterThan = false;
//		
//		for (int num : array1) {
//			if (num < number1) {
//				hasElementGreaterThan = true;
//	            break;
//			}
//		}
//		return hasElementGreaterThan;
		
// 요구하는 답 [ 배열을 직접 적어서 배교하는 값을 원하는 것이 아닌 배열이 비어있는지, 보든 요소를 고려하여 코드를 원함,,,이해 부족...]		
		// 배열이 비어있는 경우 false 반환
	    if (array.length == 0) {
	        return false;
	    }

	    // for-each 반복문을 사용하여 배열 요소 확인
	    for (int num : array) {
	        if (num > number) {
	            return true; // 주어진 숫자보다 큰 요소 발견 시 true 반환
	        }
	    }

	    return false; // 주어진 숫자보다 큰 요소 없음
	}

}
