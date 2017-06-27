import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] agrs) {
		int x = scanner.nextInt();
		String y = scanner.next();
		char[] arr = new char[x];
		int sum = 0;
		
		
		for(int i=0;i<x;i++){
			arr[i] = y.charAt(i);
			sum+=(int)arr[i]-48;
		}
		System.out.print(sum);
		
	}
}