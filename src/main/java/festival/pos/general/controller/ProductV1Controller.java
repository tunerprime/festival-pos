package festival.pos.general.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import festival.pos.general.domain.ProductGroup;
import festival.pos.general.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin("*")
public class ProductV1Controller {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<ProductGroup>> list() {
		
		List<ProductGroup> list = productService.findAll();
		
		return ResponseEntity.ok(list);
	}
}
