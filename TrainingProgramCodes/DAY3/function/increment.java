package DAY3.function;

public class increment {
    static int Icrecement(int num){
        num++;
        return num;
    }
    public static void main(String[] args) {
        int data = 5;
        System.out.println(data);
        int result = Icrecement(data);
        System.out.println(result);
    }
}
