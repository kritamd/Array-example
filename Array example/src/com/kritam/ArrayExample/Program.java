/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kritam.ArrayExample;

import com.kritam.ArrayExample.util.Arrayhelper;

/**
 *
 * @author lenovo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {3, 44, 66, 55, 56, 59, 9, 77};
        int x = 55;

        num = Arrayhelper.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

}
