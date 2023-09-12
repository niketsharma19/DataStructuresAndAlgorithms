package practice.interviewbit.arrays;

import java.util.ArrayList;

public class Segregate0sand1s {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        int[] arr = new int[A.size()];
		for (int i = 0; i < A.size(); i++) {
			arr[i] = A.get(i);
		}
        
        int indexOfOne = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 1){
                indexOfOne = i;
                break;
            }
        }
        
        if (indexOfOne == -1) {
			return A;
		}
        
        int index = indexOfOne + 1;
        while(index < A.size() && indexOfOne < A.size()){
            if(arr[index] == 0) {
                arr[index] = 1;
                arr[indexOfOne] = 0;
                indexOfOne++;
            }
            index++;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
		for (int i : arr) {
			ans.add(i);
		}
		return ans;
    }
}
