package day_2;

import java.util.Scanner;

public class Sum_of_N_no {
	int n,i;
	int add;
	
	void Add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till you want addition:");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			add +=i;
			
		}
		System.out.println("Addition = "+add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_of_N_no p = new Sum_of_N_no();
		p.Add();

	}

}
