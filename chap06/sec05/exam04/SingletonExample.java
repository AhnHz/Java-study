package sec05.exam04;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		Singleton obj1 = new Singleton();  //컴파일 에러
		Singleton obj2 = new Singleton();  //컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstance();	// 객체를 얻는 유일한 방법으로 getInstance()
		Singleton obj2 = Singleton.getInstance();
//		System.out.println(obj1);
//		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
