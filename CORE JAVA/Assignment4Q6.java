package CapgeminiAssignment;

import java.util.ArrayList;

public class Assignment4Q6 {

	public static void main(String[] args) {
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("Ankesh");
		li.add("Nandi");
		li.add("Samarth");
		li.add("Shivam");
		
		System.out.println(li+"\n");
	
	li.stream().forEach(x->System.out.println(x.replaceAll(x, x.toUpperCase())));
	
	}
}