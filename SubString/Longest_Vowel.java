package SubString;

public class Longest_Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aubbjreieofd";
		longest(str);
	}

	public static void longest(String str) {
		int count = 0;
		int ans = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (vowel(ch)) {
				count++;
			} else {
				ans = Math.max(count, ans);

				count = 0;
			}

		}

		System.out.println(ans);
	}

	public static boolean vowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
