package com.squadtop.storedelivery.service;

import com.squadtop.storedelivery.model.Categoria;
import com.squadtop.storedelivery.model.Produto;
import com.squadtop.storedelivery.repository.CategoriaRepository;
import com.squadtop.storedelivery.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdministradorService {
    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;
    public void cadastrarProduto(Produto produto) {
        validarCategoria(produto);
        produtoRepository.save(produto);

    }
    public void validarCategoria(Produto produto) {
        Categoria categoria = produto.getCategoria();
        categoriaRepository.findByName(categoria.getNome());

    }


}
