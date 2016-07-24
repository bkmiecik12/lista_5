import java.util.*;

public class ShellSort {

	static int a1[]=new int[8];	//h1=1 hi+1=3hi+1
	static int a2[]=new int[9];
	static int a3[]=new int[10];
	static int a4[]=new int[11];
	
	static int b1[]=new int[12];	//2^(k)-1
	static int b2[]=new int[13];
	static int b3[]=new int[15];
	static int b4[]=new int[16];
	
	static int c1[]=new int[13];	//2^(k)+1
	static int c2[]=new int[14];
	static int c3[]=new int[16];
	static int c4[]=new int[17];
	
	static int d1[]=new int[19];	//fibonacci
	static int d2[]=new int[20];
	static int d3[]=new int[24];
	static int d4[]=new int[25];
	
	static int e1[]=new int[1000];	//hi=3/4*hi-1
	static int e2[]=new int[1000];
	static int e3[]=new int[1000];
	static int e4[]=new int[1000];
	
	static int t1[];
	static int t2[];
	
	ShellSort(int s)
	{
		t1=new int[s];
		t2=new int[s];
		
		Random r=new Random();
		for(int i=0;i<t1.length;i++)
			t1[i]=r.nextInt(1000);
		
	}
	
	public void kopia()
	{
		for(int i=0;i<t1.length;i++)
			t2[i]=t1[i];
	}
	
	public void BubbleSort(int [] num)
	{
	    int j;
	    boolean flag = true;
	    int temp;
	    
	    while (flag)
	    {
	   	 flag=false;
	        for(j=0;j<num.length-1;j++)
	        {
	        	if (num[j]>num[j+1])
	        	{
	        		temp = num[j];
	                num[j] = num[j+1];
	                num[j+1] = temp;
	                flag=true;
	             } 
	         } 
	    }
	}
	
