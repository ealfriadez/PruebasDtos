package unfv.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unfv.edu.pe.model.Product;
import unfv.edu.pe.projection.classbased.ProductDTO;
import unfv.edu.pe.projection.interfacebased.closed.ProductClosedView;
import unfv.edu.pe.service.ProductService;


@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/findAll")
	public List<Product> findAll(){
		return productService.findAll();
	}
	
	//Closed view interface Based
	@GetMapping("/findAllProductClosedView")
	public List<ProductClosedView> findAllProductClosedView() {
		return productService.findBy();
	}
	
	@GetMapping("/findProductById/{idProduct}")
	public Optional<ProductClosedView> findProductById(@PathVariable Long idProduct){
		return productService.findProductById(idProduct);
	}	
	
	//Class view based
	@GetMapping("/findProductClassBased")
	public List<ProductDTO> findProductClassBased(){
		return productService.findProductsBy();
	} 
	
	//Dynamic
	@GetMapping("/findProductByBrandDynamicCloseView/{brand}")
	public ProductClosedView findProductByBrandDynamicCloseView(@PathVariable(name = "brand") String brand) {
		return productService.findByBrandDynamicCloseView(brand);		
	}
	
	@GetMapping("/findProductByBrandDynamicClassBased/{brand}")
	public ProductDTO findProductByBrandDynamicClassBased(@PathVariable(name = "brand") String brand) {
		return productService.findByBrandDynamicClassBased(brand);		
	}
}
