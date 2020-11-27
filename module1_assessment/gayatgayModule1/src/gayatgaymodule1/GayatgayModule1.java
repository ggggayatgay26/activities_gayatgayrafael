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
public class GayatgayModule1 {

    public boolean last(String str) {
        int l = str.length();
        String ng = "GAY";
        if (l < 3) {
            return false;
        } else if (ng.equals(str.substring(l - 3, l))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assessment_number1 no1;
        Assessment_number2 no2;
        Assessment_number3 no3;
        Assessment_number5 no5;
        Assessment_number6 no6;
        Assessment_number7 no7;
        Elaborate_number1 el1;
        Elaborate_number2 el2;
        no1 = new Assessment_number1();
        no2 = new Assessment_number2();
        no3 = new Assessment_number3();
        no5 = new Assessment_number5();
        no6 = new Assessment_number6();
        no7 = new Assessment_number7();
        el1 = new Elaborate_number1();
        el2 = new Elaborate_number2();

        System.out.println("ELABORATE: Coding Answer");
        el1.chars();
        el1.index();
        el2.arrayList();
        System.out.println("ASSESSMENT Answer");
        no1.no1();
        no2.no2();
        no3.no3();
        System.out.println("");
        System.out.println("Answer 4");
        GayatgayModule1 ala = new GayatgayModule1();
        String st = "GAYATGAY";
        System.out.println("The given strings is: " + st);
        System.out.println("The string containing GAY at last: " + ala.last(st));
        no5.no5();
        no6.no6();
        no7.no7();
    }

}
