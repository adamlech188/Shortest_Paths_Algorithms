package shortestpaths;

import matrix.IntegerMatrix;

public class HomeWorkGraph {
	public static void InitializeGraph(int[][] graph) {
		graph[0][0] = 0;
		graph[0][1] = -6;
		graph[0][2] = Integer.MAX_VALUE;
		graph[0][3] = 1;
		graph[0][4] = Integer.MAX_VALUE;
		graph[0][5] = Integer.MAX_VALUE;

		graph[1][0] = 11;
		graph[1][1] = 0;
		graph[1][2] = -4;
		graph[1][3] = Integer.MAX_VALUE;
		graph[1][4] = Integer.MAX_VALUE;
		graph[1][5] = Integer.MAX_VALUE;

		graph[2][0] = Integer.MAX_VALUE;
		graph[2][1] = Integer.MAX_VALUE;
		graph[2][2] = 0;
		graph[2][3] = Integer.MAX_VALUE;
		graph[2][4] = Integer.MAX_VALUE;
		graph[2][5] = 20;

		graph[3][0] = Integer.MAX_VALUE;
		graph[3][1] = Integer.MAX_VALUE;
		graph[3][2] = -11;
		graph[3][3] = 0;
		graph[3][4] = 2;
		graph[3][5] = Integer.MAX_VALUE;

		graph[4][0] = Integer.MAX_VALUE;
		graph[4][1] = 3;
		graph[4][2] = Integer.MAX_VALUE;
		graph[4][3] = -1;
		graph[4][4] = 0;
		graph[4][5] = 7;

		graph[5][0] = 5;
		graph[5][1] = Integer.MAX_VALUE;
		graph[5][2] = Integer.MAX_VALUE;
		graph[5][3] = Integer.MAX_VALUE;
		graph[5][4] = -3;
		graph[5][5] = 0;
	}

	public static void Initialize_Figure_25_1(IntegerMatrix graph) {
		graph.set(0, 0, 0);
		graph.set(0, 1, 3);
		graph.set(0, 2, 8);
		graph.set(0, 3, Integer.MAX_VALUE);
		graph.set(0, 4, -4);

		graph.set(1, 0, Integer.MAX_VALUE);
		graph.set(1, 1, 0);
		graph.set(1, 2, Integer.MAX_VALUE);
		graph.set(1, 3, 1);
		graph.set(1, 4, 7);

		graph.set(2, 0, Integer.MAX_VALUE);
		graph.set(2, 1, 4);
		graph.set(2, 2, 0);
		graph.set(2, 3, Integer.MAX_VALUE);
		graph.set(2, 4, Integer.MAX_VALUE);

		graph.set(3, 0, 2);
		graph.set(3, 1, Integer.MAX_VALUE);
		graph.set(3, 2, -5);
		graph.set(3, 3, 0);
		graph.set(3, 4, Integer.MAX_VALUE);

		graph.set(4, 0, Integer.MAX_VALUE);
		graph.set(4, 1, Integer.MAX_VALUE);
		graph.set(4, 2, Integer.MAX_VALUE);
		graph.set(4, 3, 6);
		graph.set(4, 4, 0);

	}

	public static void InitializeGraph(IntegerMatrix graph) {
		graph.set(0, 0, 0);
		graph.set(0, 1, -6);
		graph.set(0, 2, Integer.MAX_VALUE);
		graph.set(0, 3, 1);
		graph.set(0, 4, Integer.MAX_VALUE);
		graph.set(0, 5, Integer.MAX_VALUE);

		graph.set(1, 0, 11);
		graph.set(1, 1, 0);
		graph.set(1, 2, -4);
		graph.set(1, 3, Integer.MAX_VALUE);
		graph.set(1, 4, Integer.MAX_VALUE);
		graph.set(1, 5, Integer.MAX_VALUE);

		graph.set(2, 0, Integer.MAX_VALUE);
		graph.set(2, 1, Integer.MAX_VALUE);
		graph.set(2, 2, 0);
		graph.set(2, 3, Integer.MAX_VALUE);
		graph.set(2, 4, Integer.MAX_VALUE);
		graph.set(2, 5, 20);

		graph.set(3, 0, Integer.MAX_VALUE);
		graph.set(3, 1, Integer.MAX_VALUE);
		graph.set(3, 2, -11);
		graph.set(3, 3, 0);
		graph.set(3, 4, 2);
		graph.set(3, 5, Integer.MAX_VALUE);

		graph.set(4, 0, Integer.MAX_VALUE);
		graph.set(4, 1, 3);
		graph.set(4, 2, Integer.MAX_VALUE);
		graph.set(4, 3, -1);
		graph.set(4, 4, 0);
		graph.set(4, 5, 7);

		graph.set(5, 0, 5);
		graph.set(5, 1, Integer.MAX_VALUE);
		graph.set(5, 2, Integer.MAX_VALUE);
		graph.set(5, 3, Integer.MAX_VALUE);
		graph.set(5, 4, -3);
		graph.set(5, 5, 0);

	}
}
