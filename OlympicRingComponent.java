import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.*;

/**
   Author: Alvin Thai
   OlympicRingComponent - class that draws the olypmpic ring symbol
*/

public class OlympicRingComponent extends JComponent
{
   private int xLeft;
   private int yTop;
   static int count;
   static int cycle;
   
   public OlympicRingComponent()
   {
      xLeft = 75;
      yTop = 75;
      count = 0;
      cycle = 0;
   }
   
   public void paintComponent(Graphics g)
   {
      Color [] colors = {Color.BLUE, Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN};
      Graphics2D g2 = (Graphics2D) g;
      g2.setStroke(new BasicStroke(5));

      if(cycle >1)
      {
         count ++;
      }
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft, yTop, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 70, yTop, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 140, yTop, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 105, yTop + 35, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 35, yTop + 35, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      cycle ++;
   }
   /**
      Creates a ring given coordinates, color, and graphics object
      @param x x-coordinate at top left
      @param y y-coordinate at top left
      @param color Color object to color the ring
      @param g Graphics object to allow drawing
   */
   public void drawRing(int x, int y, Color color, Graphics g)
   {
      g.setColor(color);
      g.drawOval(x, y, 70, 70);
   }
   
   /**
      Moves Olympic symbol to another location on the frame
      @param x mouse generated x-coordinate
      @param y mouse generated y-coordinate
   */
   public void moveSymbolTo(int x, int y)
   {
      xLeft = x;
      yTop = y;
      repaint();
   }
   
   public void randomize(Graphics g)
   {
      Color [] colors = {Color.BLUE, Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN};
      Graphics2D g2 = (Graphics2D) g;
      g2.setStroke(new BasicStroke(5));

      drawRing(xLeft, yTop, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 70, yTop, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 140, yTop, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 35, yTop + 35, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      drawRing(xLeft + 105, yTop + 35, colors[count], g);
      count ++;
      if (count > 4)
      {
         count = 0;
      }
      Random ran = new Random();
      count = ran.nextInt(4);
      repaint();
   }
}