package design6;

public interface PointCPD6<E> {

		public double getX();
		public double getY();
		public double getRho();
		public double getTheta();
		
		
		public void convertStorageToPolar();
		public void convertStorageToCartesian();
		
		public double getDistance(E pointB);
		public E rotatePoint(double rotation);
		
		public String toString();
		
}
