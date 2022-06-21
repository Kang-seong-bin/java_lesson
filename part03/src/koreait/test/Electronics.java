package koreait.test;

public class Electronics extends Product{
	private double kwh;
	private double kwd=kwh*24;
	public Electronics() {
		
	}
	
public Electronics(int price, String prdName) {
		this.price=price;
		this.prdName=prdName;
	}
@Override
public String sell(Object obj) {
	return String.format("추가 할인 행사 - %d %% 인하", obj);
}

//
public double getKwh() {
	return kwh;
}


public void setKwh(double kwh) {
	this.kwh = kwh;
}
/*
 *
	
	
}

 */
 
public String power() {
	return  kwh + "필드값(시간당 전력소모량)으로 1일 24시간 전력소모량은" + kwd;
}
	
	

@Override
public String toString() {
	return "Electronics [price=" + price + ", prdName=" + prdName + "]";
}

//@Override
//public String toString() {
//	return "Electronics [price=" + price + ", prdName=" + prdName + ", kwh=" + kwh + "]";
//}




}