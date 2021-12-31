package gradedAssignment2;



public class StockersData implements Comparable<StockersData>{

	
	private double sharePrice;
	private boolean isincrease;


	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public boolean getIsincrease() {
		return isincrease;
	}
	public void setIsincrease(boolean isincrease) {
		this.isincrease = isincrease;
	}
	@Override
	public int compareTo(StockersData o) {
		 {
		        
		            return (int) (this.sharePrice - o.getSharePrice());
		        
		      
		    }
	}
	
}
