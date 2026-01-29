package com.graph.medium.AdjacencyList;

import java.util.ArrayList;
import java.util.List;

public class TestWeight {

	class Edge {
		int v;
		int weight;

		public Edge(int v, int weight) {
			this.v = v;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "(" + v + "," + weight + ")";
		}

	}

	int v;
	List<List<Edge>> adgacencyls;

	public TestWeight(int v) {
		this.v = v;
		adgacencyls = new ArrayList<>();
		for (int i = 0; i < v; i++) {
			adgacencyls.add(new ArrayList<Edge>());
		}
	}

	void addElems(int x, int y, int weight) {
		adgacencyls.get(x).add(new Edge(y, weight));
		// adgacencyls.get(y).add(x);

	}

	void printGraph() {
		for (int i = 0; i < v; i++) {
			System.out.print(i + "-> ");
			for (Edge e : adgacencyls.get(i)) {
				System.out.print(e.toString() + ", ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		TestWeight t1 = new TestWeight(5);
		t1.addElems(1, 2, 50);
		t1.addElems(4, 3, 80);
		t1.addElems(1, 1, 31);
		t1.printGraph();
	}

}
