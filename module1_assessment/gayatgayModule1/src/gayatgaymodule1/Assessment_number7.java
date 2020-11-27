/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gayatgaymodule1;

import java.io.File;

/**
 *
 * @author GAYATGAY
 */
public class Assessment_number7 {

    public void no7() {
        System.out.println();
        System.out.println("Answer 7");
        File file = new File("C:\\Users\\GAYATGAY\\Desktop\\");
        String[] file_cont = file.list();
        for (String file_name : file_cont) {
            System.out.println(file_name);
        }

    }
}
