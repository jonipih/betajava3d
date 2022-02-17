import java.awt.*;
import java.awt.event.*;

public class Painike_listnr implements ActionListener {
 Mybutton butt;
 Painike_listnr(Mybutton but)
  {
    butt = but;

  }

 public void actionPerformed(ActionEvent e) {
  
   butt.painikepainettu(e);

					     }


							}





