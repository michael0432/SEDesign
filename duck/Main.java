import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String[]> command = new ArrayList<String[]>();
        Map<String, Duck> ducks  = new HashMap<String, Duck>();
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
            if(lst[0].equals("duck")){
                if(lst[1].equals("MallardDuck")){
                    Duck md = new MallardDuck(lst[2],lst[3]);
                    ducks.put("MallardDuck",md);
                }
                else if(lst[1].equals("RedheadDuck")){
                    Duck md = new RedheadDuck(lst[2],lst[3]);
                    ducks.put("RedheadDuck",md);
                }
                else if(lst[1].equals("RubberDuck")){
                    Duck md = new RubberDuck(lst[2],lst[3]);
                    ducks.put("RubberDuck",md);
                }
                else if(lst[1].equals("DecoyDuck")){
                    Duck md = new DecoyDuck(lst[2],lst[3]);
                    ducks.put("DecoyDuck",md);
                }
            }
            else if(lst[0].equals("changeFly")){
                ducks.get(lst[1]).setFlyBehavior(lst[2]);
            }
            else if(lst[0].equals("changeQuack")){
                ducks.get(lst[1]).setQuackBehavior(lst[2]);
            }
            else if(lst[0].equals("swim")){
                ducks.get(lst[1]).swim();
            }
            else if(lst[0].equals("fly")){
                ducks.get(lst[1]).fly();
            }
            else if(lst[0].equals("quack")){
                ducks.get(lst[1]).quack();
            }
        }

    }
}