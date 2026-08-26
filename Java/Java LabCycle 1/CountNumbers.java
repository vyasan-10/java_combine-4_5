public class CountNumbers {
    public static void main(String[] args) {
        int arr[] = {5, -3, 0, 8, -1, 4};
        int pos=0, neg=0, zero=0;

        for(int num : arr) {
            if(num > 0) pos++;
            else if(num < 0) neg++;
            else zero++;
        }

        System.out.println("Positive numbers = " + pos);
        System.out.println("Negative numbers = " + neg);
        System.out.println("Zeros = " + zero);
    }
}
