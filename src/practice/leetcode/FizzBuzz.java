package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public static void main(String[] args) {
		int n= 5;
		List<String> list = new ArrayList<String>();
        for(int i = 1; i<= n;i++) {
            StringBuilder str = new StringBuilder();
            if(i%3 == 0){
                str.append("Fizz");
            }
            if(i%5 == 0){
                str.append("Buzz");
            }
            if(str.length() == 0) {
                str.append(i);
            }
            list.add(str.toString());
        }
        System.out.println(list);
	}

}
