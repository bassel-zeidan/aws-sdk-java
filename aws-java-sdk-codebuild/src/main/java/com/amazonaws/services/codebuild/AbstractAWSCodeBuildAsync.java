/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;

/**
 * Abstract implementation of {@code AWSCodeBuildAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeBuildAsync extends AbstractAWSCodeBuild implements AWSCodeBuildAsync {

    protected AbstractAWSCodeBuildAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(BatchDeleteBuildsRequest request) {

        return batchDeleteBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(BatchDeleteBuildsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteBuildsRequest, BatchDeleteBuildsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(BatchGetBuildsRequest request) {

        return batchGetBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(BatchGetBuildsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetBuildsRequest, BatchGetBuildsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(BatchGetProjectsRequest request) {

        return batchGetProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(BatchGetProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetProjectsRequest, BatchGetProjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest request) {

        return listBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(ListBuildsForProjectRequest request) {

        return listBuildsForProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(ListBuildsForProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBuildsForProjectRequest, ListBuildsForProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(ListCuratedEnvironmentImagesRequest request) {

        return listCuratedEnvironmentImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(ListCuratedEnvironmentImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCuratedEnvironmentImagesRequest, ListCuratedEnvironmentImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartBuildResult> startBuildAsync(StartBuildRequest request) {

        return startBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBuildResult> startBuildAsync(StartBuildRequest request,
            com.amazonaws.handlers.AsyncHandler<StartBuildRequest, StartBuildResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopBuildResult> stopBuildAsync(StopBuildRequest request) {

        return stopBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBuildResult> stopBuildAsync(StopBuildRequest request,
            com.amazonaws.handlers.AsyncHandler<StopBuildRequest, StopBuildResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
