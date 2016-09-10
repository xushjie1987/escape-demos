/**
 * Project Name:escape1
 * File Name:TestEscape.java
 * Package Name:com.oneapm.escape1
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.oneapm.escape1;

/**
 * ClassName:TestEscape <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
public class TestEscape {
    
    public static final String ANSI_RESET  = "\u001B[0m";
    public static final String ANSI_BLACK  = "\u001B[30m";
    public static final String ANSI_RED    = "\u001B[31m";
    public static final String ANSI_GREEN  = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE   = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN   = "\u001B[36m";
    public static final String ANSI_WHITE  = "\u001B[37m";
    
    /**
     * main: <br/>
     * 30–37: Set text color (foreground) 30 + n, where n is from the color table below <br>
     * 38: Reserved for extended set foreground color typical supported next arguments are 5;n where
     * n is color index (0..255) or 2;r;g;b where r,g,b are red, green and blue color channels (out
     * of 255) <br>
     * 39: Default text color (foreground) implementation defined (according to standard) <br>
     * 40–47: Set background color 40 + n, where n is from the color table below <br>
     * 48: Reserved for extended set background color typical supported next arguments are 5;n where
     * n is color index (0..255) or 2;r;g;b where r,g,b are red, green and blue color channels (out
     * of 255) <br>
     * 49: Default background color implementation defined (according to standard) <br>
     * 
     * @author xushjie
     * @param args
     * @since JDK 1.8
     */
    public static void main(String[] args) {
        System.out.println(ANSI_RED +
                           "This text is red!" +
                           ANSI_RESET);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("\u001B[11mHello World\u001B[0m");
        System.out.println("\u001B[12mHello World\u001B[0m");
        System.out.println("\u001B[13mHello World\u001B[0m");
        System.out.println("\u001B[14mHello World\u001B[0m");
        System.out.println("\u001B[15mHello World\u001B[0m");
        System.out.println("\u001B[16mHello World\u001B[0m");
        System.out.println("\u001B[17mHello World\u001B[0m");
        System.out.println("\u001B[18mHello World\u001B[0m");
        System.out.println("\u001B[19mHello World\u001B[0m");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("\u001B[4mHello World\u001B[0m");
        System.out.println("\u001B[21mHello World\u001B[0m");
        System.out.println("\u001B[24mHello World\u001B[0m");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // 30–37 Set text color (foreground) 30 + n, where n is from the color table below
        System.out.println("\u001B[30mHello World\u001B[0m");
        System.out.println("\u001B[31mHello World\u001B[0m");
        System.out.println("\u001B[32mHello World\u001B[0m");
        System.out.println("\u001B[33mHello World\u001B[0m");
        System.out.println("\u001B[34mHello World\u001B[0m");
        System.out.println("\u001B[35mHello World\u001B[0m");
        System.out.println("\u001B[36mHello World\u001B[0m");
        System.out.println("\u001B[37mHello World\u001B[0m");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // 40–47 Set background color 40 + n, where n is from the color table below
        System.out.println("\u001B[40mHello World\u001B[0m");
        System.out.println("\u001B[41mHello World\u001B[0m");
        System.out.println("\u001B[42mHello World\u001B[0m");
        System.out.println("\u001B[43mHello World\u001B[0m");
        System.out.println("\u001B[44mHello World\u001B[0m");
        System.out.println("\u001B[45mHello World\u001B[0m");
        System.out.println("\u001B[46mHello World\u001B[0m");
        System.out.println("\u001B[47mHello World\u001B[0m");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // Examples: to get black letters on white background use ESC[30;47m,
        // to get red use ESC[31m,
        // to get bright red use ESC[31;1m.
        // To reset colors to their defaults, use ESC[39;49m (not supported on some terminals),
        // or reset all attributes with ESC[0m
        System.out.println("\u001B[30;40mHello World\u001B[0m");
        System.out.println("\u001B[30;41mHello World\u001B[0m");
        System.out.println("\u001B[30;42mHello World\u001B[0m");
        System.out.println("\u001B[30;43mHello World\u001B[0m");
        System.out.println("\u001B[30;44mHello World\u001B[0m");
        System.out.println("\u001B[30;45mHello World\u001B[0m");
        System.out.println("\u001B[30;46mHello World\u001B[0m");
        System.out.println("\u001B[30;47mHello World\u001B[0m");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // ESC[38;2;<r>;<g>;<b>m
        // ESC[48;2;<r>;<g>;<b>m
        System.out.println("\u001B[38;2;152;118;170mHello World\u001B[0m");
        System.out.println("\u001B[38;2;152;118;170;48;2;43;43;43mHello World\u001B[0m");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // ESC[38;5;<n>m
        // ESC[48;5;<n>m
        System.out.println("\u001B[38;5;152mHello World\u001B[0m");
        System.out.println("\u001B[38;5;152;48;5;43mHello World\u001B[0m");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    
}
