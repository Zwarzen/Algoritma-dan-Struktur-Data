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
public class Nodes {
    int data;
    Nodes prev, next;
    
    Nodes (Nodes prev, int data, Nodes next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
