import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileCreator {
    public static void main(String [] args){
    	String txt = "Å×½ºÆ®";
    	String fileName = "C:\\Users\\YGH\\Desktop\\test.csv";
    	
    	try{
    		BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
    		
    		fw.write(txt);
    		fw.flush();
    		fw.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
