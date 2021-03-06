/*
 * Copyright (c) MuleSoft, Inc.
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
package org.raml.model.parameter;

import static org.raml.model.ParamType.STRING;

/**
 * <p>UriParameter class.</p>
 *
 * @author kor
 * @version $Id: $Id
 */
public class UriParameter extends AbstractParam
{

    /**
     * <p>Constructor for UriParameter.</p>
     */
    public UriParameter()
    {
    }

    /**
     * <p>Constructor for UriParameter.</p>
     *
     * @param name a {@link java.lang.String} object.
     */
    public UriParameter(String name)
    {
        super(name, STRING, true);
    }
}
