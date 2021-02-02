package assignment2;

public class LargestandSmallest {
public static void main(String[] args)
{
	int a[]= {3,4,6,5,2,12};
	int large=a[0];
	int seclarge=0;
	int small=a[0];
	int secsmall=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>large)
		{
			seclarge=large;
			large=a[i];
			
		}
		else if(a[i]<small)
		{
			secsmall=small;
			small=a[i];
			
		}
		System.out.println("Largest number is "+large);
		System.out.println("Second largest number is "+seclarge);
		System.out.println("Smallest number is "+small);
		System.out.println("Second smallest number is "+secsmall);
	}
	
	
}
}
