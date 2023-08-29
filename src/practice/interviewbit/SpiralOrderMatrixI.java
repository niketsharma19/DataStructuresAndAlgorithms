package practice.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrixI {

	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		ArrayList<Integer> list = new ArrayList<>();

		int colStart = 0;
		int colEnd = A.get(0).size() - 1;
		int rowStart = 0;
		int rowEnd = A.size() - 1;
		int totalElements = A.size() * A.get(0).size();
		while (list.size() != totalElements) {
			for (int i = colStart; i <= colEnd; i++) {
				list.add(A.get(rowStart).get(i));
			}
			rowStart++;

			for (int i = rowStart; i <= rowEnd; i++) {
				list.add(A.get(i).get(colEnd));
			}
			colEnd--;

			if (rowStart <= rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					list.add(A.get(rowEnd).get(i));
				}
				rowEnd--;
			}

			if (colStart <= colEnd) {
				for (int i = rowEnd; i >= rowStart; i--) {
					list.add(A.get(i).get(colStart));
				}
				colStart++;
			}
		}
		return list;
	}

}
