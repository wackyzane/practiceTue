public class FractionTester {

	public static void main(String[] args) {
		Fraction f = new Fraction("1/3");
		Fraction g = new Fraction("3/7");
		Fraction[] myFractions = new Fraction[5];
		
		// Add the fractions, store the result
		Fraction sum = f.add(g);
		
		myFractions[0] = f;
		myFractions[1] = g;
		myFractions[4] = sum;
		
		// Print the result
		System.out.println(myFractions[4].toPrettyString());

	}
}
