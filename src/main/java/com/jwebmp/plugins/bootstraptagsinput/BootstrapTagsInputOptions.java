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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * All the options available for Bootstrap Select
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class BootstrapTagsInputOptions
		extends JavaScriptPart
{


	/**
	 * Classname for the tags, or a function returning a classname
	 */
	private BootstrapTagsInputSize tagClass;
	/**
	 * When adding objects as tags, itemValue must be set to the name of the property containing the item's value, or a function returning an item's value.
	 */
	private String itemValue;
	/**
	 * When adding objects as tags, you can set itemText to the name of the property of item to use for a its tag's text. You may also provide a function which returns an item's
	 * value. When this
	 * options is not set, the value of itemValue will be used.
	 */
	private String itemText;
	/**
	 * Array of keycodes which will add a tag when typing in the input. (default: [13, 188], which are ENTER and comma)
	 */
	private List<Integer> confirmKeys;
	/**
	 * When set, no more than the given number of tags are allowed to add (default: undefined). When maxTags is reached, a class 'bootstrap-tagsinput-max' is placed on the
	 * tagsinput element.
	 */
	private Integer maxTags;
	/**
	 * Defines the maximum length of a single tag. (default: undefined)
	 */
	private Integer maxChars;
	/**
	 * When true, automatically removes all whitespace around tags. (default: false)
	 */
	private Boolean trimValue;
	/**
	 * When true, the same tag can be added multiple times. (default: false)
	 */
	private Boolean allowDuplicates;
	/**
	 * When the input container has focus, the class specified by this config option will be applied to the container
	 */
	private String focusClass;
	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 */
	private Boolean freeInput;
	@JsonProperty("typeahead")
	private BootstrapTagsInputOptionsTypeAheadValues typeAhead;
	/**
	 * Boolean value controlling whether form submissions get processed when pressing enter in a field converted to a tagsinput (default: false).
	 */
	private Boolean cancelConfirmKeysOnEmpty;

	/**
	 * Constructs a new tags input options object
	 */
	public BootstrapTagsInputOptions()
	{
		//Nothing Needed
	}

	/**
	 * Classname for the tags, or a function returning a classname
	 *
	 * @return
	 */
	public BootstrapTagsInputSize getTagClass()
	{
		return tagClass;
	}

	/**
	 * Classname for the tags, or a function returning a classname
	 *
	 * @param tagClass
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setTagClass(BootstrapTagsInputSize tagClass)
	{
		this.tagClass = tagClass;
		return this;
	}

	/**
	 * When adding objects as tags, itemValue must be set to the name of the property containing the item's value, or a function returning an item's value.
	 *
	 * @return
	 */
	public String getItemValue()
	{
		return itemValue;
	}

	/**
	 * When adding objects as tags, itemValue must be set to the name of the property containing the item's value, or a function returning an item's value.
	 *
	 * @param itemValue
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setItemValue(String itemValue)
	{
		this.itemValue = itemValue;
		return this;
	}

	/**
	 * When adding objects as tags, you can set itemText to the name of the property of item to use for a its tag's text. You may also provide a function which returns an item's
	 * value. When this
	 * options is not set, the value of itemValue will be used.
	 *
	 * @return
	 */
	public String getItemText()
	{
		return itemText;
	}

	/**
	 * When adding objects as tags, you can set itemText to the name of the property of item to use for a its tag's text. You may also provide a function which returns an item's
	 * value. When this
	 * options is not set, the value of itemValue will be used.
	 *
	 * @param itemText
	 */
	public void setItemText(String itemText)
	{
		this.itemText = itemText;
	}

	/**
	 * Array of keycodes which will add a tag when typing in the input. (default: [13, 188], which are ENTER and comma)
	 *
	 * @return
	 */
	public List<Integer> getConfirmKeys()
	{
		if (confirmKeys == null)
		{
			confirmKeys = new ArrayList<>();
		}
		return confirmKeys;
	}

	/**
	 * Array of keycodes which will add a tag when typing in the input. (default: [13, 188], which are ENTER and comma)
	 *
	 * @param confirmKeys
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setConfirmKeys(List<Integer> confirmKeys)
	{
		this.confirmKeys = confirmKeys;
		return this;
	}

	/**
	 * When set, no more than the given number of tags are allowed to add (default: undefined). When maxTags is reached, a class 'bootstrap-tagsinput-max' is placed on the
	 * tagsinput element.
	 *
	 * @return
	 */
	public Integer getMaxTags()
	{
		return maxTags;
	}

	/**
	 * When set, no more than the given number of tags are allowed to add (default: undefined). When maxTags is reached, a class 'bootstrap-tagsinput-max' is placed on the
	 * tagsinput element.
	 *
	 * @param maxTags
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setMaxTags(Integer maxTags)
	{
		this.maxTags = maxTags;
		return this;
	}

	/**
	 * Defines the maximum length of a single tag. (default: undefined)
	 *
	 * @return
	 */
	public Integer getMaxChars()
	{
		return maxChars;
	}

	/**
	 * Defines the maximum length of a single tag. (default: undefined)
	 *
	 * @param maxChars
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setMaxChars(Integer maxChars)
	{
		this.maxChars = maxChars;
		return this;
	}

	/**
	 * When true, automatically removes all whitespace around tags. (default: false)
	 *
	 * @return
	 */
	public Boolean getTrimValue()
	{
		return trimValue;
	}

	/**
	 * When true, automatically removes all whitespace around tags. (default: false)
	 *
	 * @param trimValue
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setTrimValue(Boolean trimValue)
	{
		this.trimValue = trimValue;
		return this;
	}

	/**
	 * When true, the same tag can be added multiple times. (default: false)
	 *
	 * @return
	 */
	public Boolean getAllowDuplicates()
	{
		return allowDuplicates;
	}

	/**
	 * When true, the same tag can be added multiple times. (default: false)
	 *
	 * @param allowDuplicates
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setAllowDuplicates(Boolean allowDuplicates)
	{
		this.allowDuplicates = allowDuplicates;
		return this;
	}

	/**
	 * When the input container has focus, the class specified by this config option will be applied to the container
	 *
	 * @return
	 */
	public String getFocusClass()
	{
		return focusClass;
	}

	/**
	 * When the input container has focus, the class specified by this config option will be applied to the container
	 *
	 * @param focusClass
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setFocusClass(String focusClass)
	{
		this.focusClass = focusClass;
		return this;
	}

	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 *
	 * @return
	 */
	public Boolean getFreeInput()
	{
		return freeInput;
	}

	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 *
	 * @param freeInput
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setFreeInput(Boolean freeInput)
	{
		this.freeInput = freeInput;
		return this;
	}

	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 *
	 * @return
	 */
	public BootstrapTagsInputOptionsTypeAheadValues getTypeAhead()
	{
		if (typeAhead == null)
		{
			typeAhead = new BootstrapTagsInputOptionsTypeAheadValues();
		}
		return typeAhead;
	}

	/**
	 * Allow creating tags which are not returned by typeahead's source (default: true)
	 * <p>
	 * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
	 *
	 * @param typeAhead
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setTypeAhead(BootstrapTagsInputOptionsTypeAheadValues typeAhead)
	{
		this.typeAhead = typeAhead;
		return this;
	}

	/**
	 * Boolean value controlling whether form submissions get processed when pressing enter in a field converted to a tagsinput (default: false).
	 *
	 * @return
	 */
	public Boolean getCancelConfirmKeysOnEmpty()
	{
		return cancelConfirmKeysOnEmpty;
	}

	/**
	 * Boolean value controlling whether form submissions get processed when pressing enter in a field converted to a tagsinput (default: false).
	 *
	 * @param cancelConfirmKeysOnEmpty
	 *
	 * @return
	 */
	public BootstrapTagsInputOptions setCancelConfirmKeysOnEmpty(Boolean cancelConfirmKeysOnEmpty)
	{
		this.cancelConfirmKeysOnEmpty = cancelConfirmKeysOnEmpty;
		return this;
	}

}
