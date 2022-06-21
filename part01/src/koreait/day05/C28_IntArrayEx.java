package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C28_IntArrayEx {

	/*	1. int �迭ũ�� 5�� �����մϴ�.	�̸��� nums
	 *	2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 *	3. �Էµ� ���� �հ�, ����� ���մϴ�. -> �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ��ϼ���.
	 *	4. �Էµ� ���� �ִ밪, �ּڰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * 				�� maxofArray , minofArray : ���ڴ� int �迭, ��ȯ�� ���� int
	 * 
	 */
	public static void main(String[] args) {//�ۼ��� : ������
				Scanner sc = new Scanner(System.in);
		int sum=0;		
		int number;
		double avg;
		int[] nums = new int[5];
		
		for(int i=0;i<nums.length; i++) {
			System.out.print("�迭 ����� ���� �Է��ϼ���. >>");
			number = sc.nextInt();
			nums[i] =number;
			sum += nums[i];
		}
		
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("�Է��� ����� �� : " + sum);
		System.out.println("�Է��� ����� ��� : " + avg);
		System.out.println();
		
		int max = maxOfArray(nums);
		System.out.println("�迭 nums �ִ밪 max = " + max);
		int min = minOfArray(nums);
		System.out.println("�迭 nums �ּڰ� min = " + min);
		
		sc.close();
	}
	//1. max,min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ �մϴ�.
	//2. �迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ� 
	//3. max�� �� ������ ������(min�� �װ����� ũ��) max(min) ���� �迭��� ������ �����մϴ�.
	//4. -> �񱳰� ������ ���� max,min ������ �˴ϴ�.

	public static int maxOfArray(int[] array) {
		int max=array[0];	//1.
		for(int i=1; i<array.length;i++) {	//3.
			if(max < array[i])	//�񱳰��� max���� ũ�ٸ�
				max = array[i];
		}
		
		// ���� : ����� main���� �����ų �� ���ϴ� �������� �ۼ��ϵ��� �մϴ�.
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
	


