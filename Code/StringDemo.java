class StringDemo{
public static void main(String args[]){
    //String a = "Amit".intern();
    //String b = "Amit".intern();
    //String a = new String("Amit").intern();
     //String b = new String("Amit").intern();
     //String a = new String("Amit");
     //String b = new String("Amit");
     String a = "Amit";
     String b = "AMIT";
    System.out.println(a==b);
    System.out.println(a+"   "+b);
    System.out.println(a.equals(b));
    System.out.println(a.equalsIgnoreCase(b));

}
}