package sec01.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {	
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {	//객체가 같은가
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {	//문자열을 비교해라
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		
		System.out.println();
		
		// 새로운 객체 변수를 만들기
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}		
	} 
}
