package map;

import java.util.Collection;
import java.util.Set;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapDemo demo = new MapDemo();
		demo.createMap();
		
		Set<String> set=demo.getMapKeys();
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		Collection<String> c = demo.getMapValues();
		for (String s:c)
		{
			System.out.println(s);
		}

}
}