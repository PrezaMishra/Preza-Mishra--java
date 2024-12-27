import java.util.Scanner;
class Book{

String name;
String author;
double price;
int num_pages;

Book(String name, String author, double price, int num_pages){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
} 
void setDetails(String name, String author, double price, int num_pages){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
String getName(){
return name;
}
String getAuthor(){
return author;
}
double getPrice(){
return price;
}
int getNum_pages(){
return num_pages;
}

public String toString(){

return "Book-Details\n"+
	"Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nPages: "+num_pages;
}
}

class BookDetails{
public static void main(String[] args){

Book[] books;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Books");
int n=sc.nextInt();
books=new Book[n];

for(int i=0;i<n;i++){
System.out.println("Enter the details of book "+(i+1)+": ");

System.out.println("Enter the name of Book: ");
String name=sc.next();

System.out.println("Enter the name of Author: ");
String author=sc.next();

System.out.println("Enter the Price of Book: ");
double price=sc.nextDouble();

System.out.println("Enter the Number of Pages: ");
int num_pages=sc.nextInt();

books[i]=new Book(name,author,price,num_pages);

}
for(int i=0;i<n;i++){
System.out.println("The Details of book "+(i+1)+" : ");

System.out.println(books[i].toString());

}

}
}
