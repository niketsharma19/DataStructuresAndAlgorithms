package practice.leetcode;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		int[] flowerbed = {0,0,1,0,0};
		int n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
	
	private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i< flowerbed.length; i++){
        	if(n == 0) {
        		return true;
        	}
            int last = 0;
            if(i != 0) {
                last = flowerbed[i-1];
            }
            int now = flowerbed[i];
            int next = 0;
            if(i != flowerbed.length-1) {
                next = flowerbed[i+1];
            }
            if(last == 0 && now == 0 && next == 0) {
            	flowerbed[i] = 1;
                n--;
            }
        }
        return n == 0;
    }

}
