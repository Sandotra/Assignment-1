package design3;

import design2.PointCPD2;

public class PointCPD3 {
	
	private char typeCoord;
	private double xOrRho;
	private double yOrTheta;
	
	public PointCPD3(char type, double xOrRho, double yOrTheta) {
		
		if(type != 'C' && type != 'P') {
			
			throw new IllegalArgumentException();
			
		} else if (type == 'C') {
			
			this.xOrRho = xOrRho;
			this.yOrTheta = yOrTheta;
			
		} else {
			
			this.xOrRho = (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
			this.yOrTheta = (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
			
		}
		typeCoord = type;
	}
	
	public double getX() {
		
		return xOrRho;
	}

	public double getY() {
		
		return yOrTheta;
	}

	public double getRho() {
		
		return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
	}

	public double getTheta() {
		
		return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
	} 
	
	public PointCPD2 convertStorageToPolar() {
		
		PointCPD2 point = new PointCPD2('P', getRho(), getTheta());
		return point;
	} 
	
	public PointCPD3 convertStorageToCartesian() {
		
		PointCPD3 point = new PointCPD3('C', getX(), getY());
		return point;
	}
	
	public double getDistance(PointCPD3 pointB) {

		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();

		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	public PointCPD3 rotatePoint(double rotation) {
		
		double radRotation = Math.toRadians(rotation);
		double X = getX();
		double Y = getY();

		return new PointCPD3('C',
				(Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
				(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}
	
	public String toString() {
		
		return "Stored as " + (typeCoord == 'C' 
				? "Cartesian  (" + getX() + "," + getY() + ")"
						: "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
	}
}