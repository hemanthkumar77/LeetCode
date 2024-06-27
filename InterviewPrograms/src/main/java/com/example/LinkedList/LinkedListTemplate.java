package com.example.LinkedList;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class LinkedListTemplate {
    private static ListNode head;
    private static ListNode tail;
   public static class ListNode{
       private int data;
       private ListNode next;
       private ListNode(int data){
           this.data=data;
           this.next=null;
       }
   }

   private void insertFrontValue(int data){
       ListNode newNode= new ListNode(data);
        newNode.next=head;
        head = newNode;
   }

   private void insertBackValue(int data){
       ListNode current = tail;
       ListNode newNode = new ListNode(data);
       if(tail==null){
           tail=newNode;
       }else {
           while (current.next!=null){
               current = current.next;
           }
           current.next=newNode;
       }
   }
   private void print(){
       ListNode current = head;
       while (current!=null){
           System.out.print(current.data+" ");
           current = current.next;
       }
   }
   private ListNode middleElement(){
       ListNode slowPtr=head;
       ListNode fastPtr=head;
       while (fastPtr !=null && fastPtr.next!=null){
           slowPtr=slowPtr.next;
           fastPtr=fastPtr.next.next;
       }
       return slowPtr;
       
   }
   private void removeDuplicatesSorted() {
       ListNode current = head;
       while (current != null && current.next != null) {
           if (current.data == current.next.data) {
               current.next = current.next.next;
           } else {
               current = current.next;
           }
       }
   }

   public ListNode reverseLinkedList(){
       ListNode current=head;
       ListNode next=null;
       ListNode previous=null;
       while (current!=null){
           next=current.next;
           current.next=previous;
           previous=current;
           current=next;
       }
       return previous;
   }

   public boolean search(int key){
       ListNode current = head;
       while (current!=null){
           if (current.data==key){
               return true;
           }
           current=current.next;
       }
       return false;
   }

   public void delete(int key){
       ListNode current=head;
       while (current!=null && current.next!=null){
           if(current.next.data==key){
               current.next=current.next.next;
           }
           current=current.next;
       }
   }
   public boolean detectLoop(){
       ListNode slowPtr = head;
       ListNode fastPtr = head;
       while (fastPtr!=null && fastPtr.next!=null){
           slowPtr=slowPtr.next;
           fastPtr=fastPtr.next.next;
           if (slowPtr==fastPtr){
               return true;
           }
       }
       return false;
   }

   public boolean palindromeLinkedList(){
       ListNode current = head;
       List<Integer> integerList = new ArrayList<>();
       while (current!=null){
           integerList.add(current.data);
           current=current.next;
       }
       int front=0,back=integerList.size()-1;
       while (front<back){
           if (integerList.get(front)!=integerList.get(back)){
               return false;
           }
           front++;
           back--;
       }
       return true;
   }

   public ListNode mergeSortedList(ListNode l1,ListNode l2){
       ListNode newNode = null;
       if (l1==null){
           return l2;
       }else if (l2==null){
           return l1;
       }
       if (l1.data<l2.data){
           newNode=l1;
           l1=l1.next;
       }else {
           newNode=l2;
           l2=l2.next;
       }
       newNode.next=mergeSortedList(l1,l2);
       return newNode;
   }

    private void printElement(ListNode newNode){
        ListNode current = newNode;
        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
   public static void main(String args[]){
       LinkedListTemplate obj = new LinkedListTemplate();
       obj.insertFrontValue(7);
       obj.insertFrontValue(5);
       obj.insertFrontValue(3);
       obj.insertFrontValue(1);
       obj.insertBackValue(2);
       obj.insertBackValue(4);
       obj.insertBackValue(6);
       obj.insertBackValue(8);
       obj.print();
       System.out.print("\n");
      ListNode newNode = obj.mergeSortedList(head,tail);
      obj.printElement(newNode);
   }
}
