package exceptionTest;

public class ExceptionTest01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e); // 클래스이름: 오류내용
			System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다");
		} catch (Exception e) {
			System.out.println("예외발생");
		} finally {
			System.out.println("예외처리 완료");
		}

		System.out.println("프로그램 종료");
	}
}
