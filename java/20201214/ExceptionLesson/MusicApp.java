import java.util.*;
import java.io.*;
public class MusicApp{
	public static void main(String[] args){
		System.out.print("音楽ファイル名>");
		String msg=new Scanner(System.in).nextLine();
		if(msg.contains(".mp3")){
			System.out.println("流します");
		}else{
			System.out.println("未対応");
		}
		/*
		try{
			System.out.print("音楽ファイル名>");
			String msg=new Scanner(System.in).nextLine();
			if(msg != msg.contains(".mp3")){
				throw new UnsupportedMusicFileException("未対応のファイルです");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
	}
}
/*
class UnsupportedMusicFileException extends Exception{
	public UnsuportedMusicFileException(String msg){
		super(msg);
	}
}
*/
