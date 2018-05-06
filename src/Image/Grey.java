package Image;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.peer.LightweightPeer;
import javax.imageio.ImageIO;
 
public class Grey{
    public BufferedImage img = null;
    public static int[][] imgMatrix;
    public static int height;
    public static int width;
    
    public Grey(){
    }    
    
    public void grey(String s) throws IOException{
        img = ImageIO.read(new File(s));
//        ColorConvertOp cco = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY),null);
//        cco.filter(img, img);
        
        height = img.getHeight();
        width = img.getWidth();
        
        imgMatrix = new int[height][width];
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int color = img.getRGB(i, 0);
                
                int alpha = (color & 0xff) >>24;
                int red = (color & 0xff) >> 16;
                int green = (color & 0xff) >> 8;
                int blue = (color & 0xff);   
              
                imgMatrix[i][j] = blue;
                
//                System.out.print(imgMatrix[i][j] + " ");
            }
//            System.out.println("");
        }
//        int color = img.getRGB(0, 0);
//        int alpha = (color & 0xff) >>24;
//        int red = (color & 0xff) >> 16;
//        int green = (color & 0xff) >> 8;
//        int blue = (color & 0xff);
        
        
    }
}
    
        
