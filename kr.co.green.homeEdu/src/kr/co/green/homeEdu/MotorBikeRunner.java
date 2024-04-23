package kr.co.green.homeEdu;

public class MotorBikeRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        MotorBike somthingElse = new MotorBike();
        
        System.out.println("ducati's speed : " + ducati.getSpeed());
        System.out.println("honda's speed : " + honda.getSpeed());

        ducati.start();
        honda.start();

        // ducati

        ducati.setSpeed(100);

        ducati.increaseSpeed(30);
        ducati.decreaseSpeed(130);

        System.out.println("ducati's speed : " + ducati.getSpeed());

        // honda

        honda.increaseSpeed(50);
        honda.decreaseSpeed(20);

        System.out.println("honda's speed : " + honda.getSpeed());

    }

}
