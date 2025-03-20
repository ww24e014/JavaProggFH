import java.util.*;

public class Strom {
    public static void main(String[] args) {


        System.out.println("Ein elektronischer Stromzähler nimmt laufend Datenpakete als float Zahlen entgegen und verarbeitet diese.\n" +
                "Ein Datenpaket darf höchstens 16 Werte beinhalten. Werte kleiner als -100 bzw. Werte größer als 100\n" +
                "werden ignoriert und sind nicht Bestandteil eines Datenpaketes. Der Wert 999 beendet ein Datenpaket\n" +
                "vorzeitig. Wenn das Datenpaket eingelesen wurde, fragt die Anzeige nach dem Durchschnittswert der letzen N\n" +
                "Werte (Eingabe von N). Von den Werten wird nur der Betrag zur Durchschnittsbildung herangezogen. Sollten\n" +
                "weniger Werte vorhanden sein, wird die Fehlermeldung „Zu wenige Werte“ ausgegeben.\n" +
                "Jede weitere Eingabe wird vom Programm ignoriert. Es endet nach spätestens 17 Eingaben.");
        int counter = 1;
        float valuesum = 0.0f;
        Scanner sc = new Scanner(System.in);
        while(counter <= 17) {

            System.out.println("Gib den " + counter + " Wert ein , 999 beendet die loop: ");
            float value = tryParseFloat(sc.nextLine());
            if(Float.isNaN(value)){
                continue;
            }
/// noch ich fertig das beispiel, elbstimplementierte linkedlist würde sinn machen aber nicht in dem beispiel gewollt ^^

            if(value == 999 && counter == 1){
                System.out.println("zu wenig werte um zu beenden :D");
                continue;
            }

            if(value == 999 && counter > 1){
                break;
            }
            if(value >= -100 && value <= 100){
                counter++;
                valuesum += value;
                continue;
            }
            counter++;

        }
        System.out.println("Eingelesen: " + counter);
        System.out.println("Werte: " + valuesum);
    }

    public static float tryParseFloat(String str) {
        try {
            return Float.parseFloat(str);
        }
        catch (NumberFormatException e) {
            return Float.NaN;
        }
    }


}
