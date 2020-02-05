import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * Write a description of class TicTacToeImages here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToeImages
{
   protected Image xx = new Image("file:X.png"); 
   protected Image oo = new Image("file:O.png");
   protected Image gray = new Image("file:Gray Image TicTacToe.png");
   protected ImageView x =  new ImageView(xx);
   protected ImageView o = new ImageView(oo);
 

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ImageView setImageX(){
        
        x.setFitWidth(100);
        x.setPreserveRatio(true);
        return x;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ImageView setImageO(){
        
        o.setFitWidth(100);
        o.setPreserveRatio(true);
        return o;
    }
    
    public ImageView setGrayImage(){
        ImageView grayImage = new ImageView(gray);
        grayImage.setFitWidth(100);
        grayImage.setPreserveRatio(true);
        return grayImage;
    }
}
