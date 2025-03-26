import java.util.*;

class Publisher{
String publisherName;
String agencyName;

Publisher(String publisherName, String agencyName){
this.publisherName = publisherName;
this.agencyName = agencyName;
}
}

class Book extends Publisher{
String bookName;
String author;
int price;
String category;

Book(String publisherName, String agencyName,String bookName, String author, int price, String category){
super(publisherName, agencyName);
this.bookName = bookName;
this.author = author;
this.price = price;
this.category = category;
}
}

class Literature extends Book{
String genre;

Literature(String publisherName, String agencyName,String bookName, String author, int price, String category, String genre){
super(publisherName, agencyName, bookName, author, price, category);
this.genre = genre;
}

void display(){
System.out.println("Publisher Name : " + publisherName);
System.out.println("Agency Name : " + agencyName);
System.out.println("Book Name : " + bookName);
System.out.println("Author : " + author);
System.out.println("Price : " + price);
System.out.println("Category : " + category);
System.out.println("Genre : " + genre);
} 
}

class Fiction extends Book{
String type;

Fiction(String publisherName, String agencyName,String bookName, String author, int price, String category, String type){
super(publisherName, agencyName, bookName, author, price, category);
this.type = type;
}

void display(){
System.out.println("Publisher Name : " + publisherName);
System.out.println("Agency Name : " + agencyName);
System.out.println("Book Name : " + bookName);
System.out.println("Author : " + author);
System.out.println("Price : " + price);
System.out.println("Category : " + category);
System.out.println("Type : " + type);
} 
}

public class BookDetails{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
Scanner s = new Scanner(System.in);

System.out.println("Enter the number of Books : ");
int n = sc.nextInt();

Literature[] literatureBooks = new Literature[n];
Fiction[] fictionBooks = new Fiction[n];

int litCount = 0, ficCount = 0;

for(int i = 0; i < n; i++){

System.out.println("Publisher Name : ");
String publisherName = s.nextLine();

System.out.println("Agency Name : ");
String agencyName = s.nextLine();

System.out.println("Book Name : ");
String bookName = s.nextLine();

System.out.println("Author Name : ");
String author = s.nextLine();

System.out.println("Price : ");
int price = sc.nextInt();

System.out.println("Category Name : ");
String category = s.nextLine();

if(category.equals("literature")){
System.out.println("Genre : ");
String genre = s.nextLine();
literatureBooks[litCount++] = new Literature(publisherName, agencyName, bookName, author, price, category,  genre);
} else if(category.equals("fiction")) {
System.out.println("Type : ");
String type = s.nextLine();
fictionBooks[ficCount++] = new Fiction(publisherName, agencyName, bookName, author, price, category,  type);
} else {
System.out.println("Invalid Category ");
}

}

if(litCount > 0) {
for(int i = 0; i < litCount; i++){
literatureBooks[i].display();
}
}

if(ficCount > 0) {
for(int i = 0; i < ficCount; i++){
fictionBooks[i].display();
}
}
}
}
