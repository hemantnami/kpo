package abc;

import java.util.Arrays;

public class Day3 {

	void sort() //method declaration
	{
		int arr[]={4,7,3,9,2};
Arrays.sort(arr); //method implemeation
System.out.println(Arrays.toString(arr));
	}
	void rev()
	{
		int arr[]={4,7,3,9,2};
for(int i=arr.length;i<=0;i--)
{
	System.out.println(arr[i]);

}
	}
	void diif()
	{
		int arr[]={4,7,3,9,2};
		int arr1[]={3,2,12,9,4};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr1.length;i++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.print(arr[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		Day3 d=new Day3();//method calling
int adhar[]={20,30,40,50,60};//single array
int adhar1[][]={{15,40,45},{100,2,96,25}};
//System.out.println(adhar1[1][0]);
//for(int i=0;i<adhar.length;i++)
//{
//	System.out.println(adhar[i]);
//}
int arr[]={4,7,3,9,2};
int arr1[]={3,2,12,9,4};

for(int i=0;i<arr.length;i++)
{
	for(int j=0;i<arr1.length;i++)
	{
		if(arr[i]==arr1[j])
		{
			System.out.print(arr[i]);
		}
	}
}
	}

}
