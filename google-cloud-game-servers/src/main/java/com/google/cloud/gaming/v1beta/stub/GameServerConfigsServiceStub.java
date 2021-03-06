/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.gaming.v1beta.stub;

import static com.google.cloud.gaming.v1beta.GameServerConfigsServiceClient.ListGameServerConfigsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.gaming.v1beta.CreateGameServerConfigRequest;
import com.google.cloud.gaming.v1beta.DeleteGameServerConfigRequest;
import com.google.cloud.gaming.v1beta.GameServerConfig;
import com.google.cloud.gaming.v1beta.GetGameServerConfigRequest;
import com.google.cloud.gaming.v1beta.ListGameServerConfigsRequest;
import com.google.cloud.gaming.v1beta.ListGameServerConfigsResponse;
import com.google.cloud.gaming.v1beta.OperationMetadata;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Game Services API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class GameServerConfigsServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<ListGameServerConfigsRequest, ListGameServerConfigsPagedResponse>
      listGameServerConfigsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listGameServerConfigsPagedCallable()");
  }

  public UnaryCallable<ListGameServerConfigsRequest, ListGameServerConfigsResponse>
      listGameServerConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listGameServerConfigsCallable()");
  }

  public UnaryCallable<GetGameServerConfigRequest, GameServerConfig> getGameServerConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getGameServerConfigCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<CreateGameServerConfigRequest, GameServerConfig, OperationMetadata>
      createGameServerConfigOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createGameServerConfigOperationCallable()");
  }

  public UnaryCallable<CreateGameServerConfigRequest, Operation> createGameServerConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: createGameServerConfigCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteGameServerConfigRequest, Empty, OperationMetadata>
      deleteGameServerConfigOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteGameServerConfigOperationCallable()");
  }

  public UnaryCallable<DeleteGameServerConfigRequest, Operation> deleteGameServerConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteGameServerConfigCallable()");
  }

  @Override
  public abstract void close();
}
