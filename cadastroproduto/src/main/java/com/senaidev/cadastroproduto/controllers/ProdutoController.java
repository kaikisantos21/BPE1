package com.senaidev.cadastroproduto.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.senaidev.cadastroproduto.service.ProdutoService;

@Restcontroller
@ResquestMapping



public class ProdutoController {
	@Autowired
	private ProdutoService ProdutoService;
	
	public Produto createProduto(Produto produto) {
		return produtoService.saveProduto(produto);
		@GetMapping
		  public 

}
