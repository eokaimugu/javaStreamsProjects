package streamsJavaDemo;

import java.util.ArrayList;
import java.util.List;

class Products
{
	 int id;
	 String name;
	 double price;
	 

	public Products(int id, String name, double price) {
	 
	
		this.id=id;
		this.name=name;
		this.price=price;
}

}
public class MoreStreamExamples {	

	public static void main(String[] args) {
		
		
		List<Products> productList = new ArrayList<Products>();
		productList.add(new Products(1,"HP Laptop", 2500));
		productList.add(new Products(2,"Dell Laptop", 3000));
		productList.add(new Products(3,"Lenovo Laptop", 2800));
		productList.add(new Products(4,"Sonny Laptop", 2900));
		productList.add(new Products(5,"Apple Laptop", 5000));
		
		
		
		productList.stream().filter(p->p.price>2500 && p.price< 3000).forEach(pr->System.out.println(pr.price));
		
		
	}

}
