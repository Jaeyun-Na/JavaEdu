package kr.co.green.homeEdu;

public class MotorBike {

    private int speed;

    MotorBike(){
    	this(5);
    }
    
    MotorBike(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    void start() {
        System.out.println("Bike start");
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        // 아래 주석과 같은 내용, (주석)검증을 중복으로 하냐, setSpeed로 넘겨
        // 하나의 검증을 여러번 사용하냐의 차이점
        setSpeed(this.speed - howMuch);
//        if (this.speed - howMuch > 0) {
//            this.speed = this.speed - howMuch;
//        }
    }
}
