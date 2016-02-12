
public class Subscriber {

	boolean subscribe;
	String sub_name;
	String product;
	
	
	public boolean isSubscribe() {
		return subscribe;
	}
	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Subscriber [subscribe=" + subscribe + ", sub_name=" + sub_name
				+ ", product=" + product + "]";
	}
	public Subscriber(boolean subscribe, String sub_name, String product) {
		super();
		this.subscribe = subscribe;
		this.sub_name = sub_name;
		this.product = product;
	}
	public Subscriber() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
}
