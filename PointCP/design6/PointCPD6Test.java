package design6;

import java.util.Random;
import java.util.Scanner;

public class PointCPD6Test {

	public static void main(String[] args) {
		
		System.out.println("Design 6 Test");
	    System.out.print("Enter number of tests to conduct: ");
	    Scanner scan = new Scanner(System.in);
	    int numberOfScans = scan.nextInt();
	    System.out.println(numberOfScans);
	    pointCPD3D2Test(numberOfScans);
	    scan.close();
		
	}
	
	public static boolean pointCPD3D2Test(int number) {
		
		  Random rand = new Random();
		  
		  long startTime = System.currentTimeMillis();
		  for (int i = 0; i < number; i++) {
			if ((i%2)==0) {
				double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
				double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
				PointCPD6 point;
				PointCPD3D6 temp = new PointCPD3D6('C', x, y);
				point = temp;
				point.getX();
				point.getY();
				point.getRho();
				point.getTheta();
				
				PointCPD6 point1, point2, point3, point4, point5, point6, point7, point8, point9, point10;
				
				point1 = point.rotatePoint(0.0);
				point2 = point.rotatePoint(10.0);
				point3 = point.rotatePoint(20.0);
				point4 = point.rotatePoint(30.0);
				point5 = point.rotatePoint(40.0);
			
				point.getDistance(point1);
				point.getDistance(point2);
				point.getDistance(point3);
				point.getDistance(point4);
				point.getDistance(point5);
				
				point6 = point1.convertStorageToPolar();
				point7 = point2.convertStorageToPolar();
				point8 = point3.convertStorageToPolar();
				point9 = point4.convertStorageToPolar();
				point10 = point5.convertStorageToPolar();
				
				point.getDistance(point6.convertStorageToCartesian());
				point.getDistance(point7.convertStorageToCartesian());
				point.getDistance(point8.convertStorageToCartesian());
				point.getDistance(point9.convertStorageToCartesian());
				point.getDistance(point10.convertStorageToCartesian());
				
				point1 = point6.convertStorageToCartesian();
				point2 = point7.convertStorageToCartesian();
				point3 = point8.convertStorageToCartesian();
				point4 = point9.convertStorageToCartesian();
				point5 = point10.convertStorageToCartesian();
				
			} else {
				double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
				double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
				double rho = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
				double theta = Math.toDegrees(Math.atan2(y, x));
				PointCPD6 point;
				PointCPD2D6 temp = new PointCPD2D6('P', rho, theta);
				point = temp;
				point.getX();
				point.getY();
				point.getRho();
				point.getTheta();
				
				PointCPD6 point1, point2, point3, point4, point5, point6, point7, point8, point9, point10;
				
				point1 = point.rotatePoint(0.0);
				point2 = point.rotatePoint(10.0);
				point3 = point.rotatePoint(20.0);
				point4 = point.rotatePoint(30.0);
				point5 = point.rotatePoint(40.0);
			
				point.getDistance(point1);
				point.getDistance(point2);
				point.getDistance(point3);
				point.getDistance(point4);
				point.getDistance(point5);
				
				point6 = point1.convertStorageToCartesian();
				point7 = point2.convertStorageToCartesian();
				point8 = point3.convertStorageToCartesian();
				point9 = point4.convertStorageToCartesian();
				point10 = point5.convertStorageToCartesian();
				
				point.getDistance(point6.convertStorageToPolar());
				point.getDistance(point7.convertStorageToPolar());
				point.getDistance(point8.convertStorageToPolar());
				point.getDistance(point9.convertStorageToPolar());
				point.getDistance(point10.convertStorageToPolar());
				
				point1 = point6.convertStorageToPolar();
				point2 = point7.convertStorageToPolar();
				point3 = point8.convertStorageToPolar();
				point4 = point9.convertStorageToPolar();
				point5 = point10.convertStorageToPolar();
			}
		  }
		  long endTime = System.currentTimeMillis();
		  long time = endTime - startTime;
		  System.out.println("Total time taken in ms: " + time);
		  return true;
	  }
}
