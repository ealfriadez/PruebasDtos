package unfv.edu.pe.service;

import java.util.List;
import java.util.Optional;

import unfv.edu.pe.model.Product;
import unfv.edu.pe.projection.classbased.ProductDTO;
import unfv.edu.pe.projection.interfacebased.closed.ProductClosedView;

public interface ProductService {

	List<Product> findAll();
	List<ProductClosedView> findBy();
	Optional<ProductClosedView> findProductById(Long id);
	List<ProductDTO> findProductsBy();
	ProductClosedView findByBrandDynamicCloseView(String brand);
	ProductDTO findByBrandDynamicClassBased(String brand);
	
	Product findProductforNameProduct(String name);
}
