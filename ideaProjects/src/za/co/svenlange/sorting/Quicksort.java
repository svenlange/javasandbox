package za.co.svenlange.sorting;// quicksort benötigt weniger resourcen als mergesort.
// quicksort verzichtet auf mischvorgang und basiert auch auf divide-and-conquer.

import java.util.Arrays;

public class Quicksort {

	static int[] o = {8,5,4,3,1,2,0,9,6,7,3,56,4,567,578,1,35,235,35,345,456,46,5312,415,46436,5};

	public static void main(String[] args) {
		qsort(o);
	}
	
	static void qsort(int[] a) {
		qsort(a, 0, a.length-1);
	}

	static void qsort(int[] array, int untergrenze, int obergrenze) {
		System.out.println(Arrays.toString(o));
	
		int lo = untergrenze, hi = obergrenze;
		
		if(hi>lo) {
			int pivot = array[(lo+hi)/2];
			
			while(lo<=hi) {
				
				while(lo < obergrenze && array[lo] < pivot)
					++lo;
				
				while(hi > untergrenze && array[hi] > pivot) 
					--hi;
					
				if(lo <= hi) {
					swap(array, lo, hi);
					++lo;
					--hi;
				}
			}
			
			if(untergrenze<hi)
				qsort(array, untergrenze, hi);
				
			if(lo < obergrenze) 
				qsort(array, lo, obergrenze);
		}	 
	}
	
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
}