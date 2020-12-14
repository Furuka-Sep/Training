import java.io.*;
import java.util.*;
public class Lesson4{
	public static void main(String[] args){
		try{
			showMessage();
		}catch(Exception e){
			;
		}
	}
	static void showMessage()throws Exception{
		System.out.println("表示");
		Thread.sleep(2000);
		// ("+p)を打つとクリップボードの文を付けられる
		// :reg で過去に消した文を閲覧できる
		System.out.println("表示終了");
	}
}
