import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class PublisherSubscriberMain {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Subscriber s=new Subscriber();
		Publisher p=new Publisher();
		PublisherSubscriberInfo ps=new PublisherSubscriberInfo();
		String csvFile = args[1];
		String line = "";
		String cvsSplitBy = ",";
	
	 
			//Map<String, String> maps = new HashMap<String, String>();
	 
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
	 
				// use comma as separator
				String[] record = line.split(cvsSplitBy);
				
				if(record[0].equalsIgnoreCase("Subscribe")){
					
					s.subscribe=true;
					s.sub_name=record[1];
					s.product=record[2];
					
					ps.addToHashMap(s.product, s.sub_name);
					//adding subscribers to already existing products.
					
				}
				
				
				//for unsubscribing
				else if (record[0].equalsIgnoreCase("Unsubscribe")){
					
					s.subscribe=false;
					s.sub_name=record[1];
					s.product=record[2];
					
					ps.removeFromHashMap(s.product,s.sub_name);
					
				}
				
				
				//for publishing
				else if(record[0].equalsIgnoreCase("Publish")){
					
					p.brand=record[3];
					p.product=record[2];
					p.publish=true;
					p.vendor=record[1];
					
					//System.out.println("Values sent for publishing : "+p.product+" "+p.brand+" "+p.vendor);
					ps.publishFromMap(p.product, p.brand, p.vendor);
					
					
				}
				
				
	 
				
			}
	

	}}
