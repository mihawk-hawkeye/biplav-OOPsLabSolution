package gradedAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Stockers {

	private Scanner sc= new Scanner(System.in);
	private int noOfComp;
	private StockersData input[];
	public static void main(String[] args) {

		Stockers obj = new Stockers();
		obj.input();
		obj.userStories();
	}

	private void userStories() {
System.out.println("Enter the operation that you want to perform\r\n"
		+ "1. Display the companies stock prices in ascending order\r\n"
		+ "2. Display the companies stock prices in descending order\r\n"
		+ "3. Display the total no of companies for which stock prices rose today\r\n"
		+ "4. Display the total no of companies for which stock prices declined today\r\n"
		+ "5. Search a specific stock price\r\n"
		+ "6. press 0 to exit");
		int choice =sc.nextInt();
		switch(choice) {
		case 1: 
			performSortAsc();
			break;
		case 2: 
			performSortDsc();
			break;
		case 3: 
			countRoseStocks();
			break;
		case 4: 
			countDeclinedStocks();
			break;
		case 5: 
			System.out.println("enter the key value");
			double key = sc.nextDouble();
			searchStockPrice(key);
			break;
		case 6:
			System.exit(0);
		}
		
	}


	private void countRoseStocks() {
		int count =0;
		for(int i=0;i<noOfComp;i++) {
			if(input[i].getIsincrease()==true)
				count++;
		}
		System.out.println("Total no of companies whose stock price declined today : "+count);
		
	}

	private void performSortAsc() {
		
		Arrays.sort(input);
        for(int i=0;i<input.length;i++)
        	System.out.println(input[i].getSharePrice());
        for(int i=0;i<input.length;i++)
        	System.out.println(input[i].getIsincrease());
	}

	private void performSortDsc() {
		//Arrays.sort(sharePrice);
		for(int i=noOfComp-1;i>=0;i--) {
			System.out.println(input[i].getSharePrice());
		}
		
	}

	private void countDeclinedStocks() {
		int count =0;
		for(int i=0;i<noOfComp;i++) {
			if(input[i].getIsincrease()==false)
				count++;
		}
		System.out.println("Total no of companies whose stock price declined today : "+count);
		
	}

	private void searchStockPrice(double key) {
		for(int i=0;i<noOfComp;i++) {
			if(input[i].getSharePrice()==key)
		
		System.out.println("Stock of value "+key+" is present");
		else 
			System.out.println("Stock of value "+key+" is not present");
		}
	}

	private void input() {


		
		System.out.println("Enter the number of companies: ");
		  noOfComp=sc.nextInt();

		   input=new StockersData[noOfComp];
		for(int i=0;i<noOfComp;i++) {
			input[i]= new StockersData();
			System.out.println("Enter current stock price of the company "+(i+1));
			input[i].setSharePrice(sc.nextDouble()) ;
			 System.out.println( "Whether company's stock price rose today compare to yesterday?");
			 input[i].setIsincrease(sc.nextBoolean()); 
		}
		
	}

}
