/*
 * Copyright 2013-2015 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.codegen.core.ext;

import java.lang.annotation.Annotation;
import java.util.Collection;

import org.raml.model.Action;
import org.raml.model.MimeType;
import org.raml.model.Raml;
import org.raml.model.Resource;
import org.raml.model.parameter.AbstractParam;

import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMethod;


/**
 * Generator extensions can extend this class
 *
 * @author pbober
 * @version $Id: $Id
 */
public abstract class AbstractGeneratorExtension implements GeneratorExtension {

	private Raml raml;
	
	/** {@inheritDoc} */
	public void onAddResourceMethod(JMethod method,  Action action,  MimeType bodyMimeType,
			 Collection<MimeType> uniqueResponseMimeTypes) {

		
	}

	/** {@inheritDoc} */
	public void onCreateResourceInterface(JDefinedClass resourceInterface, Resource resource) {

		
	}

	/** {@inheritDoc} */
	public boolean AddParameterFilter(String name,
             AbstractParam parameter,
             Class<? extends Annotation> annotationClass,
             JMethod method) {
		return true;
	}

	/** {@inheritDoc} */
	public void setRaml(Raml raml) {
		this.raml = raml;
	}
	
	/**
	 * <p>Getter for the field <code>raml</code>.</p>
	 *
	 * @return a {@link org.raml.model.Raml} object.
	 */
	protected  Raml getRaml() {
		return raml;
	}
}
