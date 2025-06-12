public class Ex2DFunction {
    public static void main(String[] args) {
        int number = 5; // Example input
        int result = twice(number);
        System.out.println("Twice of " + number + " is " + result);

        // Added a new line to demonstrate changes in devteam2 branch
        System.out.println("Added this from devteam2 branch");
    }

    public static int twice(int n) {
        return n * 2;
    }
}