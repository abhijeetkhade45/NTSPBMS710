/**
 * 
 */
/**
 * 
 */
module IOCproj16_I18N_Internationalization {
	
	requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.expression;
    requires spring.jcl;
    exports com.nt.main;
 
    opens com.nt.cfgs to spring.core, spring.beans, spring.context;
	
}