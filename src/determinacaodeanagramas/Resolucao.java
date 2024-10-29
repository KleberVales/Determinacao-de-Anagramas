package determinacaodeanagramas;

import java.util.Scanner;

public class Resolucao {

	static boolean isAnagram(String a, String b) {
		boolean isAnagram = false;

		for (int i = 0; i < a.length() && a.length() == b.length(); i += 1) {
			char individualChar = a.charAt(i);
			int aCharCount = 1;
			int bCharCount = 0;

			for (int j = 0; j < a.length(); j += 1) {
				if (i != j && individualChar == a.charAt(j)) {
					aCharCount += 1;

				}
				if (individualChar == b.charAt(j)) {
					bCharCount += 1;
				}

			}
			isAnagram = (aCharCount == bCharCount) ? true : false;
		}

		return isAnagram;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}