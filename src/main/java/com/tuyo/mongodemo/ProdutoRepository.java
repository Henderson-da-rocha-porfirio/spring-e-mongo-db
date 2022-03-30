package com.tuyo.mongodemo;

import com.tuyo.mongodemo.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, String> {
}
