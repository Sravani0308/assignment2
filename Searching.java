package assignment2;

public class Searching {
public static void main(String[] args) {
	int ar[]= {1,4,34,56,7};
	int key=56;
	int position=-1;
	int location=0;
	for(int i=0;i<ar.length;i++)
	{
		if(key==ar[i])
		{
			position=1;
			location=i+1;
		}
	}
	if(position==-1)
	{
		System.out.println("Not in Array");
	} 
	else {
		System.out.println("element found at "+ location);
	}
}
}
