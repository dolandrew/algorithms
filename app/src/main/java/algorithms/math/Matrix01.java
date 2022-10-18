//package algorithms.math;
//
//import algorithms.searching.Graph;
//
//import java.util.ArrayDeque;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Matrix01 {
//
//    public static int[][] updateMatrix(int[][] mat) {
//        int[][] dist = new int[3][3];
//        for (int i = 0; i < dist.length; i++) {
//            for (int j = 0; j < dist.length; j++) {
//                dist[i][j] = Integer.MAX_VALUE;
//            }
//        }
//
//        for (int i = 0; i < dist.length; i++) {
//            for (int j = 0; j < dist.length; j++) {
//                if (mat[i][j] == 0) {
//                    dist[i][j] = 0;
//                } else {
//                    dist[i][j] = Integer.MAX_VALUE;
//                }
//            }
//        }
//
//
//        return dist;
//    }
//    public static void main(String[] args) {
//
//        int[] row1 = {0,0,0};
//        int[] row2 = {0,1,0};
//        int[] row3 = {0,0,0};
//        int[][] input = {row1,row2,row3};
//        int[][] result = updateMatrix(input);
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(Arrays.toString(result[i]));
//        }
//    }
//
//    private int V; // No. of vertices
//    private LinkedList<Integer> adj[]; //Adjacency Lists
//
//    boolean[] visited;
//    int tries = 0;
//
//    // Constructor
//    Graph(int v)
//    {
//        V = v;
//        visited = new boolean[V];
//        adj = new LinkedList[v];
//        for (int i=0; i<v; ++i)
//            adj[i] = new LinkedList();
//    }
//
//    // Function to add an edge into the graph
//    void addEdge(int v,int w)
//    {
//        adj[v].add(w);
//    }
//
//    void BFS(int v, int search) {
//        System.out.println("Breadth first search from " + v);
//        Queue<Integer> queue = new ArrayDeque<>();
//        visited[v] = true;
//        queue.add(v);
//        while (!queue.isEmpty()) {
//            v = queue.poll();
//            Iterator<Integer> i = adj[v].listIterator();
//            while (i.hasNext()) {
//                int n = i.next();
//                if (!visited[n]) {
//                    tries++;
//                    System.out.println("checking " + n);
//                    if (n == search) {
//                        System.out.println("found " + search + " in " + tries + " tries");
//                        return;
//                    }
//                    visited[n] = true;
//                    queue.add(n);
//                }
//            }
//        }
//
//    }
//
//    void DFS(int v, int search) {
//        System.out.println("Depth first search from " + v);
//        visited[v] = true;
//        Iterator<Integer> i = adj[v].listIterator();
//        while (i.hasNext()) {
//            int n = i.next();
//            if (!visited[n]) {
//                tries++;
//                System.out.println("checking " + n);
//                if (n == search) {
//                    System.out.println("found " + search + " in " + tries + " tries");
//                    return;
//                }
//                DFS(n, search);
//            }
//        }
//    }
//
//}