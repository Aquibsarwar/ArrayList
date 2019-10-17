package com.arrayPractice.javaLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class ArrayDemo {

	private final static int INITIAL_VALUE=5;
	
	
	public static void shouldDemonstrateArrayList() {
		List<String> elements = new ArrayList<>(INITIAL_VALUE);
		//Collection<String> elements = new ArrayList<>(INITIAL_VALUE);
		elements.add("ラキブ");
		elements.add("沖中さん");
		elements.add("秋田さん");
		elements.add("社長");
		elements.add("E");
		elements.add("C");
		System.out.println(elements.size());
	
		elements.remove("D");
		System.out.println(elements.size());
		System.out.println(elements);
		System.out.println(elements.isEmpty());
		
		elements.add(0, "アキブ");
		elements.contains("E");
		System.out.println(elements.contains("E"));
		
		
		/*for(String str: elements) {
			System.out.println(str);
		}
		*/
	}
	
	
	public static void main(String[] args) {
	
		shouldDemonstrateArrayList();
	}
	
	
	
	}
	

