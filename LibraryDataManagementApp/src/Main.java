class libraryItem{


    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    String title;
    int year;
    void library_item(){
        System.out.println("Id number :"+id+" Title :  "+title+" Year of publication : "+year);
    }
}

class Book extends libraryItem{
    String author;
    void book(){
        System.out.println("written by :"+author);
    }
}

class Magazine extends libraryItem{
    int issue;
    void magazine(){
        System.out.println("issue date/id :"+issue);
    }
}

class Library_Management {
    public static void main(String[] args) {
        Book book1=new Book();
        Magazine magazine1=new Magazine();
        book1.author="chetan bhagat";
        book1.book();
        magazine1.issue=2;
        magazine1.magazine();
        book1.setId(001);
        book1.title="half girlfriend";
        book1.year=2018;
        book1.library_item();
    }
}