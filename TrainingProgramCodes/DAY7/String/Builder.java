package DAY7.String;

public class Builder {
    public static void main(String[] args){
        String str = "";
        for(int i = 1; i < 10; i++){
            str += i;
        }
        System.out.println(str);
        
        StringBuilder sb = new StringBuilder();
        for(int i =1; i<10; i++){
            sb.append(i);
        }
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.insert(0, "World ");
        System.out.println(sb2);
        sb2.delete(0, 0);
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        System.out.println(sb.substring(0, 5));
    }
}
