package test;

import java.util.*;

import myarray.MyArray;

public class TestArray {

	public static void main(String[] args) {
		
		MyArray obj = new MyArray();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number Of Elements You Wanted To Add in Array (Less Than 10): ");
		int num = sc.nextInt();
		
		if(num < 10) {
			for (int i = 0 ; i < num; i++) {
				System.out.println("Enter Element For Index "+ i + " : ");
				int a = sc.nextInt();
				obj.add(a);
			}
		}
		
//		System.out.println(obj);
		
//		obj.add(7);
//		System.out.println(obj);
		
//		obj.add(8, 2);
		System.out.println(obj);
//		System.out.println("Posistion Of The Value 45 Is : " + obj.searchByValue(45));
		
//		obj.deleteByPos(1);
//		System.out.println(obj);
//		obj.deleteByValue(5);
//		System.out.println(obj);
		
//		int [] arr1 = obj.exchangeIndexValues();
//		for (int i : arr1) {
//			System.out.print(i + "\t");
//		}
//		System.out.println();
		
		obj.reveseArray(true);
		System.out.println(obj);
//		for (int i : arr1) {
//			System.out.print(i + "\t");
//		}
		
		obj.rotateArray(false, 3);
		System.out.println(obj);

	}

}
