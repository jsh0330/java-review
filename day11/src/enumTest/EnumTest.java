package enumTest;

public class EnumTest {
	// 열거형 상수 정의
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		// 열거형 상수 사용
		Day today = Day.MONDAY;

		System.out.println(today);

		// 열거형 상수 비교(제어문->조건문)
		if (today == Day.MONDAY) {
			System.out.println("오늘은 월요일입니다.");
		} else {
			System.out.println("오늘은 월요일이 아닙니다");
		}

		// 열거형 상수 반복
		for (Day day : Day.values()) {
			System.out.println(day);
		}

		// 문자열을 열거형 상수로 변환(변환 불가)
		String dayStr = "월요일";
		Day date = Day.valueOf(dayStr);
		System.out.println(date);

	}
}
