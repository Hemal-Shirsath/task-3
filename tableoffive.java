public class TableOfFive {
    public static void main(String[] args) {
        int number = 5; // Number for which the table is to be printed

        // Using a for loop to print the table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}