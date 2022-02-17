import java.lang.reflect.Array;

public class Scrtest {

static Screen naytto = new Screen();

public static void main(String[] args){

test();





}

public static void test(){

//naytto.elements = { { 1, 2, 3, 3, 7, 7}, { 8, 5, 7, 4, 6, 4}, { 9, 0, 6, 6, 5, 1}, { 2, 9, 5, 7, 4, 8}, { 3, 8, 3, 8, 3, 9}, { 5, 6, 7, 0, 2, 4}, { 1, 4, 8, 9, 5, 0} };


System.out.println(Math.tan(Math.toRadians(45)) );


naytto.elements = new double[1][6];
naytto.elements[0][0] = -1.2;
naytto.elements[0][1] = -2.1;
naytto.elements[0][2] = 5.1;
naytto.elements[0][3] = 5.1;
naytto.elements[0][4] = 2.1;
naytto.elements[0][5] = -2.6;
naytto.makeDrawning();

int t,c;
for(t = 0;t < Array.getLength(naytto.drawning);++t){
 for(c = 0;c < Array.getLength(naytto.drawning[t]);++c){
  System.out.printf("  %d  ", naytto.drawning[t][c]);
   }
  System.out.printf("\n --------------------------- \n");
}



for(t = 0;t < Array.getLength(naytto.drawning);++t){
 for(c = 0;c < Array.getLength(naytto.drawning[t]);++c){
  System.out.printf("  %d  ", naytto.drawning[t][c]);
   }
  System.out.printf("\n --------------------------- \n");
}



}






}