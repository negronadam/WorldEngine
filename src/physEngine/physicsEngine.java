package physEngine;
import java.util.Random;
public class physicsEngine {
	
	private double xFinal;
	private double xInitial;
	private double vFinal;
	private double vInitial;
	
	public physicsEngine()
	{
		
	}
	
	public double displacementChangeCalc(double xFinal, double xInitial)
	{
		return xFinal - xInitial;
	}
	
	public double velocityFinalCalc(double xInitial,  double xFinal, double time)
	{
		return (xFinal - xInitial)/time;
	}
	
	public double accelerationCalc(double vFinal, double vInitial, double time)
	{
		return (vFinal - vInitial)/time;
	}
	
	public void drawPhysics()
	{
		System.out.println("")
	}
}
