package CapgeminiAssignment;

import java.util.ArrayList;

public class Assignment4Q8 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
	
	Thread t=new Thread()
	{
		 public void run(){
			 System.out.println(a);
		 }
	};
	t.start();
	}
}