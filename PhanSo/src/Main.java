public class Main {
    public static void main(String[] args) {
        Solution fraction1 = new Solution(8, 5);
        Solution fraction2 = new Solution(2, 3);

        System.out.println("Phân số 1: " + fraction1);
        System.out.println("Phân số 2: " + fraction2);

        // So sánh
        boolean isEqual = fraction1.equals(new Solution(16, 10));
        System.out.println("Phân số 1 có bằng 1/1 không? " + isEqual);
    }
}