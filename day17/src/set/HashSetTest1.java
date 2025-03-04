package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<>();
		animalSet.add("고양이");
		animalSet.add("강아지");
		animalSet.add("토끼");
		animalSet.add("호랑이");
		animalSet.add("기린");
		animalSet.add("하마");
		animalSet.add("기린");
		animalSet.add("기린");
		animalSet.add("기린");
		System.out.println(animalSet);

//		내가 저장한 순서대로 값이 저장되어 있어야 하는가? x
//		내가 set에서 특정 값을 가져올 수 있는가?
//		HashSet은 값을 가져올 수 없다. 그럼데 어떻게 toString()으로는 값을 가져오는가
//		다른 자료구조로 변환하여 값을 가져와야한다

		Iterator<String> animalIter = animalSet.iterator();
//		System.out.println(animalIter);
//		System.out.println(animalSet);
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());

		while (animalIter.hasNext()) {
			System.out.println(animalIter.next());
		}

	}

}
