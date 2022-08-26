package alphabets_numbers;

public class Number_Sys 
{
 public static void main(String args[]) 
 {
	 Number_Sys number=new Number_Sys ();
//	            number.String();
//	            number.String2();
//	            number.String3();
//	            number.String4();
	         // number.maximum();
	         // number.minimum();
	      //    number.divisors();
	         // number.gcd_1();
	         // number.lcm_1();
	 number.palindrome();
 } 
 
 
 //sum of the given n numbers
 public void String()
 {
  int num=10;
  int sum=0;
  for(int i=1;i<=num;i++)
  {
	sum=sum+i; 
	
  }
  System.out.println(sum);
 }
 
 
 // product of the given n numbers
 public void String2()
 {
	 int num=5;
	  int sum=1;
	  for(int i=1;i<=num;i++)
	  {
		sum=sum*i;       	
	  }
		System.out.println(sum); 
 }
 
 
 
 
//Find the LCM for given numbers 
 public void String3()
 {
  int a=7;
  int b=3;
  int large=0;
  if(b>a) {
	  large=b;
         }
  else
	  large=a; 
  while(true)
  {
	if(large%a==0 && large%b==0)  {
		System.out.println(large);
		break;
	}
	large++;
  }
 }
 
 
//Find the GCD for given numbers 
 public void String4()
 {
	 int a=10;
	 int b=30;
	 int small=1;
	 if(b>a) 
	 {
	  small=a;
	 }
     else
	  small=b;
	 while(true) 
	 {
	  if(small%a==0 && small%b==0)	
	    {
		  System.out.println(small);
		  break;
	    }
	  small++;
	 }
}
 
 
 
 //Find the divisors of the given number
 public void divisors()
 {  
   int a=112;
   int i=2;
   while(i<a)
   {
	 if(a%i==0)
	 {
	  System.out.println(i+" is one of the divisor of the given number");
	 }
	 i++;
   } 
 }

 
 //find the max number in the 12,24,27
  public void maximum() 
  {
   int a=12;
   int b=24;
   int c=27;
     if(a>=b && a>=c)
    	 System.out.println(a+" is maximum");
     else if(b>=a && b>=c)
    	 System.out.println(b+" is maximum");
     else
    	 System.out.println(c+" is maximum");
  }
  
  
  //Find the minimum number in 12,24,27
  public void minimum() 
  {
   int a=12;
   int b=24;
   int c=27;
   if(a<=b && a<=c)
  	 System.out.println(a+" is minimum");
   else if(b<=a && b<=c)
  	 System.out.println(b+" is minimum");
   else
  	 System.out.println(c+" is minimum");
   
  }
  
  
  
  
  public void gcd_1()
  {
   int a=3;
   int b=9;
   int c=21;
   int gcd=0;
   int small=1;
   if(a>b && a>c) 
   {
	small=b;   
   }
   else if(b>c && b>a)
   {
	small=c;   
   }
   else
	   small=a;
   
   System.out.println(small+" is the smallest,out of given numbers");
   
   for(int i=2;i<=small;i++)  //(2<=3)
   {
	 if(a%i==0 && b%i==0 && c%i==0) 
	 {
	  gcd=i;	 
	 }
   }
   System.out.println(gcd+" is the gcd for given numbers");
  }
  
  
  
  
  public void lcm_1()
  {
   int x=20;
   int y=45;
   int z=50;
   int lcm=0;
   int large=1;
    if(x>y && x>z) 
    {
	 large=x;    
    }
    else if(y>z && y>x)
    {
     large=y;	
    }
    else 
    	large=z;
    
    System.out.println(large+" is the largest,out of given numbers");
    
    for(int i=large;true;i++)
    {
     if(i%x==0 && i%y==0 && i%z==0)	
     {
    	 lcm=i;
    	 System.out.println(lcm+" is the lcm for given  numbers");
    	 break;
     }
    }  
  }
  
  
  
  
  public void palindrome()
  {
   int a=5678;
   int p=0;
     while(true)
     {  
      if(a>0)
    	 {	
	     p=a%10;
	     a=a/10;
	     System.out.print(p);
         }
      else
    	 break;  	
      }	
   }    
  }
 






