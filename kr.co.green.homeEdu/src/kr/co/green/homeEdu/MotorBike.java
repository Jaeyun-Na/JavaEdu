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
        // �Ʒ� �ּ��� ���� ����, (�ּ�)������ �ߺ����� �ϳ�, setSpeed�� �Ѱ�
        // �ϳ��� ������ ������ ����ϳ��� ������
        setSpeed(this.speed - howMuch);
//        if (this.speed - howMuch > 0) {
//            this.speed = this.speed - howMuch;
//        }
    }
}
