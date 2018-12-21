import java.math.BigInteger;
/*
class MyDataType{
    int x;
    float y;
    boolean z;
}
int a;
MyDataType a = new MyDataType();
*/
// String is a Wrapper over char array
/*class String{
    char value[];
    int length(){
        // loop value[] to find the length of char array.
    }
    toUpperCase(){
       // ASCII + 32 -32
    }
}*/
class StringMethods{
    public static void main(String args[]){

        BigInteger b = new BigInteger("10000000000000");
        BigInteger d = new BigInteger("10000000000000");
        BigInteger c = b.add(d);
        System.out.println("Sum is "+c);
        int x =100;
        String name= "Ammit";
        System.out.println("NAme is "+name+" Len "+name.length());
        System.out.println("UpperCase "+name.toUpperCase());
       
        System.out.println("Search "+name.indexOf("m"));
         System.out.println("Last Search "+name.lastIndexOf("m"));
        System.out.println("Single Char "+name.charAt(0));
        System.out.println(name.equals("Amit"));
        System.out.println(name.contains("mm"));
        System.out.println(name.startsWith("Am"));
         System.out.println(name.endsWith("it"));
         String t = "Hello How are You";
         String arr []= t.split(" ");
         // Old Loop
         /*for(int i = 0 ; i<arr.length; i++){
             System.out.println(arr[i]);
         }*/
         // Enhance For Loop Java 1.5
         for(String aa : arr){
             System.out.println(aa);
         }
         // Index - 0, Position - 1
         String w = "Welcome User";
         String temp = w.substring(1,4);
         System.out.println("Sub String is "+temp);

        }
}