package Assignment;

import java.util.ArrayList;
import java.util.Iterator;


public class Assignment3Q8Part1 
{       
    public static void main(String[] args) 
    {
         
        ArrayList<Integer> list = new ArrayList<Integer>();
         
        list.add(1111);
         
        list.add(2222);
         
        list.add(3333);
         
        list.add(4444);
         
        list.add(5555);
         
        Iterator<Integer> it = list.iterator();
         
        while (it.hasNext())
        {
            Integer integer = (Integer) it.next();
             
            list.add(6666);      
        }
    }   
}
