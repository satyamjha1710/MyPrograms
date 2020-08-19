import java.util.*;
interface sortoperations{
	public void sortm1(int arr[]);
	public void sortm2(int arr[]);
	public void sortm3(int arr[]);
}
class Bsort implements sortoperations
{
	public void sortm1(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
	}
	public void sortm2(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
	}
	public void sortm3(int arr[])
	{
		int flag=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
	}
}
class Test
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		Bsort obj=new Bsort();
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i>0;i++)
		{
			int a=sc.nextInt();
			if(a==1)
			{
				obj.sortm1(arr);		
			}
			else if(a==2)
			{
				obj.sortm2(a);
			}
			else if(a==3)
			{
				obj.sortm3(a)
			}	
		}
	}
}