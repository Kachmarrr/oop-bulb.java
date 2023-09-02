import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        Bulb bulb1 = new Bulb("e1mple","white", "off");

        bulb1.getNameOfBulb();
        bulb1.getColor();
        bulb1.getStatus();

        bulb1.setNameOfBulb("oleg");
        bulb1.setColor("yellow");


        bulb1.getinfo();

        System.out.println("\nwhat is the status of the light bulb?");
        String a = sc.nextLine();

        if(Objects.equals(a, "on")){
            bulb1.setStatus("on");}
        else if (Objects.equals(a, "off")) {
            bulb1.setStatus("off");}

        bulb1.getinfo();

    }
}
