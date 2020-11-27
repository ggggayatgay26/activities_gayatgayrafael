/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gayatgaymodule1;

/**
 *
 * @author GAYATGAY
 */
public class Elaborate_number2 {

    public void arrayList() {
        System.out.println();
        System.out.println("answer 2");
        java.util.ArrayList<String> aboutme = new java.util.ArrayList<>();
        aboutme.add("Chubby");
        aboutme.add("Cute");
        aboutme.add("Simple");
        aboutme.add("Friendly");
        aboutme.add("Smart");
        System.out.println("Array");
        System.out.println("My Attitude are: " + aboutme);
        String[] arrayGame = new String[aboutme.size()];
        aboutme.toArray(arrayGame);
        System.out.print("My Attitude in Array are: ");
        for (String items : arrayGame) {
            System.out.print(items + ", ");
        }
        System.out.println();
        System.out.println();
    }
}
