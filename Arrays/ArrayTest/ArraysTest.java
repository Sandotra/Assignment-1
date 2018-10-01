package ArrayTest;
import java.util.*;

public class ArraysTest {

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
		
		ArrayTest(number);
		System.out.println();
		
	}

	public static void ArrayListTest(int number) {
		
		System.out.println("ArrayList");
		
		Random rand = new Random();
		long startTime = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			al.add(rand.nextInt(9));
		}
		
		long constructionEndTime = System.currentTimeMillis();
		
		int sum = 0;
		Iterator<Integer> iterate = al.iterator();
		while (iterate.hasNext()) {
			sum = sum + iterate.next();
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		long constructionTime = constructionEndTime - startTime;
		long iterateTime = totalTime - constructionTime;
		
		System.out.println("Construction time taken in ms: " + constructionTime);
		System.out.println("Iteration time taken in ms: " + iterateTime);
		System.out.println("Total time taken in ms: " + totalTime);
		
	}
	
	public static void VectorTest(int number) {
		
		System.out.println("Vector");
		
		Random rand = new Random();
		long startTime = System.currentTimeMillis();
		
		Vector<Integer> v = new Vector<Integer>(number);
		for (int i = 0; i < number; i++) {
			v.add(rand.nextInt(9));
		}
		
		long constructionEndTime = System.currentTimeMillis();
		
		int sum = 0;
		Iterator<Integer> iterate = v.iterator();
		while (iterate.hasNext()) {
			sum = sum + iterate.next();
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		long constructionTime = constructionEndTime - startTime;
		long iterateTime = totalTime - constructionTime;
		
		System.out.println("Construction time taken in ms: " + constructionTime);
		System.out.println("Iteration time taken in ms: " + iterateTime);
		System.out.println("Total time taken in ms: " + totalTime);
		
	}
	
	public static void ArrayTest(int number) {
		
		System.out.println("Array");
		
		Random rand = new Random();
		long startTime = System.currentTimeMillis();
		
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = rand.nextInt(9);
		}
		
		long constructionEndTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		long constructionTime = constructionEndTime - startTime;
		long iterateTime = totalTime - constructionTime;
		
		System.out.println("Construction time taken in ms: " + constructionTime);
		System.out.println("Iteration time taken in ms: " + iterateTime);
		System.out.println("Total time taken in ms: " + totalTime);

	}
	
}
