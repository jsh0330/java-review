package castingTest2;

// 슈퍼클래스
public class Person {
	// 필드
	String name;
	int age;
	String job;

	// 생성자
	// 모든 매개변수 다 받는 생성자 1개
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}

	// 메소드
	void eat() {
		System.out.println(this.name + "은/는 밥을 먹는다");
	}

}
