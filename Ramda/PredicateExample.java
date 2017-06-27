package Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(new Student("����1", "����", 90), new Student("���ڰ��� ����", "����", 90),
			new Student("�����", "����", 95), new Student("ȫ�浿", "����", 92));

	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			
			if (predicate.test(student)) {
				count++;
				System.out.println(count);
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t->t.getSex().equals("����")); //���ڷ� �Ȱ�ü�� �������ش�
		System.out.println("���� ��� ���� "+maleAvg);
		double femaleAvg = avg(t-> t.getSex().equals("����"));
		System.out.println("���� ��� ����"+femaleAvg);

	}

}
