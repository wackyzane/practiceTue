
public class insertSort {
	
	public static void main(String[] args) {
		int[] x = {5,8,1,6,9,2};
		System.out.print(insertSort(x));
	
	}
	public static int[] insertSort(int[] list) {
		int i, j, key, temp;
			for (i = 1; i < list.length; i++) {
				key = list[i];
				j = i-1;
				while (j >= 0 && key < list[j]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					j--;
					
				}
				
			}
			return list;
		}
}
