public strictfp class FirstDemo{
 static public  void main(String ...arr){

    String n = new String("Amit");
    String n2 = new String("Amit");
    System.out.println("String Compare "+(n==n2));
     String name = "Amit";
     char rr = 'A';
     boolean r1 = true;
     String message = "नमस्ते";
     System.out.println(message);
   //System.in
   //System.err
// IEEE-754 Standard
   double r = 90.222;
   float e = 90.20F;
   long w1 = 10000l;
   byte w = (byte)130;
   System.out.println("Byte is "+w);
   int c = 0;
   for(int i =0; i<arr.length; i++){
    c+=Integer.parseInt(arr[i]);
   }
   //int a =Integer.parseInt(arr[0]);
   //int b =Integer.parseInt(arr[1]);
   //int c = a + b;
    System.out.println("Sum is   "+c);

}
}