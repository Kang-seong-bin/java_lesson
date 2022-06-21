package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();	//***TreeMap 을 mywords로 바꿔서 구현해보기***
		
		
		String sel, eng, kor;	
		int level;
		System.out.println("선택 기능 👉 1. 단어저장	  2. 단어검색	 3. 전체보기	 	4. 레벨로 검색		5. 프로그램 끝내기");
		boolean run = true;
		while(run) {
			System.out.println("선택 🖊     	->");
			sel= sc.nextLine();		
			switch(sel) {
			case "1": 		
				System.out.print("English -> ");
				eng = sc.nextLine();    //sc.nextInt();
				System.out.print("한글 뜻 -> ");
				kor = sc.nextLine();
				System.out.println("레벨 -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);		//저장
				break;
			case "2" :
				System.out.println("검색 단어 English -> ");
				eng = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(eng))
						System.out.println("단어장 검색했습니다. 결과 => " + w);
				break;
			case "3" :
				//System.out.println("단어장 전체보기 : " + mywords);
				all(mywords);		//정렬하고 출력하기
				break;
			case "4" :
				System.out.print("검색할 레벨 입력(1~3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);
				break;
			
			case "5" :
				run=false;
				break;
			default:
				System.out.println("잘못 입력된 선택입니다. 1~4입력입니다.");
				break;
			}
		}//while end
		System.out.println(":::: 너의 단어장 종료합니다. ::::");

	}

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
		
		
	}

	private static void all(List<Word> mywords) {	//mywords 의 참조값  전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		
		});
		System.out.println(String.format("%-20s %-20s\t %-10s", "English","Korean","Level"));
		System.out.println("----------------------------------------------------------------");
		for(Word w : mywords) {
		System.out.println(String.format("%-20s %-20s\t %-10d", w.getEnglish(),w.getKorean(), w.getLevel()));
		}
	}

	
	
}
//참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다. 
//	int score = Integer.parseInt(sc.nextLine))
//	이유 : nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
//	결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용합니다.

//선택 기능 1. 단어저장 2. 단어검색 3. 단어장보기 4. 프로그램 끝내기

