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
public class Assessment_number3 {

    public void no3() {
        System.out.println();
        System.out.println("Answer 3");
        int[] odds = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        double add = 0;
        for (int i = 0; i < odds.length; i++) {
            add = add + odds[i];
        }
        double ave = add / odds.length;
        System.out.println("Average : " + ave);

    }
}
