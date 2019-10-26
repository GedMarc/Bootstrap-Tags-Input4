module com.jwebmp.plugins.bs4.tagsinput {
	exports com.jwebmp.plugins.bs4.tagsinput;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.tagsinput.BS4TagsInputPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bs4.tagsinput.implementations.BS4TagsInputExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.tagsinput.implementations.BS4TagsInputExclusionsModule;

	opens com.jwebmp.plugins.bs4.tagsinput to com.fasterxml.jackson.databind, com.jwebmp.core;
}
