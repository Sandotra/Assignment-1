package design6;

public interface PointCPD6 {

		public double getX();
		public double getY();
		public double getRho();
		public double getTheta();
		
		/*public PointCPD6 convertStorageToPolar();*/
		public PointCPD6 convertStorageToCartesian();
		
		public double getDistance(PointCPD6 pointB);
		public PointCPD6 rotatePoint(double rotation);
		
		public String toString();
		
}
