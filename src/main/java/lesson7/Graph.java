package lesson7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private final Vertex[] vertexList;
    private final int[][] adjMat;
    private int size;
    private final Stack<Integer> stack;
    private Queue<Integer> queue;
    private long startTime;

    public Graph() {
        int MAX_VERTS = 32;
        stack = new Stack<>();
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        size = 0;

        for (int i = 0; i < MAX_VERTS; i++) {
            Arrays.fill(adjMat[i], 0);
        }
    }

    public void addVertex (char label) {
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge (int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex (int vertex) {
        System.out.println(vertexList[vertex].label);
    }

    private int getAdjUnvisitedVertex (int vertex) {
        for (int i = 0; i < size; i++) {
            if (adjMat[vertex][i] == 1 && !vertexList[i].wasVisited) {
                return i;
            }
        }
        return -1;
    }

    public void dfs() {
        startTime = System.nanoTime();
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
        System.out.println("Time is: " + (System.nanoTime() - startTime) + " ns\n");
    }

    public void bfs() {
        startTime = System.nanoTime();
        queue = new LinkedList<>();
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.add(0);
        int v2;
        while (!queue.isEmpty()) {
            int v1 = queue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                queue.add(v2);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
        System.out.println("Time is: " + (System.nanoTime() - startTime) + " ns\n");
    }
}