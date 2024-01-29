package practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class EvaluateDivision {

	public static void main(String[] args) {
		List<List<String>> equations = new ArrayList<>();
		equations.addAll(
				Arrays.asList(new ArrayList<>(Arrays.asList("a", "b")), new ArrayList<>(Arrays.asList("b", "c"))));
		double[] values = { 2.0, 3.0 };
		List<List<String>> queries = new LinkedList<>();
		queries.addAll(Arrays.asList(new ArrayList<>(Arrays.asList("a", "c")), new ArrayList<>(Arrays.asList("b", "a")),
				new ArrayList<>(Arrays.asList("a", "e")), new ArrayList<>(Arrays.asList("a", "a")),
				new ArrayList<>(Arrays.asList("x", "x")), new ArrayList<>(Arrays.asList("a", "b"))));
		var result = calcEquation(equations, values, queries);
		for (var res : result) {
			System.out.println(res);
		}
	}

	public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		Map<List<String>, Double> solution = new HashMap<>();
		double[] result = new double[queries.size()];
		Set<String> variables = new HashSet<>();
		for (int i = 0; i < equations.size(); i++) {
			solution.put(equations.get(i), values[i]);
			variables.addAll(equations.get(i));
		}
		Arrays.fill(result, -1.0);
		int last = 1;
		int[] solved = new int[queries.size()];
		while (last != 0) {
			last = 0;
			for (int i = 0; i < queries.size(); i++) {
				if (solved[i] == 1) {
					continue;
				}
				List<String> query = queries.get(i);
				if (variables.contains(query.get(0)) && variables.contains(query.get(0))) {
					solved[i] = 1;
					if (query.get(0).equals(query.get(1))) {
						result[i] = 1d;
						continue;
					}
					Double val = solution.get(query);
					if (val == null) {
						val = solution.get(Arrays.asList(query.get(1), query.get(0)));
						if (val == null) {
							boolean first, second = false;
							solution.keySet().stream().filter(x -> {
								// here
								if (query.get(0).equals(query.get(0))) {
									return true;
								}
								return true;
							});
						} else {
							last++;
							result[i] = 1 / val;
						}
					} else {
						last++;
						result[i] = val;
					}
				}
			}

		}
		return result;
	}
}