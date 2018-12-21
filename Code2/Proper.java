class Proper{
    public static void main(String args[]){
        String inputString = "THIS IS TEST HELLO how ArE yOU";
        String words [] = inputString.split(" ");
        for(String word: words){
            
            System.out.print(String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1).toLowerCase()+" ");
            //char firstCharacter = word.charAt(0);
            //String temp = String.valueOf(firstCharacter); //'' ""
            //String result = temp.toUpperCase() + word.substring(1).toLowerCase();
            //System.out.print(result + " ");
            // ValueOf convert int , long , char etc into String
            //String temp = firstCharacter + ""; // Bad
        }
        System.out.println();
    }
}