package fr.dauphine.javaavance.td2;

/**
 * This class represents an arithmetic expression as a real number
 * @author sophiasirko
 * @version 1.0 Build 18:32 11 Oct, 2021
 *
 */
public class Value extends Expr{
	
	private double reel;
	
	/**
	 * Constructs and initializes Value that represents an Arithmetic Expression as a real number
	 * @param reel is a real number
	 */
	public Value(double reel) {
		this.reel = reel;
	}

	@Override
	public Value eval() {
		return (new Value (reel));
	}

	@Override
	public String toString() {
		return ""+reel;
	}

	public double getReel() {
		return reel;
	}
	
	
	

}
