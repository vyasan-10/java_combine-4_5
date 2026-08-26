public class LargestThree {
    public static void main(String[] args) {
        int A=25, B=40, C=15;

        if(A>=B && A>=C) System.out.println("Largest = " + A);
        else if(B>=A && B>=C) System.out.println("Largest = " + B);
        else System.out.println("Largest = " + C);
    }
}
