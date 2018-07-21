package com.jda.datastructureprograms;
import com.jda.utility.Node;
import com.jda.utility.Utility2;

import java.util.HashMap;

public class Hashing {
	
	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\1023340\\Documents\\JAVAPROJECT\\numbers.txt";
		Utility2 utility = new Utility2();
		HashMap<Integer, Node<Integer>> map = new HashMap<>();
		String[] numbers = utility.readFileForIntegers(fileLocation);
		for(int i=0;i<numbers.length;i++) {
			int number = Integer.parseInt(numbers[i]);
			int remainder = number%11;
			if(map.containsKey(remainder)) {
				Node<Integer> temp = map.get(remainder);
				Node<Integer> newNode = map.get(remainder);
				while(temp.next!=null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			else {
				
			}
			Node<Integer> newNode = new Node<Integer>(number);
			map.put(remainder, newNode);
		}
		for(Integer name: map.keySet()) {
			String key = name.toString();
			String value = map.get(name).toString();
			System.out.println(key + value);
		}
	}

}