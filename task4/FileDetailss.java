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

public class FileDetailss {
	 private String file_name;
	 private List<String> largest_line = new ArrayList<String>();
	 private int number_of_lines;
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public List<String> getLargest_line() {
		return largest_line;
	}
	public void setLargest_line(List<String> largest_line) {
		this.largest_line = largest_line;
	}
	public int getNumber_of_lines() {
		return number_of_lines;
	}
	public void setNumber_of_lines(int number_of_lines) {
		this.number_of_lines = number_of_lines;
	}
	

}


