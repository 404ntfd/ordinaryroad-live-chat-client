// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SCWebGuessClosed.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class SCWebGuessClosedOuterClass {
  private SCWebGuessClosedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SCWebGuessClosedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SCWebGuessClosed)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 time = 1;</code>
     * @return The time.
     */
    long getTime();

    /**
     * <code>string guessId = 2;</code>
     * @return The guessId.
     */
    java.lang.String getGuessId();
    /**
     * <code>string guessId = 2;</code>
     * @return The bytes for guessId.
     */
    com.google.protobuf.ByteString
        getGuessIdBytes();

    /**
     * <code>uint64 displayMaxDelayMillis = 3;</code>
     * @return The displayMaxDelayMillis.
     */
    long getDisplayMaxDelayMillis();
  }
  /**
   * Protobuf type {@code SCWebGuessClosed}
   */
  public static final class SCWebGuessClosed extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SCWebGuessClosed)
      SCWebGuessClosedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SCWebGuessClosed.newBuilder() to construct.
    private SCWebGuessClosed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SCWebGuessClosed() {
      guessId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SCWebGuessClosed();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.internal_static_SCWebGuessClosed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.internal_static_SCWebGuessClosed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed.Builder.class);
    }

    public static final int TIME_FIELD_NUMBER = 1;
    private long time_ = 0L;
    /**
     * <code>uint64 time = 1;</code>
     * @return The time.
     */
    @java.lang.Override
    public long getTime() {
      return time_;
    }

    public static final int GUESSID_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object guessId_ = "";
    /**
     * <code>string guessId = 2;</code>
     * @return The guessId.
     */
    @java.lang.Override
    public java.lang.String getGuessId() {
      java.lang.Object ref = guessId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        guessId_ = s;
        return s;
      }
    }
    /**
     * <code>string guessId = 2;</code>
     * @return The bytes for guessId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGuessIdBytes() {
      java.lang.Object ref = guessId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guessId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DISPLAYMAXDELAYMILLIS_FIELD_NUMBER = 3;
    private long displayMaxDelayMillis_ = 0L;
    /**
     * <code>uint64 displayMaxDelayMillis = 3;</code>
     * @return The displayMaxDelayMillis.
     */
    @java.lang.Override
    public long getDisplayMaxDelayMillis() {
      return displayMaxDelayMillis_;
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
      if (time_ != 0L) {
        output.writeUInt64(1, time_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guessId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, guessId_);
      }
      if (displayMaxDelayMillis_ != 0L) {
        output.writeUInt64(3, displayMaxDelayMillis_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, time_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guessId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, guessId_);
      }
      if (displayMaxDelayMillis_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, displayMaxDelayMillis_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed) obj;

      if (getTime()
          != other.getTime()) return false;
      if (!getGuessId()
          .equals(other.getGuessId())) return false;
      if (getDisplayMaxDelayMillis()
          != other.getDisplayMaxDelayMillis()) return false;
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
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (37 * hash) + GUESSID_FIELD_NUMBER;
      hash = (53 * hash) + getGuessId().hashCode();
      hash = (37 * hash) + DISPLAYMAXDELAYMILLIS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDisplayMaxDelayMillis());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed prototype) {
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
     * Protobuf type {@code SCWebGuessClosed}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SCWebGuessClosed)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.internal_static_SCWebGuessClosed_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.internal_static_SCWebGuessClosed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed.newBuilder()
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
        time_ = 0L;
        guessId_ = "";
        displayMaxDelayMillis_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.internal_static_SCWebGuessClosed_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.time_ = time_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.guessId_ = guessId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.displayMaxDelayMillis_ = displayMaxDelayMillis_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed.getDefaultInstance()) return this;
        if (other.getTime() != 0L) {
          setTime(other.getTime());
        }
        if (!other.getGuessId().isEmpty()) {
          guessId_ = other.guessId_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getDisplayMaxDelayMillis() != 0L) {
          setDisplayMaxDelayMillis(other.getDisplayMaxDelayMillis());
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
                time_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                guessId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                displayMaxDelayMillis_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private long time_ ;
      /**
       * <code>uint64 time = 1;</code>
       * @return The time.
       */
      @java.lang.Override
      public long getTime() {
        return time_;
      }
      /**
       * <code>uint64 time = 1;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(long value) {

        time_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object guessId_ = "";
      /**
       * <code>string guessId = 2;</code>
       * @return The guessId.
       */
      public java.lang.String getGuessId() {
        java.lang.Object ref = guessId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          guessId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string guessId = 2;</code>
       * @return The bytes for guessId.
       */
      public com.google.protobuf.ByteString
          getGuessIdBytes() {
        java.lang.Object ref = guessId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          guessId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string guessId = 2;</code>
       * @param value The guessId to set.
       * @return This builder for chaining.
       */
      public Builder setGuessId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        guessId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string guessId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuessId() {
        guessId_ = getDefaultInstance().getGuessId();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string guessId = 2;</code>
       * @param value The bytes for guessId to set.
       * @return This builder for chaining.
       */
      public Builder setGuessIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        guessId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private long displayMaxDelayMillis_ ;
      /**
       * <code>uint64 displayMaxDelayMillis = 3;</code>
       * @return The displayMaxDelayMillis.
       */
      @java.lang.Override
      public long getDisplayMaxDelayMillis() {
        return displayMaxDelayMillis_;
      }
      /**
       * <code>uint64 displayMaxDelayMillis = 3;</code>
       * @param value The displayMaxDelayMillis to set.
       * @return This builder for chaining.
       */
      public Builder setDisplayMaxDelayMillis(long value) {

        displayMaxDelayMillis_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 displayMaxDelayMillis = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDisplayMaxDelayMillis() {
        bitField0_ = (bitField0_ & ~0x00000004);
        displayMaxDelayMillis_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SCWebGuessClosed)
    }

    // @@protoc_insertion_point(class_scope:SCWebGuessClosed)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SCWebGuessClosed>
        PARSER = new com.google.protobuf.AbstractParser<SCWebGuessClosed>() {
      @java.lang.Override
      public SCWebGuessClosed parsePartialFrom(
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

    public static com.google.protobuf.Parser<SCWebGuessClosed> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SCWebGuessClosed> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebGuessClosedOuterClass.SCWebGuessClosed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SCWebGuessClosed_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SCWebGuessClosed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SCWebGuessClosed.proto\"P\n\020SCWebGuessCl" +
      "osed\022\014\n\004time\030\001 \001(\004\022\017\n\007guessId\030\002 \001(\t\022\035\n\025d" +
      "isplayMaxDelayMillis\030\003 \001(\004B<\n:tech.ordin" +
      "aryroad.live.chat.client.codec.kuaishou." +
      "protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SCWebGuessClosed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SCWebGuessClosed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SCWebGuessClosed_descriptor,
        new java.lang.String[] { "Time", "GuessId", "DisplayMaxDelayMillis", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
