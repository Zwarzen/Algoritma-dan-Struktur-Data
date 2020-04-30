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
public class DoLL {
    Nodes head;
    int size;
    
    public DoLL(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    //ADD
    
    public void add(int item, int index) throws Exception {
        if(isEmpty()){
            addFirst(item);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            Nodes current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Nodes newNode = new Nodes(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Nodes newNode = new Nodes(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public void addFirst(int item){
        if (isEmpty()){
            head = new Nodes(null, item, null);
        } else {
            Nodes newNode = new Nodes(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        } else {
            Nodes current = head;
            while (current.next != null){
                current = current.next;
            }
            Nodes newNode = new Nodes(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            Nodes tmp = head;
            while(tmp != null){
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println("Berhasil Diisi");
        } else {
            System.out.println("Linked Lists Kosong!");
        }
    }
    
    //REMOVE
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Nodes current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Nodes current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    //Get
    
    public int get (int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas!");
        }
        Nodes tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int getFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }
    
    public int getLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        Nodes tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
}
