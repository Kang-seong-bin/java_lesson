package koreait.day05;

import java.util.Scanner;

public class C28_IntArrayEx2 {

	/*	1. int �迭ũ�� 5�� �����մϴ�.	�̸��� nums
	 *	2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 *	3. �Էµ� ���� �հ�, ����� ���մϴ�. -> �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ��ϼ���.
	 *	4. �Էµ� ���� �ִ밪, �ּڰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * 				�� maxofArray , minofArray : ���ڴ� int �迭, ��ȯ�� ���� int
	 * 
	 */
	public static void main(String[] args) {
		int total;
		double avg;
		int sum=0;
		int[] nums = new int[5];
		
		total = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		avg = total/5;
		
		Scanner sc = new Scanner(System.in);
		
		for(sum=0;sum<5;sum++) {
			System.out.println();
			sum = sc.nextInt();
			
		}
		System.out.println("ù��° �迭 ���� �Է��ϼ���");
		nums[0] = sc.nextInt();
		System.out.println("�ι�° �迭 ���� �Է��ϼ���");
		nums[1] = sc.nextInt();
		System.out.println("����° �迭 ���� �Է��ϼ���");
		nums[2] = sc.nextInt();
		System.out.println("�׹�° �迭 ���� �Է��ϼ���");
		nums[3] = sc.nextInt();
		System.out.println("�ټ���° �迭 ���� �Է��ϼ���");
		nums[4] = sc.nextInt();
		
		
		System.out.println("�迭�� ũ���" + nums.length + "�Դϴ�\n");
		System.out.println("ù��° �迭 ���� " + nums[0]);
		System.out.println("�ι�° �迭 ���� " + nums[1]);
		System.out.println("����° �迭 ���� " + nums[2]);
		System.out.println("�׹�° �迭 ���� " + nums[3]);
		System.out.println("�ټ���° �迭 ���� " + nums[4]);
		
		int max = maxOfArray(nums);
		System.out.println("�迭 nums �ִ밪 max = " + max);
		int min = minOfArray(nums);
		System.out.println("�迭 nums �ּڰ� min = " + min);
		
		
		
		
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
		for(int i=1; i<array.length;i++) {	
			if(min < array[i])	
				min = array[i];
		}
		
		return min;		
	}
	
	
}
	


