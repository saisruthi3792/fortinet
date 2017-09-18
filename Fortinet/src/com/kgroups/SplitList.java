package com.kgroups;

import java.util.HashMap;
import java.util.List;

public class SplitList {

	/* 
	 * Returns true if the list can be split and false if the list cannot be split.
	 * The list has to be split in such a way that all the partitions have equal sum.
	 * @param list It is the list which has to be checked for the split functionality.
	 * @param k It contains the value of number of partitions into which the list has
	 * to be split.
	 */
	public boolean separate(List<Integer> list, int k) {

		if (list.isEmpty() || list.size() < k)
			return false;

		HashMap<Integer, Boolean> map = new HashMap<>();
		int[] sumList = new int[k];

		int sum = 0, subSum = 0, i = 0;
		for (int l : list) {
			sum = sum + l;
			map.put(i, false);
			i++;
		}

		subSum = sum / k;
		sumList[0] = list.get(list.size() - 1);
		if (sumList[0] > subSum)
			return false;

		return helper(list, subSum, k, 0, list.size() - 1, map, sumList);

	}
	
	
    /*
     * Returns boolean value
     * This function checks if the list can be split into k groups such all the groups have equal sum
     * recursively and returns the value to the separate method.
     * @param list It is the list which has to be checked for the split functionality.
     * @param subSum It is value of the sum each partition must have.It is calculated by dividing the 
     * total sum if the array by k.
     * @param k It contains the value of number of partitions into which the list has
	 * to be split.
	 * @param curIndex It holds the value of the current index in the sumList.
	 * @param finIndex It is the final index in the list until which the partition functionality 
	 * has to be checked.
	 * @param map It holds the values of the list as keys and a boolean variable as value which says
	 * if the item has been visited or not.
	 * @sumList It has a size of k and holds the sum of the sub list formed at each stage. 
     */
	public boolean helper(List<Integer> list, int subSum, int k, int curIndex, int finIndex,
			HashMap<Integer, Boolean> map, int[] sumList) {

		if (sumList[curIndex] == subSum) {
			if (curIndex == k - 2)
				return true;

			return helper(list, subSum, k, curIndex + 1, list.size() - 1, map, sumList);

		}

		for (int i = finIndex; i >= 0; i--) {
			if (map.get(i))
				continue;

			int temp = sumList[curIndex] + list.get(i);
			if (temp <= subSum) {
				sumList[curIndex] = temp;
				map.put(i, true);

				boolean flag = helper(list, subSum, k, curIndex, i - 1, map, sumList);
				map.put(i, false);
				sumList[curIndex] = sumList[curIndex] - list.get(i);

				if (flag)
					return true;
			}

		}
		return false;
	}

}
