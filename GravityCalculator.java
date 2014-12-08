
public class GravityCalculator {

	public static void main(String[] args){
		
		double gravity = -9.81;  //gravity of earth in m/s2
		double iv = 0;           // initial velocity of object
		double ft = 10;          // falling time of object
		double ip = 1;           // initial position of object 
		double fp;               // final position of object
		
		fp = 0.5 * (gravity * ft * ft) + ip + iv ;
		
		System.out.println("The object's position after " + ft + "seconds is " + fp + "meters.");
		
		
		
	}
	
	
}
