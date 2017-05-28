import java.util.Scanner;

class User {
	private String name;
	private byte sum, kor, eng, math;

	public User(String name, byte kor, byte eng, byte math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public short sum() {
		short sum = (short) (kor + eng + math);
		return sum;
	}

	public float aver(short num) {
		float average = (float) (num / 3.0);
		return average;
	}

}

public class JavaGame {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String name;
		int su;
		byte Kor, Eng, Math;
		short sum;
		float averge;
		System.out.println("학생수를 입력하시오");
		su = scanner.nextInt();
		
		float[] arr = new float[su];
		String[] names = new String[su];
		
		
		System.out.println(
				"Name" + "\t" + "Kor" + "\t" + "Eng" + "\t" + "Math" + "\t" + "Sum" + "\t" + "Avg" + "\t" + "Rank");
		
		System.out.println("=====================================================");
		User[] user = new User[su];
		
		try {
			for (int i = 0; i < su; i++) {

				name = scanner.next();
				Kor = scanner.nextByte();
				Eng = scanner.nextByte();
				Math = scanner.nextByte();
				user[i] = new User(name, Kor, Eng, Math);

				sum = user[i].sum();
				averge = user[i].aver(sum);
				arr[i] = averge;
				names[i] = name;
				System.out.printf("%d \t %.1f\n", sum, averge);
			}

			rank(names, arr, su);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void rank(String[] names, float[] arr, int su) {
		short[] count = new short[su];

		for (int i = 0; i < su; i++) {
			count[i] = 1;
		}

		for (int i = 0; i < su; i++) {
			for (int j = 0; j < su; j++) {
				if (arr[i] < arr[j]) {
					count[i] = (short) (count[i] + 1);
				}
			}
		}
		for (int i = 0; i < su; i++) {
			System.out.println(names[i] + "학생 순위" + count[i] + "등");
		}
	}
}