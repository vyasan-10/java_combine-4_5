public class SwapNumbers {
    public static void main(String[] args) {
        int A = 15, B = 25;

        System.out.println("Before Swap: A = " + A + ", B = " + B);

        // Using temp
        int temp = A;
        A = B;
        B = temp;

        System.out.println("After Swap: A = " + A + ", B = " + B);
    }
}
