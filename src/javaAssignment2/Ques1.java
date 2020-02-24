package javaAssignment2;
class Books{
    int bookId;
    String authorName;
    String bookName;
}

abstract class User{
    int id;
    String name;

    User(int id,String name){
        this.name = name;
        this.id = id;
    }
}

class Librarian extends User{
    String phoneNo;
    Librarian(int id,String name,String phoneNo){
        super(id,name);
        this.phoneNo = phoneNo;
    }

    void issueBook(){}
    void addNewBooks(){}
    void removeOldBooks(){}
    void recieveIssuedBooks(){}
    float addFine(){}
}

class Student extends User{
    String phoneNo;
    Student(int id,String name,String phoneNo){
        super(id,name);
        this.phoneNo = phoneNo;
    }

    void getBooks(){}
    void returnBooks(){}
    float payFine(){}
}

public class Ques1 {
}
