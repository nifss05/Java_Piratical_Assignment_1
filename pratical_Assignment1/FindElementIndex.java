package pratical_Assignment1;

public class FindElementIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;
        
      
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        
        
        if (index != -1) {
            System.out.println("Index of " + target + " in array: " + index);
        } else {
            System.out.println(target + " not found in array.");
        }
    }
}

