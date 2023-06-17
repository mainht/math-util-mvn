/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thanhmai.mathutil.core;

/**
 *
 * @author ThanhMai
 */
//ta se clon class java.util.Math cua JDK ma ben trong no chua
// cac ham huyen thoai
public class MathUtility {
    public static final double PI = 3.1415;
    
    
    
    
    
    
    // ham tinh n! khong co giai thua cho so am, nem exception
    // giai thua tang nhanh, 21! kieu long bi tran
    // chi tinh giai thau tu 0..20
    // >=21! nem exception
    // 0! = 1! = 1
    public static long getFactorial (int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20, please.");
        
        if (n == 0 || n ==1)          
            return 1;
        
        long product = 1; //tich nhan don
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
        
        
    }
}
