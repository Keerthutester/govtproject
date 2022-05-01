import java.util.Map;
import java.util.HashMap;
 

public class Colle {
	public static void main(String[] args) {  
	    HashMap<Integer, String> map=new HashMap<Integer, String>();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");
	    map.put(5,"jai");  

	    
        System.out.println(map);
        
        
        HashMap<String, Integer> maps=new HashMap<String, Integer>();  
	    //Adding elements to map  
	    maps.put("ram",56);  
	    maps.put("Rahul",78);  
	    maps.put("Rahul", 9);  
	    maps.put("Ami", 78);
	    maps.put("jai",23);  

	    
        System.out.println(maps);


	}

}
