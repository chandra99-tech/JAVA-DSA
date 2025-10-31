package search;

public class SearchService {

	public static int sequentialSearch(int[] arr, int i) {
		for(int j=0;j<arr.length;j++) {
			if(arr[j]== i) {
				return j;
			}
		}
		return -1;
	}

	public static int binarySearchNonRecursive(int[] arr, int i) {
		int low=0;
		int high=arr.length-1;
        int count=0;
        while(low<=high) {
        	int mid= (low+high)/2;
        	count++;
        	if(arr[mid]==i) {
        		System.out.println("Comparision is"+ count);
        		return mid;
        	}
        	if(i<arr[mid]) {
        		high=mid-1;
        	}
        	else{
        		low=mid+1;
        	}
        }
        
        System.out.println("Comparision are"+ count);
    	return -1;
    	
	}

	public static int binarySearchRecursive(int[] arr, int i, int j, int k) {
		System.out.println("binary search out"+ j+"----"+k);
		if(j<=k) {
			int mid=(j+k)/2;
			if(i==arr[mid]) {
				return mid;
			}else if(i<arr[mid]){
				return binarySearchRecursive(arr,i,j,mid-1);
				}
			else {
				return binarySearchRecursive(arr,i,mid+1,k);
			}
		}
		return -1;
		
	}
	

}

