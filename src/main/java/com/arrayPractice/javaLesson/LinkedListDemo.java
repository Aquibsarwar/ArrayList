package com.arrayPractice.javaLesson;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
			
			deque.add("akibu");
			deque.add("prangon");
			deque.add("rakibu");
			deque.addFirst("aysha");
			deque.addLast("Rohan");
			
		System.out.print(deque);
	}
}
