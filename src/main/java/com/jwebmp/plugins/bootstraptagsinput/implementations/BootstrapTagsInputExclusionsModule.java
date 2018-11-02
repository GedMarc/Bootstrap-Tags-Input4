package com.jwebmp.plugins.bootstraptagsinput.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BootstrapTagsInputExclusionsModule
		implements IGuiceScanModuleExclusions<BootstrapTagsInputExclusionsModule>,
				           IGuiceScanJarExclusions<BootstrapTagsInputExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-tags-input-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootstraptagsinput");
		return strings;
	}
}
