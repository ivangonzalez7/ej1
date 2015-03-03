package edu.upc.eetac.dsa.igonzalez.Ejercicio1;


public class Tree {
   
	int altura;
	String tipo = "árbol";
	
	public Tree (){
		
	}
	
	public Tree (int altura){
		this.altura = altura;
	}

	public Tree (String tipo){
		this.tipo = tipo;
	
	}

	public Tree (int altura, String tipo){
		this.altura = altura;
		this.tipo = tipo;
	}
	
}
