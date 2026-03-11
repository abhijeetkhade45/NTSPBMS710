module iocProj17_BeanLifeCycle {

    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.expression;
    requires spring.jcl;

    requires jakarta.annotation;   // required for @PostConstruct

    exports com.nt.main;
    exports com.nt.sbeans;

    opens com.nt.sbeans to spring.core, spring.beans, spring.context;
    opens com.nt.cfgs to spring.core, spring.beans, spring.context;
}