package main.java.zutil;

import java.util.List;

public class TestUtils {
	public static String printBoard(char[][] board) {
		String result = "[\n";
		for (int i = 0; i < board.length; i++)
			result += "  " + printSequence(board[i]) + ",\n";
		result += "]";
		return result;
	}

	public static String printMatrix(int[][] matrix) {
		String result = "[\n";
		for (int i = 0; i < matrix.length; i++)
			result += "  " + printArray(matrix[i]) + ",\n";
		result += "]";
		return result;
	}

	public static <T> String printMatrix(T[][] matrix) {
		String result = "[\n";
		for (int i = 0; i < matrix.length; i++)
			result += "  " + printArray(matrix[i]) + ",\n";
		result += "]";
		return result;
	}

	public static String printArray(int[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			result += array[i];
			if (i != array.length - 1)
				result += ", ";
		}
		result += "]";
		return result;
	}

	public static <T> String printArray(T[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			result += array[i].toString();
			if (i != array.length - 1)
				result += ", ";
		}
		result += "]";
		return result;
	}

	public static String printSequence(char[] sequence) {
		String result = "[";
		for (int i = 0; i < sequence.length; i++) {
			result += sequence[i];
			if (i != sequence.length - 1)
				result += ", ";
		}
		result += "]";
		return result;
	}

	public static<T> String printNestedList(List<List<T>> list) {
		String result = "[";
		for (List<T> nestedList : list) {
			result += nestedList;
		}
		result += "]";
		return result;
	}

	public static String printArrayOfList(List<int[]> list) {
		String result = "[";
		for (int i = 0; i < list.size(); i++) {
			result += printArray(list.get(i));
			if (i != list.size() - 1)
				result += ", ";
		}
		result += "]";
		return result;
	}
}
