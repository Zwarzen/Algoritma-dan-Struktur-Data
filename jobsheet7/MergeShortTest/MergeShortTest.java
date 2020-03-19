/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeshorttest;

/**
 *
 * @author R154NG
 */
public class MergeShortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeShort mSort = new MergeShort();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.MergeShort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
    
}
