/*
 * author: Tendai Nyevedzanai
 */
import java.io.*;
import java.util.*;
public class Search {

   
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> splitStock =new LinkedHashMap<>();
        ArrayList<String> combinedValues=new ArrayList<>();
        ArrayList<String> employeeIDs=new ArrayList<>();
        LinkedHashMap<String, String> splitEmployeeDetails=new LinkedHashMap<>();
        Scanner userScanner=new Scanner(System.in);

        // Scanner scanner =new Scanner(System.in);
        // System.out.println("++Kindly select your category 1 or 2.\n1. Client\n2. Employee");
        // String filename=scanner.nextLine();
        try{
            Scanner scannerFileOne=new Scanner(new File("Stock.txt"));//opens and reads the file
            Scanner scannerFileTwo=new Scanner(new File("employee.txt"));
            while (scannerFileOne.hasNextLine() && scannerFileTwo.hasNextLine()) {
                combinedValues.add(scannerFileOne.nextLine());//adds all the lines to the arraylist
                employeeIDs.add(scannerFileTwo.nextLine());
            }
            scannerFileOne.close();
            scannerFileTwo.close();


        }catch(FileNotFoundException e){
            System.out.println("Database not UPDATED!!");
        }
        for(String eID: employeeIDs){
            String[] splitBySpace=eID.split(" ");
            String stuffID=splitBySpace[0];
            String stuffName=splitBySpace[1];
            splitEmployeeDetails.put(stuffID, stuffName);
        }
        for(String Line: combinedValues){
            String[] splitBySpace=Line.split(" ");
            String shopItem=splitBySpace[0];
            int itemStock=Integer.parseInt(splitBySpace[1]);
            splitStock.put(shopItem, itemStock);
        }
        int stockNeeded=0;
         
        System.out.println("++Kindly select your category 1 or 2.\n1. Client\n2. Employee");
        int userInput=userScanner.nextInt();
        if(userInput==1){
            System.out.println("++Kindly enter the item you are looking for++");
            String itemSearched=userScanner.next();
            if(splitStock.get(itemSearched)==0||splitStock.get(itemSearched)==null){
                System.out.println("unfortunately we are out of stock");
                stockNeeded++;
            }
            else{
                System.out.println("the are more "+itemSearched+" in stock.");
                stockNeeded++;

            }
            

        }
        else if(userInput==2){
            System.out.println("++Enter your employee number++");
        }
        
    }
    
}
