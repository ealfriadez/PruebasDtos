package unfv.edu.pe.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import unfv.edu.pe.model.Product;
import unfv.edu.pe.repository.LocalRepository;
import unfv.edu.pe.repository.ProductRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductServiceImplTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductService productService;
	
	@Test
	void test() {

		Product product = productRepository.findProductforNameProduct("Bone");
		
		assertNotNull(product);
	}

}
