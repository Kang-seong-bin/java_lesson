package koreait.day02;

public class C04_DoubleData {
 public static void main(String[] arg) {
	 
	 System.out.println("Float 정수데이터 -----------------");
	 System.out.println("메모리 크기 : " + Float.BYTES + "바이트");	//
	 System.out.println("Float 정수의 최솟값 : " + Float.MIN_VALUE);
	 System.out.println("Float 정수의 최댓값 : " + Float.MAX_VALUE);
	 // 1.4E-45 는 1.4 x 10의 -45승 , 3.4028235E38는 10의 38승
	 System.out.println("Double 정수데이터 -----------------");
	 System.out.println("메모리 크기 : " + Double.BYTES + "바이트");	//
	 System.out.println("Double 정수의 최솟값 : " + Double.MIN_VALUE);
	 System.out.println("Double 정수의 최댓값 : " + Double.MAX_VALUE);
	 
	 
 }
}

/*	실수데이터는 컴퓨터 구조에서 부동소수점 형식으로 다룹니다.
 * 	ex) 1.23 X 10의 23승 에서 1.23(가수) 과 23(지수) 을 각각 어떤 크기만큼 할당하느냐에 따라값의 표현범위와 정밀도가 결정된다.
 *  (float은 가수부 소수점이 7자리, double은 16자리까지 나타내며 정밀도의 차이를 보인다.)
 *  실수 데이터 기본 형식 : float ,double (변수선언할 때 사용할 키워드)
 * 	   Wrapper 클래스는 Float, Double
 * 		★★1.234리터럴은  double 형식입니다.★★	
 */
