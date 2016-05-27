package ru.sbt.testsbt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Parser {
    
public static String[] str() throws FileNotFoundException{
                List<String> list = new ArrayList<String>();
                Scanner in = new Scanner(new File("E:\\ProgrammPasha\\SBT\\datafile.txt"));
                while (in.hasNextLine())
                list.add(in.nextLine());
                String[] array = list.toArray(new String[0]);
                return array;
}
    
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int  param1, param2, result;
        String operator;

                //tut method string str vstavit
/*
                System.out.println("Что находится в файле:");
                for (int i=0; i<array.length; i++){                    
                    System.out.println(array[i]);
                }
                System.out.println();*/
                
                
       /* String[][] st = new String[array.length][4];
        int test_result=0;
        String st_temporary[];
        
        for(int i=0; i<array.length; i++){
            st_temporary = array[i].split(";");
            for(int j=0; j<st_temporary.length; j++){
                System.out.println(st_temporary[j]);
                st[i][j] = st_temporary[j];
            }            
        }
        String st[];
        int test_result=0;
        for (int i=0; i<array.length; i++){
            st = array[i].split(";"); //Разделение по знаку ";"
            param1 = Integer.parseInt(st[0]);
            param2 = Integer.parseInt(st[1]);
            result = Integer.parseInt(st[3]);
                switch(st[2]){
                    case "+": 
                        test_result = sum(param1,param2);
                        break;
                    case "-":
                        test_result = subtraction(param1,param2);
                        break;
                    case "*":
                        test_result = multiplication(param1,param2);
                        break;
                    case "/":
                        test_result = divide(param1, param2);
                        break;
                }
                
            if (test_result==result){
                System.out.println("Строка "+ i + ": Ответ метода и ответ в файле совпадают");
                System.out.println("Результат метода: "+test_result + "  Результат в файле: "+result);
            }
            else{
                System.out.println("Строка "+ i + ": Ответ метода и ответ в файле НЕ совпадают");
                System.out.println("Результат метода: "+test_result + "  Результат в файле: "+result);
            }
            System.out.println();
        } */
    }

    
    //Методы
    public static int sum(int i, int j){
        return i+j;
    }
    
    public static int divide(int i, int j){
        return i/j;
    }
    
    public static int multiplication(int i, int j){
        return i*j;
    }
    
    public static int subtraction(int i, int j){
        return i-j;
    }
    
    public static int resulting(int operand1, int operand2, String operation){
        switch(operation){
                    case "+": 
                        return sum(operand1,operand2);
                    case "-":
                        return subtraction(operand1,operand2);
                    case "*":
                        return multiplication(operand1,operand2);
                    case "/":
                        return divide(operand1, operand2);
                        
                    default: throw new IllegalArgumentException("Invalid operator: " + operation);
                }
    }
}

