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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.bootstrap4tagsinput;

import com.jwebmp.core.Page;
import com.jwebmp.plugins.bootstrap4.forms.BSForm;
import com.jwebmp.plugins.bs4.tagsinput.BS4TagsInput;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BS4TagsInputTest

{

	public BS4TagsInputTest()
	{
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testSomeMethod()
	{
		BS4TagsInput bs = new BS4TagsInput();
		bs.getOptions()
		  .setFreeInput(true);
		System.out.println(bs.toString(true));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testSomeMethod2()
	{
		BS4TagsInput bs = new BS4TagsInput();
		bs.getOptions()
		  .setMaxTags(8);
		bs.getOptions()
		  .getTypeAhead()
		  .getSource()
		  .add("New Lookahead Value");
		System.out.println(bs.renderJavascript());
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testJavaScript()
	{
		BS4TagsInput bs = new BS4TagsInput();
		bs.getOptions()
		  .setFreeInput(true);
		System.out.println(bs.renderJavascript());
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testHtml()
	{
		Page p = new Page();
		BSForm form = new BSForm();
		BS4TagsInput bs = new BS4TagsInput();
		p.getOptions()
		 .setDynamicRender(false);
		p.getBody()
		 .add(form);
		form.add(bs);
		System.out.println(p.toString(true));
	}
}
