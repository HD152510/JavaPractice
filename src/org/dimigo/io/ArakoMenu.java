package org.dimigo.io;

import java.io.*;

/**
 * Created by seungsunoh on 2017. 6. 15..
 */
public class ArakoMenu {
    public static void main(String[] args){
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Writer writer=new BufferedWriter(new FileWriter("files/menu.rtf"));
        BufferedReader reader=new BufferedReader(new FileReader("files/menu.rtf"))){
            String str;
            while((str=br.readLine())!=null){
                writer.write(str+"\n");
            }
            writer.flush();
            System.out.println("<<메뉴 출력>>");
            while((str=reader.readLine())!=null){
                System.out.println(str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}