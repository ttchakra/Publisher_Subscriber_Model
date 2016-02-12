
public class Publisher {

	boolean publish;
	String vendor;
	String product;
	String brand;
	
	public boolean isPublish() {
		return publish;
	}
	public void setPublish(boolean publish) {
		this.publish = publish;
	}
	
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publisher(boolean publish, String vendor, String product,
			String brand) {
		super();
		this.publish = publish;
		this.vendor = vendor;
		this.product = product;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Publisher [publish=" + publish + ", vendor=" + vendor
				+ ", product=" + product + ", brand=" + brand + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
