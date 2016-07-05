/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kritam.ArrayExample.util;

/**
 *
 * @author lenovo
 */
public class Arrayhelper {

    public static boolean search(int[] data, int num) {

        for (int i = 0; i <= data.length; i++) {

            if (data[i] == num) {
                return true;
            }
        }

        return false;
    }

    public static int getPosition(int[] data, int num) {

        for (int i = 0; i < data.length; i++) {

            if (data[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        return data;

    }

}
