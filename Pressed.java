import java.awt.*;
import java.awt.event.*;

public class Pressed implements ActionListener {

 public void actionPerformed(ActionEvent e) {
  System.out.println(e.getActionCommand());



switch(e.getActionCommand()){
case "U":
System.out.println("on U");
break;
}

  System.out.println(e.getModifiers());
  System.out.println(e.paramString());

				}

					}