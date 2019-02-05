/**
 * Checks code to see if it fits the length parameters
 * and if it has something hat is not allowed in the string.
 * 
 * @author Perry Karlsen
 *
 */
public class CodeWordChecker extends StringChecker {
	private int minLength;
	private int maxLength;
	private String notAllowed;
	
/**
 * +1 point for declaring header
 * +1 point for declaring variables
 * 
 * @param minLen The minimum length the string can be
 * @param maxLen The maximum length the string can be
 * @param symbol The symbol or word that is not allowed in the string
 */
	public CodeWordChecker(int minLen, int maxLen, String symbol) {
		minLength = minLen;
		maxLength = maxLen;
		notAllowed = symbol;
		
	}
	public CodeWordChecker(String symbol) {
		minLength = 5;
		maxLength = 8;
		notAllowed = symbol;
		
	}
	public boolean isValid(String str) {
		System.out.println(str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1);
		return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1;
		
	}
	
}
