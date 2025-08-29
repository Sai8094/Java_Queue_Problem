package com.inbuiltqueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

	public static void findFirstNonRepeating(String stream) {
		Queue<Character> queue = new LinkedList<>();
		Map<Character, Integer> freq = new HashMap<>();

		for (char c : stream.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
			queue.add(c);

			while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
				queue.poll();
			}

			if (queue.isEmpty())
				System.out.print("-1 ");
			else
				System.out.print(queue.peek() + " ");
		}
	}

	public static void main(String[] args) {
		String stream = "aabc";
		findFirstNonRepeating(stream);
	}

}
