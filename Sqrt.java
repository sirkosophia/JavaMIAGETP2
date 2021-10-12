package fr.dauphine.javaavance.td2;

/**
 * Multiply represents the arithmetic expression the square root.
 * @author sophiasirko
 *
 */
public class Sqrt extends Expr{
	private double reel1;
	
	/**
	 * Constructs and initializes Sqrt that represents an Arithmetic Expression of the square root of the result of an expression
	 * @param exp1 arithmetic expression of type Expr
	 */
	public Sqrt(Expr exp1){
		this.reel1 = exp1.eval().getReel();
	}

	public Value eval() {
		return (new Value(Math.sqrt(reel1)));	
	}

	public double getReel1() {
		return reel1;
	}

	@Override
	public String toString() {
		return ("\u221a" + reel1);
	}
	

}
