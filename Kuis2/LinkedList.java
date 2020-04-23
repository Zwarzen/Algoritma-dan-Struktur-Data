/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author R154NG
 */
public class LinkedList {
    y2018 h18;
    y2019 h19;
    y2020 h20;
    int size;

    public LinkedList() {
        h18 = null;
        h19 = null;
        h20 = null;
        size = 0;
    }

    public boolean isEmpty() {
        return h18 == null && h19 == null && h20 == null;
    }
    
    public void add(int item1, int item2, int item3, int bln) throws Exception {
        
        int bulan = bln - 1;
        
        if (bulan < 0 || bulan > size) {
            throw new Exception("nilai index melebihi batas");
        }
        
        if (isEmpty() || bulan == 0) {
            addFirst(item1, item2, item3);
        } else {
            y2018 tmp1 = h18;
            y2019 tmp2 = h19;
            y2020 tmp3 = h20;
            
            for (int i = 1; i < bulan; i++) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
            
            y2018 next1 = (tmp1 == null) ? null : tmp1.next;
            y2019 next2 = (tmp2 == null) ? null : tmp2.next;
            y2020 next3 = (tmp3 == null) ? null : tmp3.next;
            tmp1.next = new y2018(item1, next1);
            tmp2.next = new y2019(item2, next2);
            tmp3.next = new y2020(item3, next3);
            size++;
            
        }
    }
    
    public void addFirst(int item1, int item2, int item3) {
        h18 = new y2018(item1, h18);
        h19 = new y2019(item2, h19);
        h20 = new y2020(item3, h20);
        size++;
    }

    public void addLast(int item1, int item2, int item3) {
        
        if (isEmpty()) {
            addFirst(item1, item2, item3);
        } else {
            y2018 tmp1 = h18;
            y2019 tmp2 = h19;
            y2020 tmp3 = h20;
            
            while (tmp1.next != null) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
            
            tmp1.next = new y2018(item1, null);
            tmp2.next = new y2019(item2, null);
            tmp3.next = new y2020(item3, null);
            size++;
        
        }
    }

    public void get(int bln) throws Exception {
        
        int bulan = bln - 1;
        if (isEmpty() || bulan >= size) {
            throw new Exception("Bulan tidak terdaftar");
        }
        
        y2018 tmp1 = h18;
        y2019 tmp2 = h19;
        y2020 tmp3 = h20;
        
        for (int i = 0; i < bulan; i++) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
        }
        System.out.println("Bulan ke- 2018 \t 2019 \t 2020");
        System.out.println(bln + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
    }
    
    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("linked list tidak ada");
        }
        System.out.println("Bulan ke- 2018\t2019\t2020");
        System.out.println("1" + "\t" + h18.data + " " + h19.data + " " + h20.data);
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("linked list tidak ada");
        }
        
        y2018 tmp1 = h18;
        y2019 tmp2 = h19;
        y2020 tmp3 = h20;
        
        int bulan = 1;
        
        while (tmp1.next != null) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
            bulan++;
        }
        
        System.out.println("Bulan ke- 2018 \t 2019 \t 2020");
        System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
    
    }

    public void clear() {
        h18 = null;
        h19 = null;
        h20 = null;
        size = 0;
    }

    public void print() {
        
        if (!isEmpty()) {
            y2018 tmp1 = h18;
            y2019 tmp2 = h19;
            y2020 tmp3 = h20;
            
            int bulan = 1;
            System.out.println("Bulan ke- 2018 \t 2019 \t 2020");
            
            while (tmp1 != null) {
                System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                bulan++;
            }
            System.out.println();
        } else {
            System.out.println("Linked List tidak ada");
        }
    }
}
