import java.io.*;
import java.util.*;
public class Lesson1{
	public static void main(String[] args)throws Exception{
		FileWriter fw =new FileWriter("data.txt",true);//trueを入れると追記(append:付け足す,加える)してくれる
		fw.write("hello");
		fw.close();
	}
}
