package design3;
import java.util.Scanner;
import design2.PointCPD2;

import java.util.Random;


public class PointCPD3Test {
	
  public static void main(String[] args) {

    System.out.println("Design 3");
    System.out.println();
    getXTest();
    
  }
  
  public static void getXTest() {
	  
	  System.out.print("Testing getX() method. Enter number of tests to conduct: ");
	  Scanner scan = new Scanner(System.in);
	  int numberOfScans = scan.nextInt();
	  scan.close();
	 
	  Random rand = new Random();
	  long startTime = System.currentTimeMillis();

	  for (int i = 0; i < numberOfScans; i++) {
		  if ((i%2)==0) {
			  double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			  double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			  PointCPD3 point = new PointCPD3('C', x, y);
			  
			  point.getX();
			  point.getX();
			  point.getX();
			  point.getX();
			  point.getX();
		  } else {
			  double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			  double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
			  double rho = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
			  double theta = Math.toDegrees(Math.atan2(y, x));
			  PointCPD3 point = new PointCPD3('P', rho, theta);
			  
			  point.getX();
			  point.getX();
			  point.getX();
			  point.getX();
			  point.getX();
		  }
	  }
	  
	  long endTime = System.currentTimeMillis();
	  long time = endTime - startTime;
	  System.out.println("Total time taken in ms: " + time);
  }
}
