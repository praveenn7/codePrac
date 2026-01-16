package stringPrac;

public class LastWordLength {

    public static int lengthOfLastWord(String str) {
        String[] words = str.split(" ");

        if (words.length > 0) {
            return words[words.length - 1].length();
        }
        return 0;
    }

    public static void main(String[] args) {
        String s =  "Hello Bot";
        System.out.println(lengthOfLastWord(s));
    }

}
