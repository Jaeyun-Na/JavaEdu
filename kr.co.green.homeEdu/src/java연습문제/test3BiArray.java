package java연습문제;

import java.util.Arrays;

/*
코딩 예제: 배열들의 합이 동등한지 검사하기
BiArray 클래스 안에 2개의 정수 배열이 제공되어 있습니다.

여러분의 과제는 그 두 배열들의 합계를 비교하여 같은지 판정하는 메서드를 작성하는 것입니다.

여러분은 또한 배열의 요소들의 합을 계산하는 메서드도 작성해야 합니다.

지침

BiArray클래스 안에서 다음 메서드들을 완성하십시오.

calculateSum(int[] array): 이 메서드는 제공된 배열에 있는 요소들의 합을 계산하여 리턴해야 합니다. for-each 반복문을 사용하여 배열의 모든 요소를 반복하고 그것들을 변수 sum에 추가하십시오. 반복이 완료되면 sum을 리턴합니다.

areSumsEqual(): 이 메서드는 array1의 합과 array2의 합을 비교하여 그것들이 같으면 true를 리턴하고 그렇지 않으면 false를 리턴합니다. calculateSum(int[] array) 메서드를 사용하여 array1의 합과 array2의 합을 구하십시오.

예시

예 1:

가령 array1이 [1, 2]이고 array2가 [4, -2, 1]라고 해봅니다. sum1은 3이고 sum2도 3입니다. 메서드는 true를 리턴해야 합니다.

예 2:

가령 array1이 [5, 10, 15]이고 array2가 [1, 9, 20]이라고 해봅니다. sum1은 30이고 sum2도 30입니다. 메서드는 true를 리턴해야 합니다.

예 3:

가령 array1이[-1, -1, -1]이고 array2가 [-2, 1]라고 해봅니다. sum1은 -3이고 sum2는 -1입니다. 메서드는 false를 리턴해야 합니다.


 */
// 답 sum만 구하고 equal의 활용을 못함.... 틀림
public class test3BiArray {

	private int[] array1;
	private int[] array2;

	public test3BiArray(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);
		// TODO: Write the code to compare the sums of the arrays and return the result.
		
		return sum1 == sum2;

	}

	private int calculateSum(int[] array) {
		// TODO: Write the code to calculate the sum of the array.

		int sum = 0;

		for (int num : array) {
			sum += num;
		}

		return sum;

	}
}

/* 해설
 *1단계: 변수 선언하기

public class BiArray {
 
private int[] array1;
private int[] array2;
여기서 우리는 2개의 정수 배열 array1과 array2를 선언합니다. 우리가 앞으로 비교할 배열들입니다.

2단계: 생성자 정의하기

public BiArray(int[] array1, int[] array2) {
    this.array1 = array1;
    this.array2 = array2;
}
BiArray클래스의 생성자는 2개의 정수 배열을 인수로서 받습니다. 이 생성자는 입력되는 배열을 인스턴스 변수 array1과 array2에 할당합니다.

3단계: 헬퍼 메서드 정의하기

private int calculateSum(int[] array) {
    int sum = 0;
    for (int num : array) {
        sum += num;
    }
    return sum;
}
calculateSum메서드는 정수 배열을 인수로서 받습니다. 이 메서드는 배열 안의 모든 숫자를 반복하여 각각을 변수 sum에 추가합니다. 그러고 나서 그 sum을 리턴합니다.

4단계: calculateSum 메서드 정의하기

public boolean areSumsEqual() {
    int sum1 = calculateSum(array1);
    int sum2 = calculateSum(array2);
    return sum1 == sum2;
}
areSumsEqual 메서드는 array1과 array2에 대하여 calculateSum 메서드를 호출하고 결과를 각각 sum1과 sum2에 저장합니다. 이어서 sum1과 sum2가 동등한지 검사합니다. 만약 동등하다면 true를 리턴하고, 그렇지 않다면 false를 리턴합니다.

전체 해답 코드:

public class BiArray {
 
    // These are the two arrays that we will be comparing
    private int[] array1;
    private int[] array2;
 
    // This constructor initializes the two arrays
    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
 
    // This method checks if the sums of the two arrays are equal
    public boolean areSumsEqual() {
 
        // First, we calculate the sum of each array
        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
 
        // Then, we check if the sums are equal
        return sum1 == sum2;
    }
 
    // This private helper method calculates the sum of an array
    private int calculateSum(int[] array) {
 
        int sum = 0; // Initialize sum to 0
 
        // For each number in the array, add it to the sum
        for (int num : array) {
            sum += num;
        }
 
        // Return the total sum
        return sum;
    }
}
 *
 */
