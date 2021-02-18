package javaClassesAssignment;
import java.util.*;
public class Q4{
	class Area{
	  int length;
	  int breadth;
	  public Area(int l, int b){
	    length = l;
	    breadth = b;
	  }
	  public int getArea(){
	    return length*breadth;
	  }
	}

	class Solution {
	  void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int l,b;
	    System.out.println("Enter length");
	    l = s.nextInt();
	    System.out.println("Enter breadth");
	    b = s.nextInt();
	    
	    s.close();
	    
	    Area a = new Area(l,b);
	    System.out.println("Area : "+a.getArea());
	  }
	}
}