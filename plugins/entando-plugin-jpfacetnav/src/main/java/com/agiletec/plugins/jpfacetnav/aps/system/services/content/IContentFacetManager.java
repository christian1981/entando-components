/*
 * Copyright 2013-Present Entando Corporation (http://www.entando.com) All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.agiletec.plugins.jpfacetnav.aps.system.services.content;

import java.util.List;
import java.util.Map;

import com.agiletec.aps.system.exception.ApsSystemException;

/**
 * 
 * @author E.Santoboni
 */
public interface IContentFacetManager {
	
	/**
	 * Returns contents id
	 * @param contentTypeCodes
	 * @param facetNodeCodes 
	 * @param groupCodes
	 * @return contents id
	 * @throws ApsSystemException
	 */
	public List<String> loadContentsId(List<String> contentTypeCodes, List<String> facetNodeCodes, List<String> groupCodes) throws ApsSystemException;
	
	/**
	 * Returns occurrences
	 * @param contentTypeCodes
	 * @param facetNodeCodes
	 * @param groupCodes
	 * @return occurrences
	 * @throws ApsSystemException
	 */
	public Map<String, Integer> getOccurrences(List<String> contentTypeCodes, List<String> facetNodeCodes, List<String> groupCodes) throws ApsSystemException;
	
}
