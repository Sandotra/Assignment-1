package design3;
import java.util.Scanner;
import java.util.Random;
import design2.PointCPD2;

public class PointCPD3Test {
	
  public static void main(String[] args) {

    System.out.println("Design 3 Test");
    System.out.print("Enter number of tests to conduct: ");
    Scanner scan = new Scanner(System.in);
    int numberOfScans = scan.nextInt();
    System.out.println(numberOfScans);
    pointTest(numberOfScans);
    scan.close();
    
  }
  
  public static boolean pointTest(int number) {
		
	  Random rand = new Random();
	  
	  long startTime = System.currentTimeMillis();
	  for (int i = 0; i < number; i++) {
		if ((i%2)==0) {
			double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			PointCPD3 point = new PointCPD3('C', x, y);
			point.getX();
			point.getY();
			point.getRho();
			point.getTheta();
			PointCPD3 point1;
			point.convertStorageToPolar();
			point1 = point.convertStorageToCartesian();
			point.getDistance(point1);
			point.rotatePoint(10.0);
			
		} else {
			double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			double rho = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
			double theta = Math.toDegrees(Math.atan2(y, x));
			PointCPD3 point = new PointCPD3('P', rho, theta);
			point.getX();
			point.getY();
			point.getRho();
			point.getTheta();
			PointCPD3 point1;
			point1 = point.convertStorageToCartesian();
			point.convertStorageToPolar();
			point.getDistance(point1);
			point.rotatePoint(10.0);
		}
	  }
	  long endTime = System.currentTimeMillis();
	  long time = endTime - startTime;
	  System.out.println("Total time taken in ms: " + time);
	  return true;
  }
}
