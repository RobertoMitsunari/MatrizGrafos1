package controller;

import javax.swing.JOptionPane;

public class MatrizController {
	int matriz[][];

	public void arestas(int matriz[][]) {
		int l = matriz.length;
		int c = matriz[0].length;

		for (int x = 0; x < l; x++) {
			for (int y = 0; y < c; y++) {
				if (matriz[x][y] == 1) {
					System.out.println("Aresta entre " + x + " e " + y);
				}
			}
		}
	}
	
	
	
	public int grau(int matriz[][]) {
		int l = matriz.length;
		int c = matriz[0].length;
		int grau = 0;
		for (int x = 0; x < l; x++) {
			for (int y = 0; y < c; y++) {
				if (matriz[x][y] == 1) {
					grau++;
				}
			}
			System.out.println("Grau do vertice " + x + " é: " + grau);
			grau = 0;
		}
		return grau;
	}
	
	public void adjacencias(int matriz[][]) {
		int l = matriz.length;
		int c = matriz[0].length;
		String adjacencia = "";
		for (int x = 0; x < l; x++) {
			for (int y = 0; y < c; y++) {
				if (matriz[x][y] == 1) {
					adjacencia+= y + " ";
				}
			}
			System.out.println("São adjacencias do vertice " + x + " são: " + adjacencia);
			adjacencia = "";
		}
	}
	

	public boolean direcionado(int matriz[][]) {
		int l = matriz.length;
		int c = matriz[0].length;
		boolean direcionado = true;
		for(int x = 0;x < l;x++) {
			for(int y = 0;y < c;y++) {
				if(matriz[x][y] == 1) {
					if(matriz[y][x] != 1) {
						direcionado = false;
					}
				}
			}
		}
		return direcionado;
	}

	public int[][] carregaMatriz() {
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de linhas"));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de colunas"));
		int matriz[][] = new int[x][y];

		for (int l = 0; l < x; l++) {
			for (int c = 0; c < y; c++) {
				matriz[l][c] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Digite um numero linha " + l + " coluna " + c));
			}
		}
		return matriz;

	}
}
