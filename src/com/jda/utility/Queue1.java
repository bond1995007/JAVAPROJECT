package com.jda.utility;

public class Queue1<T extends Comparable<T>> {
	public Qnode<T> front = null;
	public Qnode<T> rear = null;

	public static class Qnode<S> {
		public S value;
		public Qnode<S> next;
        public String purpose=null;
        Qnode(S data)
        {value = data;
		next = null;
        }
		Qnode(S data,String pur) {
			value = data;
			purpose=pur;
			next = null;
		}
	}

	public Queue1() {
		rear = front = null;
	}
	public void enQueue(T data) {
		Qnode<T> newnode = new Qnode<T>(data);
		if (rear == null) {
			rear = front = newnode;
			return;
		}
		rear.next = newnode;
		rear = newnode;
	}
	

	public Qnode<T> deQueue() {
		if (front == null)
			return null;
		Qnode<T> temp=front;
		front = front.next;
		if (front == null)
			rear = null;
		return temp;

	}
	
	public boolean isEmpty() {
		
		if (front == rear)
			return true;
		else
			return false;
	}
	
}