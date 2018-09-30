package design3;
import java.util.Scanner;
import java.util.Random;

public class PointCPD3Test {
	
  public static void main(String[] args) {

    System.out.println("Design 3 Test");
    System.out.print("Enter number of tests to conduct for each method: ");
    Scanner scan = new Scanner(System.in);
    int numberOfScans = scan.nextInt();
    System.out.println();
    pointTest(numberOfScans);
    scan.close();
    
  }
  
  public static void pointTest(int number) {
		
	Random rand = new Random();
	 
	PointCPD3[] arrayOfNumbers = new PointCPD3[number];
	PointCPD3[] arrayOfNumbers1 = new PointCPD3[number];

	long startTime = System.currentTimeMillis();
	for (int i = 0; i < number; i++) {
  		double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
		double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);

		arrayOfNumbers1[i] = new PointCPD3('C', x, y);
	}
	long endTime = System.currentTimeMillis();
	long time = endTime - startTime;
	System.out.println("Total time taken in ms for Constructor taking Cartesian Points: " + time);


	startTime = System.currentTimeMillis();
	for (int i = 0; i < number; i++) {
  		double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
		double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
		double rho = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		double theta = Math.toDegrees(Math.atan2(y, x));


		arrayOfNumbers[i] = new PointCPD3('P', rho, theta);
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for Constructor taking Polar Points: " + time);


	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0) {
			arrayOfNumbers[i].getX();
		} else {
			arrayOfNumbers1[i].getX();
		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for getX(): " + time);


	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0) {
			arrayOfNumbers[i].getY();
		} else {
			arrayOfNumbers1[i].getY();
		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for getY(): " + time);

	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0) {
			arrayOfNumbers[i].getRho();
		} else {
			arrayOfNumbers1[i].getRho();
		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for getRho(): " + time);

	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0) {
			arrayOfNumbers[i].getTheta();
		} else {
			arrayOfNumbers1[i].getTheta();
		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for getTheta(): " + time);

	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0){
			double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			double rho = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
			double theta = Math.toDegrees(Math.atan2(y, x));
			PointCPD3 point1 = new PointCPD3('P', rho, theta);
			arrayOfNumbers[i].getDistance(point1);
		} else {
			double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			PointCPD3 point1 = new PointCPD3('C', x, y);
			arrayOfNumbers1[i].getDistance(point1);

		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for getDistance(): " + time);

	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0){
			arrayOfNumbers[i].rotatePoint(rand.nextInt(361));
		} else {
			arrayOfNumbers1[i].rotatePoint(rand.nextInt(361));
		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for rotatePoint(): " + time);

	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0){
			arrayOfNumbers[i].convertStorageToPolar();
		} else {
			arrayOfNumbers1[i].convertStorageToPolar();
		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for convertStorageToPolar(): " + time);

	startTime = System.currentTimeMillis();
	for (int i = 0; i < arrayOfNumbers.length; i++){
		if ((i%2)==0){
			arrayOfNumbers[i].convertStorageToCartesian();
		} else {
			arrayOfNumbers1[i].convertStorageToCartesian();
		}
	}
	endTime = System.currentTimeMillis();
	time = endTime - startTime;
	System.out.println("Total time taken in ms for convertStorageToCartesian(): " + time);

	System.out.println("Test Complete");

	}
}