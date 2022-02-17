import java.awt.*;
import java.awt.event.*;

public class Mybutton extends Frame {

 Button painike1 = new Button("painike1");
 Button painike2 = new Button("painike2");
 int x;
 int y;
 Color vari;
 Label lapl = new Label();
 Viiva viiva = new Viiva(this);

 public Mybutton() {
  x = 40;y = 40;
  painike1.addActionListener(new Painike_listnr(this));
  painike2.addActionListener(new Painike_listnr(this));
  this.setSize(new Dimension(300,300));
  GridLayout asettelija = new GridLayout();
  this.setLayout(asettelija);
  addWindowListener(new Lopeta());
  this.add(painike1);
  this.add(painike2);
  this.add(lapl);
  this.setBackground(vari);


 
  this.add(viiva);
  System.out.println(viiva.getBounds().toString());

		   }
  public void repaint() {
  setBackground(vari);
		}

  public void painikepainettu(ActionEvent e){


       System.out.println("tulostettu mybutton pinikepainetusta");
        System.out.println("getActionCommand :" + e.getActionCommand()); 
        System.out.println("getModifiers :" + e.getModifiers()); 
        System.out.println("getWhen :" + e.getWhen());  
        System.out.println("paramString :" + e.paramString()); 
        System.out.println("getSource :" + e.getSource());  
        System.out.println("getID :" + e.getID());  
       vari = Color.red;
       viiva.setForeground(vari);
       x++; y++; viiva.repaint();
       repaint();
       this.setBackground(Color.blue);
       System.out.println(x + "   " + y);
 if(e.getActionCommand() == "painike1")lapl.setText("painettu");

 if(e.getActionCommand() == "painike2")lapl.setText(" ");



					}

 class Viiva extends Canvas {
 Mybutton painike;

 Viiva(Mybutton butto){

  painike = butto;
  painike.vari = Color.blue;
		}
  public void paint(Graphics g) {
  
  g.setColor(painike.vari);
  g.drawLine(20,20,painike.x,painike.y);
  g.setColor(Color.black);
  int x, f;
  for(f = 0;f < 100; f = f + 4  ){

  for(x = 0;x < 300; x = x + 4  ){
  g.drawLine((f + 30),(x + 30),(f + 30),(x + 30));
                        }         }
}

           }











				}