/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.controller;

import biblioMVC.model.Livro;
import biblioMVC.model.LivroDAO;

/**
 *
 * @author GUSTAVORIBEIRODASILV
 */
public class LivroController {

	private LivroDAO livroDAO;

	public LivroController() {

		this.livroDAO = new LivroDAO();

	}

	public String adicionarLivros(String titulo, String autor, String anoTexto, int id)  {

		try {

			int ano = Integer.parseInt(anoTexto);

			Livro livro = new Livro (id, titulo, autor, ano);

			livroDAO.adicionarLivro(livro);

			return "Livro adicionado com sucesso!.";

		} catch (NumberFormatException e) {

			return "Erro: " + e.getMessage();

		} 

	}

}
 