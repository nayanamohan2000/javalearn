package learningjava;

public class Selectionsort {
	public static void main(String[] args)
	{
		int a[]= {3,1,-2,7,4,0};
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			int minidex=i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[minidex])
				{
					minidex=j;
				}
			}
			int temp =a[i];
			a[i]=a[minidex];
			a[minidex]=temp;
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}

}
