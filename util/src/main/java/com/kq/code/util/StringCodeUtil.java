package com.kq.code.util;

/**
 * Created by qikong on 2019/2/10.
 */
public class StringCodeUtil {


    /**
     * ascii to char
     * @param ASCII
     * @return
     */
    public static char ascii2Char(int ASCII) {
        return (char) ASCII;
    }

    /**
     * char to ascii
     * @param c
     * @return
     */
    public static int char2Ascii(char c) {
        return (int) c;
    }

    /**
     * string to ascii
     *
     * @param value
     * @return
     */
    public static String stringToAscii(String value) {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                sbu.append((int) chars[i]).append(",");
            } else {
                sbu.append((int) chars[i]);
            }
        }
        return sbu.toString();
    }


    /**
     * ascii to string
     *
     * @param value
     * @return
     */
    public static String asciiToString(String value) {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }


}
