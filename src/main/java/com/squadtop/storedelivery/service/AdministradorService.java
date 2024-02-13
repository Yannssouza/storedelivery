package com.squadtop.storedelivery.service;

import com.squadtop.storedelivery.exceptionserrors.ExecaoMensagem;
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
    // Nao pode salvar produto sem existir um nome
    // Nao pode salvar produto sem existir um preco

    produtoRepository.save(produto);
  }

  public void validarCategoria(Produto produto) {
    Categoria categoria = produto.getCategoria();
    Categoria categoriaDB = categoriaRepository.findByName(categoria.getNome());
    if (categoriaDB == null) throw new ExecaoMensagem("Registre uma categoria");
  }
}
