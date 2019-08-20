package com.revature;

public class Calcmarks {
	 static int [] marks= {50,60,70,80,90,66};
	 static int total=0;
	public static void arraymark() {
		// TODO Auto-generated method stub
		int [] marks= {50,60,70,80,90,66};
		int total=0;
		for(int mark:marks)//also b used as for(int i=0,i<marks.length,i++)
			                                       //int mark=marks[i]
		{
		
			total=total+mark;
			
		}
		System.out.println("total:" +total);
		int avg=total/marks.length;
	   System.out.println("aVERAGE:" +avg);	
	}
	public static int getTotal(int [] marks) {
		
		for(int mark:marks)
		{
		
			total=total+mark;
			
		}
		
		int avg=total/marks.length;
	  //System.out.println("aVERAGE:" +avg);	
	   return total;
	}
	
	public static void main(String[] args) {
		//arraymark();
		 total= getTotal(marks);
		 System.out.println("total:" +total);
	}

}
