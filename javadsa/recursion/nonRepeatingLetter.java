package recursion;

public class nonRepeatingLetter {
    public static void nonRepeating(String str, int i) {
        int count = 0;

        char currChar = str.charAt(i);

        for (int j = 0; j < str.length(); j++) {
            if (currChar == str.charAt(j)) {
                count++;
            }

        }
        if (count == 1) {
            System.out.println("First non-repeating charcter is " + currChar);
            return;
        } else {
            nonRepeating(str, i + 1);
        }

    }

    public static void main(String[] args) {
        String str = "agettkageee";
        nonRepeating(str, 0);
    }
}
