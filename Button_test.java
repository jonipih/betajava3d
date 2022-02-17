import java.awt.*;

public class Button_test {

public static void main(String[] args) {

 Mybutton ruutu = new Mybutton();
 ruutu.setBackground(Color.blue);
 ruutu.show();
try {
             Thread.sleep(3000);
       } catch (InterruptedException ex ) {System.out.println("Ongelmia");   
       }
 ruutu.vari = Color.red;  
 ruutu.viiva.setForeground(ruutu.vari);
 ruutu.viiva.setBackground(ruutu.vari);
 ruutu.repaint();
  ruutu.viiva.repaint();
  System.out.println(ruutu.viiva.getBounds().toString());

					}


			}