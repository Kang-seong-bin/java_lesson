package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		int[] datas= {45,23,7,21,19,11,44};	//배열은 선언할 때 배열의 크기를 정합니다.
											//배열은 기본형 데이터타입 int, double, long.... 또는 참조형 타입
		
		ArrayList<Integer> list = new ArrayList<>();
				//ArrayList는 크기가 동적입니다.
				//데이터 타입은 항상 참조형타입 입니다. 기본형은 래퍼클래스를 사용합니다.
				//<E> 는 제너릭(Generic, 포괄적인) 타입이라고 부릅니다. 모든 타입을 리스트에 담을 수 있다.
				//리스트에 저장하는 데이터를 요소(Element)라고 합니다. 
				//주요 메소드 : add, get, size, remove		
		String[] names = {"쯔위","모모","신비","은하","나나"};
		ArrayList<String> name_list = new ArrayList<>();
		
		//ArrayList에 데이터 추가는 add() 메소드
		list.add(45);
		list.add(7);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);
		
		System.out.println("1. 첫번째 ArrayList<Integer> 출력");
		System.out.println(list);
		System.out.println("참고(배열_ " + Arrays.toString(datas) + ",배열크기: " + datas.length);
		System.out.println("리스트의 크기 : " + list.size());
		
		name_list.add("쯔위");	name_list.add("모모");
		name_list.add("은하");	name_list.add("나나");
		System.out.println("\n2. 두번째 ArrayList<String> 출력");
		System.out.println(name_list);		//
		System.out.println("리스트의 크기 : " +name_list.size()); //데이터 없을 때는 0
		
		System.out.println("\n3. 특정 위치에 데이터 추가");
		list.add(1, 23); 	//(인덱스 위치, 추가될 값) 단, 인덱스 위치는 리스트의 크기 보다 작아야한다.
		System.out.println("add(1,23) 결과 : " + list);
		name_list.add(2, "신비");
		System.out.println("add(2, \"신비\") 결과 : " + name_list);
		
		System.out.println("\n4. 배열처럼 index 값으로 데이터 가져오기");
		System.out.println("get(3) : " + list.get(3));
		System.out.println("get(3) : " + name_list.get(3));
		
		System.out.println("\n5. 특정 위치의 데이터(요소) 제거");
		list.remove(4);
		System.out.println("remove(4) 결과 : " + list);
		name_list.remove(4);
		System.out.println("remove(4) 결과 : " + name_list);
		
		System.out.println("\n6. 특정 값 위치를 알아내기('신비'는 몇번 인덱스?)");
		System.out.println("배열 : " + Arrays.binarySearch(names, "신비"));
		System.out.println("리스트 : " + name_list.indexOf("신비"));
		
		System.out.println("\n7. 6번의 실행내용을 for문으로 확인한다면?");
		System.out.println("배열");//배열 구하기
		int i;		//인데스로 사용될 i값은 바깥에 선언해야 여러 기능을 사용 가능
		for(i=0;i<names.length;i++) 
			if(names[i].equals("신비"))
				break;
			
		System.out.println("'신비'는 인덱스 :" + i);
		
		System.out.println("리스트");//리스트 구하기
		for(i=0;i<name_list.size();i++)
			if(name_list.get(i).equals("신비"))
				break;
		System.out.println("'신비'는 인덱스 :" + i);
		
		//'신비' 요소가 여러 개일 때 리스트는 lastIndexOf 메소드로 마지막 일치 요소를 찾을 수 있습니다.
		
		System.out.println("\n8. contains 메소드 ");
		System.out.println("'모모'가 리스트에 있는가?" + name_list.contains("모모"));
		System.out.println("'다현'가 리스트에 있는가?" + name_list.contains("다현"));
	}

}
/*배열 : 많은 양의 데이터를 저장하는 방법
 * 
 * 컬렉션(Collections) : 자료구조. 많은 양의 데이터를 저장하는 것이고 데이터 특징에 따라
 * 						관리(저장, 읽기/쓰기)하는 차이가 있다.
 * 						데이터를 삽입/삭제 등의 알고리즘이 메소드로 구현되어 있습니다.
 * 		ㄴ	ArrayList	클래스
 * 		ㄴ	HashMap		클래스
 * 					.add 추가
					.get 데이터 가져오기
					.remove 특정위치 데이터 삭제
					기본배열크기 .length
					리스트 크기 .size
					
					
					
					list는 순서가 있는 데이터의 집합으로 데이터의 중복을 허용합니다 - ArrayList, LinkedList, Stack등
					set은 순서를 유지하지 않는 데이터의 집합으로 데이터의 중복을 허용하지 않습니다. -양의 정수, 소수집합
					Map은 키와 값의 쌍으로 이루어진 데이터의 집합으로 순서는 유지되지 않으며 키는 중복을 허용하지 않고
					값은 중복을 허용합니다 - HashMap, TreeMap, Hashtable, Properties
					키란 데이터의 집합중에서 어떤 값을 찾는데 열쇠가 된다는 의미에서 붙어진 의미 입니다.
					즉 키는 중복을 허용하지 않는다는 점
					
 * 
*/
