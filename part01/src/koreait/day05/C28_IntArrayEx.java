package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C28_IntArrayEx {

	/*	1. int 배열크기 5를 선언합니다.	이름은 nums
	 *	2. 배열 요소의 값은 사용자 입력으로 저장합니다.
	 *	3. 입력된 값의 합계, 평균을 구합니다. -> 합계는 2번에서 입력받는 for문 안에서 수식 작성하세요.
	 *	4. 입력된 값의 최대값, 최솟값을 구하는 메소드를 만듭니다.
	 * 				ㄴ maxofArray , minofArray : 인자는 int 배열, 반환값 형식 int
	 * 
	 */
	public static void main(String[] args) {//작성자 : 강성빈
				Scanner sc = new Scanner(System.in);
		int sum=0;		
		int number;
		double avg;
		int[] nums = new int[5];
		
		for(int i=0;i<nums.length; i++) {
			System.out.print("배열 요소의 값을 입력하세요. >>");
			number = sc.nextInt();
			nums[i] =number;
			sum += nums[i];
		}
		
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("입력한 요소의 합 : " + sum);
		System.out.println("입력한 요소의 평균 : " + avg);
		System.out.println();
		
		int max = maxOfArray(nums);
		System.out.println("배열 nums 최대값 max = " + max);
		int min = minOfArray(nums);
		System.out.println("배열 nums 최솟값 min = " + min);
		
		sc.close();
	}
	//1. max,min 변수를 각각 배열의 0번 요소값으로 초기화 합니다.
	//2. 배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서 
	//3. max가 그 값보다 작으면(min이 그값보다 크면) max(min) 값을 배열요소 값으로 변경합니다.
	//4. -> 비교가 끝나면 최종 max,min 결정이 됩니다.

	public static int maxOfArray(int[] array) {
		int max=array[0];	//1.
		for(int i=1; i<array.length;i++) {	//3.
			if(max < array[i])	//비교값이 max보다 크다면
				max = array[i];
		}
		
		// 권장 : 출력은 main에서 실행시킬 때 원하는 형식으로 작성하도록 합니다.
		return max;		//4.
	}
	public static int minOfArray(int[] array) {
		int min=array[0];	
		for(int i=0; i<array.length;i++) {	
			if(min > array[i])	
				min = array[i];
		}
		
		return min;		
	}
	
	
}
	


