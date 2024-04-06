package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		// 로또 번호 생성 프로그램
		// 1. 1~45까지의 숫자 중 6개의 서로 다른 숫자를 무작위로 선택하여 로또 번호 생성한다
		// HashSet<Integer>
		// Random -> nextInt(45) + 1

		// 2. 출력될 때 오름차순으로 정렬하여 출력한다
		// Collections sort()

		// 3. 사용자로부터 몇회차의 로또번호를 생성할지 입력받고 각 회차별로 생성된
		// 로또번호를 출력한다
		// 입력클래스, 입력메소드 nextInt(), 출력메시지

		// 출력예시
//      로또 번호는 [1, 2, 3, 4, 5, 6] 입니다

		LottoMain lm = new LottoMain();

		Scanner sc = new Scanner(System.in);

		System.out.println("회차를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "회차 로또 번호 : " + lm.lotto() + "\n");
		}

	}

	ArrayList<Integer> lotto() {

		HashSet<Integer> lotto = new HashSet<>();
		Random random = new Random();

		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}

		ArrayList<Integer> arrLotto = new ArrayList<>(lotto);
		Collections.sort(arrLotto);
		return arrLotto;

	}
}