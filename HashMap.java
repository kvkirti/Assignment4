// package col106.assignment4.HashMap;
import java.util.Vector;

public class HashMap<V> implements HashMapInterface<V> {

	public class HashNode{
		private String key;
		private V value;

		public HashNode(String key, V value){
			this.key=key;
			this.value=value;
		}
	}

	public HashNode[] hashTable;
	int occupied,size;

	public HashMap(int size) {
		hashTable = (HashNode[]) new Object[size];
		this.size = size;
		occupied = 0;
	}

	public V put(String key, V value){
		int index = 0;
		if(search(key)==-1){
			index = hashFunction(key);
			while(hashTable[index]!=null){
				index = (index+1) % hashTable.length;
			}
			hashTable[index] = new HashNode(key,value);
			this.occupied++;
		}
		else{
			V oldValue = hashTable[search(key)].value;
			hashTable[search(key)].value = value;
			return oldValue;
		}
		// write your code here
		return null;
	}

	public int hashFunction(String key){
		int coeff=1,offset=61,sum =(int) key.charAt(key.length()-1);
		for(int i=key.length()-2;i>=0;i--){
			sum = (((int)key.charAt(i) -offset) + (coeff*sum)%this.size) % this.size;
		}
		return (sum % this.size);
	}

	public int search(String key){
		int index = hashFunction(key);
		while(hashTable[index]!=null){
			if(hashTable[index].key.equals(key)){
				return (index);
			}
			index = (index+1) % hashTable.length;
		}
		return -1;
	}

	public V get(String key){
		int index = hashFunction(key);
		while(hashTable[index]!=null){
			if(hashTable[index].key.equals(key)){
				return (hashTable[index].value);
			}
			index = (index+1) % hashTable.length;
		}
		return null;
	}

	public boolean remove(String key){
		int index = hashFunction(key);
		if(hashTable[index]==null)	return false;
		while(hashTable[index]!=null){
			if(hashTable[index].key.equals(key)){
				hashTable[index]=null;
				int forward=index,backward=index,Max_iter=0;
				// ------------------------- Shifting --------------------------------------
				while(Max_iter<=this.size){
					if(hashTable[forward]==null)						break;
					if(hashFunction(hashTable[forward].key)<=hashFunction(key)){
						hashTable[backward]=hashTable[forward];
						backward=forward;
					}
					forward=(forward+1)%this.size;
					Max_iter++;
				}
				//---------------------------------------------------------------------------
			}
			index = (index+1) % hashTable.length;
		}
		this.occupied--;
		return true;
	}

	public void print_Hashmap(){
		System.out.println("\n-------------------- PRINTING HASHMAP---------------------------------------------------------");
		System.out.print("Index\tValue\tHash");
		for(int i=0;i<this.size;i++){
			System.out.println(i+" --> "+hashTable[i]+" --> "+ hashFunction(hashTable[i].key));
		}
		System.out.println("---------------------------------------------------------------------------------------------\n");
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
