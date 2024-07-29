package java��������;

import java.util.ArrayList;
import java.util.List;

public class test7LimiteArrayListReturn {
	public List<Integer> determineMultiples(int number, int limit) {

        List<Integer> multiples = new ArrayList<>();
        // TODO: Write your code here
        if (number <= 0 || limit <= 0) {
            return multiples;
        }

        // number�� ����� limit �̸����� ã��
        for (int i = number; i < limit; i += number) {
            multiples.add(i);
        }

        return multiples;
    }

}

/*����
 * �ڵ� ����: ������ �Ѱ� �ȿ��� �־��� ������ ������� ��� ArrayList �����ϱ�
�����п��Դ� �Ϻ� �ϼ��� NumberMagic Ŭ������ �����Ǿ� �ֽ��ϴ�.

�� Ŭ�������� ������ �Ѱ� �ȿ��� �־��� ������ ������ �� ����Ʈ�� �����ϴ� determineMultiples(int number, int limit) �޼��尡 ���ԵǾ� �ֽ��ϴ�.

�������� ������ �� �޼����� ������ �Ϸ��ϴ� ���Դϴ�.

�޼����� �ñ״�ó�� ������ �����ϴ�.

public List<Integer> determineMultiples(int number, int limit)
�Է�

�޼���� ���� �μ� 2���� �޽��ϴ�.

number : ����� ���� ����

limit : ����� ��� �Ѱ�

���

�޼���� limit �̸����� �־��� number�� ��� ����� ���Ե� List<Integer>�� �����ؾ� �մϴ�.

���� number�Ǵ� limit�� 0���� �۰ų� ���ٸ� �޼���� �� ����Ʈ�� �����ؾ� �մϴ�.



����

�� 1

number�� 3����, limit�� 20���� �ֽ��ϴ�. ���ϵ� ����Ʈ�� [3, 6, 9, 12, 15, 18]�̾�� �մϴ�.

�� 2

number�� 5��, limit�� 1�� �ֽ��ϴ�. �޼���� �� ����Ʈ []�� �����ؾ� �մϴ�.

 */


/*�ڵ� ����

1.determineMultiples(int number, int limit) �޼���� �� ���� ���� �μ� number�� limit�� �޾Ƽ�, limit �̸��� number�� ��� ����� ã�� List<Integer> ���·� ��ȯ.
2.���� number �Ǵ� limit�� 0 ������ ��� �� ����Ʈ�� ��ȯ.
3.for ������ ����Ͽ� number���� �����Ͽ� limit �̸����� number�� ���ذ��� �ݺ�. �̶� i�� number�� ���.
4.�� ����� multiples ����Ʈ�� ��.
5.�ݺ��� ���� ��, �ϼ��� multiples ����Ʈ�� ��ȯ.
���� ����

���� 1: number = 3, limit = 20

multiples = [3, 6, 9, 12, 15, 18]
�޼���� [3, 6, 9, 12, 15, 18]�� ��ȯ.

���� 2: number = 5, limit = 1

multiples = []
�޼���� �� ����Ʈ []�� ��ȯ�մϴ�.
�̷��� ������ NumberMagic Ŭ������ �־��� ������ ����� ������ �Ѱ� ������ ã�� List<Integer> ���·� ��ȯ�ϴ� ����� ����.

�߰���, �� ������ ��� ã�� ������ �⺻���� �����̸�, �̸� �����Ͽ� �� ������ ������ �ذ��� �� �ֽ��ϴ�. ���� ���, Ư�� ���� ������ ����� ���� ���ϱ�, ����� �� ���ϱ� ���� ������ �ذ�

*/


/*��
 * ���� �ش� �ڵ带 �� �ܰ辿 ������ ���캸�ڽ��ϴ�.

�׷� �Լ� ȣ�� determineMultiples(3, 20)�� ���� ��� ���� ���Ե� �ܰ���� ������ �����?

1�ܰ�: ���� ���̽� �˻��ϱ�

if (number <= 0 || limit <= 0) {
    return new ArrayList<>();
}
�޼���� ���� �־��� number �Ǵ� limit�� 0���� �۰ų� ������ �˻��մϴ�. ���� �׷��ٸ� �츮�� ����� �ƴ� ������ ����� ����� �ƴ� �Ѱ躸�� ���� ����� ã�� �� ���� ������ �Լ��� ��� ��� �ִ� ����Ʈ�� �����մϴ�. ������ number = 3�̰� limit = 20�̹Ƿ� �� �ܰ迡�� �츮�� �������� �ʽ��ϴ�.

2�ܰ�: ��� ����Ʈ �ʱ�ȭ�ϱ�

List<Integer> multiples = new ArrayList<>();
�޼���� number�� ������� �����ϱ� ����, ��� �ִ� ArrayList multiples�� �ʱ�ȭ�մϴ�.

3�ܰ�: ����� ã�� ����Ʈ�� �߰��ϱ�

for (int i = 1; i * number < limit; i++) {
    multiples.add(i * number);
}
�̾ �޼���� 1���� �����Ͽ�i * number�� limit���� ���� �� ��ӵǴ� �ݺ����� �����մϴ�. �ݺ��� ������ ��� i * number�� ����Ʈ multiples�� �߰��˴ϴ�.

�츮�� ��(number = 3 �� limit = 20)���� �� �ݺ����� ��� ����Ǵ��� �����?

ù ��° �ݺ�(i=1): 1 * 3�� 3�� ����, 20���� �����Ƿ� 3�� ����Ʈ�� �߰��ǰ� multiples�� [3]�� �˴ϴ�.

�� ��° �ݺ�(i=2): 2 * 3�� 6�� ���� 20���� �����Ƿ� 6�� ����Ʈ�� �߰��ǰ� multiples�� [3, 6]�� �˴ϴ�.

�̷��� ������ 7��° �ݺ�, �� 7 * 3�� 21�� ���� ������ �ݺ��ǰ�, 21�� 20���� ���� �ʱ� ������ �ݺ��� �ߴܵ˴ϴ�.

4�ܰ�: ��� ����Ʈ �����ϱ�

return multiples;
���������� �޼���� multiples����Ʈ�� �����մϴ�. �츮 �������� [3, 6, 9, 12, 15, 18]�Դϴ�.

������ڸ� �޼��� determineMultiples�� ���� ���̽��� �˻��ϰ� ��� �ִ� ����Ʈ�� �ʱ�ȭ�� ���� 1 ���� limit/number���� �ݺ��Ͽ� number�� ��� �� limit���� ���� ����� ���մϴ�. ������ ����� ����Ʈ�� �߰��ϰ� ���������� ��� ����Ʈ�� �����մϴ�.

��ü �ش� �ڵ�:
 
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
