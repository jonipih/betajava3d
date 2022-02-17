import java.lang.Math;
public class VectorsBase {

double veX, veY, veZ;
double hoX, hoY, hoZ;
double frX, frY, frZ;
double pointX, pointY, pointZ;
double[] tempfrom = new double[3];//taulukot joilla siiret‰‰n uudet arvot(0:x 1:y 2:z)
double[] tempto = new double[3];


VectorsBase(){
veX = 0 ;veY = 2 ;veZ = 0 ;
hoX = 2 ;hoY = 0 ;hoZ = 0 ;
frX = 0 ;frY = 0 ;frZ = 2 ;

pointX = 0 ; pointY = 0 ; pointZ = -20 ;

}






//liiku ylos

public void moveU(){

pointX = (pointX + veX) ; 
pointY = (pointY + veY) ; 
pointZ = (pointZ + veZ) ;


}





//liiku alas

public void moveD(){

pointX = (pointX - veX) ; 
pointY = (pointY - veY) ; 
pointZ = (pointZ - veZ) ;


}

//liiku vasemmalle

public void moveL(){

pointX = (pointX - hoX) ; 
pointY = (pointY - hoY) ; 
pointZ = (pointZ - hoZ) ;


}


//liiku oikealle

public void moveR(){

pointX = (pointX + hoX) ; 
pointY = (pointY + hoY) ; 
pointZ = (pointZ + hoZ) ;


}

//liiku eteen

public void moveF(){

pointX = (pointX + frX) ; 
pointY = (pointY + frY) ; 
pointZ = (pointZ + frZ) ;


}

//liiku taakse
public void moveP(){

pointX = (pointX - frX) ; 
pointY = (pointY - frY) ; 
pointZ = (pointZ - frZ) ;


}



//kaanny eteen

public void rotateUr(){

//s luvut ovat vektorin jonka ymp‰ri kierret‰‰n
//t on vektori jota k‰‰nnet‰‰n ensin dgrs:n verran r:‰‰n p‰in lopuksi k‰‰nnet‰‰n r:‰‰
//oletus on ett‰ kaikkien v‰linen kulma on 90 astetta
rotateTwoVectors(hoX,hoY,hoZ,   veX,veY,veZ,   frX,frY,frZ,1);

 veX = tempfrom[0];
 veY = tempfrom[1];
 veZ = tempfrom[2];

 frX = tempto[0];
 frY = tempto[1];
 frZ = tempto[2];



}


//kaanny taakse

public void rotateDr(){


//s luvut ovat vektorin jonka ymp‰ri kierret‰‰n
//t on vektori jota k‰‰nnet‰‰n ensin dgrs:n verran r:‰‰n p‰in lopuksi k‰‰nnet‰‰n r:‰‰
//oletus on ett‰ kaikkien v‰linen kulma on 90 astetta
rotateTwoVectors(hoX,hoY,hoZ,   frX,frY,frZ,  veX,veY,veZ,   1);

 frX = tempfrom[0];
 frY = tempfrom[1];
 frZ = tempfrom[2];

 veX = tempto[0];
 veY = tempto[1];
 veZ = tempto[2];



}

//kaanny vasemmalle

public void rotateLr(){


//s luvut ovat vektorin jonka ymp‰ri kierret‰‰n
//t on vektori jota k‰‰nnet‰‰n ensin dgrs:n verran r:‰‰n p‰in lopuksi k‰‰nnet‰‰n r:‰‰
//oletus on ett‰ kaikkien v‰linen kulma on 90 astetta
rotateTwoVectors(veX,veY,veZ,  hoX,hoY,hoZ,   frX,frY,frZ,     1);

 hoX = tempfrom[0];
 hoY = tempfrom[1];
 hoZ = tempfrom[2];

 frX = tempto[0];
 frY = tempto[1];
 frZ = tempto[2];




}

//kaanny oikealle

public void rotateRr(){


//s luvut ovat vektorin jonka ymp‰ri kierret‰‰n
//t on vektori jota k‰‰nnet‰‰n ensin dgrs:n verran r:‰‰n p‰in lopuksi k‰‰nnet‰‰n r:‰‰
//oletus on ett‰ kaikkien v‰linen kulma on 90 astetta
rotateTwoVectors(veX,veY,veZ,   frX,frY,frZ,  hoX,hoY,hoZ,      1);

 frX = tempfrom[0];
 frY = tempfrom[1];
 frZ = tempfrom[2];

 hoX = tempto[0];
 hoY = tempto[1];
 hoZ = tempto[2];



}


//kieri oikealle myotapaivaan

public void rotateRs(){

//s luvut ovat vektorin jonka ymp‰ri kierret‰‰n
//t on vektori jota k‰‰nnet‰‰n ensin dgrs:n verran r:‰‰n p‰in lopuksi k‰‰nnet‰‰n r:‰‰
//oletus on ett‰ kaikkien v‰linen kulma on 90 astetta
rotateTwoVectors( frX,frY,frZ,  veX,veY,veZ,    hoX,hoY,hoZ,      1);

 veX = tempfrom[0];
 veY = tempfrom[1];
 veZ = tempfrom[2];

 hoX = tempto[0];
 hoY = tempto[1];
 hoZ = tempto[2];



}


//kieri vasemmalle vastapaivaan

public void rotateLs(){


//s luvut ovat vektorin jonka ymp‰ri kierret‰‰n
//t on vektori jota k‰‰nnet‰‰n ensin dgrs:n verran r:‰‰n p‰in lopuksi k‰‰nnet‰‰n r:‰‰
//oletus on ett‰ kaikkien v‰linen kulma on 90 astetta
rotateTwoVectors( frX,frY,frZ,    hoX,hoY,hoZ,  veX,veY,veZ,       1);

 hoX = tempfrom[0];
 hoY = tempfrom[1];
 hoZ = tempfrom[2];

 veX = tempto[0];
 veY = tempto[1];
 veZ = tempto[2];



}




































//s luvut ovat vektorin jonka ymp‰ri kierret‰‰n
//t on vektori jota k‰‰nnet‰‰n ensin dgrs:n verran r:‰‰n p‰in lopuksi k‰‰nnet‰‰n r:‰‰
//oletus on ett‰ kaikkien v‰linen kulma on 90 astetta
public void rotateTwoVectors(
double sx,double sy,double sz,
double tx,double ty,double tz,
double rx,double ry,double rz,
double dgrs) {

double tempx, tempy,tempz; //v‰liaikainen uuden t:n ja r:n luvut
double cosdgrs = Math.cos(Math.toRadians(dgrs));
double cosnewtor = Math.cos(Math.toRadians(90) - Math.toRadians(dgrs));//cosini uuden t ja r:n v‰lill‰
double lenghttxt = ( vectorLength(tx,ty,tz) * vectorLength(tx,ty,tz) );//t:n pituus kertaa t:n pituus 81
double lenghtrxt = ( vectorLength(rx,ry,rz) * vectorLength(tx,ty,tz) );//r:n pituus kertaa t:n pituus 82


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//############################################################################################################
//t:n uusi x tx tx tx tx tx tx tx
double tempup;//yht‰lˆn osoittaja

tempup = ((sy * ((rz * lenghttxt * cosdgrs) - (tz * lenghtrxt * cosnewtor))) + (sz * ((ty * lenghtrxt * cosnewtor) - (ry * lenghttxt * cosdgrs))));

double tempdown;//nimitt‰j‰

tempdown = (sx * (tz * ry - rz * ty) + sy * (rz * tx - tz * rx) + sz * (ty * rx - ry * tx));

tempx = (tempup / tempdown);








//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//############################################################################################################
//t:n uusi y ty ty ty ty ty ty ty ty ty ty ty ty ty ty ty ty
//double tempx, tempy,tempz; //v‰liaikainen uuden t:n ja r:n luvut
//double cosdgrs = Math.cos(dgrs);
//double cosnewtor = Math.cos(90 - dgrs);//cosini uuden t ja r:n v‰lill‰
//double lenghttxt = ( vectorLength(tx,ty,tz) * vectorLength(tx,ty,tz) );//t:n pituus kertaa t:n pituus 81
//double lenghtrxt = ( vectorLength(rx,ry,rz) * vectorLength(tx,ty,tz) );//r:n pituus kertaa t:n pituus 82


tempup = sx * ((tz * lenghtrxt * cosnewtor) - (rz * lenghttxt * cosdgrs)) + sz * ((rx * lenghttxt * cosdgrs) - (tx * lenghtrxt * cosnewtor));



tempdown = sx * (tz * ry - rz * ty) + sy * (rz * tx - tz * rx) + sz * (ty * rx - ry * tx);

tempy = tempup / tempdown;








//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//############################################################################################################
//t:n uusi z
//double tempx, tempy,tempz; //v‰liaikainen uuden t:n ja r:n luvut
//double cosdgrs = Math.cos(dgrs);
//double cosnewtor = Math.cos(90 - dgrs);//cosini uuden t ja r:n v‰lill‰
//double lenghttxt = ( vectorLength(tx,ty,tz) * vectorLength(tx,ty,tz) );//t:n pituus kertaa t:n pituus 81
//double lenghtrxt = ( vectorLength(rx,ry,rz) * vectorLength(tx,ty,tz) );//r:n pituus kertaa t:n pituus 82


tempup = sx * ((ty * lenghtrxt * cosnewtor) - (ry * lenghttxt * cosdgrs)) + sy * ((rx * lenghttxt * cosdgrs) - (tx * lenghtrxt * cosnewtor));



tempdown = sx * (ty * rz - ry * tz) + sy * (rx * tz - tx * rz) + sz * (tx * ry - rx * ty);

tempz = tempup / tempdown;

//siirret‰‰n temp x y z taulukkoon tempfrom

tempfrom[0] = tempx;
tempfrom[1] = tempy;
tempfrom[2] = tempz;


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//############################################################################################################
//r:n uusi x
//double tempx, tempy,tempz; //v‰liaikainen uuden t:n ja r:n luvut
//double cosdgrs = Math.cos(dgrs);
//double cosnewtor = Math.cos(90 - dgrs);//cosini uuden t ja r:n v‰lill‰
//double lenghttxt = ( vectorLength(tx,ty,tz) * vectorLength(tx,ty,tz) );//t:n pituus kertaa t:n pituus 81
//double lenghtrxt = ( vectorLength(rx,ry,rz) * vectorLength(tx,ty,tz) );//r:n pituus kertaa t:n pituus 82
//
//rx ry rz vaihtuu temp x y z :aan
//on kohtisuorassa uutta t:‰ vastaan joten cosnewtor on nolla
//cosdgrs sama
//tx ty tz vaihtuu rx ry rz:aan
//
double lenghtrxr = ( vectorLength(rx,ry,rz) * vectorLength(rx,ry,rz) );//r:n pituus kertaa r:n pituus

tempup = sy * ((tempz * lenghtrxr * cosdgrs) - (rz * lenghtrxt * 0.0)) + sz * ((ry * lenghtrxt * 0.0) - (tempy * lenghtrxr * cosdgrs));



tempdown = sx * (rz * tempy - tempz * ry) + sy * (tempz * rx - rz * tempx) + sz * (ry * tempx - tempy * rx);

tempto[0] = tempup / tempdown;

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//############################################################################################################
//r:n uusi y
//double tempx, tempy,tempz; //v‰liaikainen uuden t:n ja r:n luvut
//double cosdgrs = Math.cos(dgrs);
//double cosnewtor = Math.cos(90 - dgrs);//cosini uuden t ja r:n v‰lill‰
//double lenghttxt = ( vectorLength(tx,ty,tz) * vectorLength(tx,ty,tz) );//t:n pituus kertaa t:n pituus 81
//double lenghtrxt = ( vectorLength(rx,ry,rz) * vectorLength(tx,ty,tz) );//r:n pituus kertaa t:n pituus 82


tempup = sx * ((rz * lenghtrxt * 0.0) - (tempz * lenghtrxr * cosdgrs)) + sz * ((tempx * lenghtrxr * cosdgrs) - (rx * lenghtrxt * 0.0));



tempdown = sx * (rz * tempy - tempz * ry) + sy * (tempz * rx - rz * tempx) + sz * (ry * tempx - tempy * rx);

tempto[1] = tempup / tempdown;


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//############################################################################################################
//r:n uusi z
//double tempx, tempy,tempz; //v‰liaikainen uuden t:n ja r:n luvut
//double cosdgrs = Math.cos(dgrs);
//double cosnewtor = Math.cos(90 - dgrs);//cosini uuden t ja r:n v‰lill‰
//double lenghttxt = ( vectorLength(tx,ty,tz) * vectorLength(tx,ty,tz) );//t:n pituus kertaa t:n pituus 81
//double lenghtrxt = ( vectorLength(rx,ry,rz) * vectorLength(tx,ty,tz) );//r:n pituus kertaa t:n pituus 82


tempup = sx * ((ry * lenghtrxt * 0.0) - (tempy * lenghtrxr * cosdgrs)) + sy * ((tempx * lenghtrxr * cosdgrs) - (rx * lenghtrxt * 0.0));



tempdown = sx * (ry * tempz - tempy * rz) + sy * (tempx * rz - rx * tempz) + sz * (rx * tempy - tempx * ry);

tempto[2] = tempup / tempdown;





}

public double vectorLength(double x,double y,double z) {
double xx,yy,zz;

 if(x < 0) xx = (x / -1); else xx = x;
 if(y < 0) yy = (y / -1); else yy = y;
 if(z < 0) zz = (z / -1); else zz = z;

 xx *= xx;
 yy *= yy;
 zz *= zz;

 return Math.sqrt(xx + yy + zz);


}

//tekee vektorin pointXYZ pisteest‰ parametrien pisteeseen
public double[] doVector(double x, double y, double z) {
double[] vector = new double[3];
vector[0] = (x - pointX);
vector[1] = (y - pointY);
vector[2] = (z - pointZ);
return vector;
}

public double calcDotResult(double xa, double ya, double za, double xb, double yb, double zb){


  return ((xa * xb) + (ya * yb) + (za * zb));


}



public double[] moveToZero(double xx, double yy, double zz){
double[] vector;
vector = doVector(xx,yy,zz);
//
//t‰ss‰ kohtaa voisi laskea Vectorbasen vektoreiden veX,hoZ,frY ym...pituudet
//ja sijoittaa sitten sx,ty,rz ym...pituuksiksi(NE PITƒƒ OLLA SAMAN PITUISIA!!!)
//
//kaavat joiden perusteella lasketaan:

// R x X: (rx*xx)+(ry*xy)+(rz*xz)=A
// S x X: (sx*xx)+(sy*xy)+(sz*xz)=B
// T x X: (tx*xx)+(ty*xy)+(tz*xz)=C
//
//vektorit jotka ovat kaavoissa samat kuin oikeassa:
//R : eteen
//S : vaakaan oikealle
//T : pystyyn ylˆsp‰in
//
//
//R : -> frXYZ
//S : -> hoXYZ
//T : -> veXYZ
//
//pistetulot A ,B ja C
double aA;
double bB;
double cC;

aA = calcDotResult(vector[0], vector[1], vector[2], frX, frY, frZ);
bB = calcDotResult(vector[0], vector[1], vector[2], hoX, hoY, hoZ);
cC = calcDotResult(vector[0], vector[1], vector[2], veX, veY, veZ);

//Taulukko johon sijoitetaan nollapisteiden arvot ja palautetaan:
double[] zeroVector = new double[3];

//nollapisteiden vektorit:

double rx = 0;double ry = 0;double rz = 2;
double sx = 2;double sy = 0;double sz = 0;
double tx = 0;double ty = 2;double tz = 0;

//nollapisteen x
double tempup;
double tempsup;

tempup = ((aA* (tz*sy - sz*ty)) + (ry*(sz*cC - tz*bB)) + (rz*(ty*bB - sy*cC)));

tempsup = ((rx* (tz*sy - sz*ty)) + (ry*(sz*tx - tz*sx)) + (rz*(ty*sx - sy*tx)));

zeroVector[0] = (tempup/tempsup);


//nollapisteen y


tempup = ((aA* (sx*tz - tx*sz)) + (rx*(sz*cC - tz*bB)) + (rz*(tx*bB - sx*cC)));

tempsup = ((rx* (sz*ty - tz*sy)) + (ry*(sx*tz - tx*sz)) + (rz*(tx*sy - sx*ty)));

zeroVector[1] = (tempup/tempsup);




//nollapisteen z


tempup = ((aA* (sx*ty - sy*tx)) + (rx*(sy*cC - ty*bB)) + (ry*(tx*bB - sx*cC)));

tempsup = ((rx* (sy*tz - ty*sz)) + (ry*(tx*sz - sx*tz)) + (rz*(sx*ty - sy*tx)));

zeroVector[2] = (tempup/tempsup);


return zeroVector;





}

























			}