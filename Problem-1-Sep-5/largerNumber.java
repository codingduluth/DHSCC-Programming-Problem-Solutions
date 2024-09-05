// Java: Find the largest of two numbers
public class largerNumber {
    public static int findLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 20;
        System.out.println("The largest number is: " + findLargest(num1, num2));
    }
}