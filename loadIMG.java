package promhs;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author Restu Wijaya
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