package toy;

public class Main {
	public static void main(String[] args) {
		Company c = new Company("서울");
		c.register(new Dog());

		// toy인터페이스 익명클래스로 cat 장난감을 생성
		Toy cat = new Toy() {

			@Override
			public String[] speackList() {
				String[] list = { "고양이는 생선을 좋아한다", "냐옹", "츄르가좋다" };
				return list;
			}

			@Override
			public void pushBtn(String speak) {
				System.out.println(speak);
			}
		};

		Company c2 = new Company("부산");
		c2.register(cat);

		// 경기지점
		Company c3 = new Company("경기");

		// 호랑이 tiger
		c3.register(new ToyAdapter() {

			@Override
			public String[] speackList() {
				String[] list = { "어흥", "테스트용", "호랑이야" };
				return list;
			}

		});

	}
}
