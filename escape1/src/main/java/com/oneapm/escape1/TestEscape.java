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
     * 
     * @author xushjie
     * @param args
     * @since JDK 1.8
     */
    public static void main(String[] args) {
        System.out.println(ANSI_RED +
                           "This text is red!" +
                           ANSI_RESET);
        System.out.println("\u001B[30mHello World\u001B[0m");
        System.out.println("\u001B[31mHello World\u001B[0m");
        System.out.println("\u001B[32mHello World\u001B[0m");
        System.out.println("\u001B[33mHello World\u001B[0m");
        System.out.println("\u001B[34mHello World\u001B[0m");
        System.out.println("\u001B[35mHello World\u001B[0m");
        System.out.println("\u001B[36mHello World\u001B[0m");
        System.out.println("\u001B[37mHello World\u001B[0m");
        System.out.println("\u001B[30;40mHello World\u001B[0m");
        System.out.println("\u001B[30;41mHello World\u001B[0m");
        System.out.println("\u001B[30;42mHello World\u001B[0m");
        System.out.println("\u001B[30;43mHello World\u001B[0m");
        System.out.println("\u001B[30;44mHello World\u001B[0m");
        System.out.println("\u001B[30;45mHello World\u001B[0m");
        System.out.println("\u001B[30;46mHello World\u001B[0m");
        System.out.println("\u001B[30;47mHello World\u001B[0m");
        System.out.println("\u001B[38;2;152;118;170mHello World\u001B[0m");
        System.out.println("\u001B[38;2;152;118;170;48;2;43;43;43mHello World\u001B[0m");
        System.out.println("\u001B[38;1;152;118;170mHello World\u001B[0m");
        System.out.println("\u001B[38;1;152;118;170;48;1;43;43;43mHello World\u001B[0m");
        System.out.println("\u001B[38;4;152;118;170mHello World\u001B[0m");
        System.out.println("\u001B[38;4;152;118;170;48;4;43;43;43mHello World\u001B[0m");
        System.out.println("\u001B[38;5;152;118;170mHello World\u001B[0m");
        System.out.println("\u001B[38;5;152;118;170;48;5;43;43;43mHello World\u001B[0m");
    }
    
}
