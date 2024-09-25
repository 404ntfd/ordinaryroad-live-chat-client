// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

/**
 * Protobuf type {@code GradeBuffInfo}
 */
public final class GradeBuffInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GradeBuffInfo)
    GradeBuffInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GradeBuffInfo.newBuilder() to construct.
  private GradeBuffInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GradeBuffInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GradeBuffInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Douyin.internal_static_GradeBuffInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Douyin.internal_static_GradeBuffInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo.class, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo)) {
      return super.equals(obj);
    }
    tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo other = (tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo parseFrom(
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
  public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo prototype) {
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
   * Protobuf type {@code GradeBuffInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GradeBuffInfo)
      tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Douyin.internal_static_GradeBuffInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Douyin.internal_static_GradeBuffInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo.class, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo.Builder.class);
    }

    // Construct using tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Douyin.internal_static_GradeBuffInfo_descriptor;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo getDefaultInstanceForType() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo.getDefaultInstance();
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo build() {
      tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo buildPartial() {
      tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo result = new tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo(this);
      onBuilt();
      return result;
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
      if (other instanceof tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo) {
        return mergeFrom((tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo other) {
      if (other == tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:GradeBuffInfo)
  }

  // @@protoc_insertion_point(class_scope:GradeBuffInfo)
  private static final tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo();
  }

  public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GradeBuffInfo>
      PARSER = new com.google.protobuf.AbstractParser<GradeBuffInfo>() {
    @java.lang.Override
    public GradeBuffInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<GradeBuffInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GradeBuffInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.GradeBuffInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

