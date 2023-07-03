package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();	// 외부의 필드를 사용하기 위해선 객체를 생성하고 참조변수를 이용해야 한다.
		
		//필드 값 읽기
		System.out.println("제작회사: " + myCar.company);	// 참조변수로 호출
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
}
