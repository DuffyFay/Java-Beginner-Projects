import java.util.Scanner;

public class AverageAndCountAbove{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum/n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if ( numbers[i] > average){
                count++;
            }
            System.out.println("Average: " + average);
            System.out.println("Number of elements above the average: " + count);
        }
    }
}
