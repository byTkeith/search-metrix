import java.io.*;
import java.util.*;
public class Search {

   
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> splitStock =new LinkedHashMap<>();
        ArrayList<String> combinedValues=new ArrayList<>();
        Scanner userScanner=new Scanner(System.in);

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
        for(String Line: combinedValues){
            String[] splitBySpace=Line.split(" ");
            String shopItem=splitBySpace[0];
            int itemStock=Integer.parseInt(splitBySpace[1]);
            splitStock.put(shopItem, itemStock);
        }
        System.out.println("++Kindly select your category 1 or 2.\n1. Client\n2. Employee");
        int userInput=userScanner.nextInt();
        if(userInput==1){
            System.out.println("++Kindly enter the item you are looking for++");
            String itemSearched=userScanner.nextLine();
            if(combinedValues.get(itemSearched)>0){

            }

        }
        
    }
    
}
