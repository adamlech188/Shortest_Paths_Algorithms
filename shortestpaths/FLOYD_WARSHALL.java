package shortestpaths;

import java.util.Vector;

import matrix.IntegerMatrix;
import matrix.PredecessorMatrix;

public class FLOYD_WARSHALL {
	IntegerMatrix W;
	Vector<IntegerMatrix> DVector;
	Vector<IntegerMatrix> PVector;
	int n; // Dimension of matrix

	public FLOYD_WARSHALL(IntegerMatrix matrix) {
		W = matrix;
		n = matrix.getColumnDimension();
		FLOYD_WARSHALL(W);
	}

	public IntegerMatrix getMatrrixD(int k) {
		return DVector.get(k);
	}

	public IntegerMatrix getMatrixP(int k) {
		return PVector.get(k);
	}

	public String asOutput() {
		StringBuffer strBfr = new StringBuffer();

		for (int k = 0; k <= n; k++) {
			strBfr.append("----------------------------------------------------------------------\n");
			strBfr.append("Matrix D" + k + " is:\n");
			strBfr.append(DVector.get(k).asOutput());
			strBfr.append("\n");

			strBfr.append("Matrix P" + k + " is:\n");
			strBfr.append(PVector.get(k).asOutput());
			strBfr.append("\n");
			strBfr.append("----------------------------------------------------------------------\n");
		}
		return strBfr.toString();
	}

	private IntegerMatrix[] FLOYD_WARSHALL(IntegerMatrix W) {
		int n = W.getColumnDimension(); // n number of columns
		DVector = new Vector<IntegerMatrix>(n);
		PVector = new Vector<IntegerMatrix>(n); // Predecessor
												// vector
		IntegerMatrix D0 = new IntegerMatrix(W);
		IntegerMatrix P0 = new PredecessorMatrix(n, n);
		DVector.add(0, D0);
		PVector.add(0, P0);
		for (int i = 1; i <= n; i++) {
			DVector.add(i, new IntegerMatrix(n, n));
			PVector.add(i, new PredecessorMatrix(n, n));
		}

		// Initializing predecessor matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && W.get(i, j) < ShortestPaths.INF) {
					P0.set(i, j, i + 1);
				}
			}
		}
		// General case
		for (int k = 1; k <= n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					IntegerMatrix d_k_minus_1 = DVector.get(k - 1);
					IntegerMatrix d_k = DVector.get(k);
					IntegerMatrix p_k_minus_1 = PVector.get(k - 1);
					IntegerMatrix p_k = PVector.get(k);
					if (d_k_minus_1.get(i, j) <= addTwoNodes(
							d_k_minus_1.get(i, k - 1),
							d_k_minus_1.get(k - 1, j))) {
						d_k.set(i, j, d_k_minus_1.get(i, j));
						p_k.set(i, j, p_k_minus_1.get(i, j));
					} else {
						d_k.set(i,
								j,
								addTwoNodes(d_k_minus_1.get(i, k - 1),
										d_k_minus_1.get(k - 1, j)));
						p_k.set(i, j, p_k_minus_1.get(k - 1, j));
					}
				}
			}
		}
		IntegerMatrix[] returnMatrix = { DVector.get(n), PVector.get(n) };
		return returnMatrix;

	}

	private int addTwoNodes(int i, int j) {
		if (i == Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (j == Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		return i + j;
	}
}
