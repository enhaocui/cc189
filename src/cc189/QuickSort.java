package cc189;

public class QuickSort {
	public void quicksort(int[] array, int start, int end) {
		if (start >= end)
			return;
		int index = quickselect(array, start, end);
		if (index > start) {
			quicksort(array, start, index - 1);
		}
		if (index < end) {
			quicksort(array, index + 1, end);
		}
	}
	private int quickselect(int[] array, int start, int end) {
		if (start == end)	return start;
		int pivot = array[end];
		int right = end - 1;
		int i = start;
		while (i <= right) {
			if (array[i] <= pivot) {
				swap(array, i, start);
				start ++;
			}
			i ++;
		}
		swap(array, start, end);
		return start;
	}
	private void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

}
