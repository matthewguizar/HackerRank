public class StringIntroduction {
    String a = "hello";
    String b = "java";

    public static void printSolution(String a, String b){
        System.out.println(a.length() + b.length());//getting length from strings and adding them
        //using compareTo to compare strings unicode
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No"); //checks if a's unicode is larger than b's
        /*unicode returns negative if number is smaller 
         *        returns 0 if they are the smae
         *        returns positive if larger
        */
        //capitalizing first letter using substring
        /*first substring starts at first letter and ends on second and capitalizes
        then using concatenation to grab the rest of the letters with substring again.
        */
        System.out.println(a.substring(0, 1).toUpperCase()+a.substring(1 , a.length())
        + " " + b.substring(0, 1).toUpperCase()+b.substring(1, b.length()));
    

    }
}
