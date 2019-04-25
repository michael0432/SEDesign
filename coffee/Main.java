import java.io.*;
import java.util.*;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args){
        List<String[]> command = new ArrayList<String[]>();
        if (args.length <= 0)
        {
            System.out.print("Please Give The File Path As Arguments!!\n");
            return;
        }

        try
        {
            File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));

            String str;
            while (( str = buffer.readLine()) != null)
            {
                command.add(str.split(" "));
            }
        }
        catch (IOException e)
        {
            System.err.format("IOException: Cannot Read File\n");
            return;
        }
        
        for (String[] lst: command){
            double price = 0;
            Beverage b = new Decaf();
            if(lst[0].equals("Decaf")){
                b = new Decaf();
            }
            else if(lst[0].equals("HouseBlend")){
                b = new HouseBlend();
            }
            else if(lst[0].equals("DarkRoast")){
                b = new DarkRoast();
            }
            else if(lst[0].equals("Espresso")){
                b = new Espresso();
            }
            else{
                System.out.print("No this beverage!!\n");
            }
            for(int i = 1 ; i < lst.length ; i++){
                if(lst[i].equals("Milk")){
                    b = new Milk(b);
                    // Milk cond = new Milk();
                }
                else if(lst[i].equals("Soy")){
                    b = new Soy(b);
                    // Soy cond = new Soy();
                }
                else if(lst[i].equals("Mocha")){
                    b = new Mocha(b);
                    // Mocha cond = new Mocha();
                }
                else{
                    System.out.print("No this condiment!!\n");
                }
            }
            DecimalFormat format = new DecimalFormat("0.##");
            System.out.print("price: ");
            System.out.println(format.format(b.cost()));
            
        }
        
    }
}