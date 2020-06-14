import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIMA
 */
public class Typngtest {
    String text[]={"Hellow my name is bhupesh","hellow guys wanna be friend"};
        Random random= new Random();
        int tl=text.length;
        int RandomNumber=random.nextInt(tl);
        String TextGenerated=text[RandomNumber];
        Date date=new Date();
        long Starttime;
        long Endtime;
        float Totaltime;
        int Speed;
        int count=0;
    public void text_length_generator(){
       
        System.out.println("The length of the string"+" "+tl);
       System.out.println("*****Type this given String fast as possible without making errors*****");
    System.out.println(TextGenerated);
    }
public void StringCompare(){
    Scanner scan=new Scanner(System.in);
    Starttime=System.currentTimeMillis();
//    System.out.println(Starttime);
    String txttype=scan.nextLine();
   
//    if(txttype.equals(TextGenerated)){
        
        
        System.out.println("nice!!!!!!!!you have typed everything correct");
       Endtime=System.currentTimeMillis();
        Totaltime=TimeUnit.MILLISECONDS.toSeconds((Endtime - Starttime));

        //word generated
        String wordcounted[]=TextGenerated.split(" ");
        int wcg=wordcounted.length;
        System.out.println(wcg);
    for(int i=0;i<=wcg-1;i++)//as arrray starts from 0 not 1 loop should run as lenth of string that would be we-1
    {
        System.out.println(i+" )"+wordcounted[i]);
    }
     //word typed
        String wordcount[]=txttype.split(" ");
         int ttl=wordcount.length;
    System.out.println(txttype.length()+"is length of typed string+");
        System.out.println(ttl);
    for(int i=0;i<=ttl-1;i++)//as arrray starts from 0 not 1 loop should run as lenth of string that would be we-1
    {
        System.out.println(i+" )"+wordcount[i]);
    }
for(int i=0;i<=wcg-1;i++){
if(wordcounted[i].equals(wordcount[i])){
    
}
else{
    
    count++;
}
}
//        System.out.println(Endtime+"seconds");
        System.out.println(Totaltime+"seconds");
      Speed=(int) ((((ttl/5)-count)/Totaltime)*60);// it divied by so that a word is 5 charter
        System.out.println(+Speed+" "+"CPM which is also net wpm"+" "+"total errors:"+count);
//    }
//    else{
//        System.out.println("please type correctly");
//    } 
}


    

public static void main(String args[])
{
  Typngtest tt=new Typngtest();
    tt.text_length_generator();
    tt.StringCompare();
    
    
}
}
