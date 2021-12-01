package class_and_object;

public class Book {

    String book_name;
    String author_name;
    int no_of_pages;

    public Book(){}

    //Parameterized Costructor
    public Book(String book_name,String author_name, int no_of_pages){
        this.book_name=book_name;
        this.author_name=author_name;
        this.no_of_pages=no_of_pages;
    }

    public static void main(String[] args){

        Book b1=new Book();     //object created

        b1.book_name="Java";
        b1.author_name="Mark Zukerberg";
        b1.no_of_pages=685;

        System.out.println(b1.book_name);
        System.out.println(b1.author_name);
        System.out.println(b1.no_of_pages);


        //Syntax Parameterized  : ClassName obj_name = new ClassName(Properties);
        Book b2=new Book("Flutter", "James Neesham", 782);

        System.out.println(b2.book_name);
        System.out.println(b2.author_name);
        System.out.println(b2.no_of_pages);


    }
}
