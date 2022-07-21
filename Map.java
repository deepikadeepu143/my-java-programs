import java.util.*;
class Map
{
	public static void main(String args[])
	{
		Map m = new HashMap();
		m.put(1,DEEPIKA);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey("deepika"));
		System.out.println(m.containsValue("DEEPIKA"));
		System.out.println(m.get(3));
	}
}