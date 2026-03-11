/**
 * 
 */
/**
 * 
 */
module IOCproj11_StrategtPatternUsing_Annotation {
	
	
	requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.expression;
    requires spring.jcl;
    exports com.nt.main;
    exports com.nt.sbeans;
    opens com.nt.sbeans to spring.core, spring.beans, spring.context;
    opens com.nt.cfgs to spring.core, spring.beans, spring.context;
}