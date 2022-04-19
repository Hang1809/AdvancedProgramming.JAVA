package com.codegym;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public MyLinkedList() {
    }

    private  class Node{
        private Node next;
        private Object data;

        public Node (Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }

    public void add (int index, Object data){
        Node temp = head;
        Node holder;
        for (int i=0; i< index -1 && temp.next !=null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node (data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes ++;
    }
    public void addLast(Object data){
      if (head == null){
          addFirst(data);
      } else {
          Node temp = head;
          while (temp.next != null){
              temp=temp.next;
          }
          temp.next = new Node(data);
      }
      numNodes++;
    }

    public Object removeAtPosition (int index){
        Node temp = head;
        for (int i=0; i< index -1 ; i++){
            temp = temp.next;
        }
        if(index ==0) return head = temp.next;
        return temp.next = temp.next.next;
    }



    public Node get (int index){
        if(index >= numNodes || index < 0){
            System.out.println("Index invalid");
        } else{
            Node temp = head;
            for (int i=0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
        return null;
    }


    public boolean contains (Object data) {
        {
            Node current = head;
            while (current !=null) {
                if (current.data.equals(data)) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    public boolean remove (Object e){
       if (contains(e)){
           removeAtPosition(indexOf(e));
           return true;
       }
       return false;
    }

    public MyLinkedList clone(){
        MyLinkedList newList = new MyLinkedList();
        Node temp = head;
        for (int i=0 ; i< numNodes; i++){
            newList.addLast(temp.data);
            temp = temp.next;
        }
        return newList;
    }


    public int indexOf(Object e){
        Node temp = head;
        for ( int i = 0; i< numNodes; i++){
            if (e.equals(temp.data)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }


    public Node getFirst(){
        if (numNodes !=0){
            return head;
        } else {
            return null;
        }
    }

    public Node getLast(){
        if(numNodes ==0){
            return null;
        }else {
            Node temp = head;
            for ( int i =0 ; i< numNodes -1 ; i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    public void clear(){
        head = null;
        numNodes = 0;
    }

    public int size(){
        return numNodes;
    }

    public void printList(){
        Node temp= head;
        while (temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }





}
