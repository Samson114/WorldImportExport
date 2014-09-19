package ONE;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class MM {

	/**
	 * @param args
	 */
	public static void main(String[] args){   
        WordExtractor w  = new WordExtractor();   
        POIFSFileSystem ps = new POIFSFileSystem();  
        WriteWord ww = new WriteWord();
        try{   
               
            /*
             * 从Word中读取内容
             * 
             */
        	File file = new File("d://1.doc");  
            InputStream in = new FileInputStream(file);   
            String s = w.extractText(in);   
            System.out.println(s);   
            
	       /*
	        * 想Word中写入内容
	        */
//	        String content="这是一个测试项目！！！";
//	        boolean result= ww.writeWordFile("d://1.doc", content);
//	        System.out.println(result);      
        
        }catch(Exception e){   
            e.printStackTrace();   
        }   
        
        
                   
    }   
}
