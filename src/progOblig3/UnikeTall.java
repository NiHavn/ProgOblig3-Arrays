package progOblig3;

import java.util.Arrays;
import static javax.swing.JOptionPane.*;


public class UnikeTall {

    // Deklarasjon av array for lagring av tilfeldige heltall

    int [] array;

   /* Konstruktør som mottar arrayets lengde som parameter og
     oppretter arrayet. */

    public UnikeTall (int lengde){
        array = new int[lengde];
    }

    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */

    public boolean tallSøk (int innTall) {
        for (int tall : array) {
            if (innTall == tall) {
                return true;
            }
        }
        return false;
    }

   /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */

    public void tilfeldigTall(){
        int i = 0;
        while(i < array.length){
            int randomTall = (int) (Math.random() * (900) + 100);
            if (!tallSøk(randomTall)) {
                i++;
                array[i] = randomTall;
            }
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayet.

    public int minsteTall(){
        int minste = array[0];
        for(int i = 1; i < array.length; i++){
            if(minste > array[i]){
                minste = array[i];
            }
        }
        return minste;
    }

    // Metode som finner og returnerer det største tallet i arrayet.

    public int storsteTall(){
        int storste = array[0];
        for(int i = 1; i < array.length; i++){
            if(storste < array[i]){
                storste = array[i];
            }
        }
        return storste;
    }

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */

    public double gjennomsnittArray(){


        }
    }

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */

    public String skrivUt(){

        String utskrift =
    }

    public static void main(String[] args) {

        int tall = Integer.parseInt(showInputDialog("Skriv inn lengden på arrayet."));
        int [] arrayet = new UnikeTall(tall).array;


    }
}



