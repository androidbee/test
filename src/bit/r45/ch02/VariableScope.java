package bit.r45.ch02;

public class VariableScope {


	void myprint() {
		System.out.println(v4);
	}
	

	// 멤버 메소드
	public static void main(String[] args) {

		char a = 'a';
		char b = 'b', c = 'c'; //문자형
		
		String str = "안녕하세요.";
		System.out.println(str);
		
		printVar();
	}
	
	
	static void printVar() {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
	
	
	
	void run() {
//		System.out.println(a);
//		System.out.println(str);
		System.out.println(ch);
		
		int v1 = 10, v2 = 0;
		
		if(v1 > 10) {
			v2 = v1 - 5;
		}
		int v3 = v1 + v2 + 10;//
		//v4계산
		v4 = v3 + 10;
		
	}
	
	
	//멤버 필드
	char ch = 'a';
	int v4 = 0;


}
