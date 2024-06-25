package java연습문제;

/*
 * 코딩 예제: 배열 역순으로 바꾸기
이번 과제에서 여러분의 목표는 Java 클래스 ArrayMagic안의 reverseArray(int[] array) 메서드를 완성하는 것입니다.

이 메서드는 정수로 된 배열을 받고, 입력된 배열이 담겨 있으나 순서가 역순인 배열을 리턴해야 합니다.

지침

여러분의 과제는 reverseArray메서드를 구현하는 것입니다. 그러려면 다음을 해야 합니다.

포인터 2개를 정의합니다. 이름을 각각 start와 end라고 합니다. start포인터는 배열의 첫 번째 요소를 지시해야 하고 end포인터는 마지막 요소를 지시해야 합니다.

역순으로 된 요소들을 저장하기 위해 새로운 배열을 만듭니다. 그 배열을 reversedArray라고 할 수 있습니다.

양쪽 끝(start및 end)에서 시작하여 중간으로 이동하면서 입력된 배열을 반복합니다.

입력된 배열의 end인덱스에서 요소를 reversedArray의 start인덱스에 복사해 넣습니다.

입력된 배열의 start 인덱스에서 요소를 복사하여 reversedArray의 end인덱스에 넣습니다.

배열의 끝을 향해start포인터를 한 단계 이동합니다.

배열의 시작을 향해 end포인터를 한 단계 이동합니다.

입력된 배열의 모든 요소가 처리되면 reversedArray에는 입력된 배열의 요소들이 역순으로 담겨 있을 것입니다. 이때 메서드는 reversedArray를 리턴해야 합니다.

엣지 케이스

reversedArray 메서드는 몇 가지 엣지 케이스를 처리할 수 있어야 합니다.

입력된 배열이 비어 있으면(즉 배열의 길이가 0이면) 메서드는 빈 배열을 리턴해야 합니다.

입력된 배열에 요소가 하나뿐이면 메서드는 다시 그 배열을 리턴해야 합니다.

예시

그럼 몇 가지 예를 통해 reversedArray메서드가 어떻게 작동해야 하는지 보여 드리겠습니다.

예 1:
입력: [1, 2, 3, 4]
출력: [4, 3, 2, 1]
설명: 입력된 배열에 4개의 요소가 있습니다. 역순 배열에는 그 요소들이 역순으로 담겨 있어야 합니다.

예 2:
입력: [5, -10, 15, -20]
출력: [-20, 15, -10, 5]
설명: 입력된 배열에는 양수와 음수가 포함된 4개의 요소가 있습니다. 역순 배열에는 그 요소들이 역순으로 담겨 있어야 합니다.

예 3:
입력: [100, 200, 300, 400, 500]
출력: [500, 400, 300, 200, 100]
설명: 입력된 배열에는 5개의 요소가 있습니다. 역순 배열에는 그 요소들이 역순으로 담겨 있어야 합니다.

그럼 행운을 빕니다!
 */

public class test5배열역순 {

    public int[] reverseArray(int[] array) {

    	int[] newArray = new int[array.length];
    	
    	for (int i = 0; i<array.length; i++) {
    		newArray[array.length -1 -i] = array[i];
    	}
    	
    	return newArray;
    }
}

/*
 * 해답을 코드 스니펫과 함께 한 단계씩 설명해 드리겠습니다.

엣지 케이스 검사하기: 메서드의 시작 부분에는 엣지 케이스에 대한 검사가 있습니다. 만일 배열의 길이가 0 또는 1이라면 배열이 그대로 리턴됩니다. 빈 배열 또는 요소가 하나인 배열은 이미 정의에 따라 ‘역순’이기 때문입니다.

if (array.length <= 1) {
    return array;
}
포인터 초기화하기: 2개의 포인터, 즉 start와 end가 각각 배열의 시작 부분과 끝 부분을 지시하도록 초기화됩니다. 또한 역순으로 된 요소를 저장하기 위해, 입력된 배열과 길이가 같은 새로운 배열 reversedArray를 만듭니다.

int start = 0;
int end = array.length - 1;
int[] reversedArray = new int[array.length];
배열 반복하기: 배열을 반복하기 위해 while 반복문을 설정합니다. start가 end보다 작거나 같은 한, 반복이 계속됩니다.

while (start <= end) {
    ...
}
요소 교환하기: 반복 중에 입력된 배열의 end인덱스에 있는 요소가 reversedArray의 start 인덱스로, start 인덱스에 있는 요소가 end인덱스로 배치됩니다.

reversedArray[start] = array[end];
reversedArray[end] = array[start];
포인터 업데이트하기: 요소들이 교환된 후 start포인터는 증가하고 end포인터는 감소합니다. 그러면 start포인터가 배열의 끝을 향해 이동하고 end포인터가 시작을 향해 이동하여 결국 배열의 중간에서 ‘모이게’ 됩니다.

start++;
end--;
결과 리턴하기: while 반복문이 실행을 마치면 입력된 배열의 모든 요소가 역순으로 reversedArray에 복사됩니다. 다음으로 reversedArray가 결과로서 리턴됩니다.

return reversedArray;
위의 단계들을 종합하면 배열 전체가 역순으로 되고 각각의 요소가 배열의 다른 쪽 끝에 있는 상대 요소와 교환됩니다.

전체 해답 코드:

public class ArrayMagic {
 

    public int[] reverseArray(int[] array) {
 
        if (array.length <= 1) {
            return array;
        }
 
        int start = 0;
        int end = array.length - 1;
 
        int[] reversedArray = new int[array.length];
 
        while (start <= end) {
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
 
            start++;
            end--;
        }
 
        return reversedArray;
    }
}
 * 
*/