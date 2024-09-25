// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SCWebSuspectedViolation.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class SCWebSuspectedViolationOuterClass {
  private SCWebSuspectedViolationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SCWebSuspectedViolationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SCWebSuspectedViolation)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool suspectedViolation = 1;</code>
     * @return The suspectedViolation.
     */
    boolean getSuspectedViolation();
  }
  /**
   * Protobuf type {@code SCWebSuspectedViolation}
   */
  public static final class SCWebSuspectedViolation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SCWebSuspectedViolation)
      SCWebSuspectedViolationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SCWebSuspectedViolation.newBuilder() to construct.
    private SCWebSuspectedViolation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SCWebSuspectedViolation() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SCWebSuspectedViolation();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.internal_static_SCWebSuspectedViolation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.internal_static_SCWebSuspectedViolation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation.Builder.class);
    }

    public static final int SUSPECTEDVIOLATION_FIELD_NUMBER = 1;
    private boolean suspectedViolation_ = false;
    /**
     * <code>bool suspectedViolation = 1;</code>
     * @return The suspectedViolation.
     */
    @java.lang.Override
    public boolean getSuspectedViolation() {
      return suspectedViolation_;
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
      if (suspectedViolation_ != false) {
        output.writeBool(1, suspectedViolation_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (suspectedViolation_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, suspectedViolation_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation) obj;

      if (getSuspectedViolation()
          != other.getSuspectedViolation()) return false;
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
      hash = (37 * hash) + SUSPECTEDVIOLATION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuspectedViolation());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation prototype) {
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
     * Protobuf type {@code SCWebSuspectedViolation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SCWebSuspectedViolation)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.internal_static_SCWebSuspectedViolation_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.internal_static_SCWebSuspectedViolation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation.newBuilder()
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
        suspectedViolation_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.internal_static_SCWebSuspectedViolation_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.suspectedViolation_ = suspectedViolation_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation.getDefaultInstance()) return this;
        if (other.getSuspectedViolation() != false) {
          setSuspectedViolation(other.getSuspectedViolation());
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
                suspectedViolation_ = input.readBool();
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

      private boolean suspectedViolation_ ;
      /**
       * <code>bool suspectedViolation = 1;</code>
       * @return The suspectedViolation.
       */
      @java.lang.Override
      public boolean getSuspectedViolation() {
        return suspectedViolation_;
      }
      /**
       * <code>bool suspectedViolation = 1;</code>
       * @param value The suspectedViolation to set.
       * @return This builder for chaining.
       */
      public Builder setSuspectedViolation(boolean value) {

        suspectedViolation_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool suspectedViolation = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuspectedViolation() {
        bitField0_ = (bitField0_ & ~0x00000001);
        suspectedViolation_ = false;
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


      // @@protoc_insertion_point(builder_scope:SCWebSuspectedViolation)
    }

    // @@protoc_insertion_point(class_scope:SCWebSuspectedViolation)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SCWebSuspectedViolation>
        PARSER = new com.google.protobuf.AbstractParser<SCWebSuspectedViolation>() {
      @java.lang.Override
      public SCWebSuspectedViolation parsePartialFrom(
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

    public static com.google.protobuf.Parser<SCWebSuspectedViolation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SCWebSuspectedViolation> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebSuspectedViolationOuterClass.SCWebSuspectedViolation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SCWebSuspectedViolation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SCWebSuspectedViolation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SCWebSuspectedViolation.proto\"5\n\027SCWeb" +
      "SuspectedViolation\022\032\n\022suspectedViolation" +
      "\030\001 \001(\010B<\n:tech.ordinaryroad.live.chat.cl" +
      "ient.codec.kuaishou.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SCWebSuspectedViolation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SCWebSuspectedViolation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SCWebSuspectedViolation_descriptor,
        new java.lang.String[] { "SuspectedViolation", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
