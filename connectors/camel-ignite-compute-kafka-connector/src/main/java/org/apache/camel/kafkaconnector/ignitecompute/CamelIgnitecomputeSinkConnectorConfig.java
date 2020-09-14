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
package org.apache.camel.kafkaconnector.ignitecompute;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelIgnitecomputeSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_IGNITECOMPUTE_PATH_ENDPOINT_ID_CONF = "camel.sink.path.endpointId";
    public static final String CAMEL_SINK_IGNITECOMPUTE_PATH_ENDPOINT_ID_DOC = "The endpoint ID (not used).";
    public static final String CAMEL_SINK_IGNITECOMPUTE_PATH_ENDPOINT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_CLUSTER_GROUP_EXPRESSION_CONF = "camel.sink.endpoint.clusterGroupExpression";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_CLUSTER_GROUP_EXPRESSION_DOC = "An expression that returns the Cluster Group for the IgniteCompute instance.";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_CLUSTER_GROUP_EXPRESSION_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_COMPUTE_NAME_CONF = "camel.sink.endpoint.computeName";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_COMPUTE_NAME_DOC = "The name of the compute job, which will be set via IgniteCompute#withName(String).";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_COMPUTE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_EXECUTION_TYPE_CONF = "camel.sink.endpoint.executionType";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_EXECUTION_TYPE_DOC = "The compute operation to perform. Possible values: CALL, BROADCAST, APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component expects different payload types depending on the operation. One of: [CALL] [BROADCAST] [APPLY] [EXECUTE] [RUN] [AFFINITY_CALL] [AFFINITY_RUN]";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_EXECUTION_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_PROPAGATE_INCOMING_BODY_IF_NO_RETURN_VALUE_CONF = "camel.sink.endpoint.propagateIncomingBodyIfNoReturnValue";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_PROPAGATE_INCOMING_BODY_IF_NO_RETURN_VALUE_DOC = "Sets whether to propagate the incoming body if the return type of the underlying Ignite operation is void.";
    public static final Boolean CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_PROPAGATE_INCOMING_BODY_IF_NO_RETURN_VALUE_DEFAULT = true;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TASK_NAME_CONF = "camel.sink.endpoint.taskName";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TASK_NAME_DOC = "The task name, only applicable if using the IgniteComputeExecutionType#EXECUTE execution type.";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TASK_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TIMEOUT_MILLIS_CONF = "camel.sink.endpoint.timeoutMillis";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TIMEOUT_MILLIS_DOC = "The timeout interval for triggered jobs, in milliseconds, which will be set via IgniteCompute#withTimeout(long).";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TREAT_COLLECTIONS_AS_CACHE_OBJECTS_CONF = "camel.sink.endpoint.treatCollectionsAsCacheObjects";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TREAT_COLLECTIONS_AS_CACHE_OBJECTS_DOC = "Sets whether to treat Collections as cache objects or as Collections of items to insert/update/compute, etc.";
    public static final Boolean CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TREAT_COLLECTIONS_AS_CACHE_OBJECTS_DEFAULT = false;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_CONFIGURATION_RESOURCE_CONF = "camel.component.ignite-compute.configurationResource";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_CONFIGURATION_RESOURCE_DOC = "The resource from where to load the configuration. It can be a: URL, String or InputStream type.";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_CONFIGURATION_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONF = "camel.component.ignite-compute.ignite";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_DOC = "To use an existing Ignite instance.";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONFIGURATION_CONF = "camel.component.ignite-compute.igniteConfiguration";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONFIGURATION_DOC = "Allows the user to set a programmatic ignite configuration.";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.ignite-compute.lazyStartProducer";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_IGNITECOMPUTE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.ignite-compute.basicPropertyBinding";
    public static final String CAMEL_SINK_IGNITECOMPUTE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_IGNITECOMPUTE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelIgnitecomputeSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelIgnitecomputeSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_IGNITECOMPUTE_PATH_ENDPOINT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_PATH_ENDPOINT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_IGNITECOMPUTE_PATH_ENDPOINT_ID_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_CLUSTER_GROUP_EXPRESSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_CLUSTER_GROUP_EXPRESSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_CLUSTER_GROUP_EXPRESSION_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_COMPUTE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_COMPUTE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_COMPUTE_NAME_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_EXECUTION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_EXECUTION_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_EXECUTION_TYPE_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_PROPAGATE_INCOMING_BODY_IF_NO_RETURN_VALUE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_PROPAGATE_INCOMING_BODY_IF_NO_RETURN_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_PROPAGATE_INCOMING_BODY_IF_NO_RETURN_VALUE_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TASK_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TASK_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TASK_NAME_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TREAT_COLLECTIONS_AS_CACHE_OBJECTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TREAT_COLLECTIONS_AS_CACHE_OBJECTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_TREAT_COLLECTIONS_AS_CACHE_OBJECTS_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_COMPONENT_CONFIGURATION_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_CONFIGURATION_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_CONFIGURATION_RESOURCE_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_IGNITE_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_IGNITECOMPUTE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_IGNITECOMPUTE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}