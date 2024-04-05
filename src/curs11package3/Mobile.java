package curs11package3;

public class Mobile extends Product {
	
	private int tva;
	private int buyingPrice;
	
	public Mobile(int tva, int buyingPrice) {
		setBuyingPrice(buyingPrice);
		setTva(tva);
	}
	
	
    @Override
	public  int calculatePrice() {
    	return buyingPrice + tva;
    }




	public int getTva() {
		return tva;
	}




	private void setTva(int tva) {
		this.tva = tva;
	}




	public int getBuyingPrice() {
		return buyingPrice;
	}




	private void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
    
    
    
    
}
