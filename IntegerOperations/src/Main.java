import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.time.*;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final double tax_added = 1.2;
    public static void main(String[] args) {


        int a,b,c;
        a = 5;
        b = 6;
        c = a;
        double q,w,e;
        q = 1.;
        w = 2.;
        e = 3.;

        try {
           // IntegerCalculation(a,b,c);
          //  DoubleCalculations(q,w,e);
          //  geburtsdatum();
          //  Tax();





           // Oktal();

          //  TimeCalculator();

           // Zahlendreher();
            timecalculations();


        }catch (ArithmeticException ex){
            System.out.println("Arithmetic exception");
        }
        catch (NumberFormatException ex){
            System.out.println("NumberFormat exception");
        }catch (Exception ex){
            System.out.println("general40.5 exception");
        }

    }
    public static void Rhombus(){

    }
    public static void game(){
        // little herumspielen mit if abfragen
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Random rand = new Random();
        int toguess = rand.nextInt(5);
        while(toguess != input){

        }

    }
    public static void UserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mal deine Namen ein: ");

        String name = sc.nextLine();
        int f = tryParsetoInteger(name);


    }
    public static Integer tryParsetoInteger(String s) throws NullPointerException{
        try {
            return Integer.parseInt(s);
        }catch (NumberFormatException ex) {
            return null;
        }
    }
    public static Long tryParsetoLong(String s) throws NullPointerException{
        try {
            return Long.parseLong(s);
        }catch (NumberFormatException ex) {
            return null;
        }
    }

    public static void IntegerCalculation(int a, int b, int c) throws ArithmeticException{
        System.out.printf("%d - %d = %d", a,b,a-b);
        System.out.println();
        System.out.printf("%d * %d = %d",a,b,a+b);
        System.out.println();
        System.out.printf("%d / %d = %d",a,b,a/b);
        System.out.println();


        System.out.printf("%d",Integer.MAX_VALUE +1);  //MAX_VALUE --> konstante (static final) != ENUM

    }

    public static void DoubleCalculations(double a, double b, double c) throws ArithmeticException{
        System.out.printf("%f ... %f",1.5D,1.D);
    }
    public static void timecalculations(){
        //beispiel komplett flasch berechnet :DDDDDDD
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(number);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(number);
        long hours = TimeUnit.MILLISECONDS.toHours(number);
        long days = TimeUnit.MILLISECONDS.toDays(number);
        long milliseconds = TimeUnit.MILLISECONDS.toMillis(number);

        System.out.println(milliseconds);
        System.out.println(seconds);
        System.out.println(minutes);
        System.out.println(hours);
        System.out.println(days);


    }

    public static void filereading(){
        File filepath = new File(System.getProperty("user.dir"));


    }



    public static void geburtsdatum(){

        System.out.println("Gib mal  bitte Geburtstdaum (TTMMJJ) ein: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String year, month, day;
        day = "";
        month = "";
        year = "";
        if(input.length() == 6){
            day = input.substring(0,2);
            month = input.substring(2,4);
            year = input.substring(4,6);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(year);
        builder.append(month);
        builder.append(day);

        System.out.println(builder.toString());
    }

    public static void Tax() throws NumberFormatException{


        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mal einen amount ein: ");
        String input = sc.nextLine();
        double input_double = Double.parseDouble(input);
        double with_tax_added = input_double * tax_added;
        System.out.println("money with added tax --> " + with_tax_added);
        sc.close();
    }

    public static void Karte(){
        System.out.println("enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // System.out.println("%-5d /\\%-5d\n",n,n);
       // System.out.println("%-5d /\\%-5d\n",n,n);
    }

    public static void Oktal() throws NullPointerException{
        Scanner sc = new Scanner(System.in);
       // ArrayList<Integer> list = new ArrayList<>();
        int first_digit = 0;
        int second_digit = 0;
        int third_digit = 0;
        int oktal_digit1 = 0;
        int oktal_digit2 = 0;
        int oktal_digit3 = 0;
        int oktal_sumup = 0;
        int ziffernsumme = 0;
        String input_user ="";
        while(true){
            System.out.println("Oktalzahl eingeben");
             input_user = sc.nextLine();

            if(tryParsetoInteger(input_user) == null){
                continue;
            }else
            {
                first_digit = Integer.parseInt(input_user.substring(0,1));
                second_digit = Integer.parseInt(input_user.substring(1,2));
                third_digit = Integer.parseInt(input_user.substring(2,3));
                break;
            }

        }
        for (int i = 2; i >= 0;i--){
            switch (i){
                case 2:

                    oktal_digit1 = first_digit * (int)(Math.pow(8,2));
                    break;
                case 1:

                    oktal_digit2 = second_digit * (int)(Math.pow(8,1));
                    break;
                case 0:
                    oktal_digit3 = third_digit * (int)(Math.pow(8,0));
                    break;

            }
             oktal_digit1 = first_digit * (int)(Math.pow(8,2));
        }
        int int_helper = 0;
        oktal_sumup = oktal_digit1 + oktal_digit2 + oktal_digit3;
       // ziffernsumme = oktal_digit1 + oktal_digit2 + oktal_digit3; //nicht so --> sondern oktalsumup die einzelnen ziffern addieren
        String strZiffernsumme = String.valueOf(oktal_sumup);
        for (int i = 0; i < strZiffernsumme.length(); i++){
            int_helper = Integer.parseInt(strZiffernsumme.substring(i,i+1));
            ziffernsumme += int_helper;
        }
        System.out.println("Dezimal: " + oktal_sumup);
        System.out.println("Ziffernsumme von oktal: " + ziffernsumme);
    }

    public static void Zahlendreher(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mal was ein: ");
        String input = sc.nextLine();
      //  int parseinputtonumber = tryParsetoInteger(input);

        for (int i = input.length() -1 ; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
    }

    public static void TimeCalculator()throws NullPointerException{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        long milli = tryParsetoLong(input);

        long days = 0;
        long months = 0;
        long minutes = 0;
        long seconds = 0;
        long hours = 0;
        long milliseconds = 0;

        // System.out.println("Millisekunden"+  zeit.getTime());
      //  System.out.println("seconds "+ zeit());    getTime --> depreciated

        long number = TimeUnit.MILLISECONDS.toSeconds(milli);
        System.out.println(number);
        number = TimeUnit.MILLISECONDS.toSeconds(milli);
        System.out.println(number);
        number = TimeUnit.MILLISECONDS.toMinutes(milli);
        System.out.println(number);
        number = TimeUnit.MILLISECONDS.toHours(milli);
        System.out.println(number);
    }

}