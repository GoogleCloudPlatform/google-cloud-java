/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gcloud.compute;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.api.services.compute.model.Disk;
import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * A Google Compute Engine disk configuration to create a disk from a Google Compute Engine
 * snaoshot.
 *
 * @see <a href="https://cloud.google.com/compute/docs/disks/">Block Storage</a>
 */
public class SnapshotDiskConfiguration extends DiskConfiguration {

  private static final long serialVersionUID = -1996055058706221049L;

  private final SnapshotId sourceSnapshot;
  private final String sourceSnapshotId;

  /**
   * A builder for {@code SnapshotDiskConfiguration} objects.
   */
  public static class Builder
      extends DiskConfiguration.Builder<SnapshotDiskConfiguration, Builder> {

    private SnapshotId sourceSnapshot;
    private String sourceSnapshotId;

    private Builder() {
      super(Type.SNAPSHOT);
    }

    private Builder(SnapshotDiskConfiguration snapshotDiskInfo) {
      super(Type.SNAPSHOT, snapshotDiskInfo);
      this.sourceSnapshot = snapshotDiskInfo.sourceSnapshot;
      this.sourceSnapshotId = snapshotDiskInfo.sourceSnapshotId;
    }

    private Builder(Disk diskPb) {
      super(Type.SNAPSHOT, diskPb);
      this.sourceSnapshot = SnapshotId.fromUrl(diskPb.getSourceSnapshot());
      this.sourceSnapshotId = diskPb.getSourceSnapshotId();
    }

    /**
     * Sets the identity of the source snapshot used to create the disk.
     */
    public Builder sourceSnapshot(SnapshotId sourceSnapshot) {
      this.sourceSnapshot = checkNotNull(sourceSnapshot);
      return this;
    }

    Builder sourceSnapshotId(String sourceSnapshotId) {
      this.sourceSnapshotId = sourceSnapshotId;
      return this;
    }

    /**
     * Creates a {@code SnapshotDiskConfiguration} object.
     */
    @Override
    public SnapshotDiskConfiguration build() {
      return new SnapshotDiskConfiguration(this);
    }
  }

  private SnapshotDiskConfiguration(Builder builder) {
    super(builder);
    this.sourceSnapshot = checkNotNull(builder.sourceSnapshot);
    this.sourceSnapshotId = builder.sourceSnapshotId;
  }

  /**
   * Returns the identity of the source snapshot used to create the disk.
   */
  public SnapshotId sourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * Returns the unique ID of the snapshot used to create this disk. This value identifies the exact
   * snapshot that was used to create the persistent disk. For example, if you created the
   * persistent disk from a snapshot that was later deleted and recreated under the same name, the
   * source snapshot ID would identify the exact version of the snapshot that was used.
   */
  public String sourceSnapshotId() {
    return sourceSnapshotId;
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  MoreObjects.ToStringHelper toStringHelper() {
    return super.toStringHelper()
        .add("sourceSnapshot", sourceSnapshot)
        .add("sourceSnapshotId", sourceSnapshotId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(baseHashCode(), sourceSnapshot, sourceSnapshotId);
  }

  @Override
  public final boolean equals(Object obj) {
    return obj instanceof SnapshotDiskConfiguration && baseEquals((SnapshotDiskConfiguration) obj);
  }

  @Override
  SnapshotDiskConfiguration setProjectId(String projectId) {
    Builder builder = toBuilder().sourceSnapshot(sourceSnapshot.setProjectId(projectId));
    if (diskType() != null) {
      builder.diskType(diskType().setProjectId(projectId));
    }
    return builder.build();
  }

  @Override
  Disk toPb() {
    return super.toPb()
        .setSourceSnapshot(sourceSnapshot.selfLink())
        .setSourceSnapshotId(sourceSnapshotId);
  }

  /**
   * Returns a builder for a {@code SnapshotDiskConfiguration} object given the snapshot identity.
   */
  static Builder builder(SnapshotId sourceSnapshot) {
    return new Builder().sourceSnapshot(sourceSnapshot);
  }

  /**
   * Returns a {@code SnapshotDiskConfiguration} object given the snapshot identity.
   */
  public static SnapshotDiskConfiguration of(SnapshotId sourceSnapshot) {
    return builder(sourceSnapshot).build();
  }

  @SuppressWarnings("unchecked")
  static SnapshotDiskConfiguration fromPb(Disk diskPb) {
    return new Builder(diskPb).build();
  }
}
