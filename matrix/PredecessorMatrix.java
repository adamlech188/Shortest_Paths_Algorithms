package matrix;

public class PredecessorMatrix extends IntegerMatrix {

	public PredecessorMatrix(int rowsNumber, int columnsNumber) {
		super(rowsNumber, columnsNumber);
		initializeMatrixArray(matrixArray);

	}

	public PredecessorMatrix(IntegerMatrix matrix) {
		super(matrix);
	}


	public String asOutput() {

		int r = getRowDimension();
		int c = getColumnDimension();
		StringBuffer strBuff = new StringBuffer();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (matrixArray[i][j] == NIL) {
					strBuff.append("NIL\t");
				} else {
					strBuff.append(matrixArray[i][j] + "\t");
				}
			}

			strBuff.append("\n");
		}
		return strBuff.toString();

	}
	private void initializeMatrixArray(int[][] matrixArray) {
		int r = getRowDimension();
		int c = getColumnDimension();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrixArray[i][j] = NIL;
			}

		}
	}
}
