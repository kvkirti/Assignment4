import java.util.Vector;
public class Test { 
    public static void main(String[] args) 
    {
		HashMap Myhash=new HashMap(11);
		Myhash.put("abc", 1);
		Myhash.put("pqr",2);
		Myhash.put("xyz",1);
		Myhash.put("xyz",2);
		Myhash.put("pqr",4);
		System.out.println(Myhash.get("pqr"));
		Myhash.print_Hashmap();
		Myhash.remove("pqr");

		Vector v = Myhash.keySet();
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		System.out.println(Myhash.contains("abc"));
  	} 
} 
