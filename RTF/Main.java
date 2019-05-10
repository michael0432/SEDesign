import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        List<String[]> command = new ArrayList<String[]>();
        Reader reader = new Reader();
        // Customer customer = new Customer(n, p, customerservice);
        
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
        
        int count = 0;
        String type = "";
        for (String[] lst: command){
            if(count % 2 == 0){
                type = lst[0];
            }
            else{
                RTF rtf = new RTF(lst[0]);
                System.out.print(reader.convert(type, rtf)+"\n");
            }
            
            count += 1;
        }
    }
}
