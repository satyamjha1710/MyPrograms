import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode trackedHeadNode = head;
    
    SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);
     nodeToInsert.data = data;
    
    //Empty List - Returned newly created node or null
    if (head==null)
    {return nodeToInsert;}
    
    //Inserting a Node ahead of the List
    if (position == 0)
    {nodeToInsert.next = head;
     return nodeToInsert;}    
    
    //Traverse the Singly Linked List to 1 Position Prior
    //Stop traversing if you reached the end of the List
    int currPosition = 0;
    
    while (currPosition < position -1 && head.next != null){
        head = head.next;        
        currPosition++;       
    }

    //Inserting a Node in-between a List or at the end of of a List
    SinglyLinkedListNode nodeAtPosition = head.next;
    head.next = nodeToInsert;
    head = head.next;
    head.next = nodeAtPosition;
        
    return trackedHeadNode;
    } 


    

    private static final Scanner scanner = new Scanner(System.in);