import java.util.Scanner;

class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class SonAgeException extends Exception {
    public SonAgeException(String message) {
        super(message);
    }
}


class Father {
    int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) throw new WrongAgeException("Age cannot be negative.");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException, SonAgeException {
        super(fatherAge); // Initialize the father's age
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative.");
        }
        if (sonAge >= fatherAge) {
            throw new SonAgeException("Son's age cannot be greater than or equal to father's age.");
        }
        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return sonAge;
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Father's Age: ");
            int fatherAge = sc.nextInt();

            System.out.print("Enter Son's Age: ");
            int sonAge = sc.nextInt();

            Son son = new Son(fatherAge, sonAge); // Create Son object

            System.out.println("Father's age is: " + fatherAge);
            System.out.println("Son's age is: " + son.getSonAge());
        } catch (WrongAgeException | SonAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close(); // Ensure the scanner is closed
        }
    }
}
