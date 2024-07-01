package java��������;

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
*1�ܰ�: �޼��� �ñ״�ó

public List<Integer> determineAllFactors(int number)
�� �޼���� ������ �μ��� �ް� ���� ����Ʈ�� �����մϴ�.

2�ܰ�: ���� ���̽� �˻��ϱ�

�⺻ ���� ���� ���� �츮�� �Էµ� ���ڰ� 0���� �۰ų� ���� ���� ���̽��� ó���մϴ�.

if (number <= 0) {
    return new ArrayList<>();
}
�μ����ش� �Ϲ������� ���� �������� ���ǵǹǷ� ���⼭ �츮�� �� ����Ʈ�� �����ϰ� �ֽ��ϴ�.

3�ܰ�: �� ����Ʈ �����

�츮�� ����� ������ ����Ʈ�� �ʿ��� ���Դϴ�. ��� �ִ� ���� ����Ʈ�� ����ϴ�.

List<Integer> factors = new ArrayList<>();
4�ܰ�: ����� �� �� �ִ� ���� �ݺ��ϱ�

�⺻ ���� 1���� �Էµ� ���ڱ��� �ݺ��ϴ� ���Դϴ�. �� ���� ���� ��� ������ �� ������ ����� �� �� �ֽ��ϴ�.

for (int i = 1; i <= number; i++) {
5�ܰ�: ���ڰ� ������� �˻��ϱ�

�ݺ��� �ȿ��� �츮�� ������ ������ %�� ����Ͽ� ���ڰ� ������ ���ͷ����� ������ ������ ���������� �˻��մϴ�. ���� number % i�� 0�� ������ i�� �� ������ ����Դϴ�.

if (number % i == 0) {
6�ܰ�: ����� ����Ʈ�� �߰��ϱ�

������ ���ڰ� ������ �츮�� �� ���ڸ� ��� ����Ʈ�� �߰��մϴ�.

factors.add(i);
7�ܰ�: ��� ����Ʈ �����ϱ�

�ݺ��� �Ϸ�Ǹ� factors����Ʈ���� �Էµ� ������ ��� ����� ��� ���� ���Դϴ�. �츮�� �� ����Ʈ�� �����մϴ�.

return factors;
�׷��� ���Դϴ�! ���� �� �޼��带 ����Ͽ� ��� ���� ���� �Է°��� ���ؼ��� ��� ����Ʈ�� ���� �� �ֽ��ϴ�.
*
*/
