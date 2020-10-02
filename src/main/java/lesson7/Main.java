package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');//0
        graph.addVertex('B');//1
        graph.addVertex('C');//2
        graph.addVertex('D');//3
        graph.addVertex('E');//4
        graph.addVertex('F');//5
        graph.addVertex('G');//6
        graph.addVertex('H');//7
        graph.addVertex('I');//8

        graph.addEdge(0, 1);//AB
        graph.addEdge(1, 2);//BC
        graph.addEdge(1, 3);//BD
        graph.addEdge(0, 4);//AE
        graph.addEdge(4, 5);//EF
        graph.addEdge(4, 6);//EG
        graph.addEdge(6, 7);//GH
        graph.addEdge(6, 8);//GI


        graph.displayVertex(5);
        System.out.println();
        graph.dfs();
        graph.bfs();
    }
}