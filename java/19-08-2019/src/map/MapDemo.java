package map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	private Map<String, String> map;
	



	public MapDemo() {
		// TODO Auto-generated constructor stub
		super();
		map = new TreeMap();
	}



	public void createMap()
	{
		map.put("Name","John");
		map.put("Address","ABC");
		map.put("Number", "987654321");
		map.put("Name", "Bob");
	}
	
	public Set <String> getMapKeys()
	{
		return map.keySet();
	}

	public Collection<String> getMapValues()
	{
		return map.values();
		}
	

}
