package eMart.gui;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

class BarCodeGenerator {

    public static void createBarcodeImage(String imageName, String  prodId) {
        try{
            Code128Bean code128=new Code128Bean();
            code128.setHeight(15f);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            BitmapCanvasProvider canvas=new BitmapCanvasProvider(baos,"image/x-png",350,BufferedImage.TYPE_BYTE_BINARY,false,0);
            code128.generateBarcode(canvas,prodId);
            canvas.finish();
            
            String userdir=System.getProperty("user.dir");
            //String outputDirPath = userdir + File.separator + "Barcodes";
            System.out.println("user dir is : "+userdir);
            FileOutputStream fos=new FileOutputStream(userdir+"\\Barcodes\\"+imageName);
            //FileOutputStream fos=new FileOutputStream(new File(outputDirPath ,imageName));
            fos.write(baos.toByteArray());
            fos.flush();
            fos.close();
            JOptionPane.showMessageDialog(null,"Barcode generated successfully");
        }
        catch(Exception e){
            System.out.print("Exception in barcode gen:"+e.getMessage());
            e.printStackTrace();
        }
    }

}
