package com.example.myapplication;

import androidx.annotation.NonNull;

public class SingleLinkedList<T> {

    private int size;
    private Node head;

    public int size(){
        return size;
    }

    public void addHead(T data){
        if (data==null){
            return;
        }
        if (head==null){
            head = new Node(data);
            size++;
            return;
        }
        head = new Node(head,data);
        size++;
    }
    public void add(int index,T data){
        if (data==null){
            return;
        }
        if (index<=0||head==null){
            addHead(data);
            return;
        }
        if (index>=size){
            index = size-1;
        }
        Node prev = head;
        for (int i = 0; i <index-1; i++) {
            if (prev.next!=null){
                prev = prev.next;
            }
        }
        Node n = new Node(prev.next,data);
        prev.next = n;
        size++;
    }


    public void removeHead(){
        if (head==null){
            return;
        }
        head=head.next;
        size--;
    }
    public void remove(int index){
        if (index<=0||head==null){
            removeHead();
            return;
        }
        if (index>=size){
            index=size-1;
        }
        Node prev = head;
        for (int i = 0; i <index-1 ; i++) {
            if (prev.next!=null){
                prev=prev.next;
            }
        }
        if (prev.next!=null){
            prev.next = prev.next.next;
        }
        size--;
    }

    public T get(int index){
        return null;
    }

    public boolean isEmpty(){
        return head==null||size==0;
    }

    public void clear(){
        if (!isEmpty()){
            head=null;
        }
    }

    @NonNull
    @Override
    public String toString() {
        if (head==null||size==0){
            return "空链表";
        }
        Node p = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (p!=null){
            stringBuilder.append("  "+p.data);
            p = p.next;
        }
        return stringBuilder.toString();

    }

    private static class Node<T>{
       Node<T> next;
       T data;

       public Node(Node<T> next, T data) {
           this.next = next;
           this.data = data;
       }

       public Node(T data) {
           this.data = data;
       }
   }
}
