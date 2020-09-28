package bit.r45.ch02;

import java.util.Scanner;

public class ScannerTest {


	// 멤버 메소드
	public static void main(String[] args) {

		System.out.println("이름과 나이을 입력하세요. 예) 홍길동 24");
		System.out.print("이름 입력: ");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int num = sc.nextInt();		
		System.out.println(name + " : " + num);
		
	}
	

}
