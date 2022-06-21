package ASA;

public class Electronics extends Product{
	private double kwh;
	private double kwd=kwh*24;
	//9
	public Electronics() {
		
	}
	
public Electronics(int price, String prdName) {
		this.price=price;
		this.prdName=prdName;
	}
@Override//5
public String sell(Object obj) {
	return String.format("묶음 상품-%s(1set)", obj);
}

//8
public double getKwh() {
	return kwh;
}


public void setKwh(double kwh) {
	this.kwh = kwh;
}

 
public String power() {//11
	return  kwh + "필드값(시간당 전력소모량)으로 1일 24시간 전력소모량은" + kwd;
}

@Override
public String toString() {//12
	return "Electronics [price=" + price + ", prdName=" + prdName + ", kwh=" + kwh + "]";
}
	
	




}