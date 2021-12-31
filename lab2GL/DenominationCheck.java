package lab2GL;

import java.util.Arrays;
import java.util.Scanner;

public class DenominationCheck {

	private int targetAmount;
	private int	totDenomination;
	private static int denominationVal[];
	public static void main(String[] args) {


			DenominationCheck obj=new DenominationCheck();
			obj.inputDenomination();			// method to take input and target amount
			Arrays.sort(denominationVal);			// to sort denomination
			obj.calcNoOfNotes();					//  method to calculate no of denomination reqd
	}

	

	private  void calcNoOfNotes() {
		int countDenom[]=new int[totDenomination];
		int tempTargetAmt=targetAmount;
		for(int i=denominationVal.length-1;i>=0;i--) {
			
		 if(tempTargetAmt >= denominationVal[i] && denominationVal[i] != 0) 		// check to ignore if denomination is 0 & 
			 																				//if amount can still be paid by smaller denomination
		 { 
			 countDenom[i] = tempTargetAmt / denominationVal[i] ; 					// storing no of notes
			 tempTargetAmt = tempTargetAmt % denominationVal[i];						//string remaining amount
 
		 }
			}
		if(tempTargetAmt >0) {
			System.out.println("Denomination not available for given amount.");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<countDenom.length;i++) {
				if(countDenom[i]>0)
				System.out.println(denominationVal[i]+":"+countDenom[i]);
			}
		}
	}



	private void inputDenomination() {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		 totDenomination=sc.nextInt();
		 denominationVal=new int[totDenomination];
		for(int i=0;i<totDenomination;i++) {
		System.out.println("Enter the "+(i+1) +" currency denominations value");
		denominationVal[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		targetAmount=sc.nextInt();
	}

}
