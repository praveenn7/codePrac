package stringPrac;

public class FindLongestCommonPrefix {
	
	public static String findLCP(String[] sArr) {
		if (sArr == null || sArr.length == 0) {
	        return "";
	    }
		String first = sArr[0];

		for (int i = 0; i < first.length(); ++i) {
			char c = first.charAt(i);

			for (int j = 1; j < sArr.length; ++j) {
				if (i >= sArr[j].length() || c != sArr[j].charAt(i)) {
					return first.substring(0, i);
				}
			}
		}

		return first;
		
	}

	public static void main(String[] args) {
		
		String[] a = {"interview", "intervie"};
		
		System.out.println(findLCP(a));

	}

}
