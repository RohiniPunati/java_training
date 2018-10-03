package task4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
public static boolean w;
	
	public static void main(String[] args) throws IOException {
		FileDetailss file_d=new FileDetailss();
		ReadFromFile rd = new ReadFromFile();
		final File folder = new File("C:/training_workspace/java_kt/src/java_kt");
		  List<String> ll = new ArrayList<String>();
		File statText = new File("C:/training_workspace/java_kt/src/java_kt/FileDetailStore.txt");
		FileOutputStream fos;
		 OutputStreamWriter osw;
		 fos = new FileOutputStream(statText);
		 osw = new OutputStreamWriter(fos); 
		 PrintWriter  ww = new PrintWriter (osw);
		for (final File fileEntry : folder.listFiles()) {
				 
				w = fileEntry.getName().toLowerCase().endsWith(".java");
				if (w) {
					String file_name;
					file_name = fileEntry.getName();
					File file = new File("C:/training_workspace/java_kt/src/java_kt/" + file_name);
					
				        BufferedReader br = null;
				        try {
				            br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(file))));
				            int l_line = 0;
				            int lines_count=0;
				            String line = null;
				            while((line = br.readLine()) != null){
				            	
				                int count = (line.split("\\s+")).length;
				                if(count > l_line){
				                	ll.clear();
				                	file_d.setLargest_line(ll);
				                	ll.add(line);
				                	file_d.setLargest_line(ll);			                	
				                	l_line = count;
				                } else if(count == l_line){
				                	ll.add(line);
				                	file_d.setLargest_line(ll);		
				                } 
				                lines_count++;
				                
				            }
				            file_d.setNumber_of_lines(lines_count);
				            ww.println(file_name);
							ww.println(String.valueOf(lines_count));
							ww.println(String.valueOf(ll));
				        } catch (FileNotFoundException e) {
				            e.printStackTrace();
				        } catch (IOException e) {
				            e.printStackTrace();
				        } finally{
				            try{
				                if(br != null) br.close();
				            }catch(Exception ex){}
				        }
				        br.close();
					}
			 }
		ww.close();
		BufferedReader br = new BufferedReader(new FileReader(statText));
		String line;
		while((line = br.readLine()) != null)
		{

			if(line.matches(".*\\.java")){
				System.out.println(" file name: "+line);
			}
			else if(line.matches("\\d+")){
		    	System.out.println("Number of lines : "+line);
			}
			else{
		    	System.out.println("largest_line :  "+line);
			}
	    
		}
		br.close();
	}
	}



