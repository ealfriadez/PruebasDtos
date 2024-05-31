package unfv.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unfv.edu.pe.model.Product;
import unfv.edu.pe.projection.classbased.ProductDTO;
import unfv.edu.pe.projection.interfacebased.closed.ProductClosedView;
import unfv.edu.pe.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {		
		return productRepository.findAll();
	}

	@Override
	public List<ProductClosedView> findBy() {
		return productRepository.findBy();
	}

	@Override
	public Optional<ProductClosedView> findProductById(Long id) {		
		return productRepository.findProductByIdProduct(id);
	}

	@Override
	public List<ProductDTO> findProductsBy() {		
		return productRepository.findProductBy();
	}

	@Override
	public ProductClosedView findByBrandDynamicCloseView(String brand) {
		ProductClosedView productClosedView = productRepository.findProductByBrand(brand, ProductClosedView.class);
		return productClosedView;
	}

	@Override
	public ProductDTO findByBrandDynamicClassBased(String brand) {
		ProductDTO productDTO = productRepository.findProductByBrand(brand, ProductDTO.class);
		return productDTO;
	}

	@Override
	public Product findProductforNameProduct(String name) {
		
		Optional<Product> productOptional = productRepository.findAll()
												.stream()
												.filter(e -> e.getName().contains(name))
												.findFirst();
		
		Product product = null;
		if (productOptional.isPresent()) {
			product = productOptional.orElseThrow();
		}
		
		
		return product;
	}

}
