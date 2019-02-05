import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int[] fac = new int[5];
		fac[0] = 1;
		for(int i=2; i<=5; i++) fac[i-1] = fac[i-2]*i;
		System.out.println(fac[4]);
	}

}