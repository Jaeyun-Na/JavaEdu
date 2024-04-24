package 참조자료형;

public class String불변객체 {
	//1
//	String str = "in28Minutes";
//	
//	str.concat("is awesome");
//	
//	String anotherString = str.concat(" is awesome");
//	
//	String string2 = anotherString.concat(".");
	
	//str뒤에 .concat으로 문자를 붙였지만, str의 값은"in28Minutes"으로 변하지 않음
	
	//2
	String str = "in28Minutes is awesome.";
	str.toUpperCase() //대문자 변환
	str.toLowerCase() //소문자 변환
	
	String str2 = "  in28Minutes is awesome.  ";
	str2.trim() //앞뒤 간격 제거
}
