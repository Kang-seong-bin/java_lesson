package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {
		
		//String 클래스의 split(분열시키다.쪼개다) 메소드 : 리턴타입이 String[]
		//split으로 분열해주면 String 타입으로 리턴된다.
		//그러면 int로 바꾸는 작업이 필요한 상황이 생기게 된다.
		
		String temp = "모모 90 88 79";
		String result[] = temp.split(" ");	//공백을 기준으로 문자열을 여러 개로 쪼개기
		System.out.println("1. 반복문 없이 출력");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		System.out.println("result length : " + result.length );
		//for문으로
		System.out.println("2. 일반적인 for 출력");
		for(int i =0;i<result.length;i++) {
			System.out.println(String.format("result[%d] : %s",i, result[i]));
		}
		
		//향상된 for
		System.out.println("3. 향상된 for 출력");
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		String temp2 = "모모,90,88,79";
		result = temp2.split(",");
		
		System.out.println("4. split 구분기호 ,");
		for(String t : result)
		System.out.println("result 요소 : " + t);
		
		temp2 = "모모,,90,,88,,79";
		result = temp2.split(",");
		
		System.out.println("5. split 구분기호 ,");
		System.out.println("result length : " + result.length );
		for(String t : result)
		System.out.println("result 요소 : " + t);
		//result[1],result[3],result[5] 3개의 빈 문자열 입니다.
		
		result = temp2.split(",,");
		
		System.out.println("6. split 구분기호 ,,");
		System.out.println("result length : " + result.length );
		for(String t : result)
		System.out.println("result 요소 : " + t);
		
		//split 의 인자인 문자열은 정규식 regex 문자열입니다. (정규식 패턴은 복잡.어렵습니다.)
		// 정규식 예시 : [] 안에 표시하는 것은 문자 여러 개가 또는(or) 에 해당합니다. 문자 한 개씩이 또는 으로 연결됨 즉 ,() 기호는 총 3개가 한 개씩 연결된다는 뜻
		
		temp2 = "모모,90,88()79";
		result = temp2.split("[ ,()]");		//정규식 문자열 : 구분 기호는 공백 또는, 또는 ( 또는 )
				
		System.out.println("7. split 인자가 정규식");
		System.out.println("result length : " + result.length );
		for(String t : result)
		System.out.println("result 요소 : " + t);
		
		temp2 = "모모,90,88,79";
		result = temp2.split(",", 2);
		//result = temp2.split(",",6);
		System.out.println("8. split 두번째 인자 limit 확인");
		//limit은 맅ㄴ되는 배열의 크기. 단 쪼개지는 갯수보다 커질 수는 없음.
		System.out.println("result length : " + result.length);
		for(String t : result)
		System.out.println("result 요소 : " + t);
		
		//배열과 유사한 자료구조 : List
		//배열을 List로 변환하는 방법
		result = temp2.split(",");
		System.out.println("9. result 배열을 List 객체로 변경");
		List<String> rlist = Arrays.asList(result);		//
		System.out.println(rlist);
		System.out.println("rlist size : " + rlist.size());
		for(String t : rlist)
			System.out.println("rlist 요소 : " + t);

		
		//위의 rlist는 배열의 크기만큼 List 를 정적으로 생성합니다.(추가/삭제/변경 못함)
		//rlist.add("test");	//오류: 고정된 크기의 리스트
		rlist.remove(2);		//오류
		rlist.add(2, "100");	//오류
		
		//동적인 List로 만들기
		System.out.println("10. ArrayList 의 인자가 있는 생성자 테스트");
		List<String> rlist2 = new ArrayList<String>(rlist);
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);
		
		//Arrays.asLIst 는 테스트용으로 또는 간단한 고정 리스트 사용으로 만들 때 유용합니다.
		List<Integer> ilist = Arrays.asList(1,2,6,9,100);
		System.out.println("11. Arrays.asList 활용");
		System.out.println(ilist);
		
}//쓰레드와 스트링은 각자 공부해도됨
}
