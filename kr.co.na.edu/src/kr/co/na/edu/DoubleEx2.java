package kr.co.na.edu;

public class DoubleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		//for문 지정한 문장을 정해진 횟수만큼 반목하는 반복문
		
		System.out.println(dnum);
		
	}

}
