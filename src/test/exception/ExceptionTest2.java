package test.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		try {
			System.out.print("* 분자(나누어지는 수) 입력 :");
			n1 = s.nextInt();
			System.out.print("* 분모(나누는 수) 입력 :");
			n2 = s.nextInt();
			System.out.printf("%d ÷ %d = %d\n", n1, n2, n1/n2);
		}
		
		catch (ArithmeticException e) {
			System.out.println("!!! 정수를 정수를 나눌 때는 분모가 0이면 안됩니다.");
			System.out.print("* 분모(나누는 수) 입력 :");
			n2 = s.nextInt();
			System.out.printf("%d ÷ %d = %d\n", n1, n2, n1/n2);
		}
		catch (InputMismatchException e) {
			System.out.println("!!! 정수만 입력해야 합니다.");
		}
		finally {
			System.out.println("프로그램 종료");
		}
		s.close();

	}

}
