import java.io.*;
import java.util.*;
public class Camp{
	public static void main(String[] args)throws Exception{
		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		Map<String,String> map1=new LinkedHashMap<>();
		Map<String,Integer> map2=new LinkedHashMap<>();
		while((line=br.readLine()) != null){
			System.out.println(line);
			String[] lines=line.split(",", -1);
			int num=Integer.parseInt(lines[2]);
			map1.put(lines[0],num);
			map2.put(lines[1],num);
		}
		System.out.println();
		br.close();
	}
}
