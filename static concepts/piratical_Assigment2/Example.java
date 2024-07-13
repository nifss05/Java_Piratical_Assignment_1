package piratical_Assigment2;

public class Example {

    private int a;
    private int b;

    static {
        System.out.println("Static block executed");
    }

    public Example(int a) {
        this.a = a;
        System.out.println("Constructor with one parameter called");
    }

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor with two parameters called");
    }

    public void displayValues() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        Example obj1 = new Example(5);
        obj1.displayValues();

       
        Example obj2 = new Example(10, 20);
        obj2.displayValues();
    }
}

