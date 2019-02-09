import com.jwebmp.plugins.bs4.tagsinput.BS4TagsInputPageConfigurator;
import com.jwebmp.plugins.bs4.tagsinput.implementations.BS4TagsInputExclusionsModule;

module com.jwebmp.plugins.bs4.tagsinput {
	exports com.jwebmp.plugins.bs4.tagsinput;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with BS4TagsInputPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with BS4TagsInputExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with BS4TagsInputExclusionsModule;

	opens com.jwebmp.plugins.bs4.tagsinput to com.fasterxml.jackson.databind, com.jwebmp.core;
}
