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
    Categoria categoria = validarCategoria(produto);
    if (produto.getNome() == null) throw new ExecaoMensagem("O produto deve ter um nome");
    if (produto.getPreco() == null) throw new ExecaoMensagem("O produto deve conter um preço");
    produto.setCategoria(categoria);
    produtoRepository.save(produto);
  }

  public Categoria validarCategoria(Produto produto) {
    Categoria categoria = produto.getCategoria();
    Categoria categoriaDB = categoriaRepository.findByNome(categoria.getNome());
    if (categoriaDB == null) throw new ExecaoMensagem("Registre uma categoria");
    return categoriaDB;
  }
}
