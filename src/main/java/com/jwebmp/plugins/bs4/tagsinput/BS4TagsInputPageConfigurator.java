/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bs4.tagsinput;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Bootstrap Tags Input",
		pluginDescription = "jQuery plugin providing a Twitter Bootstrap user interface for managing tags",
		pluginUniqueName = "jwebswing-tags-input",
		pluginVersion = "2.1.3",
		pluginCategories = "multi input, text input, tags, , dropdown, bootstrap, ui,web ui, framework",
		pluginSubtitle = "jQuery plugin providing a Twitter Bootstrap user interface for managing tags",
		pluginSourceUrl = "https://github.com/bootstrap-tagsinput/bootstrap-tagsinput",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Bootstrap-Tags-Input/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Bootstrap-Tags-Input",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://bootstrap-tagsinput.github.io/bootstrap-tagsinput/examples/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BS4TagsInput.jar/download")
public class BS4TagsInputPageConfigurator
		implements IPageConfigurator<BS4TagsInputPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new BS4TagsInputPageConfigurator
	 */
	public BS4TagsInputPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BS4TagsInputPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BS4TagsInputPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(BS4TagsInputReferencePool.BootstrapTagsInput.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BS4TagsInputReferencePool.BootstrapTagsInput.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return BS4TagsInputPageConfigurator.enabled;
	}
}
