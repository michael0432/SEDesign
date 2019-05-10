public class WidgetFactory implements Factory{
    public String convert(String input){
        String output = "";
        for (int i=0; i < input.length(); i++){
            if(input.charAt(i) == 'C'){
                output += "<Char>";
            }
            if(input.charAt(i) == 'F'){
                output += "<Font>";
            }
            if(input.charAt(i) == 'P'){
                output += "<Paragraph>";
            }
        }
        return output;
    }
}