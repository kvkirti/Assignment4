package col106.assignment4.HashMap;
import java.util.Vector;

public class HashMap<V> implements HashMapInterface<V> {

	public Array<V> hashTable;
	int occupied;
	V deleted;

	public HashMap(int size) {
		hashTable = new Array<V>(size);
		this.size = size;
		occupied = 0;
	}

	public V put(String key, V value){
		int index = 0;
		if(search(key)==-1){
			index = hashFunction(key);
			while(hashTable[index]!=null && hashTable[index] != deleted){
				index = (index+1) % hashTable.length;
			}
			hashTable[index] = value;
			occupied++;
		}
		else{
			V oldValue = hashTable[search(key)];
			hashTable[search(key)] = value;
			return oldvalue;
		}
		// write your code here
		return null;
	}

	public int hashFunction(String key){

	}

	public int search(String key){

	}
	public V get(String key){
		// write your code here
		return null;
	}

	public boolean remove(String key){
		// write your code here
		return false;
	}

	public boolean contains(String key){
		// write your code here
		return false;
	}

	public Vector<String> keySet(){
		// write your code here
		return null;
	}
}
