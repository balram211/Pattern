import java.util.*;
class Pattern{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Pattern fib=new Pattern();
		fib.Fibonacci(n/2 +1);
		fib.prime(n/2);
		
		
	}

public void Fibonacci(int n){
	int  a=1;
	int b=1;
	System.out.print(a);
	System.out.print(" "+b);
	for(int i=1;i<=n;i+=2)
	{
		int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
}
public void prime(int n){
	for(int i=2;i<=n;i+=2)
	{
		int j,fact,k;
   
    for(j=1; j<=n; j++)
    {
        fact=0;
        for(k=1; k<=n; k++)
        {
            if(j%k==0)
			{
                fact++;
			}
        }
        if(fact==2)
		{
            System.out.print(" "+j);
		}
    }
	}
}
}
/*
public Prime(){
	for(int i=2;i<=n;i=i+2){
		while(n!=0){
			if(i%n==0)
		}
	}
}
*/
