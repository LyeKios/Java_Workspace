package hello;

import java.util.Scanner;


public class inputt {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(num);
		input.close();
	}

}
