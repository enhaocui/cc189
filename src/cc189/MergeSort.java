package cc189;

public class MergeSort {
	public void mergesort(int[] array) {
		int[] copy = new int[array.length];
		mergesort(array, copy, 0, array.length - 1);
	}
	private void mergesort(int[] array, int[] copy, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		mergesort(array, copy, start, mid);
		mergesort(array, copy, mid + 1, end);
		merge(array, copy, start, mid, end);
	}
	private void merge(int[] array, int[] copy, int start, int mid, int end) {
		for(int i = start; i <= end; i ++) {
			copy[i] = array[i];
		}
		int left = start, right = mid + 1, index = start;
		while (left <= mid && right <= end) {
			if (copy[left] <= copy[right]) {
				array[index++] = copy[left++];
			}
			else {
				array[index++] = copy[right++];
			}
		}
		while (left <= mid) {
			array[index++] = copy[left++];
		}
	}
	
	
}
