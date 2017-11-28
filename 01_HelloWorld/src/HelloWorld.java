import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int[] hello = new int[10];
		hello[0] = 101;
		hello[1] = 102;
		int[] world = {10,20,30};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int a = sc.nextInt();
		System.out.println("val = " + a);
		
		for(int i=0; i<world.length; i++) {
			System.out.println("value: " + world[i]);
		}
	}

}
