import java.util.*;
public class BitwiseOp {
    public static void main(String[] args) {
        System.out.println(" Bitwise operator : ");
        int BitwiseAnd = 12 & 13;
        System.out.println(BitwiseAnd);
        int BitwiseOr = 12 | 13;
        System.out.println(BitwiseOr);
        int Xor = 7 ^ 13;
        System.out.println(Xor);
        int Not = ~5;
        System.out.println(Not);

        int leftShift = 15<<2;
        System.out.println(leftShift);

        int rightShift = 15>>2;
        System.out.println(rightShift);
    }
}
