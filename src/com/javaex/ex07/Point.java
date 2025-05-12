package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
  
	 public boolean equals(Object obj) {
	       
	        if (obj != null && obj.getClass() == this.getClass()) {
	            Point p1 = (Point) obj; 
	            return this.x == p1.x; 
	        }else
	        return false;
	    }
		
			
	}

