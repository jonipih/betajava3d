import java.awt.*;


public class Rotatepanel extends Panel {


Label rotateLabel = new Label();
Button rotateUp = new Button("Ur");
Button rotateDw = new Button("Dr");
Button rotateLf = new Button("Lr");
Button rotateRg = new Button("Rr");
Button spinRg = new Button("Rs");
Button spinLf = new Button("Ls");


public Rotatepanel(){
rotateLabel.setText("rotate");


  GridBagLayout rotateLayout = new GridBagLayout();
  setLayout(rotateLayout);

  add(rotateLabel, new GridBagConstraints(0,0,5,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));


  add(rotateUp, new GridBagConstraints(2,1,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(rotateDw, new GridBagConstraints(2,3,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(rotateLf, new GridBagConstraints(1,2,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(rotateRg, new GridBagConstraints(3,2,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(spinRg, new GridBagConstraints(4,1,1,3,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

  add(spinLf, new GridBagConstraints(0,1,1,3,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));





         }


























}