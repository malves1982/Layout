/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author malves
 */
public class CanvasWindow {
    Frame f = new Frame();
    Canvas c = new Canvas();

    public CanvasWindow() {
        f.setSize(400, 400);
        f.setLocation(100, 100);
        f.setTitle("Estrela");
        f.setResizable(true);
        f.setVisible(true);
        
        f.add(new MyCanvas());
    }
    
    public static void main(String[] args) {
        CanvasWindow cw = new CanvasWindow(); 
    }
    
    class MyCanvas extends Canvas {

      public MyCanvas () {
         setBackground (Color.GRAY);
         setSize(300, 300);
      }

      public void paint (Graphics g) {
          Graphics2D g2;
         g2 = (Graphics2D) g;
         g2.drawLine(150, 0, 0, 300);
         g2.drawLine(0, 300, 300, 100);
         g2.drawLine(300, 100, 0, 100);
         g2.drawLine(0, 100, 300, 300);
         g2.drawLine(300, 300, 150, 0);
      }
   }
    
}
