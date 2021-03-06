/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.azure.storage.services;

import com.azure.storage.queue.QueueServiceClient;
import org.apache.camel.kafkaconnector.azure.common.services.AzureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AzureStorageQueueServiceFactory {
    private static final Logger LOG = LoggerFactory.getLogger(AzureStorageQueueServiceFactory.class);

    private AzureStorageQueueServiceFactory() {

    }

    public static AzureService<QueueServiceClient> createAzureService() {
        String instanceType = System.getProperty("azure.instance.type");

        if (instanceType == null || instanceType.equals("local-azure-container")) {
            return new AzureStorageQueueLocalContainerService();
        }

        if (instanceType.equals("remote")) {
            return new AzureStorageQueueRemoteService();
        }

        LOG.error("Azure instance must be one of 'local-azure-container' or 'remote");
        throw new UnsupportedOperationException(String.format("Invalid Azure instance type: %s", instanceType));
    }
}
