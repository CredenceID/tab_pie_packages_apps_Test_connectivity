/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.googlecode.android_scripting.jsonrpc;

public abstract class RpcReceiver {

  protected final RpcReceiverManager mManager;

  public RpcReceiver(RpcReceiverManager manager) {
    // To make reflection easier, we ensures that all the subclasses agree on this common
    // constructor.
    mManager = manager;
  }

  /** Invoked when the receiver is shut down. */
  public abstract void shutdown();
}