/*
 * 영어로 저장
 * 한국어로 저장
 * 
 * 단어검색
 * 검색단어 (영어인지 한글인지) -> break
 * 단어장 검색  결과 
 * 단어장보기
 * 전체보기 : ㅇㅇ
 * 
 * 6월 23일 평가 프로그래밍언어응용
 * 1. OX : 틀린  설명 바르게 고쳐서 설명하기
 * 		배열, 클래스, 상속, 추상클래스, 인터페이스 용어정리하기 주석포함
 * day 13인터페이스
 * ------------------------------
 * 추상 클래스 : 상속을 통한 다형성의 구현(메소드 오버라이드)에 강제성을 부여하기 위한 클래스
	추상메소드 : 메소드의 원형만 존재하고 실제 내용이 없는 메소드
	
 * 추상클래스는 일반메소드, 추상메소드 둘 다 선언가능
 * 하지만 인터페이스는 추상메소드만 선언 가능
 * 일반 메소드는 public String methodName(){
 * return "";
 * }
 * 이와 같은 구조를 가지며 메소드 이름, 그 이름에 맞는 기능을 중괄호 안에 구현하는 형태입니다.
 * 
 * 추상 메소드는 선언만 되어 있고 기능이 명시되어 있지 않는 형태입니다. 또한 추상메소드라는 의미에서
 * abstract를 메소드에 명시해주는데 이는 생략도 가능합니다. 이처럼 명확하게 기능이 구현되어 있지 않는 메소드를 추상메소드라고 합니다.
 * 
 * 기능도 없는 메소드를 선언만하는 이유
 * 추상 메소드도 사용을 목적으로 선언이 되었으며 추상 메소드의 기능 구현은 추상 클래스나 인터페이스에서 하지 않고
 * 추상 클래스와 인터페이스를 사용하는 일반 클래스에서 해야하기 때문입니다. 사용하는 쪽에서 직접기능을 구현해서 사용
 * 추상 메소드를 구현하는 경우 Override가 표시된다.
 * 
 * --------------------------------
 * 23개 설명 중 틀린 10개 찾아서 바르게 정의하기
 * 2. 자바 관련 주제 조사 설명하기(서술)
 * -추상화, 다형성, 상속 + 캡슐화
 * 자바
 * 자바는 객체지향언어이며 객체지향프로그래밍 환경에서 사용되는 프로그램 언어이다.
 * 객체 중심프로그래밍을 위해서 사용하는 언어로 각 객체들의 집합으로 구성되며 이때 객체란 모든 부품, 모든 기능이 전부 각각의 객체입니다.
 * 객체 지향언어의 종류로는 자바, C++ 파이썬
 * -----------------------------------
 * 객체 지향언어의 특성
 * 캡슐화
 * 객체지향프로그래밍을 할 떄 있어서 매우 중요한 특징으로
 * 서로 연관이 있는 데이터와 알고리즘을 하나로 묶어서
 * 하나의 캡슐의 형태로 만드는 것 으로 이 기능을 통하여 데이터와 알고리즘이 다른 정보로 인해서 손상되거나
 * 오류가 발생할 가능성을 최소화시키는 것이 가능해졌으며 데이터가 바뀌더라도 사용방법은 바뀌지 않아서
 * 다른 객체에 영향을 끼치지 않는다. -> 독립성이 유지되면서 객체 간의 결합도가 낮아져서 인터페이스가 간단해지게 되었다.
 * 서로 연관이 없는 다른 객체의 접근을 제한하기 위해서 접근 제한 수식자의 기능을 제공하기도 한다.
 * 
 * 상속
 * 상속은 소프트웨어 개발자들이 클래스들 간의 관계를 정립하는데 있어서 상위 클래스와 하위 클래스를 구분하게 되는데
 * 이 때 상위 클래스의 모든 것을 하위 클래스가 이어 받는 것을 상속이라고 한다.
 * 예시로 상위 클래스 A의 데이터와 함수를 하위 클래스인 B,C가 상속받아서 활용할 수 있다는 것을 의미한다.
 * 
 * 다형성
 * 다형성이란 원래 여러 개의 형태를 가진다는 것을 의미한다.
 * 그러나 프로그래밍 언어에서는 상속과 연관이 있는 개념으로 사용되며 하나의 객체가 다른 여러 객체로 재구성되는 것을 의미한다.
 * 
 * 다형성의 예시로는 오버로딩과 오버라이딩이 있습니다.
 * 프로그래밍에서 오버 로딩은 메소드 중복 정의, 오버라이딩은 메소드 재정의를 의미한다.
 * 
 * 메소드 오버로딩은 이름이 동일한 메소드가 하나의 클래스 안에서 중복해서 정의되어 있는 경우를 뜻한다.
 * 동일한 이름의 메소드가 있으면 구분을 할 수 없기에 매개변수와 인자 값을 다르게 해서 메소드를 구분한다.
 * 
 * 메소드 오버라이딩은 메소드 오버로딩처럼 상속에서 발생하는데 오버라이딩은 상위클래스에서 정의한 메소드를 하위 클래스에서
 * 상속을 받아왔을 때 상위 클래스의 정의를 전부 무시하고 다시 재정의해서 사용하는 것을 의미한다.
 * 예시로 상위클래스의 본질은 변하지 않지만 유형에 따라 다르게 재정의해준다고 생각하면된다.
 * ex) 아르바이트라는 본질에서 야간 수당을 받는 알바, 초과근무를 하는 알바들은 기본급여를 받는 알바와 
 * 급료를 다르게 정의해주는 것과 비슷하다고 볼 수 있다.
 * 
 * 추상화
 * 추상화란 공통된 속성이나 기능을 묶어서 이름을 붙이는 것으로 객체지향적 관점에서 클래스를 정의하는 것이 추상화라고 볼 수 있습니다.
 * 
 * 예시로는 어떠한 물건들이 있을 때 이 물건들의 공통된 특성을 통해서 해당 물건들을 모두 포함하는 단어로 물건들을 설명하는 것을
 * 추상화로 볼 수 있습니다. 추상화는 다른 객체들과 구분되는 핵심적인 특징들에만 집중하면서 복잡도를 관리할 수 있도록 하는 효과를 가져오게 됩니다.
 * 
 * 이때 주의할 점으로는 추상화는 문제 영역과 관점에서 의존적이라는 것으로 어떤 영역에서는 중요한 것이 다른 영역에서는 중요하지 않을 수도 있으므로
 * 하나의 대상이라도 목적에 따라서 여러 추상화 모델이 만들어지게 된다.
 * -----------------------------------------------------------
 * 3. 코딩문제  MyDictionary , Word로 단어장와 유사한 구조의 문제
 * 실행화면만 보고 코딩하세요.
 */
