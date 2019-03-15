package com;

public class EmailToSixCharacterUniqueAlphaNumeric {

    public static void main(String args[]) {
        String str = "test.email@gmail.com";
        System.out.println("Str1 : " + str.hashCode());
        System.out.println("Str1HExCustom : " + getUnsignedString(str.hashCode()));
    }

    public static String getUnsignedString(int number) {
        char[] grammer = new char[36];
        grammer[0] = '0';
        grammer[1] = '1';
        grammer[2] = '2';
        grammer[3] = '3';
        grammer[4] = '4';
        grammer[5] = '5';
        grammer[6] = '6';
        grammer[7] = '7';
        grammer[8] = '8';
        grammer[9] = '9';
        grammer[10] = 'a';
        grammer[11] = 'b';
        grammer[12] = 'c';
        grammer[13] = 'd';
        grammer[14] = 'e';
        grammer[15] = 'f';
        grammer[16] = 'g';
        grammer[17] = 'h';
        grammer[18] = 'i';
        grammer[19] = 'j';
        grammer[20] = 'k';
        grammer[21] = 'l';
        grammer[22] = 'm';
        grammer[23] = 'n';
        grammer[24] = 'o';
        grammer[25] = 'p';
        grammer[26] = 'q';
        grammer[27] = 'r';
        grammer[28] = 's';
        grammer[29] = 't';
        grammer[30] = 'u';
        grammer[31] = 'v';
        grammer[32] = 'w';
        grammer[33] = 'x';
        grammer[34] = 'y';
        grammer[35] = 'z';

        int quotient = number;
        int rem = 0;
        int base = 36;
        String value = "";
        while(true) {
            quotient = number/base;
            rem = number%base;
            value = value  + grammer[rem];
            if(quotient <= 0)
                break;
            else {
                number = quotient;
                //base = rem;
            }
        }

        String reverseValue = "";
        for(int i = value.length() -1; i > -1 ; i--) {
            reverseValue = reverseValue + value.charAt(i);
        }
        return reverseValue;
    }

}

