package koreait.test;
//c product클래스를 추상클래스로 변경하고 (abstract사용)sell이라는 추상메소드를 public으로 선언하세요
// : 메소드의 리턴타입은 String, 인자는 Object 1개입니다.
public abstract class Product {
//b Product 클래스의 접근 한정자를 protected로 합니다
	static final int BIKE = 1;
	static final int DOG = 2;
protected int price;
protected String prdName;	//a Product클래스에
// 문자열 타입'상품명'필드를 선언하세요. 필드명은 prdName입니다.

public abstract String sell(Object obj); //c	추상메소드 sell public으로 선언, 인자 Object








}
//디폴트 생성자 사용가능 Product클래스는
//만약 여기서 커스텀 생성자를 생성했으면 bike에서 super를 통해 이용가능


//0
//1
//2
//3

//4 
//5-  0?
//6
//7
//8-	0?
//9-	0?
//10x-		동물  부모 자식 정의한 것처럼 한정자 정의하고 
// name과 speed를 문자열로 리턴
//11x-10번과 동일 Ex) "당신은 name을 시속 speed로 탈 수 있습니다" ,   "kwh 필드값(시간당 전력소모량)으로 1일 24시간 전력소모량"을 (실수 float or double)로 계산하여 리턴 
//12 Electronics만
//13	0?
//14-x
//15
//16- ride메소드x





//필드접근한정자


//자식클래스가 bike말고 하나더 있을 예정 시험에선 car로 연습함
/*Object 타입에 대입되는 int,long, 이런것들은
래퍼클래스타입으로 변환되어 캐스팅됩니다.
우리가 Integer a= 1;
이렇게 쓸때도 변환이 일어난거에요. 자동으로요
원래는 new Integer(1)
이렇게 해야해요

 * */