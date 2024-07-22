package bitManipulation;

public class bits {
    // Get Bit
    // public static void main(String[] args) {
    // int n = 5;
    // int pos = 3;
    // int bitMask = 1 << pos;

    // if ((bitMask & n) == 0) {
    // System.err.println("Bit was zero");
    // } else {
    // System.err.println("bit was One");
    // }
    // }

    // Set Bit
    // public static void main(String[] args) {
    // int n = 5;
    // int pos = 1;
    // int bitMask = 1 << pos;

    // int num = bitMask | n;
    // System.err.println(num);
    // }

    // Clear Bit

    // public static void main(String[] args) {
    // int n = 5;
    // int pos = 2;
    // int bitMask = 1 << pos;
    // int notBitMask = ~(bitMask);

    // int num = notBitMask & n;
    // System.out.println(num);
    // }

    // Update Bit

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int op = 1;
        int bitMask = 1 << pos;

        if (op == 1) {
            int num = bitMask | n;
            System.err.println(num);
        }
        else{
            int notBitMask = ~bitMask;
            int num = notBitMask & n;
            System.err.println(num);
        }

    }
}
