package col106.assignment4.HashMap;

public class WordCounter {
	// HashMap<Integer> hash;

	public WordCounter(){
		// hash = new HashMap<Integer>(1000000);
	}

	public int count(String str, String word){
		HashMap<Integer> hash = new HashMap<Integer>(1000000);
		int value=0;
		boolean present=false;
		for(int i=0;i<str.length()-word.length()+1;i++){
			if(str.substring(i,i+word.length()).equals(word)){
				present=true;
			}
			if(hash.get(str.substring(i,i+word.length()))!=null){
				hash.put(str.substring(i,i+word.length()),hash.get(str.substring(i,i+word.length()))+1);
			}
			else{
				hash.put(str.substring(i,i+word.length()),1);
			}
		}
		// hash.print_Hashmap();
		// System.out.println(word);

		// write your code here
		if(present)		return hash.get(word);
		return 0;
	}
}
