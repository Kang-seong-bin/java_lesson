package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;



public class C52_MyDictionary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//키보드 입력시 nextLine() 과 nextInt() 등을 같이 쓰면 입력이 정상 실행 안됩니다.
		//HashMap<String,String> mydic = new HashMap<>();
		TreeMap<String, String> mydic = new TreeMap<String, String>();	//이진 검색한 구조로 Map 을 생성 : 정렬이 되는 Map
		//key는 영어단어, value는 한글 뜻
		String english = "english";
		String korean = "korean";
		String sel, eng, kor, choice;	
		System.out.println("선택 기능 👉 1. 단어저장	  2. 단어검색	 3. 단어장보기	 4. 프로그램 끝내기");
		boolean run = true;
		while(run) {
			System.out.println("선택 🖊     	->");
			sel= sc.nextLine();		//sc.nextInt();는 nextLine()과 달리 엔터를 넘겨받지 않아서 같이사용하면 오류가 발생
			switch(sel) {
			case "1": 		//switch 문에서 case "문자열" 형식 가능. if 문에서는 sel.equals("1") 로 해야합니다.
				System.out.print("English - >");
				eng = sc.nextLine();
				System.out.print("한글 뜻 - >");
				kor = sc.nextLine();
				mydic.put(eng, kor);
				//저장
				break;
			case "2" :
				System.out.println("검색 단어를 고르시오 영어(0) or 한글(1)");
				choice= sc.nextLine();
				if(Integer.parseInt(choice)==0) {
				System.out.print("검색 단어 English - >");
				eng = sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과=>"+ mydic.get(eng));
				}
				else if(Integer.parseInt(choice)==1) {
					System.out.print("검색 단어 korean - >");
					kor = sc.nextLine();	
					System.out.println("단어장 검색했습니다. 결과=>"+ mydic.get(kor));
				}else 
					System.out.println("언어를 선택해주세요");
				
				break;
			case "3" :
				System.out.println("단어장 전체보기 : " + mydic);
				break;
			case "4" :
				run=false;
				break;
			default:
				System.out.println("잘못 입력된 선택입니다. 1~4입력입니다.");
				break;
				
			}
		}//while end
		System.out.println(":::: 너의 단어장 종료합니다. ::::");
	}}
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
 * 
 */
