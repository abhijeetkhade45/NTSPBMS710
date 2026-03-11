/**
 * 
 */
/**
 * 
 */
module IOCproj06FactoryDesignPatternAnnotationCfgs {
	

	    requires spring.context;
	    requires spring.beans;
	    requires spring.core;
	    requires spring.expression;
	    requires spring.jcl;

	    opens com.nt.configs to spring.beans, spring.core, spring.context;
	    opens com.nt.sbeans to spring.beans, spring.core, spring.context;

	
}