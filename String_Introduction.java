public class String_Introduction{
    public static void main(String[] args){
        
        String name = "Varnika Bagaria";                                       //method 1 (optimised method than method 2) {stored in String pool area}
        String anotherName = new String("Varnika Bagaria");                   // method 2 {stored in heap area}
        System.out.println(name);
        System.out.println(anotherName);
        
        System.out.println(name == anotherName);                       // false because one is stored at heap area and another is at string pool area
        
    }
}
