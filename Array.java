public class Array {

    public static void main(String[] args) {
        int[] numbers= {9,4,5,2};
        for(int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        numbers[0] = 10;
         for(int updatedNumber : numbers) {
            System.out.println(updatedNumber);
        }

    }
    
}
