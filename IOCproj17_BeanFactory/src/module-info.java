/**
 * 
 */
/**
 * 
 */
module IOCproj17_BeanFactory {
	
	requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.expression;
    requires spring.jcl;
    exports com.nt.main;
    exports com.nt.sbean;
    opens com.nt.sbean to spring.core, spring.beans, spring.context;
    opens com.nt.cfgs to spring.core, spring.beans, spring.context;
}