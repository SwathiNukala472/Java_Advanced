package com.test.java8;

public class LinkedListOperations {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}

	public static LinkedListOperations insert(LinkedListOperations list,int data) {
		Node newNode=new Node(data);
		if(list.head==null) {
			list.head=newNode;
		}
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		return list;
	}
	
	public static void print(LinkedListOperations list) {
		Node currentNode=list.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data +" ");
			currentNode=currentNode.next;
		}
	}
	//key is data //delete by key
	public static LinkedListOperations deleteByKey(LinkedListOperations list,int key) {
		Node currentNode=list.head;
		Node prev=null;
		
		if(currentNode.data==key ) {
			list.head=currentNode.next;
			System.out.println("key is head");
			return list;
		}
		//else {
			while(currentNode!=null && currentNode.data!=key){
				prev=currentNode;
				currentNode=currentNode.next;
			}
		//}
		
		if(currentNode!=null) {
			prev.next=currentNode.next;
			System.out.println("key  found");
		}
		if(currentNode==null) {
			System.out.println("key Not found");
		}
		return list;
	}
	//delete the element by position//position starts from 0 
	public static LinkedListOperations deleteByPosition(LinkedListOperations list,int position)
	{
		Node currentNode=list.head;
		Node prev=null;
		if(position==0) {
			list.head=currentNode.next;
			System.out.println("position is at head");
			return list;
		}
		//if(position==list.s)
		int count=1;
		while(currentNode !=null && position >=count) {
			prev=currentNode;
			currentNode=currentNode.next;
			count++;
		}
		if(currentNode!=null) {
			prev.next=currentNode.next;
			System.out.println("position  found");
		}
		if(currentNode == null) {
			//prev.next=currentNode.next;
			System.out.println("position not  found");
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations list=new LinkedListOperations();
		list.insert(list, 1);
		list.insert(list, 3);
		list.insert(list, 5);
		list.insert(list, 7);
		list.insert(list, 9);
		
		
		LinkedListOperations.print(list);
		//deleting by key
		LinkedListOperations list1=deleteByKey(list,5);
		LinkedListOperations.print(list1);
		
		//remove at position 0 means head
		LinkedListOperations list2=LinkedListOperations.deleteByPosition(list, 0);
		LinkedListOperations.print(list2);
		
		//remove at position 2
		LinkedListOperations list3=LinkedListOperations.deleteByPosition(list, 2);
		LinkedListOperations.print(list3);
		
		//remove last element
		LinkedListOperations list4=LinkedListOperations.deleteByPosition(list,4 );
		LinkedListOperations.print(list4);
		
	}

}
