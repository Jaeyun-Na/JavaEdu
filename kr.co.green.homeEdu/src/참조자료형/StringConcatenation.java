package �����ڷ���;

public class StringConcatenation {
	public static void main(String[] args) {
		
//	1 + 2 = 3
//	"1" + "2" = "12"
//	"1" + 2 = "12"
//	"1" + 23 = "123"
//	1 + 23 = 24
//	1 + 2 + "3" = "33"
//	"1" + 2 + 3 = "123"
		
		//String ������ ���� �� ������ String �������� ��Ÿ��
		//1 + 2 + "3" = "33"�� ��� 1+2�� ��� intŸ������ 3�� ������, ���� 3 + "3"�̹Ƿ� "33"�� ���
		
		int i = 20;

		System.out.println("Value is" + 20);
		//Value is 20
		System.out.println("Value is" + 20 + 20);
		//Value is 2020
		System.out.println("Value is" + (20 + 20));
		//Value is 40
		String.join(",", "2","3","4");
		//"2,3,4"
		//String.join("��ĥ ����(����)", "��1","��2","��3");
		
		"abcd".replace('a', 'z');
		//"zbcd"
		"abcd".replace("ab", "xyz");
		//"xyzcd"
	}
}
