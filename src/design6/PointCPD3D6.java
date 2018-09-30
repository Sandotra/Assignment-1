package design6;

public class PointCPD3D6<E> implements PointCPD6<E> {
	
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

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRho() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTheta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void convertStorageToPolar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void convertStorageToCartesian() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getDistance(E pointB) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E rotatePoint(double rotation) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
