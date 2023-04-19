package test.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3 {
	
	static void inputTest() throws Exception {
		Scanner s = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		System.out.print("* 분자(나누어지는 수) 입력 :");
		n1 = s.nextInt();
		System.out.print("* 분모(나누는 수) 입력 :");
		n2 = s.nextInt();
		System.out.printf("%d ÷ %d = %d\n", n1, n2, n1/n2);
		s.close();
		}
	
	public static void main(String[] args) {
		try {
			inputTest();
		}
		catch (Exception e) {
			System.out.println("정수를 0으로 나누었는지 확인");
			System.out.println("입력값이 정수가 맞는지 확인");
		}
		
	}

}
