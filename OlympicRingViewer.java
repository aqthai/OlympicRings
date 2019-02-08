import javax.swing.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

/**
   Author: Alvin Thai
   OlympicRingViewer - uses OlympicRingComponent class to draw five 2D circles
*/

public class OlympicRingViewer
{
   public static void main(String[] args)
   {  
      JFrame frame = new OlympicFrame();

      frame.setTitle("OlympicRingViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}