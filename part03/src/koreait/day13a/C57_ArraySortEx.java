package koreait.day13a;

public class C57_ArraySortEx {

	
	//�迭�� ����� ���� ���� ���� �����غ���.
	public static void main(String[] args) {
		int temp = 0;
		int [] nums= {9,19,35,45,56,77};
		for(int i=0;i<nums.length-2;i++) {
			for(int k=i+1;k<nums.length-1;k++) {
				if(nums[i]>nums[k]) {
					temp=nums[i];
					
				}
			}
		
		
		}
	}

}
