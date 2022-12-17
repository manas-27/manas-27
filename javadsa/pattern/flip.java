import java.util.*;

public class flip{
    
    public static String reverse(String s){
        String str = "";
        for(int i = s.length()-1; i >=0 ; i--){
            str = str + s.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String str = sc.nextLine();
            String s = str;
            for(int j = 0; j < s.length()-1; j++){
                if(s.charAt(j) > s.charAt(j+1)){
                    str = reverse(str);
                }
            }
            System.out.println(str);
        }
        sc.close();
    }
}