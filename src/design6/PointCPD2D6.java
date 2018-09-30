package design6;
import design6.PointCPD3D6;

public class PointCPD2D6 implements PointCPD6 {
	
	private char typeCoord;
	private double xOrRho;
	private double yOrTheta;
	
	public PointCPD2D6(char type, double xOrRho, double yOrTheta) {
		if(type != 'C' && type != 'P') {
     		throw new IllegalArgumentException();
    	}
    	if (type == 'C') {
    		this.xOrRho = (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
    		this.yOrTheta = Math.toDegrees(Math.atan2(xOrTheta, yOrRho));
    	} else if (type == 'P'){
      		this.xOrRho = xOrRho;
      		this.yOrTheta = yOrTheta;
    }

    typeCoord = type;
    
    }
	

	
	public double getX()
  {
   return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getY()
  {
   return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getRho()
  {
   return xOrRho;
  }
  
  public double getTheta()
  {
   return yOrTheta;
  }

	public PointCPD6 convertStorageToPolar() {
		PointCPD6 point;
		PointCPD2D6 point1 = new PointCPD2D6('P', getRho(), getTheta());
		point = point1;
		return point;
	}

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
	    PointCPD2D6 point = new PointCPD2D6('C',
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
