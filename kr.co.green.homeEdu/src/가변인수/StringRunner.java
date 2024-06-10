package 가변인수;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
				"Thersday", "Friday", "Saturday"};
		
		String dayWithMostCharaters = "";
		for(String day:daysOfWeek) {
			if(day.length() > dayWithMostCharaters.length()) {
				dayWithMostCharaters = day;
			}
		}
		System.out.println("Day with Most Number of characters : " + dayWithMostCharaters);
		
		for(int i=daysOfWeek.length-1; i >=0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
