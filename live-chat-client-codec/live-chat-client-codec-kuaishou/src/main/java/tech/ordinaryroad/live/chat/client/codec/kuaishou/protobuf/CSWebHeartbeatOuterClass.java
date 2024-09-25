// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CSWebHeartbeat.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class CSWebHeartbeatOuterClass {
  private CSWebHeartbeatOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CSWebHeartbeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CSWebHeartbeat)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 timestamp = 1;</code>
     * @return The timestamp.
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code CSWebHeartbeat}
   */
  public static final class CSWebHeartbeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CSWebHeartbeat)
      CSWebHeartbeatOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CSWebHeartbeat.newBuilder() to construct.
    private CSWebHeartbeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CSWebHeartbeat() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CSWebHeartbeat();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.internal_static_CSWebHeartbeat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.internal_static_CSWebHeartbeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_ = 0L;
    /**
     * <code>uint64 timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
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
      if (timestamp_ != 0L) {
        output.writeUInt64(1, timestamp_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, timestamp_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat) obj;

      if (getTimestamp()
          != other.getTimestamp()) return false;
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat prototype) {
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
     * Protobuf type {@code CSWebHeartbeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CSWebHeartbeat)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.internal_static_CSWebHeartbeat_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.internal_static_CSWebHeartbeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat.newBuilder()
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
        timestamp_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.internal_static_CSWebHeartbeat_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timestamp_ = timestamp_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
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
              case 8: {
                timestamp_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

      private long timestamp_ ;
      /**
       * <code>uint64 timestamp = 1;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>uint64 timestamp = 1;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {

        timestamp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 timestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CSWebHeartbeat)
    }

    // @@protoc_insertion_point(class_scope:CSWebHeartbeat)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CSWebHeartbeat>
        PARSER = new com.google.protobuf.AbstractParser<CSWebHeartbeat>() {
      @java.lang.Override
      public CSWebHeartbeat parsePartialFrom(
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

    public static com.google.protobuf.Parser<CSWebHeartbeat> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSWebHeartbeat> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSWebHeartbeatOuterClass.CSWebHeartbeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CSWebHeartbeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CSWebHeartbeat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CSWebHeartbeat.proto\"#\n\016CSWebHeartbeat" +
      "\022\021\n\ttimestamp\030\001 \001(\004B<\n:tech.ordinaryroad" +
      ".live.chat.client.codec.kuaishou.protobu" +
      "fb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CSWebHeartbeat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CSWebHeartbeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CSWebHeartbeat_descriptor,
        new java.lang.String[] { "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
