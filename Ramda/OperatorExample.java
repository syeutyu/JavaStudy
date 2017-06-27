package Ramda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] socres = { 90, 91, 99 };

	public static int MaxOrMin(IntBinaryOperator oper) { //연산부분
		int result = socres[0];
		System.out.println("1번째"+ result);// static이라서 처음 1번만 구동된다 이부분은
		for (int score : socres) {
			result = oper.applyAsInt(result, score);
			System.out.println("for문 값"+result);
		}
		System.out.println("return값 : " + result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = MaxOrMin((a, b) -> {
			System.out.println(a+","+b);
			if (a < b)
				return b;
			else {
				return a;
			}
		});
		System.out.println(max);
	}

}
