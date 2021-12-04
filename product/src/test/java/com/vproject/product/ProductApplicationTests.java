package com.vproject.product;

import com.vproject.product.entity.BrandEntity;
import com.vproject.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity entity = new BrandEntity();
		entity.setName("Huawei");
		brandService.save(entity);
		System.out.println("success");
	}

}
