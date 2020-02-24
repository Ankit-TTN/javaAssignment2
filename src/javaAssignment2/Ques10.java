package javaAssignment2;

public class Ques10 {
}

class Customer{
    String name;
    String phoneNo;
    Customer(String name,String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }
    void placeOrder(){ }
    void requestForBill(){}
    void makePayemnt(){}
}

class Cashier{
    int empId;
    String name;

    Cashier(int empId,String name){
        this.empId = empId;
        this.name = name;
    }

    float takeOrderAndprepareBill(){}
    int acceptPayment(){}
    void addOrderToOrderQueue(){}
}

class Barista {
    int empId;
    String name;

    Barista(int empId,String name){
        this.empId = empId;
        this.name = name;
    }
    void prepareCoffee(){}
    void addOrderToCompletedQueue(){}
    int notifyOrderCompletedForToken(){}
}

class Orders{
    private static Orders instance = null;

    int orderIdx = 0;  // For OrderId and Token
    int completedOrderIdx = 0; // For Completed Orders
    int[] orderQueue = new int[10000000];
    int[] completedQueue = new int[10000000];

    private Orders() { }

    public static Orders getInstance() {
        if (instance == null)
            instance = new Orders();
        return instance;
    }
}

