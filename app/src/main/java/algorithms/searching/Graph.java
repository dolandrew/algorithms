package algorithms.searching;// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; //Adjacency Lists

	boolean[] visited;
	int tries = 0;

	// Constructor
	Graph(int v)
	{
		V = v;
		visited = new boolean[V];
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}

	void BFS(int v, int search) {
		System.out.println("Breadth first search from " + v);
		Queue<Integer> queue = new ArrayDeque<>();
		visited[v] = true;
		queue.add(v);
		while (!queue.isEmpty()) {
			v = queue.poll();
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					tries++;
					System.out.println("checking " + n);
					if (n == search) {
						System.out.println("found " + search + " in " + tries + " tries");
						return;
					}
					visited[n] = true;
					queue.add(n);
				}
			}
		}

	}

	void DFS(int v, int search) {
		System.out.println("Depth first search from " + v);
		visited[v] = true;
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				tries++;
				System.out.println("checking " + n);
				if (n == search) {
					System.out.println("found " + search + " in " + tries + " tries");
					return;
				}
				DFS(n, search);
			}
		}
	}

	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		g.BFS(0, 3);
	}
}
// This code is contributed by Aakash Hasija
