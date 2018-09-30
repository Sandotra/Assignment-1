package design6;

import java.util.Random;

public class PointCPD6Test {

	public static void main(String[] args) {
		
		
	}
	
	public static boolean pointCPD3Test(int number) {
		
		  Random rand = new Random();
		  
		  long startTime = System.currentTimeMillis();
		  for (int i = 0; i < number; i++) {
			if ((i%2)==0) {
				double x = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
				double y = ((rand.nextInt(50) +1 )*rand.nextDouble() + 1);
				PointCPD6 point;
				PointCPD3D6 temp = new PointCPD3D6('C', x, y);
				point = (PointCPD6) temp;
				point.getX();
				point.getY();
				point.getRho();
				point.getTheta();
				PointCPD6 point1;
				point.convertStorageToPolar();
				point1 = point.convertStorageToCartesian();
				point.getDistance(point1);
				point.rotatePoint(10.0);
				
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
				PointCPD6 point1;
				point.convertStorageToCartesian();
				point1 = point.convertStorageToPolar();
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
