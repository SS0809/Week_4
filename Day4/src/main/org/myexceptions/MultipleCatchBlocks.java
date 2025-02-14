package org.myexceptions;
//4. Multiple Catch Blocks
//💡 Problem Statement:
//Create a Java program that performs array operations.
//Accept an integer array and an index number.
//Retrieve and print the value at that index.
//Handle the following exceptions:
//ArrayIndexOutOfBoundsException if the index is out of range.
//NullPointerException if the array is null.
//Expected Behavior:
//        If valid, print "Value at index X: Y".
//If the index is out of bounds, display "Invalid index!".
//If the array is null, display "Array is not initialized!".
public class MultipleCatchBlocks {
    void arrayOps(int[] arr,int size){
            for(int i=0;i<size;i++){
                System.out.print(" "+arr[i]);
            }
    }
    public static void main(String[] args) {
        try {
        int[] arr = {5,0,3,6,7,9,0,4};
        MultipleCatchBlocks mc = new MultipleCatchBlocks();
//        mc.arrayOps(arr,arr.length);
        int arrr[] = null;
        mc.arrayOps(arrr,1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\narray out of bound ");
        } catch (NullPointerException e) {
            System.out.println("\nnull pointer exception");
        }
    }
}
