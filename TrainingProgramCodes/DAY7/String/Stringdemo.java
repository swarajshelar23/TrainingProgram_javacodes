package DAY7.String;
public class Stringdemo{
    public static void main(String[] args){
        String str = "Swaraj";
        System.out.println(str);
        
        String str2 = "Swaraj";
        System.out.println(str2);
        System.out.println(str == str2); // true, because both str and str2 refer to the same string literal in the string pool

        String collegeName = new String("MIT");
        System.out.println(collegeName);
        String collegeName2 = new String("MIT");
        System.out.println(collegeName2);
        System.out.println(collegeName == collegeName2); // false, because str1 and str2 refer to different objects in the heap

        String str3 = "Swaraj";
        System.out.println(str3.hashCode());

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        String str4 = "ironman";
        System.out.println(str4.contains("man"));
        System.out.println(str4.startsWith("iron"));
        System.out.println(str4.endsWith("n"));

        String str5 = "   Hello World!   ";
        System.out.println(str5.substring(3, 8)); 
        System.out.println(str5.replace("o","a"));

        String str6 = "Java Python C++";
        String[] subjects = str6.split(" ");
        for(String subject : subjects){
            System.out.println(subject);
        }
        System.out.println(str5.trim());
    

        String name = "dragon ball z";
        for(int i = 0; i < name.length(); i++){
            name=name.toLowerCase();
            char x = name.charAt(i);
            if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u'){
                System.out.println(name.charAt(i));
            }
            
        }
    
    }

}