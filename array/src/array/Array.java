package array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int[]arr = new int[5];
		acceptData(arr);
		
		displaydata(arr);
		
		int sum =sumData(arr);
		System.out.println(sum);
		int min=
		
		
	}

	private static int sumData(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void displaydata(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
		}
		
	}

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("enter Element");
			arr[i]=sc.nextInt();
			
		}
		
		
		
	}

	
}
