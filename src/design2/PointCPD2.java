// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 
package design2;
/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
import design3.PointCPD3;
public class PointCPD2
{
  //Instance variables ************************************************
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double Rho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double Theta;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCPD2(char type, double Rho, double Theta)
  {
    if(type != 'C' && type != 'P') {
      throw new IllegalArgumentException();
    }
    if (type == 'C') {
    	Rho = (Math.sqrt(Math.pow(Rho, 2) + Math.pow(Theta, 2)));
    	Theta = Math.toDegrees(Math.atan2(Theta, Rho));
    }
    this.Rho = Rho;
    this.Theta = Theta;
    
    }
  
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
   return (Math.cos(Math.toRadians(Theta)) * Rho);
  }
  
  public double getY()
  {
   return (Math.sin(Math.toRadians(Theta)) * Rho);
  }
  
  public double getRho()
  {
   return Rho;
  }
  
  public double getTheta()
  {
   return Theta;
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public PointCPD2 convertStorageToPolar()
  {
	  return this;
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public PointCPD3 convertStorageToCartesian()
  {
	  PointCPD3 point = new PointCPD3('C', getX(), getY());
      return point;
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCPD2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCPD2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCPD2('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Polar [" + getRho() + "," + getTheta() + "]" + "\n";
  }
}