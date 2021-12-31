package lab2GL;

/*
 * Question 
		PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They
		also have a daily target that they must achieve. Given a list of transactions done by
		PayMoney and a daily target, your task is to determine at which transaction PayMoney
		achieves the same. If the target is not achievable, then display the target is not achieved.
 */

import java.util.Scanner;

public class TransactionTarget {

	private int sizetrx;
	private int sizetarget;
	private int sourceTrx[];
	
	private int sumSourceTrx[];
	private Scanner sc= new Scanner(System.in);
	
	public void processTrx() {
		input();
		calcSumSourceTrx();
		targetTrxInput();
	}

	private void targetTrxInput() {
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		sizetarget=sc.nextInt();											// Taking number of targeted transactions.
					
		for(int i=0;i<sizetarget;i++) {
			System.out.println("Enter the values of "+(i+1)+" target transaction :");
			//targetTrx[i]=sc.nextInt();
			int targetval= sc.nextInt();													
			checkifTargetFeasible(targetval,sumSourceTrx);								// Checking for each target transaction Value
		}
		
	}

	private void calcSumSourceTrx() {
		
		int sum=0;
		sumSourceTrx=new int[sizetrx];
		for(int i=0;i<sizetrx;i++) {
			sum=sum+sourceTrx[i];
			sumSourceTrx[i]=sum;								// Storing Prefix sum in another Array One time
		}				
	/*	for(int val:sumSourceTrx) {
			System.out.println("val "+val);				
		}
*/
	}




	private void checkifTargetFeasible(int target, int[] sumSourceTrx) {

		for(int i=0;i<sumSourceTrx.length;i++) {
			if(sumSourceTrx[i]>=target) {
				System.out.println("Target achieved after "+(i+1)+" transactions"); 
				return;
			}
		}
		System.out.println("Given target is not achieved");
	}

	private void input() {

	
		System.out.println("Enter the size of transaction array: ");
		sizetrx=sc.nextInt();						// Taking no of transactions
		
		sourceTrx=new int[sizetrx];
		for(int i=0;i<sizetrx;i++) {
			System.out.println("Enter the values of "+(i+1)+" transaction :");			// Taking initial transactions in Array
			sourceTrx[i]=sc.nextInt();
		}
		
	}

}
