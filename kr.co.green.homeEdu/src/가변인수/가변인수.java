package �����μ�;

public class �����μ� {

	/*
	 * jshell
	 * 
	 * int sum(int 1,int j){ return i+j; }
	 * 
	 * sum(1,2) => 3
	 * 
	 * sum(1,2,3) => ���� �߻� sum�� ������ 2�� ������ ������ ���� 3���� ������ ���� ���ؼ��� ���ο� �޼ҵ带 ��������
	 * 
	 * int sum (int i, int j, int k){ return i + j + k; }
	 * 
	 * ���ο� �޼ҵ带 �������� �ʰ� ������ ������ �ٸ��� �Ҽ� �ִ�?? --> ���� �μ�
	 * 
	 * �Ϲ� ������ void print(int i) -> ���� ����������, �پ��� ���ڸ� argument�ϰ� ���� ��� void
	 * print(int... values)�� �ۼ�
	 * 
	 * void print(int... values){ System.out.println(Arrays.toString(values)); } ����
	 * ���� �ۼ� �� values�� ���� �ٸ��� ������, ������ �ٸ� ���� ���� �迭�� ������
	 * 
	 * int sum(int... values){ ...> int sum = 0; ...> for(int value:values){ ...>
	 * sum += value; ...> } ...> return sum; ...> }
	 * 
	 * jshell> sum(1,2,3) $6 ==> 6
	 * 
	 * jshell> sum(1,1) $7 ==> 2
	 * 
	 * jshell> sum(1,22,33,444,55) $8 ==> 555
	 * 
	 * void print (int... value, String name){ } --> ���� ���� ���� ���� �μ��� �������� ��ġ�ؾ���
	 * 
	 * jshell> Person[] person = new Person[5]; person ==> Person[5] { null, null,
	 * null, null, null }
	 * 
	 * jshell> person[1] = new Person(); $4 ==> Person@6a41eaa2
	 * 
	 * jshell> person person ==> Person[5] { null, Person@6a41eaa2, null, null, null
	 * }
	 * 
	 * 
	 * 
	 * 
	 */
}
