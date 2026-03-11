package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfigs;

public class ClientApp {

    
       public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfigs.class);
        System.out.println("HIiiiii");
        String language = sc.next();
        String country = sc.next();
        Locale locale = Locale.of(language, country);

       

        System.out.println(ctx.getMessage("person.msg", null, locale));
        System.out.println("HIiiiii");        
        sc.close();
    }
}