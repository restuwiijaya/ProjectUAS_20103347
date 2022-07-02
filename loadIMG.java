package promhs;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author I Ketut Agus Restu Wijaya 20103347
 */
public class loadIMG {
     public static BufferedImage loadImage(String ref){
        BufferedImage bimg = null;
        try{
            bimg = ImageIO.read(new File(ref));
        }catch(Exception e){}
        return bimg;
    }
}
