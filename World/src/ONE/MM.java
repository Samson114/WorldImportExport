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
             * ��Word�ж�ȡ����
             * 
             */
        	File file = new File("d://1.doc");  
            InputStream in = new FileInputStream(file);   
            String s = w.extractText(in);   
            System.out.println(s);   
            
	       /*
	        * ��Word��д������
	        */
//	        String content="����һ��������Ŀ������";
//	        boolean result= ww.writeWordFile("d://1.doc", content);
//	        System.out.println(result);      
        
        }catch(Exception e){   
            e.printStackTrace();   
        }   
        
        
                   
    }   
}
