package DAY8.Practice;

public class Maruti {
    static int Cartyres = 4;
    int Model;
    double TopSpeed;
    String Color;

    void StartEngine(){
        System.out.println("Maruti engine started");
    }

    void StopEngine(){
        System.out.println("Maruti engine stopped");
    }

    void Drift(){
        System.out.println("Maruti is drifting");
    }

    static void service(){
        System.out.println("Sir here some water for you.");
    }

    void carVariant(String variant){
        System.out.println(variant.toUpperCase()+"is Available");
    }
}
