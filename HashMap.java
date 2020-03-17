package col106.assignment4.HashMap;
import java.util.Vector;

public class HashMap<V> implements HashMapInterface<V> {

	public class HashNode{
		private String key;
		private V value;

		public HashNode(String key, V value){
			this.key=key;
			this.value=value;
		}

	public HashNode[] hashTable;
	int occupied;
	HashNode deleted;

	public HashMap(int size) {
		hashTable = new HashNode[size];
		this.size = size;
		occupied = 0;
		deleted = new HashNode("deleted", -1);
	}

	public V put(String key, V value){
		int index = 0;
		if(search(key)==-1){
			index = hashFunction(key);
			while(hashTable[index]!=null && hashTable[index] != deleted){
				index = (index+1) % hashTable.length;
			}
			hashTable[index] = new HashTable(key,value);
			occupied++;
		}
		else{
			V oldValue = hashTable[search(key)].value;
			hashTable[search(key)].value = value;
			return oldvalue;
		}
		// write your code here
		return null;
	}

	public int hashFunction(String key){
		int sum =key.charAt(key.length()-1);
		for(int i=key.length()-2;i>=0;i--){
			sum = (key.charAt(i) + 41*sum) % this.size;
		}
		return (sum % this.size);
	}

	public int search(String key){
		index = hashFunction(key);
		while(hashTable[index]!=null){
			if(hashTable[index].key.equals(key)){
				return (index);
			}
			index = (index+1) % hashTable.length;
		}
		return -1;
	}

	public V get(String key){
		index = hashFunction(key);
		while(hashTable[index]!=null){
			if(hashTable[index].key.equals(key)){
				return (hashTable[index].value);
			}
			index = (index+1) % hashTable.length;
		}
		return null;
	}

	public boolean remove(String key){
		// write your code here
		return false;
	}

	public boolean contains(String key){
		index = hashFunction(key);
		while(hashTable[index]!=null){
			if(hashTable[index].key.equals(key)){
				return true;
			}
			index = (index+1) % hashTable.length;
		}
		return false;
	}

	public Vector<String> keySet(){
		// write your code here
		return null;
	}
}
