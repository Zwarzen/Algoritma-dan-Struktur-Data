/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu13;

/**
 *
 * @author R154NG
 */
public class Minggu13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DoLL dll = new DoLL();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addLast(7);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.clear();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.addLast(50);
            dll.addLast(40);
            dll.addLast(10);
            dll.addLast(20);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.removeFirst();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.removeLast();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.remove(1);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.clear();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            System.out.println("Data awal  : " + dll.getFirst());
            System.out.println("Data akhir  : " + dll.getLast());
            System.out.println("Data indeks ke-1 : " + dll.get(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
