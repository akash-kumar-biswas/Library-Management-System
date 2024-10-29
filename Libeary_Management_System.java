import java.util.ArrayList;

interface Item{
    void displayInfo();
}

class Book implements Item{
     private String title;
     private String author;
     private String year_of_publication;

     public Book(String title, String author, String year_of_publication){
        this.title=title;
        this.author=author;
        this.year_of_publication=year_of_publication;
     }

     public void displayInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year_of_publication);
        System.out.println();
     }
}

class Magazine implements Item{
    private String title;
    private int issue_no;
    private String pub_date;

    public Magazine(String title, int issue_no, String pub_date){
        this.title=title;
        this.issue_no=issue_no;
        this.pub_date=pub_date;
    }

    public void displayInfo(){
        System.out.println(title);
        System.out.println(issue_no);
        System.out.println(pub_date);
        System.out.println();
    }
}

class DVD implements Item{
    private String title;
    private String director;
    private int duration;

    public DVD(String title, String director, int duration){
        this.title=title;
        this.director=director;
        this.duration=duration;
    }

    public void displayInfo(){
        System.out.println(title);
        System.out.println(director);
        System.out.println(duration);
        System.out.println();
    }
}

class Library{
    private ArrayList<Item> arr=new ArrayList<>();
    void Add(Item newItem){
        arr.add(newItem);
    }
    void display(){
        for(Item it: arr){
            it.displayInfo();
        }
    }
}
public class Libeary_Management_System {
    public static void main(String[] args) {
        Library obj=new Library();
        Item i1=new Book("Java is Hard", " mr. X", "10/10/2012");
        obj.Add(i1);
        Item i2=new DVD("XYZ", "mr. Y", 10);
        obj.Add(i2);
        Item i3=new Magazine("ABC", 150, "10/10/2023");
        obj.Add(i3);
        obj.display();
    }
}
