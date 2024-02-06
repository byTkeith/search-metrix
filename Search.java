import java.io.*;
import java.util.*;
public class Search {

    public static String Manipulate(String string){
        String[] splitBySpace=string.split(" ");
        String shopItem=splitBySpace[0];
        return "hi";
    } 
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> splitStock =new LinkedHashMap<>();
        ArrayList<String> combinedValues=new ArrayList<>();

        // Scanner scanner =new Scanner(System.in);
        // System.out.println("++Kindly select your category 1 or 2.\n1. Client\n2. Employee");
        // String filename=scanner.nextLine();
        try{
            Scanner scanner=new Scanner(new File("Stock.txt"));//opens and reads the file
            while (scanner.hasNextLine()) {
                combinedValues.add(scanner.nextLine());//adds all the lines to the arraylist
            }


        }catch(FileNotFoundException e){
            System.out.println("Database not UPDATED!!");
        }
        System.out.println("++Kindly select your category 1 or 2.\n1. Client\n2. Employee");
        if()
        for(String Line: combinedValues){
            String eachLine=Manipulate(Line);
        }
    }
    
}
