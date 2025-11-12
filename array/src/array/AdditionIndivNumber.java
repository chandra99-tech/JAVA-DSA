package Arrays;

public class AdditionIndivNumber {

	public static void main(String[] args) {
		int arr[] =new int[] {14,55,66,97,7,4,66,53,8,5};
		
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println("The sum of Every Individual is :" + sum);
		for(int i=0;i<arr.length;i++) {
			  int sum=0;
			  int num=arr[i];
			while(num!=0) {
				int r=num%10;
				 sum=sum+r;
				 num=num/10;
				 
			}
			
			System.out.println("the sum of "+arr[i]+"is "+sum);
		}

	}

}
