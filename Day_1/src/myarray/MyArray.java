package myarray;

import java.util.*;

public class MyArray {
	
	int [] arr;
	int cnt;

	public MyArray() {
		super();
		arr = new int [10];
		cnt = 0;
	}

	public MyArray(int[] arr, int cnt) {
		super();
		this.arr = arr;
		this.cnt = cnt;
	}

	public MyArray(int size) {
		arr = new int [size];
		cnt ++;
	}

	public int getSize() {
		return cnt;
	}

	public void add(int i) {
		if (cnt < arr.length) {
			arr[cnt] = i;
			cnt ++;
		}
		
	}

	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + ", cnt=" + cnt + "]";
	}

	public void add(int value, int pos) {
		if (cnt < arr.length && pos < cnt ) {
			for(int i = cnt ; i > pos ; i--) {
				arr[i] = arr[i-1];
			}
			arr[pos] = value;
			cnt++;
		}
		else
		{
			System.out.println("Please Enter Posistion Of Array Less Than Count Number!");
		}
		
	}

	public int searchByValue(int j) {
		for(int i=0;i<cnt;i++) {
			if(arr[i]== j) {
				return i;
			}
		}
		return -1;
	}

	public void deleteByPos(int pos) {
		
		for(int i=pos;i<cnt;i++) {
				arr[i] = arr[i+1];
		}
		cnt --;
		
	}

	public void deleteByValue(int value) {
		int pos=searchByValue( value);
		deleteByPos( pos);
	}

	public int[] exchangeIndexValues() {
		int max = findmax();
		
		int [] arr1 = new int [max+1];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = -1;
		}
		
		for(int i = 0; i < cnt ; i++) {
//			int pos = i;
			int num = arr[i];
			arr1[num] = i;	
		}
		return arr1;
	}

	private int findmax() {
		int max = arr[0];
		for(int i = 1; i<cnt; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public int[] reveseArray(boolean b) {
		if(b) {
			for(int i=0,j=cnt-1;i<j;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			return arr;
		}
		else {
			int [] temp = new int [cnt];
			for(int i = 0; i < cnt-1 ; i++) {
				temp[i] = arr[cnt-i];
			}
			return temp;
		}
		
	}

	public void rotateArray(boolean toRight, int num) {
	    int len = arr.length;
	    num = num % len; // Handle rotations greater than array length

	    if (toRight) {
	        // Right rotation
	        for (int i = 0; i < num; i++) {
	            int last = arr[len - 1];
	            for (int j = len - 1; j > 0; j--) {
	                arr[j] = arr[j - 1];
	            }
	            arr[0] = last;
	        }
	    } else {
	        // Left rotation
	        for (int i = 0; i < num; i++) {
	            int first = arr[0];
	            for (int j = 0; j < len - 1; j++) {
	                arr[j] = arr[j + 1];
	            }
	            arr[len - 1] = first;
	        }
	    }
	}

	
}


