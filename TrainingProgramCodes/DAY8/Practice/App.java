package DAY8.Practice;

public class App {
    public static void main(String[] args){
        Maruti Baleno = new Maruti();
        Baleno.Model = 2022;
        Baleno.TopSpeed = 180.5;
        Baleno.Color = "Red";
        String variant = "vxi";
        
        System.out.println("BALENO");
        
        System.out.println("Maruti Model: " + Baleno.Model);
        System.out.println("Maruti Top Speed: " + Baleno.TopSpeed);
        System.out.println("Maruti Color: " + Baleno.Color);

        Maruti.service();
        Baleno.StartEngine();
        Baleno.Drift();
        Baleno.StopEngine();
        
        Baleno.carVariant(variant);
        System.out.println(variant);

        System.out.println("--------------------------------------------------");
        System.out.println("BREZZA");
        Maruti  Brezza = new Maruti();
        Brezza.Model = 2023;
        Brezza.TopSpeed = 200.0;
        Brezza.Color = "Blue";


        System.out.println("Maruti Model: " + Brezza.Model);
        System.out.println("Maruti Top Speed: " + Brezza.TopSpeed);
        System.out.println("Maruti Color: " + Brezza.Color);
        System.out.println("Number of tyres: " + Brezza.Cartyres);

        Maruti.service();
        Brezza.StartEngine();
        Brezza.Drift();
        Brezza.StopEngine();


        

    }
}
