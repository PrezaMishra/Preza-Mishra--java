import java.util.Scanner;

class QuadraticEquation   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        // Check the value of the discriminant
        if (discriminant > 0) {
            // Two real solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The real solutions are: " + root1 + " and " + root2);
        } 
        else if (discriminant == 0) {
            // One real solution
            double root = -b / (2 * a);
            System.out.println("The real solution is: " + root);
        } 
        else {
            // No real solutions
            System.out.println("There are no real solutions.");
        }

        
    }
}
