package javadsa.bigo;

public class bitManipulation {
    static void getBit() {
        int n = 6;
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit at given position is zero");
        } else {
            System.out.println("Bit at given position is one");
        }
    }

    static void setBit() {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }

    static void clearBit() {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;

        System.out.println(newNumber);
    }

    public static void main(String[] args) {
        getBit();
        setBit();
        clearBit();

    }
}
