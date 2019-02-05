import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

	public static void main(String[] args) {
		String fileName = "/home/compsci/eclipse-workspace/010FileWriteArrayList/MyFriends.txt";
		String line;
		ArrayList aList = new ArrayList();
		try {
			BufferedReader input = new BufferedReader(new FileReader(fileName));
			if (!input.ready()) {
				input.close();
				throw new IOException();

			}
			while ((line = input.readLine()) != null) {
				aList.add(line);

			}

			input.close();

		} catch (IOException e) {
			System.out.println("Error: " + e);

		}
		array[] 
		int sz = aList.size();
		for (int i = 0; i < sz; i++) {
			System.out.println(aList.get(i).toString());

		}

	}

}
