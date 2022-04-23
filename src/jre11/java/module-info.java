import com.jwebmp.plugins.bs4.tagsinput.implementations.BS4TagsInputInclusionsModule;

module com.jwebmp.plugins.bs4.tagsinput {
	exports com.jwebmp.plugins.bs4.tagsinput;

	requires transitive com.jwebmp.plugins.bootstrap;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.tagsinput.BS4TagsInputPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BS4TagsInputInclusionsModule;
	
	opens com.jwebmp.plugins.bs4.tagsinput to com.fasterxml.jackson.databind, com.jwebmp.core;
}
