package design6;

public class PointCPD3D6 implements PointCPD6 {
	
	private char typeCoord;
	private double xOrRho;
	private double yOrTheta;
	
	public PointCPD3D6(char type, double xOrRho, double yOrTheta) {
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

	/*public PointCPD6 convertStorageToPolar() {
		PointCPD6 point;
		PointCPD2D6 point1 = new PointCPD2D6('P', getRho(), getTheta());
		point = point1;
		return point;
	}*/

	public PointCPD6 convertStorageToCartesian() {
		PointCPD6 point;
		PointCPD3D6 point1 = new PointCPD3D6('C', getX(), getY());
		point = point1;
		return point;
	}

	public double getDistance(PointCPD6 pointB) {
		double deltaX = getX() - ((PointCPD6) pointB).getX();
	    double deltaY = getY() - ((PointCPD6) pointB).getY();
	    
	    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	public PointCPD6 rotatePoint(double rotation) {
		double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	    PointCPD3D6 point = new PointCPD3D6('C',
	  	      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
		      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	    PointCPD6 point1 = point;   
	    return point1;
	}
	
	public String toString() {
	    return "Stored as " + (typeCoord == 'C' 
	       ? "Cartesian  (" + getX() + "," + getY() + ")"
	       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
	  }
}
