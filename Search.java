import java.io.*;
import java.util.*;
public class Search {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> stock =new LinkedHashMap<>();
        // Scanner scanner =new Scanner(System.in);
        // System.out.println("++Kindly select your category 1 or 2.\n1. Client\n2. Employee");
        // String filename=scanner.nextLine();
        try{
            Scanner scanner=new Scanner(new File("Stock.txt"));
            

        }catch(FileNotFoundException e){
            System.out.println("Database not UPDATED!!");
        }
    }
    
}
