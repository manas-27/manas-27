public class removeWord {

    public static String skipWord(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipWord(up.substring(5));
        }
        else{
            return ch + skipWord(up.substring(1));
        }
    }
    public static void main(String [] args){
        System.out.println(skipWord("cbdcdhappleghj"));
    }
}
