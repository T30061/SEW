package htl.teddy_com.code.extra;

import java.io.*;

public class Extra_02_04 {

    //Histogramm in HTML speichern und die Divs speichern

    public static void main(String[] args) throws IOException {
        int[] array1 = {1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        saveFile("yes",array1);
    }

    public static void saveFile(String name,int[] arr) throws IOException {
        File myObj = new File(name+".html");
        if (myObj.createNewFile())
            System.out.println("File created: " + myObj.getName());
        else
            System.out.println("File already exists.");

        FileWriter myWriter = new FileWriter(myObj.getName());
        myWriter.write("<!DOCTYPE html>\n" + "<html lang=\"en\">\n" + "<head>\n" + "    <meta charset=\"UTF-8\">\n" + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + "    <title>Teddy_com Histogramsaver</title>\n" + "</head>\n" + "<body>\n" );
        for(int el : arr){
            myWriter.write("\t<div style=\"background-color: red; width:"+ (el*10)+"px;\">"+arr[el-1]+"</div>\n");
        }
        myWriter.write("</body>\n"+"</html>");
        myWriter.close();
    }
}
