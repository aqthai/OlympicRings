import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Graphics;

/**
   OlympicFrame contains movable symbol with MouseListener attached
*/
public class OlympicFrame extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_LENGTH = 300;
   
   private OlympicRingComponent scene;
   
   class MousePressListener implements MouseListener
   {
      public void mousePressed(MouseEvent event)
      {
         int x = event.getX();
         int y = event.getY();
         scene.moveSymbolTo(x, y);
      }
      
      public void mouseReleased(MouseEvent event) {}
      public void mouseClicked(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
   }
   
   public OlympicFrame()
   {
      scene = new OlympicRingComponent();
      add(scene);
      MouseListener listener = new MousePressListener();
      scene.addMouseListener(listener);
      
      setSize(FRAME_WIDTH, FRAME_LENGTH);
      
      //Creates Menu
      JMenuBar menuBar = new JMenuBar();     
      setJMenuBar(menuBar);
      menuBar.add(createFileMenu());
      menuBar.add(createColorMenu());
   }
   
   class ExitItemListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         System.exit(0);
      }
   }  
   
   public JMenu createFileMenu()
   {
      JMenu menu = new JMenu("File");
      JMenuItem exitItem = new JMenuItem("Exit");      
      ActionListener listener = new ExitItemListener();
      exitItem.addActionListener(listener);
      menu.add(exitItem);
      return menu;
   }
   
   public JMenu createColorMenu()
   {
      JMenu menu = new JMenu("Color");
      menu.add(createColorItem("Randomize"));
      return menu;
   }
   
   public JMenuItem createColorItem(String name)
   {
      class ColorItemListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            repaint();
         }
      }
      JMenuItem item = new JMenuItem(name);      
      ActionListener listener = new ColorItemListener();
      item.addActionListener(listener);
      return item;
   }
}