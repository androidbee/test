package bit.r45.members;

// 클래스
public class Student {
	
	// 멤버들: 필드(속성), 메서드(함수)
	
	/* 필드 */
	int age;
	int color; // 1: red, 2: blue, 3: black
	
	
	/* 메서드 */
	public void run() {
		int x = 1;
		int y;
		y = 2;
		
		int result = x + y;
				
		System.out.println("1+2=" + result);
		System.out.println("Student AGE: " + this.age);
	}
	
	
	// this
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
