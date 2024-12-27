import java.util.Scanner;
class Student {
    int n;
    int marks[];
    int credits[];
    String usn,name;
    Scanner sc=new Scanner(System.in);

    public Student () {
        System.out.println("Enter the number of subjects: ");
        n=sc.nextInt();
        marks=new int[n];
        credits=new int[n];
    }
    void getDetails(){
        System.out.println("Enter the USN:");
        usn=sc.nextLine();

        
        System.out.println("Enter the Name:");
        name=sc.nextLine();
        System.out.println("Enter the credits and marks of"+" n " + "subjects: ");
        for(int i=0;i<n;i++){
            credits[i]=sc.nextInt();
            marks[i]=sc.nextInt();
        }
    }

    void displayDetails(){
        System.out.println("Name: "+name+" USN: "+usn);
        

        System.out.println("The marks and credits of "+n+" subjects: ");
        for(int i=0;i<n;i++){
            System.out.println(marks[i]+":"+credits[i]);
        }
        System.out.println("SGPA: "+calculateSGPA());
    }
    public double calculateSGPA() {
        double totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < n; i++) {
            double points = 0;
            if (marks[i] >= 90) points = 10;
            else if (marks[i] >= 80) points = 9;
            else if (marks[i] >= 70) points = 8;
            else if (marks[i] >= 60) points = 7;
            else if (marks[i] >= 50) points = 6;
            else if (marks[i] >= 40) points = 5;
            totalCredits += credits[i];
            totalPoints += points * credits[i];
            }

        return totalPoints/totalCredits;
        }
}

class Main {
    public static void main(String[] args){
    Student s1=new Student ();
    s1.getDetails();
    s1.displayDetails();

    }  

}
