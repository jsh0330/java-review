package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// 컬렉션 프레임워크 이용(점수 저장)
		// 1. 사용자로부터 학생 수와 학생 점수 입력받기
		// 2. 입력받은 점수를 이용해서 평균점수 계산하기
		// 3. 입력받은 점수 중 최고점수 계산하기
		// 4. 계산된 평균점수와 최고점수 출력하기
		Scanner sc = new Scanner(System.in);

		StudentMain sm = new StudentMain();

		ArrayList<Integer> student = new ArrayList<>();
		int studentNum = 0, studentScore = 0;

		System.out.println("학생 수를 입력하세요 : ");
		studentNum = sc.nextInt();

		for (int i = 0; i < studentNum; i++) {
			System.out.println((i + 1) + "번 학생의 점수를 입력하세요 : ");
			studentScore = sc.nextInt();
			student.add(studentScore);
		}

//		System.out.println(student);
		
		System.out.printf("평균 점수 : %.2f\n", sm.avgScore(student));
		
		int max = Collections.max(student);
		System.out.println("최대 점수 : " + max);

	}

	double avgScore(ArrayList<Integer> arr) {
		double avg = 0;

		for (int data : arr) {
			avg += data;
		}

		return avg / arr.size();
	}

}
