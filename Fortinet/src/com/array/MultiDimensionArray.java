package com.array;

public class MultiDimensionArray {

	//static long[] arr;

	

   /*
    * Returns the value in the array index that is passed.
    *@param indexOfDimension index of the single dimensional array mapped from 
    *the N-d array.
    */
	public static long getValue(int indexOfDimension) {
		//long value = arr[indexOfDimension];
        long value =0;
		return value;
	}

	/*
	 * Returns the sum of all elements in multidimensional array
	 * Function takes the multidimensional array object and the length of all 
	 * dimensions as arguments.  The size of one dimensional array corresponding 
	 * to the N- dimensional array will be the product of lengths of dimensions.
	 * We are using the single dimensional array index calculated to get the 
	 * value. Using these indices we are getting the actual value and calculating 
	 * the sum.
	 * @param marray It is the object of the multidimensional array class
	 * lengthOfDeminsion It is an array containing the lengths of the dimensions. 
	 * The length of this array gives the number of dimensions. 
	 */
	public static long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) {
		int dimensions = lengthOfDeminsion.length;
		int size = 1;
		int i = 0;
		long sum = 0;
		while (i < dimensions) {
			size = size * lengthOfDeminsion[i];
		}

		for (int j = 0; j < size; j++) {
			sum = sum + getValue(j);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] dimArr = new int[4];

		MultiDimensionArray mArray = new MultiDimensionArray();

		MultiDimensionArray.sum(mArray, dimArr);

		}
}
