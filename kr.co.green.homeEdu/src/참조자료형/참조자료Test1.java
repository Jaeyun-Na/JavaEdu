package �����ڷ���;

public class �����ڷ�Test1 {
	public int countUppercaseLetters(String str) {
		�����ڷ�Test1 stringMagic = new �����ڷ�Test1();
		int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
		
		if (str.length() == 0) {
	            return 0;
	        }

	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            // �� ���ڰ� �빮������ Ȯ��
	            if (Character.isUpperCase(str.charAt(i))) {
	                count++;
	            }
	        }

	        return count;
	    }
}

/*
�ڵ� ����: ���ڿ��� �빮�� ���� ����
�������� ������ countUppercaseLetters��� �̸��� Java �޼��带 �ϼ��ϴ� ���Դϴ�. �� �޼���� ���ڿ��� �Է°����� �޾Ƽ� �� ���ڿ��� �ִ� �빮���� ������ �����մϴ�. �� �޼���� StringMagicŬ������ �Ϻκ��Դϴ�.



���� ���� ������ ���� ���� ���̽��� ����Ͻñ� �ٶ��ϴ�.

���ڿ��� ��� ���� ���, �޼���� 0�� �����ؾ� �մϴ�.

���ڿ��� �빮�ڰ� ���� ��쿡�� �޼���� 0�� �����ؾ� �մϴ�.



������ �����п��� ������ ���� �ڵ��Դϴ�.

public class StringMagic {
    
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
    }
}


���� Ǯ�̿� ������ �Ǵ� �޼��� �Ұ�

String Ŭ������ charAt(int index) �޼��带 ����ϸ� Ư���� �ε����� �ִ� ���ڸ� ���� �� �ֽ��ϴ�.

Character Ŭ������ ���� �޼����� isUpperCase(char ch)�� ����ϸ� � ���ڰ� �빮������ �˻��� �� �ֽ��ϴ�.

����

�� ������ ���ڿ� "Hello WORLd"���� �빮�ڰ� 5�� �ֽ��ϴ�("H", "W", "O", "R", "L"). �׷��Ƿ� countUppercaseLetter �޼���� 5�� �����մϴ�.



StringMagic stringMagic = new StringMagic();
int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
System.out.println(uppercaseLetters); // This will print 5
*/