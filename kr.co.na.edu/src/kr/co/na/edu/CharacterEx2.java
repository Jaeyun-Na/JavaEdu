package kr.co.na.edu;

public class CharacterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ѱ� �����ڵ�, 16���� ���, 16���� ���� �ϳ��� 4��Ʈ�� ��������� �ѱ� '��'���ڸ� ǥ���ϴ� �� 4��Ʈ 4��, 2����Ʈ�� ���.
		
		char ch1 = '��';
		char ch2 = '\uD55c';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66;	//������ ������ ������ ������ ���� �߻�(Ȯ�� �� �ּ�ó����)
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
	}

}
