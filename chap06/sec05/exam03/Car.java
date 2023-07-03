package sec05.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car(); 	// 객체 생성 후
		myCar.speed = 60;	// 참조 변수로도 접근 가능
		myCar.run();
	}
}

