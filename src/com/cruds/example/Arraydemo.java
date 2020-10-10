package com.cruds.example;

public class Arraydemo 
{
// types of array demo
	public static void main(String[] args)
	{
		/*int[] Arrele=new int[5];
		Arrele[0]=54;
		Arrele[1]=154;
		Arrele[2]=524;
		Arrele[3]=542;
		Arrele[4]=555;
		/*for(int ele:Arrele)
		{
			
			//System.out.println(Arrele[0]);
			System.out.println(ele);
		}*/
		/*for (int i=0;i<Arrele.length;i++)
		{
			System.out.println("array elements==>" +Arrele[i]);
		}*/
		int[][] arr={
								{12,23,34,45},
								{12,56,89,68,69},
								{11,12,13,14,11}		
					};
		System.out.println("array ele of[0][0]==>" +arr[2][4]);
		/*for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(" array elements are==>" +arr[i][j]);
			}
		}
		*/
		
	}
}
