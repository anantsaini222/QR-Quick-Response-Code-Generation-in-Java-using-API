/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrcodegenrator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author anant
 */
public class QRCodeGenrator {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        String details = "Anant : Channel Name : Flexncode Learnings ...... ";
        
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        
        File f= new File("C:\\Users\\anant\\Downloads\\QRCode\\MyChannel.jpg");
        FileOutputStream fos = new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush();
        
    }v
    
}
