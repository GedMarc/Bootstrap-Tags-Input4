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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.bootstraptagsinput;

import com.jwebmp.core.Page;
import com.jwebmp.plugins.bootstrap.forms.BSForm;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class BootstrapTagsInputTest

{

	public BootstrapTagsInputTest()
	{
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testSomeMethod()
	{
		BootstrapTagsInput bs = new BootstrapTagsInput();
		bs.getOptions()
		  .setFreeInput(true);
		System.out.println(bs.toString(true));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testSomeMethod2()
	{
		BootstrapTagsInput bs = new BootstrapTagsInput();
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
		BootstrapTagsInput bs = new BootstrapTagsInput();
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
		BootstrapTagsInput bs = new BootstrapTagsInput();
		p.getOptions()
		 .setDynamicRender(false);
		p.getBody()
		 .add(form);
		form.add(bs);
		System.out.println(p.toString(true));
	}
}
