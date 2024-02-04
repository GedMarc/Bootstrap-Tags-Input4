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

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;
import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Creates toast messages
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
public class BS4TagsInputFeature
		extends Feature<GlobalFeatures, BS4TagsInputOptions, BS4TagsInputFeature>
{
	
	
	/*
	 * Constructs a new BS4TagsInputFeature
	 */
	public BS4TagsInputFeature(ComponentHierarchyBase component)
	{
		super("BS4TagsInputFeature", component);
	}
	
	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase()
		                       .getJQueryID() + "tagsinput(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
	
	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public BS4TagsInputOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new BS4TagsInputOptions());
		}
		return super.getOptions();
	}
	
}
