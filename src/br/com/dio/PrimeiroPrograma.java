package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma{
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		Gato gato = new Gato("Gato de Botas", "Pardo", 3);
		
//		gato.setNome("Gato de Botas");
//		gato.setCor("Pardo");
//		gato.setIdade(3);
		
		System.out.println(gato.getNome());
		System.out.println(gato.getCor());
		System.out.println(gato.getIdade()+" anos");
		
		System.out.println(livro);
	}
	
}