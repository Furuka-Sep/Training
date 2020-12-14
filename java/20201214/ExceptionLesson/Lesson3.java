import java.io.*;
import java.util.*;
public class Lesson3{
	public static void main(String[] args){
		try(FileWriter fw =new FileWriter("data.txt",true);){
			fw.write("hello");
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
}
