import java.lang.Math;
import java.lang.reflect.Array;
import java.awt.*;
import java.awt.event.*;


public class Screen implements ActionListener {

double[][] elements; //oikeat viivat x y z
int[][] drawning;    //2D viivat x y
int screenWidth;
int screenHeigth;
int screenScale;
double burningDistance;
Myframe frames;
Myframe.MyCanvas draft;

double hoAngMin;
double hoAngMax;
double veAngMin;
double veAngMax;

VectorsBase space;

Screen(Myframe frames, Myframe.MyCanvas draft){

this.frames = frames;

this.draft = draft;

space = new VectorsBase();
elements = new double[1][6];

int y,o;
int kkl = -200;
for(y = 0;y < 400;++y){

o = Array.getLength(elements);
--o;
elements[o][0] = kkl;
elements[o][1] = 0;
elements[o][2] = 0;

elements[o][3] = (1 + kkl);
elements[o][4] = 0;
elements[o][5] = 0;

elemAddRow();
kkl =(kkl + 2);


}
kkl = -200;
for(y = 0;y < 400;++y){

o = Array.getLength(elements);
--o;
elements[o][0] = 0;
elements[o][1] = kkl;
elements[o][2] = 0;

elements[o][3] = 0;
elements[o][4] = (1 + kkl);
elements[o][5] = 0;

elemAddRow();
kkl =(kkl + 2);



}
kkl = -200;
for(y = 0;y < 400;++y){

o = Array.getLength(elements);
--o;
elements[o][0] = 0;
elements[o][1] = 0;
elements[o][2] = kkl;

elements[o][3] = 0;
elements[o][4] = 0;
elements[o][5] = (1 + kkl);

elemAddRow();
kkl =(kkl + 2);



}

//--------------------NELIO-----------------


elemAddRow();

o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 0;
elements[o][2] = 5;

elements[o][3] = 10;
elements[o][4] = 0;
elements[o][5] = 5;

elemAddRow();

o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 0;
elements[o][2] = 5;

elements[o][3] = 5;
elements[o][4] = 0;
elements[o][5] = 10;

elemAddRow();

o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 0;
elements[o][2] = 10;

elements[o][3] = 10;
elements[o][4] = 0;
elements[o][5] = 10;

elemAddRow();


o = Array.getLength(elements);
--o;
elements[o][0] = 10;
elements[o][1] = 0;
elements[o][2] = 10;

elements[o][3] = 10;
elements[o][4] = 0;
elements[o][5] = 5;

elemAddRow();


o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 5;
elements[o][2] = 5;

elements[o][3] = 10;
elements[o][4] = 5;
elements[o][5] = 5;

elemAddRow();

o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 5;
elements[o][2] = 5;

elements[o][3] = 5;
elements[o][4] = 5;
elements[o][5] = 10;

elemAddRow();

o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 5;
elements[o][2] = 10;

elements[o][3] = 10;
elements[o][4] = 5;
elements[o][5] = 10;

elemAddRow();


o = Array.getLength(elements);
--o;
elements[o][0] = 10;
elements[o][1] = 5;
elements[o][2] = 10;

elements[o][3] = 10;
elements[o][4] = 5;
elements[o][5] = 5;


elemAddRow();


o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 0;
elements[o][2] = 5;

elements[o][3] = 5;
elements[o][4] = 5;
elements[o][5] = 5;

elemAddRow();


o = Array.getLength(elements);
--o;
elements[o][0] = 5;
elements[o][1] = 0;
elements[o][2] = 10;

elements[o][3] = 5;
elements[o][4] = 5;
elements[o][5] = 10;

elemAddRow();


o = Array.getLength(elements);
--o;
elements[o][0] = 10;
elements[o][1] = 0;
elements[o][2] = 10;

elements[o][3] = 10;
elements[o][4] = 5;
elements[o][5] = 10;

elemAddRow();


o = Array.getLength(elements);
--o;
elements[o][0] = 10;
elements[o][1] = 0;
elements[o][2] = 5;

elements[o][3] = 10;
elements[o][4] = 5;
elements[o][5] = 5;

elemAddRow();

for(y = 0;y < 40;++y){

o = Array.getLength(elements);
--o;
elements[o][0] = (-5 - y);
elements[o][1] = 0;
elements[o][2] = 10;

elements[o][3] = (-5 - y);
elements[o][4] = 0;
elements[o][5] = 0;

elemAddRow();




}

//-------------tekee 4:nnen asteen kayran


double ppp;
double ddd = -2.5;
for(y = 0;y < 1000;++y){




ppp = (ddd + 0.01);
int l;
for(l = 0;l < 4;++l){

o = Array.getLength(elements);
--o;

elements[o][0] = ddd;
elements[o][1] = ((2 * ddd * ddd) - (2 * ddd));
elements[o][2] = l;



elements[o][3] = ppp;
elements[o][4] = ((2 * ppp * ppp) - (2 * ppp));
elements[o][5] = l;

elemAddRow();

	}
ddd = (ddd + 0.01);



}



















screenScale = 200;
burningDistance = 6.0;
}


public void makeDrawning(){

drawning = new int[1][4];
int draw_calc = 0;                //laskin jolla voi testata paljonko 2d riveja on

calcAngBounds();
int xa;
for(xa = 0;xa < Array.getLength(elements);++xa){//eka for
double[] vpa = space.doVector(elements[xa][0], elements[xa][1], elements[xa][2]);
double[] vpb = space.doVector(elements[xa][3], elements[xa][4], elements[xa][5]);

double ppa = space.calcDotResult(vpa[0], vpa[1], vpa[2], space.frX, space.frY, space.frZ);
double ppb = space.calcDotResult(vpb[0], vpb[1], vpb[2], space.frX, space.frY, space.frZ);

    if( (0 < ppa)  &  (0 < ppb) ){//eka if  pistetulot 0 suurempia

     double[] zpa = space.moveToZero(elements[xa][0], elements[xa][1], elements[xa][2]);

       double apaHo = Math.toDegrees(    Math.atan(zpa[0]/zpa[2])     );//a pisteen vaakakulma
       double apaVe = Math.toDegrees(    Math.atan(zpa[1]/zpa[2])     );//a pisteen pystykulma

       double calc_apaHo = ( 180 - (90 + apaHo) ); //vaaka testaus
       double calc_apaVe = ( 180 - (90 + apaVe) );//pysty testaus


     double[] zpb = space.moveToZero(elements[xa][3], elements[xa][4], elements[xa][5]);

       double apbHo = Math.toDegrees(    Math.atan(zpb[0]/zpb[2])     );//b pisteen vaakakulma
       double apbVe = Math.toDegrees(    Math.atan(zpb[1]/zpb[2])     );//b pisteen pystykulma

       double calc_apbHo = ( 180 - (90 + apbHo) ); //vaaka testaus
       double calc_apbVe = ( 180 - (90 + apbVe) );//pysty testaus

            if( 
                  ((hoAngMin  <   calc_apaHo) & (calc_apaHo  <   hoAngMax)) & 
                  ((veAngMin  <   calc_apaVe) & (calc_apaVe   <  veAngMax )) & 
                  ((hoAngMin  <  calc_apbHo)  & (calc_apbHo   <   hoAngMax)) & 
                  ((veAngMin  <  calc_apbVe)  & (calc_apbVe    <  veAngMax ))               ){//toka if
                     
                          if(0 < draw_calc) drawAddRow(); //lisaa drawningiin rivin jos taalla on jo kayty kerran tai useammin

//a pisteen paikka
//apaHo apaVe      toRadians


	double xtemp,ytemp,ztemp;
apaHo = Math.toRadians(apaHo);

	xtemp =  burningDistance  *  Math.tan(apaHo);

	ztemp = screenScale * xtemp;

	drawning[draw_calc][0] = ((screenWidth/2) + ((int)ztemp )  );

apaVe = Math.toRadians(apaVe);

	ytemp =  burningDistance  *  Math.tan(apaVe);

	ztemp = screenScale * ytemp;
	drawning[draw_calc][1] = ((screenHeigth/2) - ((int)ztemp  )  );



//b pisteen paikka
//apbHo apbVe

	xtemp =  burningDistance  *  Math.tan(Math.toRadians(apbHo));
	ztemp = screenScale * xtemp;
	drawning[draw_calc][2] = ((screenWidth/2) + ((int)ztemp    )  );

	ytemp =  burningDistance  *  Math.tan(Math.toRadians(apbVe));
	ztemp = screenScale * ytemp;
	drawning[draw_calc][3] = ((screenHeigth/2) - ((int)ztemp    )  );






                          ++draw_calc;   //kasvattaa 2d taulun laskuria

                   }//tokan ifin paattava

    }//ekan if:n paattava

}//ekan for:n paattava

}




public void elemAddRow(){
double[][] temp = new double[(Array.getLength(elements) + 1)][Array.getLength(elements[0])];
int x;
int y;

 for(x = 0;x < Array.getLength(elements);++x){


    for(y = 0;y < Array.getLength(elements[0]);++y){

    temp[x][y] = elements[x][y];
    }
 }

elements = new double[Array.getLength(temp)][Array.getLength(temp[0])];

 for(x = 0;x < Array.getLength(temp);++x){

 
    for(y = 0;y < Array.getLength(temp[0]);++y){
    elements[x][y] = temp[x][y];
    }
 }
}














public void drawAddRow(){
int[][] temp = new int[(Array.getLength(drawning) + 1)][Array.getLength(drawning[0])];
int x;
int y;

 for(x = 0;x < Array.getLength(drawning);++x){


    for(y = 0;y < Array.getLength(drawning[0]);++y){

    temp[x][y] = drawning[x][y];
    }
 }

drawning = new int[Array.getLength(temp)][Array.getLength(temp[0])];

 for(x = 0;x < Array.getLength(temp);++x){

 
    for(y = 0;y < Array.getLength(temp[0]);++y){
    drawning[x][y] = temp[x][y];
    }
 }
}












public void calcAngBounds(){
double tempup;
double tempsup;
double alfa;
//vaakatason maksimit

 tempup = (screenWidth/2);

 tempsup = (tempup/screenScale);

 alfa = Math.atan(tempsup/burningDistance);

 alfa = Math.toDegrees(alfa);

 hoAngMax = (alfa + 90);
 hoAngMin = (180 - hoAngMax);

   //pystytason maksimit

   tempup = (screenHeigth/2);

   tempsup = (tempup/screenScale);

   alfa = Math.atan(tempsup/burningDistance);

   alfa = Math.toDegrees(alfa);

   veAngMax = (alfa + 90);
   veAngMin = (180 - veAngMax);
}








