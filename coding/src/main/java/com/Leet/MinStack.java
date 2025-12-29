package com.Leet;

public class MinStack {
    private Node head;

    public MinStack(){

    }
    public void push(int num){
        if(head == null){
            head = new Node(num,num,null);
        }
        else{
            head = new Node(num,Math.min(head.min,num),head);
        }
    }
    public void pop(){
        head = head.next;
    }

    public int top(){
        return head.val;
    }

    public int getMin(){
        return head.min;
    }

    private class Node{
        int val;
        int min;
        Node next;
        Node(int val,int min,Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
