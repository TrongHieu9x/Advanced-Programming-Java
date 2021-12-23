package BaiTap;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("Tam giac deu")
    public void testCase1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giac deu";

        String result = TriangleClassifier.classifierTriangle(a , b , c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tam giac can")
    public void testCase2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giac can";

        String result = TriangleClassifier.classifierTriangle(2, 2, 3);
        assertEquals(expected, result);
    }

    @Test
   @DisplayName("Tam giac thuong")
    public void testCase3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giac thuong";

        String result = TriangleClassifier.classifierTriangle(3, 4, 5);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong phai tam giac")
    public void testCase4(){
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Khoong phai tam giac";

        String result = TriangleClassifier.classifierTriangle(8, 2, 3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong phai tam giac")
    public void testCase5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Khong phai tam giac";

        String result = TriangleClassifier.classifierTriangle(-1, 2, 1);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong phai tam giac")
    public void testCase6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Khong phai tam giac";

        String result = TriangleClassifier.classifierTriangle(0, 1, 1);
        assertEquals(expected, result);
    }
}