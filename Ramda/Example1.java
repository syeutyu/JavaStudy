package Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Example1 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 80, 98), new Student("홍길단", 78, 91));

	public static void printString(Function<Student, String> function) { //Student 객체를 String으로 적용
		for(Student student : list){ 
			System.out.println(function.apply(student)+" test"); //function를 student로 적용
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> funtion){ //int를 Student객체로 적용
		for(Student student : list){
			System.out.println(funtion.applyAsInt(student)+ " test");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학생이름");
		printString(a -> a.getName()); //이름에 해당하는 객체를 전송한다
		
		System.out.println("영어 성적");
		printInt(z -> z.getEnglishScore());
		
		System.out.println("수학 성적");
		printInt(h -> h.getMathScore());
	}

}
