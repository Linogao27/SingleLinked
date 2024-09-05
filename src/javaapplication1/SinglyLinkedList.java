/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 24
 */
public class SinglyLinkedList {

 
    public static void main(String[] args) {
        // TODO code application logic here
   
    SingleLinkedListClass link = new SingleLinkedListClass();
    SingleLinkedListClass.Node node = link.new Node(5);
    
    
    
    link.addNode(1);
    link.addNode(2);
    link.addNode(3);
    link.addNode(4);
    link.addNode(5);
    link.display();
    link.deleteFirstNode();
    System.out.println("\ndeleted first node");
    link.display();
    System.out.println("\ndeleted 3");
    link.deleteAnyWhere(3);
    link.display();
    System.out.println("\ndeleted last node");
    link.deleteLastNode();
    link.display();
    System.out.println("\n");
    link.addNode(1);
    link.addNode(3);
    link.addNode(5);
    link.display();
    }
    
}
