package ArrayTest;
import java.util.*;

public class ArrayTest {

	public static void main(String[] args) {
		
		System.out.print("Number of Integers to add: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		ArrayListTest(number);
		VectorTest(number);
		
	}

	public static void ArrayListTest(int number) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("ArrayList");
		
		System.out.println();
		
		Random rand = new Random();
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < number; i++) {
			int x = rand.nextInt(9);
			al.add(x);
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("Total time taken in ms: " + time);
	}
	
	public static void VectorTest(int number) {
		
		System.out.println("Vector");
		System.out.print("Number of Integers to add: ");
		Scanner scan1 = new Scanner(System.in);
		int number = scan1.nextInt();
		scan1.close();
		System.out.println();
	}
}
