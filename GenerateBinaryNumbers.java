package com.inbuiltqueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {
		int n = 10;
		generate(n);
	}

	public static void generate(int n) {
		Queue<String> queue = new LinkedList<>();
		queue.add("1");

		for (int i = 1; i <= n; i++) {
			String curr = queue.poll();
			System.out.print(curr + " ");
			queue.add(curr + "0");
			queue.add(curr + "1");
		}
	}
}
