# betajava3d

Ohjeet ohjelman toimintaan saamiseksi windowsille:
1.tarvitsee java runtime enviromentin mikä todennäköisesti on jo koneellasi, löytyy myös:https://www.java.com/en/download/

2.koska tiedostot lähdekoodimuodossa(.java) vaatii java development kit ohjelman löytyy:https://www.oracle.com/java/technologies/downloads/
saattaa vaatia vanhemman JDK:n löytyy:https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html

3.kun java development kit on asennettu avaa windows comman prompt (cmd.exe) ja suorita komento javac. Mikäli cmd ei tunnista komentoa
ja antaa ilmoituksen:komentoa javac ei tunnistettu sisäiseksi tai....... niin täytyy lisätä PATH ympäristömuuttujaksi javac.exe ohjelman kansion polku
joka yleensä on tämän näköinen (C:\Program Files\Java\jdk_versio\bin) tarkasta. PATH muuttujan voi lisätä :
Käynnistä -> ohjauspaneeli -> järjestelmä -> järjestelmän lisäasetukset -> ympäristömuuttujat.

4. lataa lähdekoodi github:sta  CODE -> Download ZIP

5. pura kansio

6. avaa windows command prompt(komentokehote)(cmd.exe) ja liiku kansioon jossa purettu lähdekoodi on 
komennolla: cd C:\polku...    esimerkiksi  cd C:\Users\Your name\Desktop\betajava

7.suorita komento javac *.java  tai  javac Myframe_test.java, nyt lähdekoodiset .java tiedostot on muutettu .class välikielelle(bytecode).

8.suorita komento java Myframe_test ja ohjelman tulisi aueta
 (java komennolla aukaistaan se tiedosto jossa koko ohjelman main funktio (public static void main (String args[]) on)


