package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concrates.Product;

public interface ProductDao extends JpaRepository <Product,Integer>
{ //JpaRepository burada entityye verdiğin ismi ve veri tipini istiyor

	
	
	
}
