package java��������;

import java.util.Arrays;

/*
�ڵ� ����: �迭���� ���� �������� �˻��ϱ�
BiArray Ŭ���� �ȿ� 2���� ���� �迭�� �����Ǿ� �ֽ��ϴ�.

�������� ������ �� �� �迭���� �հ踦 ���Ͽ� ������ �����ϴ� �޼��带 �ۼ��ϴ� ���Դϴ�.

�������� ���� �迭�� ��ҵ��� ���� ����ϴ� �޼��嵵 �ۼ��ؾ� �մϴ�.

��ħ

BiArrayŬ���� �ȿ��� ���� �޼������ �ϼ��Ͻʽÿ�.

calculateSum(int[] array): �� �޼���� ������ �迭�� �ִ� ��ҵ��� ���� ����Ͽ� �����ؾ� �մϴ�. for-each �ݺ����� ����Ͽ� �迭�� ��� ��Ҹ� �ݺ��ϰ� �װ͵��� ���� sum�� �߰��Ͻʽÿ�. �ݺ��� �Ϸ�Ǹ� sum�� �����մϴ�.

areSumsEqual(): �� �޼���� array1�� �հ� array2�� ���� ���Ͽ� �װ͵��� ������ true�� �����ϰ� �׷��� ������ false�� �����մϴ�. calculateSum(int[] array) �޼��带 ����Ͽ� array1�� �հ� array2�� ���� ���Ͻʽÿ�.

����

�� 1:

���� array1�� [1, 2]�̰� array2�� [4, -2, 1]��� �غ��ϴ�. sum1�� 3�̰� sum2�� 3�Դϴ�. �޼���� true�� �����ؾ� �մϴ�.

�� 2:

���� array1�� [5, 10, 15]�̰� array2�� [1, 9, 20]�̶�� �غ��ϴ�. sum1�� 30�̰� sum2�� 30�Դϴ�. �޼���� true�� �����ؾ� �մϴ�.

�� 3:

���� array1��[-1, -1, -1]�̰� array2�� [-2, 1]��� �غ��ϴ�. sum1�� -3�̰� sum2�� -1�Դϴ�. �޼���� false�� �����ؾ� �մϴ�.


 */
// �� sum�� ���ϰ� equal�� Ȱ���� ����.... Ʋ��
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

/* �ؼ�
 *1�ܰ�: ���� �����ϱ�

public class BiArray {
 
private int[] array1;
private int[] array2;
���⼭ �츮�� 2���� ���� �迭 array1�� array2�� �����մϴ�. �츮�� ������ ���� �迭���Դϴ�.

2�ܰ�: ������ �����ϱ�

public BiArray(int[] array1, int[] array2) {
    this.array1 = array1;
    this.array2 = array2;
}
BiArrayŬ������ �����ڴ� 2���� ���� �迭�� �μ��μ� �޽��ϴ�. �� �����ڴ� �ԷµǴ� �迭�� �ν��Ͻ� ���� array1�� array2�� �Ҵ��մϴ�.

3�ܰ�: ���� �޼��� �����ϱ�

private int calculateSum(int[] array) {
    int sum = 0;
    for (int num : array) {
        sum += num;
    }
    return sum;
}
calculateSum�޼���� ���� �迭�� �μ��μ� �޽��ϴ�. �� �޼���� �迭 ���� ��� ���ڸ� �ݺ��Ͽ� ������ ���� sum�� �߰��մϴ�. �׷��� ���� �� sum�� �����մϴ�.

4�ܰ�: calculateSum �޼��� �����ϱ�

public boolean areSumsEqual() {
    int sum1 = calculateSum(array1);
    int sum2 = calculateSum(array2);
    return sum1 == sum2;
}
areSumsEqual �޼���� array1�� array2�� ���Ͽ� calculateSum �޼��带 ȣ���ϰ� ����� ���� sum1�� sum2�� �����մϴ�. �̾ sum1�� sum2�� �������� �˻��մϴ�. ���� �����ϴٸ� true�� �����ϰ�, �׷��� �ʴٸ� false�� �����մϴ�.

��ü �ش� �ڵ�:

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
