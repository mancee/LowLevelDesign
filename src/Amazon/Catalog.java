package Amazon;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{
	// only one catalog - singleton pattern
	
	HashMap<String,List<Product>> productNames;
	HashMap<String,List<Product>> productCategories;

	@Override
	public List<Product> searchProductsByName(String name) {
		return productNames.get(name);
	}

	@Override
	public List<Product> searchProductsByCategory(String name) {
		return productCategories.get(name);
	}
	
}
