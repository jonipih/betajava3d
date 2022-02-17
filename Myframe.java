import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.lang.reflect.Array;
 

public class Myframe extends Frame {

 static Color vari = Color.black;
 MyCanvas kuva;
 Movepanel movPane;
 Rotatepanel rotatePanel;
 TextField text3 = new TextField("text3");
 Lopeta tapahtuma = new Lopeta();
 Pressed motion = new Pressed();
 Screen draw;

 public Myframe () {
  
  rotatePanel = new Rotatepanel();
  movPane = new Movepanel();
  kuva = new MyCanvas();
  draw = new Screen(this,kuva);

  GridBagLayout frameLayout = new GridBagLayout();
  this.setLayout(frameLayout);

  this.add(kuva, new GridBagConstraints(0,0,1,3,0.8,0.8,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  this.add(movPane, new GridBagConstraints(1,0,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,5),0,0));

  this.add(rotatePanel, new GridBagConstraints(1,1,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,5),0,0));

  this.add(text3, new GridBagConstraints(1,2,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,5),0,0));


  addWindowListener(tapahtuma);
  movPane.moveUp.addActionListener(draw);
  movPane.moveDw.addActionListener(draw);
  movPane.moveLf.addActionListener(draw);
  movPane.moveRg.addActionListener(draw);
  movPane.moveFwPw.moveFw.addActionListener(draw);
  movPane.moveFwPw.movePw.addActionListener(draw);
  rotatePanel.rotateUp.addActionListener(draw);
  rotatePanel.rotateDw.addActionListener(draw);
  rotatePanel.rotateLf.addActionListener(draw);
  rotatePanel.rotateRg.addActionListener(draw);
  rotatePanel.spinRg.addActionListener(draw);
  rotatePanel.spinLf.addActionListener(draw);
  setSize(new Dimension(400,400));



  

		   }



 


public class MyCanvas extends Canvas { 

  Color origColor;
  Color vari1;
  int[][] drav;


  public MyCanvas() {
 
  drav = new int[2][4];

  drav[0][0] = 1;
  drav[0][1] = 2;
  drav[0][2] = 12;
  drav[0][3] = 12;

  drav[1][0] = 45;
  drav[1][1] = 45;
  drav[1][2] = 121;
  drav[1][3] = 121; 












  vari1 = Color.black;



   }



  public void paint(Graphics g) { 
//System.out.println("Canvas paint metodi alkaa");
    Dimension size = getSize(); //komponentin koko 

    g.setColor(vari1); 
    //Piirret‰‰n reunat komponentin ymp‰rille. 
    g.draw3DRect(0,0,size.width-12, size.height-12, false); 

int t;
for(t = 0;t < Array.getLength(drav);++t){



    g.drawLine(drav[t][0],drav[t][1],drav[t][2],drav[t][3]); 

}




//System.out.println("Canvas paint metodi paattyy");



  } 
  /** 
   * Komponentin toivottu minimikoko on 100 * 100. Asettelija  
   * k‰ytt‰‰ t‰t‰ tietoa hyv‰kseen. 
   */ 
  public Dimension getMinimumSize() { 
    return new Dimension(100,100); 
  } 
  /** 
   * Komponentin toivottu koko on 150 * 150. 
   */ 
  public Dimension getPreferredSize() { 
    return new Dimension(150,150); 
  } 


}






				}