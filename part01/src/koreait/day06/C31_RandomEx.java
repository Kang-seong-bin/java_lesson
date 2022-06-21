package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * �л� ����(����) ���� ����
		 * �л� �ο��� 100�� - ������ ����(0<= ���� <100)
		 * 
		 * 90~100 : o �� (0.0%) �Ҽ��� 1�ڸ�	 ī��Ʈ ������ 5�� �ʿ��մϴ�.
		 * 80~89 : o �� (0.0%) �Ҽ��� 1�ڸ�		��	counts[5]: counts[0],....
		 * 70~79 : o �� (0.0%) �Ҽ��� 1�ڸ�
		 * 60~69 : o �� (0.0%) �Ҽ��� 1�ڸ�
		 * 60�� �̸� : o �� (0.0%) �Ҽ��� 1�ڸ�
		 */
		int[] koreans = new int[100];
		int[] counts = new int[5];
		Random r = new Random();
		
		System.out.println("1. ������ ���� �� 10�� ���");
		for(int i = 0; i<koreans.length; i++) {
			koreans[i] =r.nextInt(101);	
		// ���� ���� ����
		}
		System.out.println(Arrays.toString(koreans));
		//���� ���� count�ϱ�
		for(int i =0; i<koreans.length;i++) {
			
			if(89<koreans[i]) {	//if�� 90�̻��� ���� ȹ���� �л�
				counts[0]++;	//90�� �̻� ������ �������� �ش��ϴ� �л� �� �߰�
		}else if(79<koreans[i]) {
			counts[1]++;
		}else if(69<koreans[i]) {
			counts[2]++;
		}else if(59<koreans[i]) {
			counts[3]++;
		}else {
			counts[4]++;
			}
		}
		//���� ���� ��� ����ϱ�
			System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");	//�з��� ������ ���
			System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60�̸�" );
			System.out.println("---------------------------------------------");
			for(int i = 0; i<counts.length; i++) {
				//counts�迭 �� ���
			System.out.printf("%8d", counts[i]);	// �迭�� ������ �Ҽ��� ���ܷ� ����
			}
			System.out.println("");
			for(int i=0; i < counts.length;i++) {
				// counts�迭 ������ ����� ���ϰ� ����ϱ�
				System.out.printf("%8.1f%% ", (double)counts[i]);	//�迭�� ���� ������� �Ҽ��� 1�ڸ��� �ݿø� �� %�� ǥ��
			}
	}

}
//�迭���� ����� ���(������ ����/����,ũ�⵵ �������� ����) �� ���� �ڹ�ArrayList
//�迭������ ���� ������ ����/������ �����մϴ�. -> �޼ҵ� ����
