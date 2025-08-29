package com.inbuiltqueue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {
	public static void interleave(Queue<Integer> queue) {
		if (queue.size() % 2 != 0) {
			System.out.println("Queue must have even number of elements");
			return;
		}

		int halfSize = queue.size() / 2;
		Queue<Integer> firstHalf = new LinkedList<>();

		for (int i = 0; i < halfSize; i++) {
			firstHalf.add(queue.poll());
		}

		while (!firstHalf.isEmpty()) {
			queue.add(firstHalf.poll());
			queue.add(queue.poll());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= 6; i++)
			queue.add(i);

		System.out.println("Before: " + queue);
		interleave(queue);
		System.out.println("After: " + queue);
	}
}
