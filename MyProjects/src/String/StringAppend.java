package String;

public class StringAppend {

    public static void main(String args[]){

        StringBuilder stringBuilder = new StringBuilder("");
        for(int i=1;i<=50000;i++){
            stringBuilder.append(",");
            stringBuilder.append(i);
        }
        String built = stringBuilder.toString();
        built = built.replaceFirst(",","");
        System.out.println(built);
    }
}
