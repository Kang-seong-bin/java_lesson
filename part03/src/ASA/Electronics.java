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
	return String.format("���� ��ǰ-%s(1set)", obj);
}

//8
public double getKwh() {
	return kwh;
}


public void setKwh(double kwh) {
	this.kwh = kwh;
}

 
public String power() {//11
	return  kwh + "�ʵ尪(�ð��� ���¼Ҹ�)���� 1�� 24�ð� ���¼Ҹ���" + kwd;
}

@Override
public String toString() {//12
	return "Electronics [price=" + price + ", prdName=" + prdName + ", kwh=" + kwh + "]";
}
	
	




}