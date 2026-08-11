

import java.util.*;
public class FinalsActivityMainMenu 
{
	static 	String Arr[] = {"Tim", "Dot", "Eva", "Roy", "Tom", "Kim", "Guy", "Amy", "Jon", "Ann", "Jim", "Kay", "Ron", "Jan"};
    static int N = Arr.length;
	static int Interval;
	static int Start, Unsrt_Indx, Srt_Indx;
	static String Temp;
    
    static Scanner wehttam = new Scanner(System.in);
    //1st method
    static void Insert_Sort(){
		int Srt_Indx,Unsrt_Indx, i;
		String[] Arr = {"Jafar", "Genie", "Alladin", "Jasmine", "Abu"};
		int N = Arr.length;
		String Temp;
		
		if(N==1)
		{
			System.exit(0);
		}
		
		Unsrt_Indx = 1;
		while(Unsrt_Indx<N)
		{
			if((Arr[Unsrt_Indx-1].compareTo(Arr[Unsrt_Indx])>0))
			{
				Srt_Indx = Unsrt_Indx;
				Temp = Arr[Srt_Indx];
				
				while((Srt_Indx>0)&&(Arr[Srt_Indx-1].compareTo(Temp) > 0 ))
				{
					Arr[Srt_Indx] = Arr[Srt_Indx-1];
					Srt_Indx--;
				}
				Arr[Srt_Indx] = Temp;
			}
			Unsrt_Indx++;
		}
			System.out.println();
			System.out.println("Sorted array:");
			for (int a = 0; a<N; a++) {
				System.out.println(Arr[a]);
		    }
		}
    //2nd method
    static void Select_Sort() {
		String[] Arr = {"Alladin", "Genie", "Jasmine", "Jafar", "Abu"};
		int N = Arr.length;
		int Indx, PosHigh, I;
		String Temp;
		
	{
		
		{
			if(N==0)
				System.exit(0);
		}
		Indx = 4;
		
		while(Indx>1)
		{
			PosHigh = 1;
			I = 2;
			
			while(I<=Indx)
			{
				if(Arr[I].compareTo(Arr[PosHigh])>0)
				{
					PosHigh = I;
				}
				I++;
				}
				if(PosHigh != Indx)
				{
					Temp = Arr[PosHigh];
					Arr[PosHigh] = Arr[Indx];
					Arr[Indx] = Temp;
				}
				Indx--;
		}
		
		for (int i = 0; i<N; i++) {
			System.out.println(Arr[i]);
	    }
	}
    }
   	//3rd method
   	static void Shell_Sort() {
		
		if(N==0)
		{
				System.exit(0);
		}
		Interval = N;
		while(Interval != 1)
		{
			Interval = ((Interval/3)+1);
			if((Interval % 2) != 0)
			{
				Interval = (int) Interval;
			}
			Start = 1;
			while(Start<=Interval)
			{
				Srt();
				Start++;
			}
		}
		
		for (int i = 0; i<N; i++) {
			System.out.println(Arr[i]);
	    }
	}
	static void Srt(){
		Unsrt_Indx = (Start+Interval-1);
		while(Unsrt_Indx<N)
		{
			if((Arr[Unsrt_Indx - Interval]).compareTo(Arr[Unsrt_Indx])>0)
			{
				Srt_Indx = Unsrt_Indx;
				Temp = Arr[Srt_Indx];
				
				while((Srt_Indx>Start)&&((Arr[Srt_Indx-Interval]).compareTo(Temp)>0))
				{
					Arr[Srt_Indx] = Arr[Srt_Indx-Interval];
					Srt_Indx = (Srt_Indx-Interval);
				}
				Arr[Srt_Indx] = Temp;
			}
			Unsrt_Indx = (Unsrt_Indx+Interval);
		}
	}
	
    
 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
   public static void main(String[] args)
    {
    	//Initialize
    	int a = 0;
    	//list
    	System.out.println("Choose what program do you want to use.");
		System.out.println("-------------------------------------------------");
		System.out.println("1.Insert_Sort");
		System.out.println("2.Select_Sort");
		System.out.println("3.Shell_Sort");
		System.out.println("4.EXIT");
		
 		System.out.println("-------------------------------------------------");
 		System.out.println("Want to use a program? ");
 		System.out.print("Please Enter the Number: ");
    	a = wehttam.nextInt();
    	//main condition
    	while ( a != 4) 
    	{
    	if ( a == 1 ) 
    		{
    		System.out.println("-----------------------------------------------------");
        	System.out.println("------Insert_Sort------\n");
        	Insert_Sort();
        	System.out.println("-----------------------------------------------------");
        	System.out.println("Want to use another program?");
        	System.out.print("Enter the number: ");
        	a = wehttam.nextInt();
    		}
        else if ( a == 2 ) 
        	{
           	System.out.println("-----------------------------------------------------");
        	System.out.println("------Select_Sort------\n");
        	Select_Sort();
        	System.out.println("-----------------------------------------------------");
        	System.out.println("Want to use another program?");
        	System.out.print("Enter the number: ");
        	a = wehttam.nextInt();
        	}
        else if ( a == 3 ) 
        	{
        	System.out.println("-----------------------------------------------------");
        	System.out.println("------Shell_Sort------\n");
        	Shell_Sort();
        	System.out.println("-----------------------------------------------------");
        	System.out.println("Want to use another program?");
        	System.out.print("Enter the number: ");
        	a = wehttam.nextInt();
        	}
        else 
      	 	{
        	System.out.println("-----------------------------------------------------");
        	System.out.println("Invalid Key. Please Enter a Valid Key in the Menu");
        	System.out.println("Other else EXIT the program.");
        	System.out.println("-----------------------------------------------------");
        	System.out.println("Want to use another program?");
        	System.out.println("Enter the number: ");
        	a = wehttam.nextInt();
        	}
    	}
    	System.out.println("-----------------------------------------------------");
    	System.out.println("Thank you!!!.");
    	System.out.println("Bye! Bye!! :D");
    	System.out.println("-----------------------------------------------------");
    }
    
}
