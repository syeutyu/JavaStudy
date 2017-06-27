package Ramda;

import java.util.function.Consumer;

public class AndThenExample {

	public static void main(String[] args) {
		Consumer<Member> a = m ->{
			System.out.println("A : "+ m.getName());
		};
		Consumer<Member> b = m ->{
			System.out.println("B : "+ m.getId());
		};
		
		Consumer<Member> ab = a.andThen(b);
		ab.accept(new Member("ȫ�浿","hong",null));
	}

}
