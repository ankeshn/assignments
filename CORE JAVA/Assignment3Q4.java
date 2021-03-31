package Assignment;

import java.util.*;
import java.util.Map.Entry;    
class DateClass {    
	  private int date;
	  private int month;
	  private int year;
	private String name;     
public DateClass(int date, int month, int year, String name ) {    
    this.date = date;
    this.month = month;
    this.year = year;
    this.name = name;
}    
public int compareTo(DateClass c) {  
    if(date>c.date){  
        return -1;  
    }else if(date<c.date){  
        return 1;  
    }else{
    	return 0;
    }
}
static class Assignment3Q5 {    
public static void main(String[] args) {        
    Map<Integer,DateClass> map=new HashMap<Integer,DateClass>();    
    DateClass b1=new DateClass(27,2,2000,"Nandi");    
    DateClass b2=new DateClass(8,9,1999,"Shivam");    
    DateClass b3=new DateClass(1,8,1999,"Samarth");     
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);    
    for(Entry<Integer, DateClass> entry:map.entrySet()){    
        int key=entry.getKey();  
        DateClass b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.date+"/"+b.month+"/"+b.year+" "+b.name);   
    }    
}    
}
}