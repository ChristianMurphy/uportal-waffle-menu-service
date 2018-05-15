/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portlet.wafflemenu.controllers.rest.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST API for the Waffle Menu project suitable for next-generation content objects.  This
 * controller (1) is Servlet API-based and (2) provides access to contents of a Waffle Menu 
 * filtered by the user via JWT.
 *
 * @since 1.0
 */
@RestController
@RequestMapping(WaffleMenuRestController.API_ROOT)
public class WaffleMenuRestController {

	public static final String API_ROOT = "/api/v1/waffle";

	
	@RequestMapping(method = RequestMethod.GET)
   	public String fetchWaffleMenuContent() {
        	// TODO:  Pull in server-side JSON Waffle Menu json, and return menu items filtered by user
        	return "TODO - Waffle Menu Items here";
	}
}
