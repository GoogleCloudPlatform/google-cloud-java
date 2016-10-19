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

package com.google.cloud.compute;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Identity for a Google Compute Engine image.
 */
public final class ImageId extends ResourceId {

  static final Function<String, ImageId> FROM_URL_FUNCTION = new Function<String, ImageId>() {
    @Override
    public ImageId apply(String pb) {
      return ImageId.fromUrl(pb);
    }
  };
  static final Function<ImageId, String> TO_URL_FUNCTION = new Function<ImageId, String>() {
    @Override
    public String apply(ImageId imageId) {
      return imageId.getSelfLink();
    }
  };

  private static final String REGEX = ResourceId.REGEX + "global/images/([^/]+)";
  private static final Pattern PATTERN = Pattern.compile(REGEX);
  private static final long serialVersionUID = 6434553917859414341L;

  private final String image;

  private ImageId(String project, String image) {
    super(project);
    this.image = checkNotNull(image);
  }

  /**
   * Returns the name of the image. The name must be 1-63 characters long and comply with RFC1035.
   * Specifically, the name must match the regular expression {@code [a-z]([-a-z0-9]*[a-z0-9])?}
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   *
   * @see <a href="https://www.ietf.org/rfc/rfc1035.txt">RFC1035</a>
   */
  @Deprecated
  public String image() {
    return getImage();
  }

  /**
   * Returns the name of the image. The name must be 1-63 characters long and comply with RFC1035.
   * Specifically, the name must match the regular expression {@code [a-z]([-a-z0-9]*[a-z0-9])?}
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   *
   * @see <a href="https://www.ietf.org/rfc/rfc1035.txt">RFC1035</a>
   */
  public String getImage() {
    return image;
  }

  @Override
  @Deprecated
  public String selfLink() {
    return getSelfLink();
  }

  @Override
  public String getSelfLink() {
    return super.getSelfLink() + "/global/images/" + image;
  }

  @Override
  MoreObjects.ToStringHelper toStringHelper() {
    return super.toStringHelper().add("image", image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseHashCode(), image);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof ImageId)) {
      return false;
    }
    ImageId other = (ImageId) obj;
    return baseEquals(other) && Objects.equals(image, other.image);
  }

  @Override
  ImageId setProjectId(String projectId) {
    if (getProject() != null) {
      return this;
    }
    return ImageId.of(projectId, image);
  }

  /**
   * Returns an image identity given the image name. The image name must be 1-63 characters long and
   * comply with RFC1035. Specifically, the name must match the regular expression
   * {@code [a-z]([-a-z0-9]*[a-z0-9])?} which means the first character must be a lowercase letter,
   * and all following characters must be a dash, lowercase letter, or digit, except the last
   * character, which cannot be a dash.
   *
   * @see <a href="https://www.ietf.org/rfc/rfc1035.txt">RFC1035</a>
   */
  public static ImageId of(String image) {
    return new ImageId(null, image);
  }

  /**
   * Returns an image identity given project and image names. The image name must be 1-63 characters
   * long and comply with RFC1035. Specifically, the name must match the regular expression
   * {@code [a-z]([-a-z0-9]*[a-z0-9])?} which means the first character must be a lowercase letter,
   * and all following characters must be a dash, lowercase letter, or digit, except the last
   * character, which cannot be a dash.
   *
   * @see <a href="https://www.ietf.org/rfc/rfc1035.txt">RFC1035</a>
   */
  public static ImageId of(String project, String image) {
    return new ImageId(project, image);
  }

  /**
   * Returns {@code true} if the provided string matches the expected format of an image URL.
   * Returns {@code false} otherwise.
   */
  static boolean matchesUrl(String url) {
    return PATTERN.matcher(url).matches();
  }

  static ImageId fromUrl(String url) {
    Matcher matcher = PATTERN.matcher(url);
    if (!matcher.matches()) {
      throw new IllegalArgumentException(url + " is not a valid image URL");
    }
    return ImageId.of(matcher.group(1), matcher.group(2));
  }
}
