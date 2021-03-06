package br.com.sistema.hibernate;

import org.hibernate.cfg.Configuration;

import br.com.sistema.rotinas.arquivos.Arquivo;
import br.com.sistema.rotinas.produtos.Carrinho;
import br.com.sistema.rotinas.produtos.CarrinhoItem;
import br.com.sistema.rotinas.produtos.PerguntasERespostas;
import br.com.sistema.rotinas.produtos.Produto;
import br.com.sistema.rotinas.usuario.Usuario;

public class AnnotatedClasses {

	public static Configuration getConfiguration() {

		Configuration cfg = new Configuration();

		cfg.addAnnotatedClass(Usuario.class);
		cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(Arquivo.class);
		cfg.addAnnotatedClass(PerguntasERespostas.class);
		cfg.addAnnotatedClass(Carrinho.class);
		cfg.addAnnotatedClass(CarrinhoItem.class);
		
		return cfg;
	}
}