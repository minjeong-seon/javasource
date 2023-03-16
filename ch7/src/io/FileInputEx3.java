package io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;

public class FileInputEx3 {
	public static void main(String[] args) {
		// FileInputEx1.java 를 읽어서 화면 출력
		// 행 번호와 같이 출력(FileReader, Writer)
		
//		try(FileReader fis=new FileReader(".\\src\\io\\FileInputEx1.java");
//				OutputStream out = System.out) {			
//			
//			int data = 0;
//			int row = 1; //행번호
//			
//			System.out.print(row+"   ");		
//			
//			while((data=fis.read())!=-1) {
//				
//				System.out.print((char)data);
//				
//				if(data == '\n') {
//					row++;
//					System.out.print(row+"   ");	
//				}				
//			}			
//		} catch (Exception e) { 			
//			e.printStackTrace();
//		}
		
		
		
		try(FileReader fis=new FileReader(".\\src\\io\\FileInputEx1.java");
				PrintStream out = System.out) {			
			
			int data = 0;
			int row = 1; //행번호
			
			out.print(row+"   ");		
			
			while((data=fis.read())!=-1) {
				
				out.print((char)data);
				
				if(data == '\n') {
					row++;
					out.print(row+"   ");	
				}				
			}			
		} catch (Exception e) { 			
			e.printStackTrace();
		}
	}
}








