package javaAssignment2;

abstract class Furniture{
    String material;
    Double stressResistance;
    boolean isFlamable;
    Furniture(String material){
        this.material = material;
    }
    void stressTest(Double stressResistance){
        this.stressResistance = stressResistance;
    }
    void fireTest(boolean isFlamable){
        this.isFlamable = isFlamable;
    }
}

class Chair extends Furniture{
    float height;
    float width;
    float armRestHeight;

    Chair(String material,float height,float width,float armRestHeight) {
        super(material);
        this.height = height;
        this.width = width;
        this.armRestHeight = armRestHeight;
    }
}

class Table extends Furniture{
    float height;
    float width;

    Table(String material,float height,float width){
        super(material);
        this.height = height;
        this.width = width;
    }
}

public class Ques9 {
}