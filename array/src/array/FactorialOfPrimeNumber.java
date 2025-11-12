package Arrays;

public class FactorialOfPrimeNumber {

	public static void main(String[] args) {
		int arr[]= new int[]{1,3,10,13,17,19,11,5,2};
		for(int num:arr) {
			if(isPrime(num)) {
				long fact=isFactorial(num);
				System.out.println("The factorial of "+num+" is "+fact );
			}
		}
		
	}

	private static long isFactorial(int num) {
		long fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		
		return fact;
	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
