package com.nt.sbean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component("cf")
public class CouriorFactory implements FactoryBean<Courior>{
	
	@Value("${courior.name}")
	private String type;
    @Override
    public Courior getObject() throws Exception {
    	
    	if(type.equals("dtdc")) {
    		return new DTDC();
    	}
    	else if(type.equals("BlueDart")) {
    		return new BlueDart();
    	}
    	else {
    		return null;
    	}
      
    }

    @Override
    public Class<?> getObjectType() {
        return Courior.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}