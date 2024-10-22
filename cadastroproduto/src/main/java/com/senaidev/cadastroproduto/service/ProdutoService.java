package com.senaidev.cadastroproduto.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoService {
	@Serviceo
	
	public class ProdutoService {
		
		@Autowired
		private ProdutoRespository produtoRepository;
		
		public Produto saveProduto( Produto produto) {
			return produtoRepository.save(produto);
		
		}
		
	}

}
