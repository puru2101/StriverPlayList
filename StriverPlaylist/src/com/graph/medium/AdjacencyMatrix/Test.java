package com.graph.medium.AdjacencyMatrix;

import java.util.Iterator;

public class Test {

	int v;
	int[][] adjmatrix;

	Test(int v) {
		this.v = v;
		adjmatrix = new int[v][v];
	}

	void addElems(int x, int y) {
		adjmatrix[x][y] = 1;
		adjmatrix[y][x] = 1;// for undirected
	}

	void addElemsWeight(int x, int y, int weight) {
		adjmatrix[x][y] = weight;
		// adjmatrix[y][x] = 1;// for undirected
	}

	void printGraph() {
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.print(adjmatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Test t1 = new Test(4);
		t1.addElems(1, 3);
		t1.addElems(2, 3);
		t1.addElems(1, 1);
		t1.addElems(1, 2);
		t1.addElemsWeight(3, 0, 5);
		t1.printGraph();

	}

}
