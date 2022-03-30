package bstorm.akimts.demo;

import java.util.Scanner;

public class DemoTab {

    public static void main(String[] args) {

        int a = 4;

        char[] tab = new char[++a];
        // 0 1 2 3 4
        tab[0] = '1';
        tab[1] = '2';
        tab[2] = '3';
        tab[3] = '4';
        tab[4] = '5';

        char[] tabRapide = { '1', '2', '3', '4', '5' };

        System.out.println( tab[0] );
        tab[0] = 10;

        int[][] tab2Dim = new int[2][2];

        int[] tab1 = tab2Dim[0];
        int[] tab2 = tab2Dim[1];

        int tab1case1 = tab2Dim[0][0];
        int tab1case2 = tab2Dim[0][1];
        int tab2case1 = tab2Dim[1][0];
        int tab2case2 = tab2Dim[1][1];


    }

}
