import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstraptagsinput.BootstrapTagsInputPageConfigurator;
import com.jwebmp.plugins.bootstraptagsinput.implementations.BootstrapTagsInputExclusionsModule;

module com.jwebmp.plugins.bootstraptagsinput {
	exports com.jwebmp.plugins.bootstraptagsinput;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BootstrapTagsInputPageConfigurator;

	provides IGuiceScanJarExclusions with BootstrapTagsInputExclusionsModule;
	provides IGuiceScanModuleExclusions with BootstrapTagsInputExclusionsModule;

	opens com.jwebmp.plugins.bootstraptagsinput to com.fasterxml.jackson.databind, com.jwebmp.core;
}
