package javaAssignment2;
public class Ques4 {
    private static Ques4 instance = null;

    public String str;

    private Ques4() {
        this.str = "Singeltion";
    }

    public static Ques4 getInstance() {
        if (instance == null)
            instance = new Ques4();
        return instance;
    }
}
class A{
    public static void main(String[] args) {
        Ques4 obj  = Ques4.getInstance();
        Ques4 obj1  = Ques4.getInstance();
        Ques4 obj2  = Ques4.getInstance();

        System.out.println(obj.str);
        System.out.println(obj1.str);
        System.out.println(obj2.str);

        obj.str ="Hello";
        obj2.str ="World";

        System.out.println(obj.str);
        System.out.println(obj1.str);
        System.out.println(obj2.str);
    }
}