import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) { 
                result.add(Arrays.asList(nums1[i][0], nums1[i][1] + nums2[j][1]));
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) { 
               
                result.add(Arrays.asList(nums1[i][0], nums1[i][1]));
                i++;
            } else { 
                result.add(Arrays.asList(nums2[j][0], nums2[j][1]));
                j++;
            }
        }

        while (i < nums1.length) {
            result.add(Arrays.asList(nums1[i][0], nums1[i][1]));
            i++;
        }

        while (j < nums2.length) {
            result.add(Arrays.asList(nums2[j][0], nums2[j][1]));
            j++;
        }

        return convertTo2DArray(result);
    }
     public int[][] convertTo2DArray(List<List<Integer>> list) {
        int[][] array = new int[list.size()][2]; // Create 2D array
        for (int i = 0; i < list.size(); i++) {
            array[i][0] = list.get(i).get(0);
            array[i][1] = list.get(i).get(1);
        }
        return array;
    }
}
 