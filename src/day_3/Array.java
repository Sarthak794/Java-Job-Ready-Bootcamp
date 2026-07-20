package day_3;

public class Array {
	
	public void First_Array() {
		int []arr = {10,20,30,40,50};
		
		for(int num : arr) {
			System.out.print(num+ " ");
		}System.out.println();
	}
	
	public void Sum() {
		int sum=0;
		int []arr = {10,12,15,16,14,15};
		
		for(int num : arr) {
			sum +=num;
		}
		System.out.println("Addition of Array : "+sum);
	}
	
	public void Average() {
		int sum=0;
		int [] arr = {10,20,30,40,50,60,70};
		
		for(int num:arr) {
			sum +=num;
		}
		int avg = sum/arr.length;
		System.out.println("Average of an array : "+avg);
	}
	
	public void Max_Element() {
		int great_no=0;
		int [] arr = {10,20,30,40,50,60};
		for(int num : arr) {
			if(num>great_no) {
				great_no =num;
			}
		}
		System.out.println("Greatest number in array is: "+great_no);	
	}

	public void Min_Element() {
		
		int [] arr = {10,20,30,40,50,60};
		int min_no = arr[0];
		
		for(int num :arr) {
			if(num<min_no) {
				min_no=num;
			}
		}System.out.println("Smallest number in array : "+min_no);
	}
	
	public void Second_largest() {
		
		int[] arr = {10,20,30,40,50,60};
		int greatest = Integer.MIN_VALUE;
		int second_greatest =Integer.MIN_VALUE;
		
		for(int num: arr) {
			if(num>greatest) {
				second_greatest=greatest;
				greatest = num;
			}
		}System.out.println("Second Greatest number : "+second_greatest);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array print = new Array();
		print.First_Array();
		print.Sum();
		print.Average();
		print.Max_Element();
		print.Min_Element();
		print.Second_largest();
	}

}
