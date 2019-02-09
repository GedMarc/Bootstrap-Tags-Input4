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

import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.core.plugins.ComponentInformation;

import java.util.Objects;

/**
 * Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select
 * elements.
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Tags Input",
		description = "jQuery plugin providing a Twitter Bootstrap user interface for managing tags",
		url = "https://github.com/GedMarc/JWebMP-Bootstrap-Tags-Input")
public class BS4TagsInput
		extends InputTextType<BS4TagsInput>
{


	/**
	 * The feature for this select
	 */
	private BS4TagsInputFeature feature;

	/*
	 * Constructs a new BS4TagsInput
	 */
	public BS4TagsInput()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the feature for this component
	 *
	 * @return
	 */
	public BS4TagsInputFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BS4TagsInputFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for this bootstrap drop down
	 *
	 * @param feature
	 */
	public void setFeature(BS4TagsInputFeature feature)
	{
		this.feature = feature;
	}

	@Override
	public BS4TagsInputOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getFeature());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BS4TagsInput))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BS4TagsInput that = (BS4TagsInput) o;
		return Objects.equals(getFeature(), that.getFeature());
	}
}
