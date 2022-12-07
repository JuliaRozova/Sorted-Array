package SortArray;


public class App {
    public static void main(String[] args) {
        TwoDecimalArray twoDecimalArray = new TwoDecimalArray(6,3);
        twoDecimalArray.createArray();
        System.out.println("Original array:");
        twoDecimalArray.printArray();
        System.out.println("Sum of even elements:");
        twoDecimalArray.sortArray();
        System.out.println("Sorted array:");
        twoDecimalArray.printArray();
    }
}
