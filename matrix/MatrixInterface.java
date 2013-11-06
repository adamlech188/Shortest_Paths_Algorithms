package matrix;

public interface MatrixInterface<E> {
	public E get(int row, int col);

	public int getColumnDimension();

	public int getRowDimension();

	public void set(int row, int col, E elem);

}
