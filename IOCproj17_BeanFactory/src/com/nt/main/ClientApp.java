package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfigs;
import com.nt.sbean.*;

public class ClientApp {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfigs.class);

        System.out.println(
            ctx.getBean("fpkt", FlipCart.class)
               .shopping(new double[]{1200.0,900.0}, new String[]{"pant","chaddi"})
        );
    }
}