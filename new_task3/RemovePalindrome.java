package newTask3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RemovePalindrome {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:/training_workspace/newTask3/src/newTask3/data.txt");
		BufferedReader br = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null) {
			stringBuffer.append(line);
		}
		String str = stringBuffer.toString();
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			String stt = str1[i];
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(stt);
			stringBuilder.reverse();
			String sttt = stringBuilder.toString();

			if (str1[i].equals(sttt)) {
				System.out.print(" ");
			} else {
				System.out.print(str1[i] + " ");
			}
		}

	}
}
