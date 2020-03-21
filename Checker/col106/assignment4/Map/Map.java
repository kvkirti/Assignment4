// package col106.assignment4.Map;
import java.io.File;
// import java.io.*;
// import java.util.*;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Map<V> { 
	WeakAVLMap wAvl;
	HashMap hashmap;

	public Map() {
		this.wAvl=new WeakAVLMap();
		this.hashmap=new HashMap<V>(1000000);
	}
	public void eval(String inputFileName, String outputFileName) throws IOException {
		try {
			long tWavl_Insert=0,tWavl_Delete=0,tHash_Insert=0,tHash_Delete=0;
			Scanner scanner = new Scanner(new File(inputFileName));
			while (scanner.hasNextLine()) {
				String raw_line=scanner.nextLine();
				String[] input=raw_line.split(" ",0);

				// for(int i=0;i<input.length;i++){
				// 	System.out.print(input[i]+" ");
				// }

				System.out.println();
				if(input.length==3){
					long startTime = System.currentTimeMillis();
					wAvl.put(input[1], input[2]);
					long endTime = System.currentTimeMillis();				 
					tWavl_Insert = tWavl_Insert + (endTime - startTime);  //Total execution time in milli seconds
					// System.out.println(tWavl_Insert);				
					
					startTime = System.currentTimeMillis();
					hashmap.put(input[1], input[2]);
					endTime = System.currentTimeMillis();				 
					tHash_Insert = tHash_Insert + (endTime - startTime);  //Total execution time in milli seconds
					// System.out.println(tHash_Insert);				
				}
				else if(input.length==2){
					long startTime = System.currentTimeMillis();
					wAvl.remove(input[1]);
					long endTime = System.currentTimeMillis();				 
					tWavl_Delete = tWavl_Delete + (endTime - startTime);  //Total execution time in milli seconds
					// System.out.println(tWavl_Delete);				
					
					startTime = System.currentTimeMillis();
					hashmap.remove(input[1]);
					endTime = System.currentTimeMillis();				 
					tHash_Delete = tHash_Delete + (endTime - startTime);  //Total execution time in milli seconds				
					// System.out.println(tHash_Delete);				
				}
			}
			File fout = new File(outputFileName);
			// FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fout));
			// OutputStreamWriter osw = new OutputStreamWriter(fos);
			bw.write("Operations\t WAVL\t HashMap\n");
			bw.write("Insertions\t "+Long.toString(tWavl_Insert)+"\t "+Long.toString(tHash_Insert)+"\n");
			bw.write("Deletions\t "+Long.toString(tWavl_Delete)+"\t "+Long.toString(tHash_Delete)+"\n");
			bw.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// write your code here	
	}
}
