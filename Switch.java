package s;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) 
	{
	 int  I=0;
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("Enter i value");
	 int i=sc1.nextInt();
	 if(i==1)
	  {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter CoffeeType");
		 int CoffeeType=sc.nextInt();
		 switch(CoffeeType)
		 {
		 case 1:
		 System.out.println("Black Cofee");
		 break;
		 case 2:
		 System.out.println("Java Cofee");
		 break;
		 case 3:
		 System.out.println("Sugarless Cofee");
		 break;
		 }	
	 } 
	 else if(i==2)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter TeaType");
		 int Teatype=sc.nextInt();
		 switch(Teatype)
		 {
	     case 1:
		 System.out.println("Green Tea");
		 break;
		 case 2:
		 System.out.println("Black Tea");
		 break;
		 case 3:
		 System.out.println("Sugarless Tea");
		 break;
	     }
	 }
	}
}
   




/*int a=8,b=10,ch=2;
      switch(ch)
      {
      case 1: 
      System.out.println(a+b);
      break;
      case 2:
      System.out.println(a-b);
      break;
      case 3:
      System.out.println(a*b);
      break;
      case 4:
      System.out.println(a/b);
      break;
      case 5:
      System.out.println(a%b);
      break;
      }    
	}
}*/
