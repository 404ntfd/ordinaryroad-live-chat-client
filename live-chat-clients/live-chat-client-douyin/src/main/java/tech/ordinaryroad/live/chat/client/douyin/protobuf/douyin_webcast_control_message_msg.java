/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_webcast_control_message_msg.proto

package tech.ordinaryroad.live.chat.client.douyin.protobuf;

/**
 * Protobuf type {@code tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg}
 */
public final class douyin_webcast_control_message_msg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg)
    douyin_webcast_control_message_msgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use douyin_webcast_control_message_msg.newBuilder() to construct.
  private douyin_webcast_control_message_msg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private douyin_webcast_control_message_msg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new douyin_webcast_control_message_msg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_webcast_control_message_msg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_webcast_control_message_msg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg.class, tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg.Builder.class);
  }

  public static final int COMMON_FIELD_NUMBER = 1;
  private tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common common_;
  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return common_ != null;
  }
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common getCommon() {
    return common_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.getDefaultInstance() : common_;
  }
  /**
   * <code>.Common common = 1;</code>
   */
  @java.lang.Override
  public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.CommonOrBuilder getCommonOrBuilder() {
    return common_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.getDefaultInstance() : common_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_ = 0;
  /**
   * <code>int32 status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (common_ != null) {
      output.writeMessage(1, getCommon());
    }
    if (status_ != 0) {
      output.writeInt32(2, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (common_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommon());
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, status_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg)) {
      return super.equals(obj);
    }
    tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg other = (tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (getStatus()
        != other.getStatus()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg)
      tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_webcast_control_message_msg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_webcast_control_message_msg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg.class, tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg.Builder.class);
    }

    // Construct using tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      status_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_webcast_control_message_msg_descriptor;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg getDefaultInstanceForType() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg.getDefaultInstance();
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg build() {
      tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg buildPartial() {
      tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg result = new tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = commonBuilder_ == null
            ? common_
            : commonBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg) {
        return mergeFrom((tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg other) {
      if (other == tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getCommonFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              status_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common common_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.CommonOrBuilder> commonBuilder_;
    /**
     * <code>.Common common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Common common = 1;</code>
     * @return The common.
     */
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
      } else {
        commonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(
        tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder mergeCommon(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common value) {
      if (commonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          common_ != null &&
          common_ != tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.getDefaultInstance()) {
          getCommonBuilder().mergeFrom(value);
        } else {
          common_ = value;
        }
      } else {
        commonBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder clearCommon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.Builder getCommonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.CommonOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.getDefaultInstance() : common_;
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.CommonOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.CommonOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private int status_ ;
    /**
     * <code>int32 status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {

      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg)
  }

  // @@protoc_insertion_point(class_scope:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg)
  private static final tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg();
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<douyin_webcast_control_message_msg>
      PARSER = new com.google.protobuf.AbstractParser<douyin_webcast_control_message_msg>() {
    @java.lang.Override
    public douyin_webcast_control_message_msg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<douyin_webcast_control_message_msg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<douyin_webcast_control_message_msg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_webcast_control_message_msg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

