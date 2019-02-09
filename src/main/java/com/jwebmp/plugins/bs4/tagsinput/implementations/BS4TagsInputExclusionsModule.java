package com.jwebmp.plugins.bs4.tagsinput.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BS4TagsInputExclusionsModule
		implements IGuiceScanModuleExclusions<BS4TagsInputExclusionsModule>,
				           IGuiceScanJarExclusions<BS4TagsInputExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-tags-input4-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootstrap4tagsinput");
		return strings;
	}
}