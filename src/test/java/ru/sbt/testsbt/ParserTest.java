package ru.sbt.testsbt;

import java.io.FileNotFoundException;
import org.junit.Test;
import static org.junit.Assert.*;
import static ru.sbt.testsbt.Parser.str;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.annotations.Parameter;

public class ParserTest {

    String[] array;
    String[][] st;
    int test_result=0;
    String st_temporary[];
    @Parameter int  param1, param2, result;
    @Parameter String operator;
    @Parameter int resultTest;
        
    public ParserTest() {
    }

    @Title("First test ")
    @Test
    public void firstSimpleTest() {
    assertTrue("Result not equals to 4", 2 * 2 == 4);
    }
    
    @Title("Тест отдельного метода sum")
    @Test
    public void sum(){
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        int operand1 = 12;
        int operand2 = 42;
        assertEquals(operand1 + operand2, Parser.sum(operand1,operand2));
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println();
    }
    
    @Title("Тест отдельного метода divide")
    @Test
    public void divide(){
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        int operand1 = 12;
        int operand2 = 3;
        assertEquals(operand1/operand2, Parser.divide(operand1,operand2));
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println();
    }
    
    @Title("Тест отдельного метода multiplication")
    @Test
    public void multiplication(){
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        int operand1 = 10;
        int operand2 = 100;
        assertEquals(operand1*operand2, Parser.multiplication(operand1,operand2));
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println();
    }
    
    @Title("Тест арифметических операций файла")
    @Test
    public void allTest() throws FileNotFoundException{
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        array = Parser.str();
        st = new String[array.length][4];
        for(int i=0; i<array.length; i++){
            st_temporary = array[i].split(";");
            for(int j=0; j<st_temporary.length; j++){
                System.out.println(st_temporary[j]);
                st[i][j] = st_temporary[j];
            }            
        }
        for(int i=0;i<st.length; i++){
            for(int j=0; j<st.length; j++){
                param1 = Integer.parseInt(st[i][j]);
                j++;
                param2 = Integer.parseInt(st[i][j]);
                j++;
                operator = st[i][j];
                j++;
                result = Integer.parseInt(st[i][j]);
                resultTest = Parser.resulting(param1, param2, operator);
                assertEquals(resultTest,result);
                System.out.println(operator);
            }
        }
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println();
    }
}