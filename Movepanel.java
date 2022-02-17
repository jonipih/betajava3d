import java.awt.*;


public class Movepanel extends Panel {


Label moveLabel = new Label();
Button moveUp = new Button("U");
Button moveDw = new Button("D");
Button moveLf = new Button("L");
Button moveRg = new Button("R");


Movefwpwpanel moveFwPw;


public Movepanel(){
moveLabel.setText("move");

  moveFwPw = new Movefwpwpanel();
  GridBagLayout moveLayout = new GridBagLayout();
  setLayout(moveLayout);

  add(moveLabel, new GridBagConstraints(0,0,4,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));


  add(moveUp, new GridBagConstraints(2,1,1,2,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(moveDw, new GridBagConstraints(2,5,1,2,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(moveLf, new GridBagConstraints(1,3,1,2,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(moveRg, new GridBagConstraints(3,3,1,2,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));





  add(moveFwPw, new GridBagConstraints(0,1,1,6,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.VERTICAL,new Insets(0,0,0,5),0,0));


         }


public class Movefwpwpanel extends Panel {



Button moveFw = new Button("F");
Button movePw = new Button("P");


public Movefwpwpanel(){

  GridBagLayout movefwpwLayout = new GridBagLayout();
  this.setLayout(movefwpwLayout);


  add(moveFw, new GridBagConstraints(0,0,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));


  add(movePw, new GridBagConstraints(0,1,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));


         }}























}