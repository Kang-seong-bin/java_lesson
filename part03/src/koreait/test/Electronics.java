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
	return String.format("�߰� ���� ��� - %d %% ����", obj);
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
	return  kwh + "�ʵ尪(�ð��� ���¼Ҹ�)���� 1�� 24�ð� ���¼Ҹ���" + kwd;
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