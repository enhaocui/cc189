package cc189;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort ms = new MergeSort();
		int[] in = new int[]{2,5,1,6,4,7,9};
		ms.mergesort(in);
		System.out.println(in);
		QuickSort qs = new QuickSort();
		in = new int[]{1,5,1,7,4,7,9};
		qs.quicksort(in, 0, in.length - 1);
		System.out.println(in);

	}

}
