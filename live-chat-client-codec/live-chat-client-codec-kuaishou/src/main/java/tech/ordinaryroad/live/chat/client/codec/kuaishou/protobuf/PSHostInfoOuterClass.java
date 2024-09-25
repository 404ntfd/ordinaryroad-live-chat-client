// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PSHostInfo.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class PSHostInfoOuterClass {
  private PSHostInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PSHostInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PSHostInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string ip = 1;</code>
     * @return The ip.
     */
    java.lang.String getIp();
    /**
     * <code>string ip = 1;</code>
     * @return The bytes for ip.
     */
    com.google.protobuf.ByteString
        getIpBytes();

    /**
     * <code>int32 port = 2;</code>
     * @return The port.
     */
    int getPort();
  }
  /**
   * Protobuf type {@code PSHostInfo}
   */
  public static final class PSHostInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PSHostInfo)
      PSHostInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PSHostInfo.newBuilder() to construct.
    private PSHostInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PSHostInfo() {
      ip_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PSHostInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.internal_static_PSHostInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.internal_static_PSHostInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo.Builder.class);
    }

    public static final int IP_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object ip_ = "";
    /**
     * <code>string ip = 1;</code>
     * @return The ip.
     */
    @java.lang.Override
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      }
    }
    /**
     * <code>string ip = 1;</code>
     * @return The bytes for ip.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private int port_ = 0;
    /**
     * <code>int32 port = 2;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
      }
      if (port_ != 0) {
        output.writeInt32(2, port_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
      }
      if (port_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, port_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo) obj;

      if (!getIp()
          .equals(other.getIp())) return false;
      if (getPort()
          != other.getPort()) return false;
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
      hash = (37 * hash) + IP_FIELD_NUMBER;
      hash = (53 * hash) + getIp().hashCode();
      hash = (37 * hash) + PORT_FIELD_NUMBER;
      hash = (53 * hash) + getPort();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo prototype) {
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
     * Protobuf type {@code PSHostInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PSHostInfo)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.internal_static_PSHostInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.internal_static_PSHostInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo.newBuilder()
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
        ip_ = "";
        port_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.internal_static_PSHostInfo_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ip_ = ip_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.port_ = port_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo.getDefaultInstance()) return this;
        if (!other.getIp().isEmpty()) {
          ip_ = other.ip_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getPort() != 0) {
          setPort(other.getPort());
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
                ip_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                port_ = input.readInt32();
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

      private java.lang.Object ip_ = "";
      /**
       * <code>string ip = 1;</code>
       * @return The ip.
       */
      public java.lang.String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ip_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string ip = 1;</code>
       * @return The bytes for ip.
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        java.lang.Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string ip = 1;</code>
       * @param value The ip to set.
       * @return This builder for chaining.
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ip_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string ip = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIp() {
        ip_ = getDefaultInstance().getIp();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string ip = 1;</code>
       * @param value The bytes for ip to set.
       * @return This builder for chaining.
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ip_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>int32 port = 2;</code>
       * @return The port.
       */
      @java.lang.Override
      public int getPort() {
        return port_;
      }
      /**
       * <code>int32 port = 2;</code>
       * @param value The port to set.
       * @return This builder for chaining.
       */
      public Builder setPort(int value) {

        port_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 port = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000002);
        port_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PSHostInfo)
    }

    // @@protoc_insertion_point(class_scope:PSHostInfo)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PSHostInfo>
        PARSER = new com.google.protobuf.AbstractParser<PSHostInfo>() {
      @java.lang.Override
      public PSHostInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PSHostInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PSHostInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PSHostInfoOuterClass.PSHostInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PSHostInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PSHostInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020PSHostInfo.proto\"&\n\nPSHostInfo\022\n\n\002ip\030\001" +
      " \001(\t\022\014\n\004port\030\002 \001(\005B<\n:tech.ordinaryroad." +
      "live.chat.client.codec.kuaishou.protobuf" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PSHostInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PSHostInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PSHostInfo_descriptor,
        new java.lang.String[] { "Ip", "Port", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
