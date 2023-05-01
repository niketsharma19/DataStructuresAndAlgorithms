package practice.leetcode;

class AverageSalaryExcludingtheMinimumandMaximumSalary {
	
	public static void main(String[] args) {
		int[] salary = {4000,3000,1000,2000};
		average(salary);
	}

	private static double average(int[] salary) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] > salary[max]) {
				max = i;
			}
			if (salary[i] < salary[min]) {
				min = i;
			}
		}
		int total = 0;
		for (int i = 0; i < salary.length; i++) {
			if (i != max && i != min) {
				total = total + salary[i];
			}
		}
		return (total * 1d) / (salary.length - 2);
	}
}