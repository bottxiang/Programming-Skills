package graph;


import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public Node[] nodes;

    public Graph() {
        nodes = new Node[6];
        for (int i = 0; i < 6; i++) {
            nodes[i] = new Node();
        }
        nodes[0].name = "0";
        nodes[0].children = new Node[3];
        nodes[0].children[0] = nodes[1];
        nodes[0].children[1] = nodes[4];
        nodes[0].children[2] = nodes[5];

        nodes[1].name = "1";
        nodes[1].children = new Node[2];
        nodes[1].children[0] = nodes[3];
        nodes[1].children[1] = nodes[4];

        nodes[2].name = "2";
        nodes[2].children = new Node[1];
        nodes[2].children[0] = nodes[1];

        nodes[3].name = "3";
        nodes[3].children = new Node[2];
        nodes[3].children[0] = nodes[2];
        nodes[3].children[1] = nodes[4];

        nodes[4].name = "4";

        nodes[5].name = "5";
    }
    static class Node {
        String name;
        boolean visited;
        Node[] children;

        Node() {
        }
    }

    static void DFS(Node root) {
        if (root == null) return;
        System.out.println(root.name);
        root.visited = true;
        if (root.children == null) return;
        for (Node n : root.children) {
            if (!n.visited) {
                DFS(n);
            }
        }
    }

    static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node n = queue.poll();
            System.out.println(n.name);
            if (n.children == null) continue;
            for (Node node : n.children) {
                if (!node.visited) {
                    node.visited = true;
                    queue.offer(node);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        //DFS(graph.nodes[0]);
        BFS(graph.nodes[0]);
    }
}
