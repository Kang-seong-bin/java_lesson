package koreait.day13a;

import koreait.day12.Member;
import java.util.Comparator;
//Member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberNameDescending implements Comparator<Member>{
	
	
	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);	//내림차순 :
	}
	/*
	 * 리턴식은 음수값이 나오는 경우를 씁니다.	교환하지 않는 경우를 -1(음수)로 리턴하게 합니다.
	 * 각각 교환하지 않는 경우는
	 * 오름차순 : o1 < o2		//내림차순 : o1 > o2
	 * 
	 * 
	 * 
	 * 그럼 멤버는 그저 정렬일 뿐인거고 유저는 비교를해서 정렬을 한다 이렇게 보면 되는건가요? => 비교는 동일하고 객체를 직접 비교할수 있는 상태로 만드는가? 아닌가? -> X
	 * 비교는 둘다해야함 객체를 직접비교하는 상태로 하는가 아닌가의 차이
	 * 비교기준 내용과 방법을 sort에 적용
		객체를 직접 비교할수 있는 상태로 만드는가? User
		비교기준 내용과 방법을 sort에 적용한 것이 Member


	 */
	
	
}
