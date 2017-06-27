package Ramda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] socres = { 90, 91, 99 };

	public static int MaxOrMin(IntBinaryOperator oper) { //����κ�
		int result = socres[0];
		System.out.println("1��°"+ result);// static�̶� ó�� 1���� �����ȴ� �̺κ���
		for (int score : socres) {
			result = oper.applyAsInt(result, score);
			System.out.println("for�� ��"+result);
		}
		System.out.println("return�� : " + result);
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
