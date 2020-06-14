
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIMA
 */
public class Randomarray {
public static void main(String args[])
{
   String text[]={"Hellow world","My name is bhupesh","I want to become programmmer"};
        Random Randomtxt=new Random();
        System.out.println(text.length);
        int RandomNumber=Randomtxt.nextInt(text.length);
        System.out.println(RandomNumber);
}
}
