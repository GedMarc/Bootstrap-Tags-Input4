import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrap4tagsinput.BootstrapTagsInputPageConfigurator;
import com.jwebmp.plugins.bootstrap4tagsinput.implementations.BootstrapTags4InputExclusionsModule;

module com.jwebmp.plugins.bootstrap4tagsinput {
	exports com.jwebmp.plugins.bootstrap4tagsinput;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BootstrapTagsInputPageConfigurator;

	provides IGuiceScanJarExclusions with BootstrapTags4InputExclusionsModule;
	provides IGuiceScanModuleExclusions with BootstrapTags4InputExclusionsModule;

	opens com.jwebmp.plugins.bootstrap4tagsinput to com.fasterxml.jackson.databind, com.jwebmp.core;
}
