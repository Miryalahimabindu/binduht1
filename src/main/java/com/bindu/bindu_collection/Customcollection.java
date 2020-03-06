package com.bindu.bindu_collection;
import java.util.*;
import java.io.*;
class SNT1Collection {
	 private Object[] objArray = new Object[10];
	 private int elementCount=0;
	 public void add(Object obj) {
		 if(elementCount==objArray.length) {
			 increaseCapacity();
		 }
		 objArray[elementCount]=obj;
		 elementCount++;
		 
	 }
	 public void increaseCapacity() {
		 int newCapacity=objArray.length*2;
		 Object[] nextArray=new Object[newCapacity];
		 for(int i=0;i<objArray.length;i++) {
			 nextArray[i]=objArray[i];
		 }
		 objArray=nextArray;
	 }
	 public int capacity() {
		 return objArray.length;
	 }
	 public int size() {
		 return elementCount;
	 }
	 public Object get(int index) throws IndexOutOfBoundException {
		 if(index<0||index>=size()) {
			 throw new IndexOutOfBoundException();
		 }
		 return objArray[index];
	 }
	 public void remove(int index)  throws IndexOutOfBoundException{
		 if(index<0||index>=size()) {
			 throw new IndexOutOfBoundException();
		 }
		 while(index<size()-1) {
			 objArray[index]=objArray[index+1];
		     index++;
		 }
		 objArray[index]=null;
		 elementCount--;
	 }
	  public void display() {
          System.out.print("Displaying list : ");
          for (int i = 0; i < size(); i++) {
                 System.out.print(objArray[i] + " ");
          }
   }
}
	 
   class Customcollection{
	   public static void main(String[] args) throws IndexOutOfBoundException {
		   
		   SNT1Collection col = new SNT1Collection();
		   col.add("6");
		   col.add("b");
		   col.add("g");
		   col.add("7.5");
		   col.add("a");
		   col.add("5");
		   col.add(null);
		   col.add(null);
		   col.add("k");
		   col.add("7");
		   col.display();
		   System.out.println(col);
		   System.out.println(col.capacity());
		   System.out.println(col.size());
		   
		  Object obj=(col.get(1));
		   System.out.println(obj);
		  col.remove(2);
		   col.display();
		   
	   }
   }
   

