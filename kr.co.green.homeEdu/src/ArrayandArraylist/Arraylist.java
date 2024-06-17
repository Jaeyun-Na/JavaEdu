package ArrayandArraylist;

public class Arraylist {
	/*
	 * 240612
	 * 
	 * jshellArrayList arraylist = new ArrayList() arraylist ==> []
	 * 
	 * jshell> arraylist.add("apple"); ==> true
	 * 
	 * jshell> arraylist.add("bat"); ==> true
	 * 
	 * jshell> arraylist arraylist ==> [apple, bat]
	 * 
	 * jshell> arraylist.add("cat");==> true
	 * 
	 * jshell> arraylist arraylist ==> [apple, bat, cat]
	 * 
	 * jshell> arraylist.remove("apple") $12 ==> true
	 * 
	 * jshell> arraylist arraylist ==> [bat, cat]
	 * 
	 * --->위와 같이 했을 경우에는 타입을 정해 놓은것이 아니기 떄문에 String, int 타입 모두 입력 가능하다 하지만 좋지 않은 방법.
	 * 탑입을 지정하여 같은 타입만 입력되도록 하는것이 좋다.
	 * 
	 * ArrayList<String> items = new ArrayList<String>() items ==> []
	 * 
	 * jshell> items.add("apple"); $17 ==> true
	 * 
	 * jshell> items.add(1); | Error: | incompatible types: int cannot be converted
	 * to java.lang.String | items.add(1); | ^
	 * 배열을 만들때 String타입으로 지정하였기 떄문에 int타입인 1은 등록되지 않는다.
	 * 
	 * jshell> items.add("bat"); $18 ==> true
	 * 
	 * jshell> items items ==> [apple, bat]
	 * 
	 * jshell> items.remove(0) $20 ==> "apple"
	 * 인덱스 번호 0번인 apple가 삭제되는 것임
	 * 
	 * jshell> items items ==> [bat]
	 * 
	 * 
	 */
}
