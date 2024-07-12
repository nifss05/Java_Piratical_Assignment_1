package pratical_Assignment1;

public class MethodOverloadingDemo {
  
    public void display(int num) {
        System.out.println("Integer value: " + num);
    }
    
   
    public void display(String str) {
        System.out.println("String value: " + str);
    }
    
 
    public void display(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }
    
    
    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        
       
        obj.display(5);
        obj.display("Hello");
        obj.display(3, 7);
    }
}

