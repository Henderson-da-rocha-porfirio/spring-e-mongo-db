package com.tuyo.mongodemo;

import com.tuyo.mongodemo.model.Produto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class MongodemoApplicationTests {

	@Autowired
	ProdutoRepository repository;

	@Test
	void testSave() {
		Produto produto = new Produto();
		produto.setName("Mac Book Pro");
		produto.setPrice(2000f);
		Produto saveProduto = repository.save(produto);
		assertNotNull(saveProduto);
	}

}
