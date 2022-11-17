/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author jrayv20
 */
public class RomanToInt {

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        System.out.println(romanToInt(romanNumeral));
    }
    
    public static int romanToInt(String s){
       String numeral = s.toUpperCase();
       char[] values = numeral.toCharArray();
       int decimal = 0;
       
       for(int i = values.length - 1; i >= 0; i--){
                if(values[i] == 'I'){
                    decimal++;
                }
                else if(values[i] == 'V'){
                    if(i == 0){
                        decimal += 5;
                    }
                    else{
                        if(values[i - 1] == 'I'){
                            decimal += 4;
                            i--;
                        }
                        else{
                            decimal += 5;
                        }
                    }    
                }
                else if(values[i] == 'X'){
                    if(i == 0){
                        decimal += 10;
                    }
                    else{
                        if(values[i - 1] == 'I'){
                            decimal += 9;
                            i--;
                        }
                        else{
                            decimal += 10;
                        }
                    }
                }
                else if(values[i] == 'L'){
                    if(i == 0){
                        decimal += 50;
                    }
                    else{
                        if(values[i-1] == 'X'){
                            decimal += 40;
                            i--;
                        }
                        else{
                            decimal += 50;
                        }
                    }
                }
                else if(values[i] == 'C'){
                    if(i == 0){
                        decimal += 100;
                    }
                    else{
                        if(values[i-1] == 'X'){
                            decimal += 90;
                            i--;
                        }
                        else{
                        decimal += 100;
                    }    } 
                }
                else if(values[i] == 'D'){
                    if(i == 0){
                        decimal += 500;
                    }
                    else{
                        if(values[i-1] == 'C'){
                            decimal += 400;
                            i--;    
                        }
                        else{
                            decimal += 500;
                        }
                    }
                }
                else if(values[i] == 'M'){
                    if(i == 0){
                        decimal += 1000;
                    }
                    else{
                        if(values[i-1] == 'C'){
                            decimal += 900;
                            i--;
                        }
                        else{
                            decimal += 1000;
                        }
                    }
                }
            }
        return decimal;
    }
}
