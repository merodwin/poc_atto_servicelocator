package junit.org.rapidpm.test.atto.remoteproxy.remote.service.locator.client;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rapidpm.ddi.DI;
import org.rapidpm.test.atto.remoteproxy.remote.service.locator.client.AttoServiceLocatorRestClient;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

/**
 * Copyright (C) 2010 RapidPM
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created by RapidPM - Team on 02.06.16.
 */
public class AttoServiceLocatorRestClientTest {

  @Before
  public void setUp() throws Exception {
    DI.clearReflectionModel();
    DI.activatePackages("org.rapidpm");
    DI.activatePackages(this.getClass());
  }


  @After
  public void tearDown() throws Exception {
    DI.clearReflectionModel();
  }

  @Test
  public void registerServiceAndResolve001() throws Exception {


//    final AttoServiceLocatorRestClient serviceLocatorRestClient = new AttoServiceLocatorRestClient();
//
//    final Optional<String> resolve = serviceLocatorRestClient.resolve(BusinessService.class.getName());
//    Assert.assertFalse(resolve.isPresent());
//
//    final RestUtils restUtils = new RestUtils();
//    final String basicReqURL = restUtils.generateBasicReqURL(BusinessServiceRest.class, Main.CONTEXT_PATH_REST);
//
//
//    serviceLocatorRestClient.registerService(BusinessService.class.getName(), "");


  }


}