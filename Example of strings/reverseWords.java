
class reverseWords {

    // Function to reverse words in a given string.
    String reverseWord(String str) {
        if (str.endsWith(".")) {
            System.out.println("Invalid inpiut");
            return "";
        }

        String[] word = str.split("\\.");

        StringBuilder reverse = new StringBuilder();

        for (int i = word.length - 1; i >= 0; i--) {

            reverse.append(word[i]);
            if (i != 0) {
                reverse.append(".");
            }
        }
        return reverse.toString();

    }

    public static void main(String[] args) {

        reverseWords rev = new reverseWords();
        System.out.println(rev.reverseWord("i.love.java.very.much"));
    }
}
