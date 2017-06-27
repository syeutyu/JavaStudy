package Ramda;

import java.util.function.Function;

public class ComposeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city = null ;

		functionA = (m) -> m.getAddress();
		functionB = (m) -> m.getCity();

		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println(city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println(city);
	}

}
