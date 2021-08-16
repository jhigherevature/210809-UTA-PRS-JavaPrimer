package algorithms;

/*
 * Quick sort is a recursive sorting algorithm that 
 * organizes elements within an indexed collection 
 * by partitioning elements around an arbitrary value
 * within the collection (usually the first or last index)
 * and then moving all elements higher than the arbitrary
 * value to the right of the element, and all elements
 * lower to the left of the element. This process continues
 * on these smaller partitions until the entire collection
 * is sorted.
 */
public class QuickSort {
	/* Simulator Method */
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 26 };
		
		System.out.println("Given Array");
		printArray(arr);
		
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted array");
		printArray(arr);
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	/*
	 * Sort an array by finding a partition value and
	 * swapping elements to either the front or
	 * back based on that element's value.
	 */
	public void quickSort(int arr[], int begin, int end) {
		/*
		 * continue this swap until we are only looking at
		 * a single element...(when begin and end are the 
		 * same value, we know we are only looking at a 
		 * single element
		 */
		if (begin < end) {
			int p_index = partition(arr, begin, end);
			/*
			 * recursive calls on left and right based
			 * on the partition element
			 */
			quickSort(arr, begin, p_index-1);
			quickSort(arr, p_index+1, end);
		}
	}
	
	private int partition(int arr[], int begin, int end) {
		/* 
		 * here, we arbitrarily use the value of index 
		 * element when determining how to swap
		 */
		int pivot = arr[end];
		/*
		 * used to keep track of which element we
		 * need to swap with
		 */
		int i = begin - 1;
		
		/*
		 * iterate through collection. If current
		 * index is less than the pivot, we can swap,
		 * and we increase i to know which elements need
		 * to swap positions
		 */
		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot ) {
				i++;
				
				swap(arr, i, j);
			}
		}
		
		swap(arr, i+1, end);
		
		return i+1;
	}
	
	/* Swap position of two indexs of an array */
	void swap (int[] arr, int l_index, int r_index) {
		int temp = arr[l_index];
		arr[l_index] = arr[r_index];
		arr[r_index] = temp;
	}
}
