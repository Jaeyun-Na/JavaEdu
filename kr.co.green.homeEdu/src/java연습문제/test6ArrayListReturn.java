package java연습문제;

import java.util.ArrayList;
import java.util.List;

public class test6ArrayListReturn {

	/**
	 * This method returns all factors of a given number in an ArrayList.
	 * 
	 * @param number the number to find factors of
	 * @return a List of factors of the number
	 */
	public List<Integer> determineAllFactors(int number) {

		// TODO: Write your code here
		if (number <= 0) {
			return new ArrayList<>();
		}

		List<Integer> factors = new ArrayList<>();

		// Start from 1 and iterate up to the given number.
		// Check if the number is divisible by the current iterator value (i.e., if it's
		// a factor).
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				// If it is, add it to the factors list.
				factors.add(i);
			}
		}

		return factors;
	}

}
/*
*1단계: 메서드 시그니처

public List<Integer> determineAllFactors(int number)
이 메서드는 정수를 인수로 받고 정수 리스트를 리턴합니다.

2단계: 엣지 케이스 검사하기

기본 논리로 들어가기 전에 우리는 입력된 숫자가 0보다 작거나 같은 엣지 케이스를 처리합니다.

if (number <= 0) {
    return new ArrayList<>();
}
인수분해는 일반적으로 양의 정수에만 정의되므로 여기서 우리는 빈 리스트를 리턴하고 있습니다.

3단계: 빈 리스트 만들기

우리는 약수를 저장할 리스트가 필요할 것입니다. 비어 있는 정수 리스트를 만듭니다.

List<Integer> factors = new ArrayList<>();
4단계: 약수가 될 수 있는 숫자 반복하기

기본 논리는 1부터 입력된 숫자까지 반복하는 논리입니다. 이 범위 안의 모든 정수는 그 숫자의 약수가 될 수 있습니다.

for (int i = 1; i <= number; i++) {
5단계: 숫자가 약수인지 검사하기

반복문 안에서 우리는 나머지 연산자 %를 사용하여 숫자가 현재의 이터레이터 값으로 나누어 떨어지는지 검사합니다. 만일 number % i가 0과 같으면 i는 그 숫자의 약수입니다.

if (number % i == 0) {
6단계: 약수를 리스트에 추가하기

현재의 숫자가 약수라면 우리는 그 숫자를 약수 리스트에 추가합니다.

factors.add(i);
7단계: 약수 리스트 리턴하기

반복이 완료되면 factors리스트에는 입력된 숫자의 모든 약수가 담겨 있을 것입니다. 우리는 그 리스트를 리턴합니다.

return factors;
그러면 끝입니다! 이제 이 메서드를 사용하여 어떠한 양의 정수 입력값에 대해서도 약수 리스트를 얻을 수 있습니다.
*
*/
