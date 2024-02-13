package com.squadtop.storedelivery.service;

import com.squadtop.storedelivery.exceptionserrors.ExecaoMensagem;
import com.squadtop.storedelivery.model.Categoria;
import com.squadtop.storedelivery.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoriaService {
  private final CategoriaRepository categoriaRepository;

  public void cadastrarCategoria(Categoria categoria) {
    if(categoria.getNome() == null) throw new ExecaoMensagem("Deve informar o nome da categoria");
    categoriaRepository.save(categoria);
  }
}
