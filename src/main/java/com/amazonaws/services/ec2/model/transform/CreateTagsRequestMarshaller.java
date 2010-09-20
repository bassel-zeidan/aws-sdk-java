/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Tags Request Marshaller
 */
public class CreateTagsRequestMarshaller implements Marshaller<Request<CreateTagsRequest>, CreateTagsRequest> {

    public Request<CreateTagsRequest> marshall(CreateTagsRequest createTagsRequest) {
        Request<CreateTagsRequest> request = new DefaultRequest<CreateTagsRequest>(createTagsRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTags");
        request.addParameter("Version", "2010-08-31");
        if (createTagsRequest != null) {
            java.util.List<String> resourcesList = createTagsRequest.getResources();
            int resourcesListIndex = 1;
            for (String resourcesListValue : resourcesList) {
                if (resourcesListValue != null) {
                    request.addParameter("ResourceId." + resourcesListIndex, StringUtils.fromString(resourcesListValue));
                }
                resourcesListIndex++;
            }
        }

        if (createTagsRequest != null) {
            java.util.List<Tag> tagsList = createTagsRequest.getTags();
            int tagsListIndex = 1;
            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {
                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }
                }
                if (tagsListValue != null) {
                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }

                tagsListIndex++;
            }
        }


        return request;
    }
}
