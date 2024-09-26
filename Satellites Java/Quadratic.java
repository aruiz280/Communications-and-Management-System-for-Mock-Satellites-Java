public class Quadratic {
	
	private int a, b, c;
	private String solution;
	Complex result1;
	Complex result2;

	public Quadratic(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	
	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public String getComment() {
		return solution;
	}

	public void setComment(String comment) {
		this.solution = comment;
	}

	public ComplexPair solveQuadratic() {

		double discrim = b * b - 4 * a * c;
		double firstRoot, temp2;
		if (a == 0) {
			firstRoot = (-c) / b;
			result1 = new Complex(firstRoot, 0);
			result2 = new Complex(firstRoot, 0);
			solution = "Linear Equation : one real root";
		} else {
			if (discrim > 0) {
				firstRoot = (-b + Math.sqrt(discrim)) / (2 * a);
				temp2 = (-b - Math.sqrt(discrim)) / (2 * a);
				result1 = new Complex(firstRoot, 0);
				result2 = new Complex(temp2, 0);
				solution = "Two distinct real roots";

			} else if (discrim == 0) {
				firstRoot = (-b) / (2 * a);
				temp2 = (-b) / (2 * a);
				result1 = new Complex(firstRoot, 0);
				result2 = new Complex(temp2, 0);
				solution = "Double real root";
			} else {
				double real = -b / (2 * a);
				double imaginary = Math.sqrt(-discrim) / (2 * a);
				result1 = new Complex(real, imaginary);
				result2 = new Complex(real, imaginary * -1);
				solution = "Two distinct complex roots";
			}
		}

		return new ComplexPair(result1, result2);
	}

	@Override
	public String toString() {
		String equation = "";
		if (a != 0)
			equation = equation + a + "x^2";
		
		if (b != 0)
			
			if(b<0)
				
				equation = equation + " - " + Math.abs(b) + "x";
			else
			
				equation = equation + " + " + b + "x";
		if (c != 0)
			
			if(c<0)
				
				equation = equation + " - " + Math.abs(c);
			else
			   
				equation = equation + " + " + c;

		return equation;
	}

}