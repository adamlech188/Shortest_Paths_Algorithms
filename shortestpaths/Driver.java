package shortestpaths;
import static shortestpaths.ShortestPaths.*; 
import matrix.IntegerMatrix;
public class Driver {
	public static void main(String[] args) {
		
		IntegerMatrix L1 = new IntegerMatrix(6,6); 
		HomeWorkGraph.InitializeGraph(L1);
		
/*		IntegerMatrix Figure_25_1 = new IntegerMatrix(5,5); 
		HomeWorkGraph.Initialize_Figure_25_1(Figure_25_1);
		FLOYD_WARSHALL fw = new FLOYD_WARSHALL(L1); 
		System.out.println(fw.asOutput()); 
		IntegerMatrix[] DandP = FLOYD_WARSHALL(Figure_25_1); 
		IntegerMatrix DN = DandP[0]; 
		IntegerMatrix PN = DandP[1]; 
		System.out.println("D5 is: \n"); 
		System.out.println(DN.asOutput()); 
		System.out.println("PN is: \n"); 
		System.out.println(PN.asOutput()); 
		System.out.println("Figure_25_1 graph is: \n"); 
		System.out.println(Figure_25_1.asOutput()); */
		
		System.out.println("Homework 7 problem 1."); 
		int[][] l1 = L1.matrixAsArray(); 
		
		System.out.println("L1 is: \n"); 
		System.out.println(asOutput(l1)); 
		
		int[][] l2 = Extend_Shortest_Paths(l1, l1); 
		
		System.out.println("L2 is: \n"); 
		System.out.println(asOutput(l2));
		
		int[][] l3 = Extend_Shortest_Paths(l2, l1); 
		
		System.out.println("L3 is: \n"); 
		System.out.println(asOutput(l3));
		
		int[][] l4 = Extend_Shortest_Paths(l2, l2); 
		
		System.out.println("L4 is: \n"); 
		System.out.println(asOutput(l4));
		
		
		int[][] W1 = L1.matrixAsArray(); 
		
		
		int[][] W2 = ShortestPaths.Extend_Shortest_Paths(W1, W1); 
		int[][] W3 = Extend_Shortest_Paths(W2, W1); 
		int[][] W6 = Extend_Shortest_Paths(W3, W3); 
		
		System.out.println("W1 is: \n"); 
		System.out.println(asOutput(W1)); 
		
		System.out.println("W2 is: \n"); 
		System.out.println(asOutput(W2)); 
 
		System.out.println("W3 is: \n"); 
		System.out.println(asOutput(W3)); 
		
		System.out.println("W6 is: \n"); 
		System.out.println(asOutput(W6)); 

	}


}
