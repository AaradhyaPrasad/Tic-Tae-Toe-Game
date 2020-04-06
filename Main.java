import java.util.*;
public class Main
{
    static char arr[] ={'1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'}; 
    
    static int count=0;
    
    public void display()
		{
		  System.out.println("    "+arr[0]+"  |  "+arr[1]+"  |  "+arr[2]+"   ");
		  
		  System.out.println("---------------------");
		  
		  System.out.println("    "+arr[3]+"  |  "+arr[4]+"  |  "+arr[5]+"   ");
		  
		  System.out.println("---------------------");
		  
		  System.out.println("    "+arr[6]+"  |  "+arr[7]+"  |  "+arr[8]+"   ");
		}
		public void chance() 
		{
		    char c;
		    if(count%2==0)
		    {
		        c='0';
		    }
		    else
		    {
		        c='x';
		    }
		    char z;
		    Scanner sc=new Scanner(System.in);
		    z=sc.next().charAt(0);
		    int f=0;
		    for(int i=0;i<9;i++)
		    {
		        if(arr[i]==z)
		        {
		            arr[i]=c;
		            f=1;
		        }
		    }
		    if(f==0)
		    {
		        System.out.println("Invalid Input");
		        chance();
		    }
		}
		
		public boolean check()
		{
		    if(arr[0]==arr[1] && arr[1]==arr[2])
		    {
		        return true;
		    }
		    if(arr[3]==arr[4] && arr[4]==arr[5])
		    {
		        return true;
		    }
		    if(arr[6]==arr[7] && arr[7]==arr[8])
		    {
		        return true;
		    }
		    if(arr[0]==arr[3] && arr[3]==arr[6])
		    {
		        return true;
		    }
		    if(arr[1]==arr[4] && arr[4]==arr[7])
		    {
		        return true;
		    }
		    if(arr[2]==arr[5] && arr[5]==arr[8])
		    {
		        return true;
		    }
		    if(arr[0]==arr[4] && arr[4]==arr[8])
		    {
		        return true;
		    }
		    if(arr[2]==arr[4] && arr[4]==arr[6])
		    {
		        return true;
		    }
		    
		    return false;
		    
		}
		
	public static void main(String[] args) 
	{
	    Main m= new Main();
	   
	  m.display();
	  
	  while(count<9)
	  {
	      m.chance();
          boolean boo=m.check();
          if(boo==true)
          {
              if(count%2==0)
              {
                  System.out.println("Winner is 0");
                  break;
              }
              else
              {
                  System.out.println("Winner is X");
                  break;
              }
              
	     
          }
           m.display();
	      count++;
	       
	  }
	  if(count==9)
	  {
	      System.out.println("Draw");
	  }
	 
	}
}


