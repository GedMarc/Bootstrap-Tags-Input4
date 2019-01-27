module com.jwebmp.plugins.bootstrap4tagsinput {
	exports com.jwebmp.plugins.bootstrap4tagsinput;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrap4tagsinput.BootstrapTagsInputPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootstrap4tagsinput.implementations.BootstrapTags4InputExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrap4tagsinput.implementations.BootstrapTags4InputExclusionsModule;

	opens com.jwebmp.plugins.bootstrap4tagsinput to com.fasterxml.jackson.databind, com.jwebmp.core;
}
