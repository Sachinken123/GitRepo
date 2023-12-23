package day20.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		//ArrayList l1=new ArrayList();
				//or
		List list1=new ArrayList();
		
		list1.add("Pune");//auto up-casting from String objct to Object class object, Object obj="Pune";
		list1.add(10);//Auto boxing(from int to Integer object) dn auto up-casting(Integer object to Object class object)
		list1.add(true);//Auto boxing dn auto up-casting
		
		System.out.println("element count: "+list1.size());
		System.out.println("List elements are: "+list1);
		list1.add(1, "Bangalore");
		System.out.println("element count: "+list1.size());
		System.out.println("List elements are: "+list1);
		//to get element from list use get(index) which will return element from the list in the form of Object
		Object obj=list1.get(0);
		System.out.println(obj);
		for(int i=0;i<list1.size();i++) {
			System.out.println("Element at index-"+i+": "+list1.get(i));
		}
		//to update list element use set method
		list1.set(0, "Bangalore");
		System.out.println("element count: "+list1.size());
		System.out.println("List elements are: "+list1);
		System.out.println("********** List elements using for-each ***********");
		for(Object l1: list1) {
			System.out.println(l1);
		}
	}
}
