/**
 * Project Name:escape1
 * File Name:TestJansi.java
 * Package Name:com.oneapm.escape1
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.oneapm.escape2;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

/**
 * ClassName:TestJansi <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
public class TestJansi {
    
    /**
     * main: <br/>
     * 
     * @author xushjie
     * @param args
     * @since JDK 1.8
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        AnsiConsole.systemInstall();
        System.out.println(Ansi.ansi()
                               .eraseScreen()
                               .fg(Ansi.Color.RED)
                               .a("Hello")
                               .fg(Ansi.Color.GREEN)
                               .a(" World")
                               .reset());
        System.out.println(Ansi.ansi()
                               .eraseScreen()
                               .render("@|red Hello|@ @|green World|@"));
        AnsiConsole.systemUninstall();
    }
    
}
