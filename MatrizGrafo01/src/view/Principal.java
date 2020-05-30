package view;

import controller.MatrizController;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = {{1,1,0,0,1},{1,1,1,1,1},{0,1,0,1,0},{0,1,1,0,0},{1,1,0,0,0}};
		MatrizController m = new MatrizController();
		matriz = m.carregaMatriz();
		m.arestas(matriz);
		System.out.println(m.direcionado(matriz));
		m.grau(matriz);
	}

}
