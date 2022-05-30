public class rabin_karp
{
    // d is the number of characters in the input alphabet
    public final static int d = 256;
     
    /* pat -> pattern
        txt -> text
        q -> A prime number
    */
    static void search(String pat, String txt, int q)
    {
        int pat_length = pat.length();
        int txt_length = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;
     
        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < pat_length-1; i++)
            h = (h*d)%q;
     
        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < pat_length; i++)
        {
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }
     
        // Slide the pattern over text one by one
        for (i = 0; i <= txt_length - pat_length; i++)
        {
     
            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters one by one
            if ( p == t )
            {
                /* Check for characters one by one */
                for (j = 0; j < pat_length; j++)
                {
                    if (txt.charAt(i+j) != pat.charAt(j))
                        break;
                }
     
                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == pat_length)
                    System.out.println("Pattern found at index " + i);
            }
     
            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if ( i < txt_length-pat_length )
            {
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+pat_length))%q;
     
                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                t = (t + q);
            }
        }
    }
     
    /* Driver Code */
    public static void main(String[] args)
    {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
           
          // A prime number
        int q = 101;
       
          // Function Call
        search(pat, txt, q);
    }
}
