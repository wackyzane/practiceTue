
public class StringChecker {
	public static void main(String[] args) {
		CodeWordChecker myCodeWordChecker = new CodeWordChecker("$");
		
		myCodeWordChecker.isValid("happy");
		myCodeWordChecker.isValid("happy$");
		myCodeWordChecker.isValid("Code");
		myCodeWordChecker.isValid("happyCode");
	}
	
}
