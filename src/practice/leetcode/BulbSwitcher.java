package practice.leetcode;

class BulbSwitcher {

	public static void main(String[] args) {
		int index = 0;
		while (index <= 30) {
			System.out.println(index + " : " + bulbSwitch(index));
			index++;
		}
	}

	private static int bulbSwitch(int n) {
		int index = 0;
		int ans = 0;
		int increment = 1;
		int counter = 0;
		while (index < n) {
			counter++;
			if(increment == counter) {
				ans++;
				counter = 0;
				increment = increment + 2;
			}
			index++;
		}
		return ans;
		// (int) Math.sqrt(ans);
	}
}