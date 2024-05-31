package unfv.edu.pe.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unfv.edu.pe.model.Product;
import unfv.edu.pe.projection.classbased.ProductDTO;
import unfv.edu.pe.projection.interfacebased.closed.ProductClosedView;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	//Closed view interface brand
	List<ProductClosedView> findBy();
	
	Optional<ProductClosedView> findProductByIdProduct(Long idProduct);
	
	//View class based
	List<ProductDTO> findProductBy();

	//Dynamic
	<T> T findProductByBrand(String brand, Class<T> type);
	
	List<Product> findAll();
	

	Product findProductforNameProduct(String name);

}
