/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.quyen.math.util.core;

//code nay clone lai 100% class java.util.Math cua JDK
public class MathUtility {

    public static final double PI = 3.1415;

    //tinh giai thua
    //thiet ke quy uoc ham/method nay
    //0! = 1! = 1
    //ko ap dung giai thua cho so am, neu n < 0 => error\
    // ko ap dung giai thua cho so > 20 (vua du kieu du lieu long)
    public static long getFactorial(int n) {
        long factorial = 1;
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid. n must be between 0 to 20");

        for (int i = 2; i <= n; i++) 
            factorial *= i;
            
        if (n == 0) 
            return 1;
        
        return factorial;
    }
}
    //TEST case va test driven developement - TDD
    //viec viet code va test code dc tien hanh song song, dan xen luon
    //1 ham dc viet ra thi ngay trong qua trinh viet da chuan bi luon
    //bo test cases, nhieu test cases de test ham dung hay sai luon
    //ta lien tuc sua code/ them code va chay test case, run test
    //giong qc la lam test case, run test case
    //khac qc: phai viet ca code cho app
    //test case la 1 bo data dua vao ham/app de test ham/ app dung sai
    //chua input, expected value. va cach thuc thi test case
    //dua data, nhan cai gi, xem cai gi, ket luan cai gi
    //cac test case co format nhu sau

