
public class Runner {
	public static void main(String[] args) {
		int tot = 0;
		for (int i=2; i<17; i++) {
			tot += i;
			// This is how you solve the problem, using paper.
			System.out.println("i = " + i + ", tot = " + tot);
		}
		System.out.println(tot);
		int count=0;
		for(int j=4; j<9; j++) {
			if(j%2==1) {
				count++;
			}
		}
		System.out.print(count);
		System.out.println();

	}
}
 