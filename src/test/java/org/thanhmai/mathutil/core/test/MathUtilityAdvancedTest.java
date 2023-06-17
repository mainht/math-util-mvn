/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thanhmai.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.thanhmai.mathutil.core.MathUtility;

/**
 *
 * @author ThanhMai
 */
public class MathUtilityAdvancedTest {

    // chuan  bi san rieng test data fill vao ham
    //DDT
    //ham tra ve mang 2 chieu, kieu wrapper class/object
    //mang chua cac cap n -> expected
    public static Object[][] initTestData() {
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120}, 
                               {6, 720}
                              };

        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        //tham so hoa viec dua test data vao ham assertE()
        //bien doi du lieu thanh tham so cho tong quat
        //parameterized
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
//TDD vs DDT
//Test Driven Development
// ki thuat viet code chinh dan xen, cung voi test case/ test script
// tuc la qua trinh viet code lam app ta viet luon nhung doan code (dung thu vien JUnit,..)
// dung de test ham ta vua test
// viet cdoe va viet code test cung nhau thi goi la ki thuat lap trinh ve kiem thu - TDD

//DDT: Data Driven Testing
// la ki thuat ho tro/ mo rong them cho ki thuat TDD
// la ki thuat viet test code ma ta tach rieng nhung bo data test ra 1 cho, cau lenh so sanh ra 1 cho
// ket noi, map/fill test data vao ham test thong qua cac tham so
//{6, 720} fill vao 2 bien n, expected va 2 bien nay fill vao ham assertEqual(expected, getF(n))

// data duoc tach rieng r bien thanh tham so cho ham kiem thu
// ki thuat nay duoc goi la tach data huong cho viec kiem thu
// con goi 1 ten khac la Parameterized testing
// ki thuat kiem thu code ma huong ve tham so hoa cac data test