import java.util.*;
class Circumference {
    public static float FindCircum(float r){
        float pi = 3.14f;
        float res = 2*pi*r;
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter radius of circle : ");
        float rad = sc.nextFloat();
        System.out.println("Circumference of circle is "+FindCircum(rad));

    }
}
