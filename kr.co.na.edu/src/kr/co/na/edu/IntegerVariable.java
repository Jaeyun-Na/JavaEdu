package kr.co.na.edu;

public class IntegerVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڷ����� �ٸ� �� ������ ���� ���ϴ� ��
		/* byte�� - 1����Ʈ�� 8��Ʈ. ����Ʈ������ ������ �����ϰų� ����ҋ� �ַ� ���
		 * 		  �������̳� ���� ������ ����ҋ� �Ǵ� ��Ʈ��ũ�� �����͸� �����ҋ� ���(-2^7 ~ 2^7-1 (-128 ~ 127) �̹����� �Ѿ�� ����ǥ��)
		 * short�� - 2����Ʈ�� ������ ǥ���ϴ� �ڷ���.(-2^15 ~ 2^15-1(-32,768 ~ 32,767) 
		 * int�� - ������ ǥ���ҋ� ���� ���� ����ϴ� �ڷ���(-2^31 ~ 2^31-1(-2,147,483,648 ~ 2,147,483,647)
		 * 		  ���� �ڷ������� int���� ���� ���� ����ϴ� ������ ��ǻ�Ϳ��� ������ ���� �� �� 4����Ʈ ������ ó���ϴ°��� ���� ȿ�����̱� ����
		 * long�� - �ڹٿ��� ������ ǥ���ϴ� ���� ū ������ �ڷ���.(-2^63 ~ 2-63-1)
		 * 		   int�� ������ �Ѿ�� ������ ����� �� ��� 
		 */
		int num1 = 12345678900;
		long num2 = 12345678900;
		long num = 12345678900L;
		// num1�� int������ ǥ�������� ������ �Ѿ��⿡ �����߻�
		// num2�� �ڹٴ� ��� ���� ���� int������ ó���ϱ⿡ �߻��� ����, �ش� ���ڸ� long������ ó���� ���ϴ� ��� ���ڵڿ� L�Ǵ�l�� �ٿ�����
		long num3 = 1000;
		// num3�� ��� int���� ������ ���� ���� ���, �ڵ����� long������ ��ȯ, ���� ������ ���� ����ҋ��� �ĺ��ڰ� �ʿ����
		
		short sVal = 10; //
		byte bVal = 20;
		
		System.out.println(sVal+bVal);
	}

}