public class TexFactory implements Factory{
    public String convert(String input){
        String output = "";
        for (int i=0; i < input.length(); i++){
            if(input.charAt(i) == 'C'){
                output += "c";
            }
            if(input.charAt(i) == 'F'){
                output += "_";
            }
            if(input.charAt(i) == 'P'){
                output += "|";
            }
        }
        return output;
    }
}