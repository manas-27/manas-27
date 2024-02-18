package lists;

public class stringreverse {
    public static void main(String[] args) {

        String str = "Java";

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - 1 - i;

            char firstchar = sb.charAt(front);
            char lastchar = sb.charAt(back);

            sb.setCharAt(front, lastchar);
            sb.setCharAt(back, firstchar);

        }
        System.out.println(sb);
    }
}
