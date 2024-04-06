package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {
	// 필드
	int studentNumber;
	String studentName;
	int[] grades;

	// 생성자
	public Student(String studentName, int[] grades) {
		super();
		this.studentName = studentName;
		this.grades = grades;
	}

	// 메소드
	// 1. 이름, 번호, 성적을 각각 출력
	void showGradeInfo() {
		System.out.println("Student {studentName = \'" + studentName + "\', studentNumber = " + (studentNumber + 1)
				+ ", grades = " + Arrays.toString(grades));
	}

	// 1. 성적을 모두 더해줄 result 선언
	// 2. for문을 이용해 result에 성적 다 더하기
	// 3. 출력 양식에 맞춰 출력(서식지정자 이용)
	// 4. result를 이용해 평균을 구하고 리턴
	double scoreAvg() {
		double result = 0;
		for (int i = 0; i < grades.length; i++) {
			result += grades[i];
		}
		System.out.printf("학생 이름 : %s, 평균 성적 : %.2f\n", studentName, result / grades.length);
		return result / grades.length;
	}

	// 1. 오버라이딩
	// 2. 내용 수정
	@Override
	public String toString() {
		System.out.println("학생 이름 : " + studentName + ", 성적 : " + Arrays.toString(grades));
		return super.toString();
	}

}