 public void actionPerformed(ActionEvent e) {
//  System.out.println(e.getActionCommand());



screenHeigth = draft.getHeight();
screenWidth = draft.getWidth();

try{


switch(e.getActionCommand()){
case "U": //liiku ylos
space.moveU();

draft.repaint();
//System.out.println("on U");
break;





case "D"://liiku alas
space.moveD();


draft.vari1 = Color.red;
//System.out.println("on U");
break;





case "L"://liiku vasemmalle
space.moveL();

//System.out.println("on U");
break;





case "R"://liiku oikealle
space.moveR();
//System.out.println("on U");
break;





case "F"://liiku eteen
space.moveF();
//System.out.println("on U");
break;



case "P"://liiku taakse
space.moveP();
//System.out.println("on U");
break;




case "Ur"://kaanny eteen
space.rotateUr();
//System.out.println("on U");
break;



case "Dr"://kaanny taakse
space.rotateDr();
//System.out.println("on U");
break;




case "Lr"://kaanny vasemmalle
space.rotateLr();
//System.out.println("on U");
break;




case "Rr"://kaanny oikealle
space.rotateRr();
//System.out.println("on U");
break;




case "Rs"://kieri oikealle myotapaivaan
space.rotateRs();
//System.out.println("on U");
break;




case "Ls"://kieri vasemmalle vastapaivaan
space.rotateLs();
//System.out.println("on U");
break;


}

}finally{

makeDrawning();

//System.out.println("finally lohko suoritettu");
makeCanvasDrawing();

draft.repaint();

	}//finally lohko paattyy

  //System.out.println(e.getModifiers());
  //System.out.println(e.paramString());

				}




public void makeCanvasDrawing(){

draft.drav = new int[Array.getLength(drawning)][4];
int y;
for(y = 0;y < Array.getLength(drawning);++y){//eka for

draft.drav[y][0] = drawning[y][0];
draft.drav[y][1] = drawning[y][1];
draft.drav[y][2] = drawning[y][2];
draft.drav[y][3] = drawning[y][3];


	}//ekan forin paattyy






			}//makecanvas lohko paattyy
































}