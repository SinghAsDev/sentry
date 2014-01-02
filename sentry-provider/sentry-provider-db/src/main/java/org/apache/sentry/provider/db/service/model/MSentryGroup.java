/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.sentry.provider.db.service.model;

import java.util.Set;

public class MSentryGroup {

  private String groupName;

  // set of roles granted to this group
  private Set<MSentryRole> roles;

  private long createTime;

  private String grantorPrincipal;


  MSentryGroup(String groupName, long createTime, String grantorPrincipal,
    Set<MSentryRole> roles) {
    this.setGroupName(groupName);
    this.createTime = createTime;
    this.grantorPrincipal = grantorPrincipal;
    this.setRoles(roles);
  }

  public long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime;
  }

  public String getGrantorPrincipal() {
    return grantorPrincipal;
  }

  public void setGrantorPrincipal(String grantorPrincipal) {
    this.grantorPrincipal = grantorPrincipal;
  }

  public Set<MSentryRole> getRoles() {
    return roles;
  }

  public void setRoles(Set<MSentryRole> roles) {
    this.roles = roles;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public void appendRoles(Set<MSentryRole> roles) {
    this.roles.addAll(roles);
  }
}