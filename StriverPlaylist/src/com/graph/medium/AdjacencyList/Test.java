package com.graph.medium.AdjacencyList;

import java.util.*;


class Edge{
	int v;
	int weight;
	
	public Edge(int v, int weight) {
		this.v=v;
		this.weight=weight;
	}
}

public class Test {

	int v;
	List<List<Integer>> adgacencyls;

	Test(int v) {
		this.v = v;
		adgacencyls = new ArrayList<>();
		for (int i = 0; i < v; i++) {
			adgacencyls.add(new ArrayList<>());
		}
	}

	void addElems(int x, int y) {
		adgacencyls.get(x).add(y);
		//adgacencyls.get(y).add(x);

	}
	

	void printGraph() {
		for (int i = 0; i < v; i++) {
			System.out.print(i+"-> ");
			for (Integer j : adgacencyls.get(i)) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Test t1= new Test(5);
		t1.addElems(1, 2);
		t1.addElems(4, 3);
		t1.addElems(1, 1);

		t1.printGraph();
	}

}
