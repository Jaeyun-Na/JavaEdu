package kr.co.green.homeEdu;

public class BookRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Book cleanCode = new Book(20);

        cleanCode.increaseNoOfCopies(15);
        cleanCode.decreaseNoOfCopies(4);

        System.out.println("Book_cleanCode Counte : " + cleanCode.getNoOfCopies());
    }

}