	public void InsertSort(int [] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j;
			for(j=i-1;j>=0 && temp<a[j];j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
	}
	
	public void genA()
	{
		
			a1[0]=1;
			int i=1;
			while(i<a1.length)
			{
				a1[i]=a1[i-1]*3+1;
				i++;
			}
			//System.out.println("Tu jestem");
			a2[0]=1;
			i=1;
			while(i<a2.length)
			{
				a2[i]=a2[i-1]*3+1;
				i++;
			}
			
			a3[0]=1;
			i=1;
			while(i<a3.length)
			{
				a3[i]=a3[i-1]*3+1;
				i++;
			}
			
			a4[0]=1;
			i=1;
			while(i<a4.length)
			{
				a4[i]=a4[i-1]*3+1;
				i++;
			}
	}
	
	public void genB()
	{
		int i=1;
		b1[0]=(int) (Math.pow(2, 1)-1);
		while(i<b1.length)
		{
			b1[i]=(int) (Math.pow(2, i+1)-1);
			i++;
		}
		
		i=1;
		b2[0]=(int) (Math.pow(2, 1)-1);
		while(i<b2.length)
		{
			b2[i]=(int) (Math.pow(2, i+1)-1);
			i++;
		}
		
		i=1;
		b3[0]=(int) (Math.pow(2, 1)-1);
		while(i<b3.length)
		{
			b3[i]=(int) (Math.pow(2, i+1)-1);
			i++;
		}
		
		i=1;
		b4[0]=(int) (Math.pow(2, 1)-1);
		while(i<b4.length)
		{
			b4[i]=(int) (Math.pow(2, i+1)-1);
			i++;
		}
	}
	
	public void genC()
	{
		int i=1;
		c1[0]=(int) (Math.pow(2, 0));
		while(i<c1.length)
		{
			c1[i]=(int) (Math.pow(2, i)+1);
			i++;
		}
		
		i=1;
		c2[0]=(int) (Math.pow(2,0));
		while(i<c2.length)
		{
			c2[i]=(int) (Math.pow(2, i)+1);
			i++;
		}
		
		i=1;
		c3[0]=(int) (Math.pow(2, 0));
		while(i<c3.length)
		{
			c3[i]=(int) (Math.pow(2, i)+1);
			i++;
		}
		
		i=1;
		c4[0]=(int) (Math.pow(2, 0));
		while(i<c4.length)
		{
			c4[i]=(int) (Math.pow(2, i)+1);
			i++;
		}
	}
	public void genD()
	{
		d1[0]=1;
		d1[1]=1;
		int i=2;
		while(i<d1.length)
		{
			d1[i]=d1[i-1]+d1[i-2];
			i++;
		}
		
		d2[0]=1;
		d2[1]=1;
		i=2;
		while(i<d2.length)
		{
			d2[i]=d2[i-1]+d2[i-2];
			i++;
		}
		
		d3[0]=1;
		d3[1]=1;
		i=2;
		while(i<d3.length)
		{
			d3[i]=d3[i-1]+d3[i-2];
			i++;
		}
		
		d4[0]=1;
		d4[1]=1;
		i=2;
		while(i<d4.length)
		{
			d4[i]=d4[i-1]+d4[i-2];
			i++;
		}
	}
	
	public void genE()
	{
		double n=5000;
		int r=e1.length-1;
		e1[r]=(int)n/2;
		r--;
		while(n>=1)
		{
			e1[r]= (e1[r+1]*3)/4;
			r--;
			n=(double)n*0.75;
		}
		
		n=10000;
		r=e2.length-1;
		e2[r]=(int)n/2;
		r--;
		while(n>=1)
		{
			e2[r]= (e2[r+1]*3)/4;
			r--;
			n=(double)n*0.75;
		}
		
		n=50000;
		r=e3.length-1;
		e3[r]=(int)n/2;
		r--;
		while(n>=1)
		{
			e3[r]= (e3[r+1]*3)/4;
			r--;
			n=(double)n*0.75;
		}
		
		n=100000;
		r=e4.length-1;
		e4[r]=(int)n/2;
		r--;
		while(n>=1)
		{
			e4[r]= (e4[r+1]*3)/4;
			r--;
			n=(double)n*0.75;
		}
	}
	
	public void wyswietl(int a[])
	{
		for(int i=a.length-1;i>a.length-30;i--)
			System.out.printf("%d, ",a[i]);
		//System.out.printf("%d, ",a[a.length-3]);
		
		int i=0;
		//while(a[i]!=0)
		//{
		//	i++;
		//}
		//System.out.printf("indeks: %d ", i);
		System.out.println();
	}
	
	public void Shell1(int a[],int b[])
	{
		kopia();
		long start=System.nanoTime(); 
		int i=0;
		int h0=b.length-1;
		while(b[h0]>1)
		{
			i=0;
			int h=b[h0];
			while(i+h<a.length)
			{
				if(a[i]>a[i+h])
				{
					int temp=a[i];
					a[i]=a[i+h];
					a[i+h]=temp;
				}
				i++;
			}
			h0--;
		}
		for(int j=1;j<a.length;j++)
		{
			int temp=a[j];
			int k;
			for(k=j-1;k>=0 && temp<a[k];k--)
			{
				a[k+1]=a[k];
			}
			a[k+1]=temp;
		}
		long stop=System.nanoTime();
		System.out.printf("%12d|",(stop-start));
		
	}
	
	public void Shell2(int a[],int b[])
	{
		kopia();
		long start=System.nanoTime();
		int i=0;
		int h0=b.length-1;
		while(b[h0]>1)
		{
			i=0;
			int h=b[h0];
			while(i+h<a.length)
			{
				if(a[i]>a[i+h])
				{
					int temp=a[i];
					a[i]=a[i+h];
					a[i+h]=temp;
				}
				i++;
			}
			h0--;
		}
		BubbleSort(a);
		long stop=System.nanoTime();
		System.out.printf("%12d|",(stop-start));
	}
	
	public void Shell3(int a[],int b[])
	{
		kopia();
		long start=System.nanoTime();
		int i=0;
		int h0=b.length-1;
		while(b[h0]>1)
		{
			i=0;
			int h=b[h0];
			while(i+h<a.length)
			{
				if(a[i]>a[i+h])
				{
					int temp=a[i];
					a[i]=a[i+h];
					a[i+h]=temp;
				}
				i++;
			}
			h0--;
		}
		InsertSort(a);
		long stop=System.nanoTime();
		System.out.printf("%12d|",(stop-start));
	}
	
	public static void main(String[] args) {
			ShellSort s = new ShellSort(5000);
			s.genA();
			s.genB();
			s.genC();
			s.genD();
			s.genE();

			System.out.println("--------------------------------------------------");
			System.out.printf("%10s|%12s|%12s|%12s|\n","(5000)","Wersja 1","Wersja 2","Wersja 3");
			System.out.println("--------------------------------------------------");
			System.out.printf("%10s|","ci퉓 1");
			s.Shell1(t2, a1);
			s.Shell2(t2, a1);
			s.Shell3(t2, a1);
			System.out.println();
			System.out.printf("%10s|","ci퉓 2");
			s.Shell1(t2, b1);
			s.Shell2(t2, b1);
			s.Shell3(t2, b1);
			System.out.println();
			System.out.printf("%10s|","ci퉓 3");
			s.Shell1(t2, c1);
			s.Shell2(t2, c1);
			s.Shell3(t2, c1);
			System.out.println();
			System.out.printf("%10s|","ci퉓 4");
			s.Shell1(t2, d1);
			s.Shell2(t2, d1);
			s.Shell3(t2, d1);
			System.out.println();
			System.out.printf("%10s|","ci퉓 5");
			s.Shell1(t2, e1);
			s.Shell2(t2, e1);
			s.Shell3(t2, e1);
			System.out.println();
			System.out.println("--------------------------------------------------");
			s = new ShellSort(10000);
			System.out.printf("%10s|%12s|%12s|%12s|\n","(10000)","Wersja 1","Wersja 2","Wersja 3");
			System.out.println("--------------------------------------------------");
			System.out.printf("%10s|","ci퉓 1");
			s.Shell1(t2, a2);
			s.Shell2(t2, a2);
			s.Shell3(t2, a2);
			System.out.println();
			System.out.printf("%10s|","ci퉓 2");
			s.Shell1(t2, b2);
			s.Shell2(t2, b2);
			s.Shell3(t2, b2);
			System.out.println();
			System.out.printf("%10s|","ci퉓 3");
			s.Shell1(t2, c2);
			s.Shell2(t2, c2);
			s.Shell3(t2, c2);
			System.out.println();
			System.out.printf("%10s|","ci퉓 4");
			s.Shell1(t2, d2);
			s.Shell2(t2, d2);
			s.Shell3(t2, d2);
			System.out.println();
			System.out.printf("%10s|","ci퉓 5");
			s.Shell1(t2, e2);
			s.Shell2(t2, e2);
			s.Shell3(t2, e2);
			System.out.println();
			System.out.println("--------------------------------------------------");
			s = new ShellSort(50000);
			System.out.printf("%10s|%12s|%12s|%12s|\n","(50000)","Wersja 1","Wersja 2","Wersja 3");
			System.out.println("--------------------------------------------------");
			System.out.printf("%10s|","ci퉓 1");
			s.Shell1(t2, a3);
			s.Shell2(t2, a3);
			s.Shell3(t2, a3);
			System.out.println();
			System.out.printf("%10s|","ci퉓 2");
			s.Shell1(t2, b3);
			s.Shell2(t2, b3);
			s.Shell3(t2, b3);
			System.out.println();
			System.out.printf("%10s|","ci퉓 3");
			s.Shell1(t2, c3);
			s.Shell2(t2, c3);
			s.Shell3(t2, c3);
			System.out.println();
			System.out.printf("%10s|","ci퉓 4");
			s.Shell1(t2, d3);
			s.Shell2(t2, d3);
			s.Shell3(t2, d3);
			System.out.println();
			System.out.printf("%10s|","ci퉓 5");
			s.Shell1(t2, e3);
			s.Shell2(t2, e3);
			s.Shell3(t2, e3);
			System.out.println();
			System.out.println("--------------------------------------------------");
			s = new ShellSort(100000);
			System.out.printf("%10s|%12s|%12s|%12s|\n","(100000)","Wersja 1","Wersja 2","Wersja 3");
			System.out.println("--------------------------------------------------");
			System.out.printf("%10s|","ci퉓 1");
			s.Shell1(t2, a4);
			s.Shell2(t2, a4);
			s.Shell3(t2, a4);
			System.out.println();
			System.out.printf("%10s|","ci퉓 2");
			s.Shell1(t2, b4);
			s.Shell2(t2, b4);
			s.Shell3(t2, b4);
			System.out.println();
			System.out.printf("%10s|","ci퉓 3");
			s.Shell1(t2, c4);
			s.Shell2(t2, c4);
			s.Shell3(t2, c4);
			System.out.println();
			System.out.printf("%10s|","ci퉓 4");
			s.Shell1(t2, d4);
			s.Shell2(t2, d4);
			s.Shell3(t2, d4);
			System.out.println();
			System.out.printf("%10s|","ci퉓 5");
			s.Shell1(t2, e4);
			s.Shell2(t2, e4);
			s.Shell3(t2, e4);
			System.out.println();
			System.out.println("--------------------------------------------------");
	}

}