/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cesavemr
 */
public class FileController {
    
    public File[] readFile(String route){        
        File f = new File(route);        
        if (f.exists()){ 
            return f.listFiles();            
        }        
        return null;
    }
    
    public String processFile(File file){        
        String result = "";
        try {
            String temp;            
            FileReader reader = new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(reader);
            Integer line = 0;            
            while((temp = br.readLine()) != null){
                Pattern pattern = Pattern.compile("([a-zA-Z0-9\\-]+\\s()[a-zA-Z0-9\\-]|[a-zA-Z0-9\\-;])+");                
                Matcher matcher = pattern.matcher(temp);
                line ++;
                if (!matcher.matches()) {                    
                    result += "'"+temp + "' - " + "Line: " + line +"\n";
                }
            }
            return result;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        } catch (IOException io){
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, io);
            return result;
        }        
    }
    
}
