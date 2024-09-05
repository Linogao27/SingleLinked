/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;




/**
 *
 * @author 24
 */
public class SingleLinkedListClass {
    
  class Node{
      private int data;    
      private Node next;
      public Node (int data){
          this.data = data;
          this.next = null;
      }
            
            }   
    private Node head = null;
    private Node tail = null;
    
    public void addNode (int addValue){
    Node value = new Node(addValue);
    if (head == null){
        head = value;
        tail = value;
        
    }else{
        tail.next = value;
        tail = value;
    
    
        }
    
    }
    
    public void deleteFirstNode(){
        if(head == null){
         System.out.println("aray");   
         
    }else{
         head = head.next; 
        if (head == null){
            tail = null;
            
       
           }
        
        } 
        
    }
    
    public void deleteLastNode(){
        if(head == null){
            System.out.println(" aray wawawa");
          
    }else if(head == tail) {
        head = tail = null;

    }else{
        Node current = tail;
        while(current.next != tail) {
       current = current.next;
    
   }
       current.next = null;
       tail = current;
          }  

    }
    public void deleteAnyWhere(int value){
        if(head == null){
        System.out.println("way sulod");
     
    } else if (head.data == value) {
        deleteFirstNode();
        
    }else{
        Node current = head;
        Node previous = null;
        while(current != null && current.data != value){
           previous = current;
           current = current.next;
           
        }
        if(current == null){
        System.out.println("dili dre");
        
        
    }else{
        previous.next = current.next;
        if(current == tail){
            tail = previous;
        }
    }
    
    }}
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("Linked list is bokya");
            
        }else{
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
        
    }
}
    