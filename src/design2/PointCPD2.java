package design2;

import design3.PointCPD3;
public class PointCPD2 {
 
	private char typeCoord;
	private double Rho;
	private double Theta;
	
	public PointCPD2(char type, double xOrRho, double yOrTheta) {
		if(type != 'C' && type != 'P') {
			throw new IllegalArgumentException();
		}
		if (type == 'C') {
			this.Rho = (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
			this.Theta = Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
		} else if (type == 'P'){
			this.Rho = xOrRho;
			this.Theta = yOrTheta;
		}
		typeCoord = type;
     }
	
	public double getX() {
		return (Math.cos(Math.toRadians(Theta)) * Rho);
	}
  
	public double getY() {
		return (Math.sin(Math.toRadians(Theta)) * Rho);
	}
  
	public double getRho() {
		return Rho;
	}
  
	public double getTheta() {
		return Theta;
	}
	
	public PointCPD2 convertStorageToPolar() {
	  return this;
	}
	
	public PointCPD3 convertStorageToCartesian() {
	  PointCPD3 point = new PointCPD3('C', getX(), getY());
      return point;
	}
	
	public double getDistance(PointCPD2 pointB) {

    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}
	
	public PointCPD2 rotatePoint(double rotation) {
		double radRotation = Math.toRadians(rotation);
		double X = getX();
		double Y = getY();
        
		return new PointCPD2('C',
				(Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
				(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}
	
	public String toString() {
		return "Stored as " + (typeCoord == 'C' 
				? "Cartesian  (" + getX() + "," + getY() + ")"
						: "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
	}
}
