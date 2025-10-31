package test;

import search.SearchService;

public class TestSearch {

	public static void main(String[] args) {
	
		int arr[] = {2,5,7,4,6,9,2,45,5};
		int pos =SearchService.sequentialSearch(arr,2);
		if(pos!=-1) {
			System.out.println("The Number Found at Position :"+ pos);
		}
		else {
			System.out.println("Element Not Found");
		}
		
		int arr1[]= {12,14,11,19,15,35,92,45,};
		 pos=SearchService.binarySearchNonRecursive(arr1,92);
		if(pos!=-1) {
			System.out.println("The Number Found at Position :"+ pos);
		}
		else {
			System.out.println("Element Not Found");
		}
		
		pos=SearchService.binarySearchRecursive(arr1,35,0,7);
		if(pos!=-1) {
			System.out.println("The Number Found at Position :"+ pos);
		}
		else {
			System.out.println("Element Not Found");
		}

	}
	
}
