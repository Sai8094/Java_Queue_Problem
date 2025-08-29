package com.inbuiltqueue;

public class CircularQueue {
	private int[] arr;
	private int front, rear, size, capacity;

	public CircularQueue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	public void enqueue(int x) {
		if (isFull()) {
			System.out.println("Queue is full!");
			return;
		}
		rear = (rear + 1) % capacity;
		arr[rear] = x;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int value = arr[front];
		front = (front + 1) % capacity;
		size--;
		return value;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public static void main(String[] args) {
		CircularQueue circluarqueue = new CircularQueue(3);
		circluarqueue.enqueue(10);
		circluarqueue.enqueue(20);
		circluarqueue.enqueue(30);
		System.out.println(circluarqueue.dequeue());
		circluarqueue.enqueue(40);
		System.out.println(circluarqueue.dequeue());
	}
}
