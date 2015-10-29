package com.practice.practiceJava;

import java.lang.Math;
/**
 * Created by Pravin on 10/27/2015.
 * @author Pravin
 * This class contains methods to convert binary or hexadecimal numbers to Decimal numbers
 */
public class ConversionToDecimals{


    /**
     * The method to convert any binary number to decimal numbers
     *
     * @param input   The binary number in String format that needs to be converted to decimal number
     * @return        The decimal numbers in int data type.
     */
    public static int binaryToDecimal(String input){
        String binStr = new StringBuilder(input).reverse().toString();
        int binStrLength = binStr.length();
        int decimal =0;
        char indBinStrChar;
        for (int i = 0; i < binStrLength ; ++i ) {
            indBinStrChar = binStr.charAt(i);
            if (indBinStrChar == '1' || indBinStrChar == '0') {
                decimal += (indBinStrChar - '0') * Math.pow(2, i);
            } else {
                System.out.println("Invalid Binary number. The binary numbers should only include 1's and 0's.");
                break;
            }
        }
        return decimal;
    }

    /**
     * The method to convert any hexadecimal number to decimal numbers
     *
     * @param input : The hexamdecimal number in String data type that needs to be converted to Decimal numbers
     * @return         The decimal number in int data type
     *
     */
    public static int hexToDec(String input){
        String hexNum = new StringBuilder(input).reverse().toString();
        int hexStrLength = hexNum.length();
        int decimal =0;
        char indHexStrChar;
        for (int i = 0; i < hexStrLength; ++i) {
            indHexStrChar = hexNum.charAt(i);
            if (indHexStrChar >= '0' && indHexStrChar <= '9') {
                decimal += (indHexStrChar - '0') * Math.pow(16, i);
            } else if (indHexStrChar >= 'a' && indHexStrChar <= 'f') {
                decimal += (indHexStrChar - 'a' + 10) * Math.pow(16, i);
            } else if (indHexStrChar >= 'A' && indHexStrChar <= 'F') {
                decimal += (indHexStrChar - 'A' + 10) * Math.pow(16, i);
            } else {
                System.out.println("Invalid Hex number. The Hexadecimal numbers should only include 0-9 and A-F");
                break;
            }
        }
        System.out.println(decimal);
    return decimal;
    }

}
