package javaAssignment2;

class Dummy implements Cloneable{
    int i;
    Dummy(int i){
        this.i = i;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Dummy2{
    int i;

    Dummy2(int i){
        this.i = i;
    }
    Dummy2(Dummy2 obj){
        this.i = obj.i;
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Dummy obj = new Dummy(7);
        Dummy obj2 = null;
        System.out.println("Using Cloneable");
        try{
            obj2 = (Dummy) obj.clone();
            System.out.println("Obj :"+ obj.i );
            System.out.println("Cloned Obj :"+ obj2.i );
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("\nUsing Copy Constructor");
        Dummy2 obj3 = new Dummy2(8);
        Dummy2 obj4 = new Dummy2(obj3);
        System.out.println("Obj :"+ obj3.i );
        System.out.println("Cloned Obj :"+ obj4.i );

    }
}
