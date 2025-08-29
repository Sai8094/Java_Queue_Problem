package com.inbuiltqueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	private Queue<Integer> queue1 = new LinkedList<>();
	private Queue<Integer> queue2 = new LinkedList<>();

	public void push(int x) {
		queue1.add(x);
	}

	public int pop() {
		while (queue1.size() > 1) {
			queue2.add(queue1.poll());
		}
		int top = queue1.poll();
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return top;
	}

	public int top() {
		while (queue1.size() > 1) {
			queue2.add(queue1.poll());
		}
		int top = queue1.peek();
		queue2.add(queue1.poll());
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return top;
	}

	public boolean isEmpty() {
		return queue1.isEmpty();
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop()); // 30
		System.out.println(stack.top()); // 20
	}

}
