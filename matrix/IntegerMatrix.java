package matrix;

public class IntegerMatrix implements MatrixInterface<Integer> {
	int rowsNumber;
	int columnsNumber;
	int[][] matrixArray;
	public static final Integer NIL = Integer.MIN_VALUE;

	public IntegerMatrix(int rowsNumber, int columnsNumber) {
		this.rowsNumber = rowsNumber;
		this.columnsNumber = columnsNumber;
		matrixArray = new int[rowsNumber][columnsNumber];

	}

	/**
	 * Copy constructor
	 * 
	 * @param matrix
	 */

	public IntegerMatrix(IntegerMatrix matrix) {
		this.rowsNumber = matrix.getRowDimension();
		this.columnsNumber = matrix.getColumnDimension();
		matrixArray = new int[rowsNumber][columnsNumber];
		copyMatrixArray(matrixArray, matrix.matrixArray);
	}

	@Override
	public Integer get(int row, int col) {

		return matrixArray[row][col];
	}

	@Override
	public int getColumnDimension() {

		return rowsNumber;
	}

	@Override
	public int getRowDimension() {

		return columnsNumber;
	}

	@Override
	public void set(int row, int col, Integer elem) {
		matrixArray[row][col] = elem;

	}

	public int[][] matrixAsArray() {
		return matrixArray;
	}

	public String asOutput() {

		int r = getRowDimension();
		int c = getColumnDimension();
		StringBuffer strBuff = new StringBuffer();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (matrixArray[i][j] == Integer.MAX_VALUE) {
					strBuff.append("inf\t");
				} else {
					strBuff.append(matrixArray[i][j] + "\t");
				}
			}

			strBuff.append("\n");
		}
		return strBuff.toString();

	}

	private void copyMatrixArray(int[][] arr1, int[][] arr2) {
		int r = getRowDimension();
		int c = getColumnDimension();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr1[i][j] = arr2[i][j];
			}

		}
	}

}
