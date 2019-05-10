public class Reader{
    Factory Tex;
    Factory Widget;
    public Reader(){
        Tex = new TexFactory();
        Widget = new WidgetFactory();
    }
    public String convert(String type, RTF input){
        if(type.equals("TeX")){
            return Tex.convert(input.content);
        }
        else{
            return Widget.convert(input.content);
        }
    }
}