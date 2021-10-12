package fr.dauphine.javaavance.td2;

/**
 * Add represents the arithmetic expression Addition 
 * @author sophiasirko
 *
 */
public class Add extends Expr{
	private double reel1; 
	private double reel2;
	
	/**
	 * Constructs and initializes Add that represents an Arithmetic Expression of adding the result of two expression
	 * @param exp1 arithmetic expression 1 of type Expr
	 * @param exp2 arithmetic expression 2 of type Expr
	 */
	public Add(Expr exp1, Expr exp2){
		this.reel1 = exp1.eval().getReel();
		this.reel2 = exp2.eval().getReel();
	}
	
	/**
	 * Evaluates an arithmetic expression 
	 * @return the result of the expression
	 */
	public Value eval() {
		return (new Value(reel1+reel2));	
	}

	public double getReel1() {
		return reel1;
	}
	
	public double getReel2() {
		return reel2;
	}

	@Override
	public String toString() {
		return (reel1 + "+" + reel2);
	}	
}
