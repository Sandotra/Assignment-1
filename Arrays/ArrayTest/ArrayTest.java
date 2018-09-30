package ArrayTest;
import java.util.*;

public class ArrayTest {

	public static void main(String[] args) {
		
		System.out.print("Number of Integers to add: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		System.out.println();
		ArrayListTest(number);
		System.out.println();
		VectorTest(number);
		System.out.println();
		
	}

	public static void ArrayListTest(int number) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("ArrayList");
		
		Random rand = new Random();
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < number; i++) {
			al.add(rand.nextInt(9));
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("Total time taken in ms: " + time);
	}
	
	public static void VectorTest(int number) {
		
		Vector<Integer> v = new Vector<Integer>(number);
		System.out.println("VectorTest");
		
		Random rand = new Random();
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < number; i++) {
			v.add(rand.nextInt(9));
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("Total time taken in ms: " + time);
	}
}
