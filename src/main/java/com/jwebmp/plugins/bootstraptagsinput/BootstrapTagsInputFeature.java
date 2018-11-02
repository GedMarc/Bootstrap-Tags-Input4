/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.bootstraptagsinput;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Creates toast messages
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class BootstrapTagsInputFeature
		extends Feature<GlobalFeatures, BootstrapTagsInputOptions, BootstrapTagsInputFeature>
{


	/*
	 * Constructs a new BootstrapTagsInputFeature
	 */
	public BootstrapTagsInputFeature(ComponentHierarchyBase component)
	{
		super("BootstrapTagsInputFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "tagsinput(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public BootstrapTagsInputOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new BootstrapTagsInputOptions());
		}
		return super.getOptions();
	}

}
