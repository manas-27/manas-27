class AException extends Exception{
    // Checked Exception --> compile time exception
}

class BException extends RuntimeException{

}

class Hello{
    void m1() throws AException{
        System.out.println("M1 in Hello");
    }

    void m2() throws BException{
        System.out.println("M2 in Hello");
    }
}

class hii{
    void showAll() throws BException{
        Hello h = new Hello();
        try {
            h.m1();
        } catch (Exception e) {
            System.out.println(e);
        }
        h.m2();
    }
}


public class exceptions {
    public static void main(String[] args) {
        System.out.println("Hello World");


        // try{
        //     int i = Integer.parseInt(args[0]);
        // } catch (Exception e) {
        //     if(e instanceof ArrayIndexOutOfBoundsException){
        //         System.out.println("please give some value" + e);
        //     }
        //     if(e instanceof ArrayIndexOutOfBoundsException){
        //         System.out.println("please give some Numeric value" + e);
        //     }
            
        // }
        
        
    }
}
