package unfv.edu.pe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	private String name;
	private String brand;
	private boolean expired;
	private float price;
	
	@ManyToOne
	@JoinColumn(
			name = "id",
			referencedColumnName = "id_local"
			)
	private Local local;
}
