
package Persistencia;

import edu.eci.arsw.wordprocessor.view.GuordMainFrame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Estevan
 */
public class SerialMethod {
   private String defaultP="/tmp/";
   
   public void load(JTextArea texto){ 
        String name=null;
        
        File filesPath=new File(defaultP);
        String[] choices=filesPath.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return (name.endsWith(".guord"));
            }
        });        
        if (choices.length>0){
            name = (String) JOptionPane.showInputDialog(null, "Choose document...",
            "Choose document", JOptionPane.QUESTION_MESSAGE, null, // Use
            choices, // Array of choices
            choices[0]); // Initial choice            
        }
        else{
            JOptionPane.showMessageDialog(null, "No documents found");
        }
        
        if (name!=null){
            ObjectInputStream ois=null;
            try {            
                ois = new ObjectInputStream(new FileInputStream(defaultP+name));            
                String obj=(String)ois.readObject();
                texto.setText(obj);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(GuordMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (ois!=null) ois.close();
                } catch (IOException ex) {
                    Logger.getLogger(GuordMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
        }
    }
    
    public void save(JTextArea texto){
        // prompt the user to enter the file name
        String name = JOptionPane.showInputDialog(this, "Enter file name.");
        if (!name.endsWith(".guord")){
            name=name+".guord";
        }
        ObjectOutputStream oos=null;
        try {
            String body=texto.getText();        
            oos = new ObjectOutputStream(new FileOutputStream(defaultP+name));
            oos.writeObject(body);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuordMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuordMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(GuordMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
          }
    }
    
}
