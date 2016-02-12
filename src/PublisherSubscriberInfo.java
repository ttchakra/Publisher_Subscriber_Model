import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;


public class PublisherSubscriberInfo {
	
	
	HashMap<String,ArrayList> hm=new HashMap<String,ArrayList>();
	Publisher p=new Publisher();
	Subscriber s=new Subscriber();
	
	public void addToHashMap(String key, String value ){
		ArrayList<String> al=new ArrayList<String>();
		if(hm.containsKey(key)){
			
			//if subscriber is already subscribed; that is same subscription made twice
			al=hm.get(key);
			if(al.contains(value))
			{
				//do nothing
			}
			
			//for subscribing the first time
			else{
			al.add(value);
			hm.put(key, al);
			//System.out.println("Value added to subscriber's list"+key+" "+ value);
			}
		}
		
		//adding new subscribers.
		else
		{
			al.add(value);
			hm.put(key, al);
			//System.out.println("Value added to subscriber's list"+key+" "+ value);
		}
		
		/*for (Entry<String, ArrayList> entry : hm.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		}*/
		
			
	}
	
	public void removeFromHashMap(String key, String value){
		ArrayList<String> a1=new ArrayList<String>();
		if(hm.containsKey(key)){
			a1=hm.get(key);
			a1.remove(value);
			//System.out.println("Value removed from subscriber's list: "+ value);
		}
		
		else{
			
			//do nothing
		}
		
	}
	
	public void publishFromMap(String key, String brand, String vendor){
		
		if(hm.containsKey(key))
		{
			//System.out.println(key);
			ArrayList<String> a=hm.get(key);
			for(String i: a)
			System.out.println(i+" notified of "+ brand +" from "+ vendor);
		}
		
		else{
			//System.out.println("Not found !");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
