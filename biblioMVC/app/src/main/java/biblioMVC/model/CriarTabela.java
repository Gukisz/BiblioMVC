/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Aluno
 */

public class CriarTabela {
    // Método que cria a tabela 'usuarios' no banco de dados
    public static void criarTabelaUsuarios(Connection conexao) {
        // Cria uma string contendo o comando SQL para criar a tabela, se não existir
        String sql = "CREATE TABLE IF NOT EXISTS livros (" 
                   + "id INTEGER PRIMARY KEY AUTOINCREMENT, " // Coluna 'id' como chave primária com autoincremento
                   + "titulo TEXT NOT NULL, " // Coluna 'titulo' do tipo TEXT, obrigatório (NOT NULL)
                   + "autor TEXT NOT NULL)" // Coluna 'autor' do tipo TEXT, obrigatório (NOT NULL)
                   + "ano TEXT NOT NULL)";// Coluna 'ano' do tipo TEXT, obrigatório (NOT NULL)
        
        // Bloco try and catch para garantir o fechamento do Statement após a execução
        try (Statement stmt = conexao.createStatement()) { 
            stmt.execute(sql); // Executa o comando SQL para criar a tabela
            System.out.println("Tabela 'usuarios' criada ou já existente."); // Exibe mensagem de sucesso
        } catch (Exception e) { // Captura exceções que possam ocorrer durante a execução
            System.out.println("Erro ao criar tabela: " + e.getMessage()); // Exibe mensagem de erro
        }
    }
}