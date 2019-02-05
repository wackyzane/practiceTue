/**
 * Add two fractions, Learn Javadocs, Enter the two fraction as Strings
 * then use String methods to pull our numerator and denominator.
 * Use common denominator to add , then reduce to lowest common denominator.
 * (First Grade: Just Add)
 * (second part grading: Add, Subtract, Multiply, Divide)
 * @author Perry Karlsen
 *
 */
public class Fraction {
	// Field
	/**
	 * STOP Hammer time
	 */
	private int numerator;
	private int denominator;
	private int numerator1;
	private int denominator1;
	private int divisor;
	private int secInt;
	// Constructor or Constructor Stack
	
	public Fraction(String passFraction1, String passFraction2, String choice) {
		int separator = passFraction1.indexOf("/");
		String strNumerator1 = passFraction1.substring(0, separator);
		String strDenominator1 = passFraction1.substring(separator + 1);
		
		separator = passFraction2.indexOf("/");
		String strNumerator2 = passFraction2.substring(0, separator);
		String strDenominator2 = passFraction2.substring(separator + 1);
		
		numerator = Integer.parseInt(strNumerator1);
		denominator = Integer.parseInt(strDenominator1);
		numerator1 = Integer.parseInt(strNumerator2);
		denominator1 = Integer.parseInt(strDenominator2);
		
		if (choice.equals("Add") || choice.equals("add")) {
			numerator = addNum();
			denominator = denominator * denominator1; 
			
		} else if (choice.equals("Sub") || choice.equals("sub") || choice.equals("Subtract") || choice.equals("subtract")) {
			numerator = subNum();
			denominator = denominator * denominator1; 
			
		} else if (choice.equals("Mult") || choice.equals("mult") || choice.equals("Multiply") || choice.equals("multiply")) {
			numerator = numerator * numerator1;
			denominator = denominator * denominator1;
					
			
		} else if (choice.equals("Div") || choice.equals("div") || choice.equals("Divide") || choice.equals("divide")) {
			numerator = numerator * denominator1;
			denominator = denominator * numerator1;
			
		}
		
		divisor = simplify();
		numerator /= divisor;
		denominator /= divisor;
		while (numerator >= denominator) {
			numerator -= denominator;
			secInt += 1;
			
		}
		
	}

	// Methods
	
	private int simplify() {
		int a = Math.max(Math.abs(numerator), Math.abs(denominator));
		int b = Math.min(Math.abs(numerator), Math.abs(denominator));

		int rem = a % b;

		while (rem != 0) {
			a = b;
			b = rem;
			rem = a % b;
		}
		return b;
		
	}
	
	public int addNum() {
		this.numerator = numerator * denominator1;
		this.numerator1 = numerator1 * denominator;
		this.numerator = numerator + numerator1;
		return numerator;
		
	}
	
	public int subNum() {
		this.numerator = numerator * denominator1;
		this.numerator1 = numerator1 * denominator;
		this.numerator = numerator - numerator1;
		return numerator;
		
	}
	
	public int getSecInt() {
		return secInt;
		
	}
	
	public int getNumerator() {
		return numerator;
		
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		
	}

	public int getDenominator() {
		return denominator;
		
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
		
	}
	
}
