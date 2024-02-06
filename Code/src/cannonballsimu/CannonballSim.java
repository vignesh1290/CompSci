package cannonballsimu;

import java.util.ArrayList;

public class CannonballSim {
	private double xpos=0;
	private double ypos=.00001;
	private double xvel;
	private double yvel;

	public CannonballSim(double xpos, double xvel, double yvel) {
		this.xpos = xpos;
		this.xvel = xvel;
		this.yvel = yvel;
		
		
	}

	public void move(double deltaSec) {
		xpos+=deltaSec*xvel;
		ypos+=deltaSec*yvel;
		yvel=deltaSec*-9.81;
		
	}
	public Point getLocation(){
		Point pointt= new Point(xpos, ypos);
		return pointt;
	}
	public ArrayList<Point> shoot(double alpha, double v, double deltasec){
		xvel=v*Math.cos(alpha*Math.PI/180);
		yvel=v*Math.sin(alpha*Math.PI/180);
		ArrayList<Point> array= new ArrayList<Point>();
		
		while(ypos>0) {
			this.move(deltasec);
			array.add(this.getLocation());
		
		}
		 return array;
		
	}
		
}
