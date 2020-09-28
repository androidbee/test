package bit.r45.ch02;

public class HelloLiteral {

	public static void main(String[] args) {

		char a = 'a';
		char b = 'b', c = 'c'; //문자형
		
		int n = 10;                 // int(정수)형
		int n1 = 1000, z = -1000;
		
		int hex = 0xAF01;	// 16진수
		int oct = 0137; // 8진수
		
		float r1 = 0.25f, r2 = -3.14f; // 실수형
	
		boolean istrue = true, iszero = false; // 불리언형
		
		// ==========================================
		
		String str = "안녕하세요.";
		System.out.println(str);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		System.out.println(z);
		System.out.println(hex);
		System.out.println(r1);
		System.out.println(istrue);
		
	}
	
	
	

}
