/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dubbo.rpc.service;
import edu.illinois.CTestJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import edu.illinois.CTestClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceDescriptorInternalCacheTest {

    @Test
    void genericService() {
        Assertions.assertNotNull(ServiceDescriptorInternalCache.genericService());
        Assertions.assertEquals(GenericService.class,
            ServiceDescriptorInternalCache.genericService().getServiceInterfaceClass());
    }

    @Test
    void echoService() {
        Assertions.assertNotNull(ServiceDescriptorInternalCache.echoService());
        Assertions.assertEquals(EchoService.class,
            ServiceDescriptorInternalCache.echoService().getServiceInterfaceClass());
    }
}
