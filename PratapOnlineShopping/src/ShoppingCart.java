import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	Scanner sc=new Scanner(System.in);
	
	List<Product> list=new ArrayList<>();
	public void addProduct(Product product) {
		list.add(product);
	}
	
	public List<Product> getList(){
		return list;
	}
	
	public double getTotal(){
		int total=0;
		for(Product p:list) {
			total +=p.getPrice();
		}
		return total;
	}
	
	
	public void LogicForPoints() {
		
		boolean lap=true;
		
		while(lap) {
			display();
			int num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("Enter Product name: ");
				String ProductName=sc.next();
				System.out.println("Enter Product Price: ");
				double ProductPrice =sc.nextDouble();
				Product product=new Product(ProductName, ProductPrice);
				addProduct(product);
				System.out.println("product added: ");
				break;
			case 2:
				List<Product> list=getList();
				if(list.isEmpty()) {
				System.out.println("Your Cart is Empty: ");
				}else {
					System.out.print("Your Cart: ");
					int total=0;
				for(Product p:list) {
					System.out.println(p.getName()+" -  $"+p.getPrice());
					total+=p.getPrice();
				}
				System.out.println("Total: $"+ getTotal());
				}
				break;
				
			case 3:
				System.out.println("Total: $"+ getTotal());
				System.out.println("Thank you for shopping with us!");
				lap=false;
				break;
			case 4:
				System.out.println("Thank you for visiting the Online Store!");
				lap=false;
				break;
			}
		}
		
	}
	public void display() {
	    System.out.println(" Welcome to the Online Store: ");
	    
	    System.out.println("1. Add Product to Cart");
	    System.out.println("2. View Cart  ");
	    System.out.println("3. Checkout ");
	    System.out.println("4. Exit");
	    System.out.println("Enter your Choice:\n");
	   
	    
	    }


}
