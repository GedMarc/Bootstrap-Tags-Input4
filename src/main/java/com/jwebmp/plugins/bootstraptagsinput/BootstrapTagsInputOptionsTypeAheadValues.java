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

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * The type ahead values available for tags input
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public class BootstrapTagsInputOptionsTypeAheadValues
		extends JavaScriptPart
{


	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 */
	private List<String> source;

	/*
	 * Constructs a new BootstrapTagsInputOptionsTypeAheadValues
	 */
	public BootstrapTagsInputOptionsTypeAheadValues()
	{
		//Nothing needed
	}

	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 *
	 * @return
	 */
	public List<String> getSource()
	{
		if (source == null)
		{
			source = new ArrayList<>();
		}
		return source;
	}

	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 *
	 * @param source
	 */
	public void setSource(List<String> source)
	{
		this.source = source;
	}

}
