package Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Example1 {
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿", 80, 98), new Student("ȫ���", 78, 91));

	public static void printString(Function<Student, String> function) { //Student ��ü�� String���� ����
		for(Student student : list){ 
			System.out.println(function.apply(student)+" test"); //function�� student�� ����
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> funtion){ //int�� Student��ü�� ����
		for(Student student : list){
			System.out.println(funtion.applyAsInt(student)+ " test");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�л��̸�");
		printString(a -> a.getName()); //�̸��� �ش��ϴ� ��ü�� �����Ѵ�
		
		System.out.println("���� ����");
		printInt(z -> z.getEnglishScore());
		
		System.out.println("���� ����");
		printInt(h -> h.getMathScore());
	}

}
