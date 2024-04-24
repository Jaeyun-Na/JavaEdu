package 참조자료형;

public class StringConcatenation {
	public static void main(String[] args) {
		
//	1 + 2 = 3
//	"1" + "2" = "12"
//	"1" + 2 = "12"
//	"1" + 23 = "123"
//	1 + 23 = 24
//	1 + 2 + "3" = "33"
//	"1" + 2 + 3 = "123"
		
		//String 형식이 포함 된 수식은 String 형식으로 나타남
		//1 + 2 + "3" = "33"의 경우 1+2의 경우 int타입으로 3이 나오고, 이후 3 + "3"이므로 "33"이 출력
		
		int i = 20;

		System.out.println("Value is" + 20);
		//Value is 20
		System.out.println("Value is" + 20 + 20);
		//Value is 2020
		System.out.println("Value is" + (20 + 20));
		//Value is 40
		String.join(",", "2","3","4");
		//"2,3,4"
		//String.join("합칠 문자(기준)", "값1","값2","값3");
		
		"abcd".replace('a', 'z');
		//"zbcd"
		"abcd".replace("ab", "xyz");
		//"xyzcd"
	}
}
