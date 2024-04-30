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
// source: LiveFansGroupState.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class LiveFansGroupStateOuterClass {
  private LiveFansGroupStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LiveFansGroupStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LiveFansGroupState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 intimacyLevel = 1;</code>
     * @return The intimacyLevel.
     */
    int getIntimacyLevel();

    /**
     * <code>uint32 enterRoomSpecialEffect = 2;</code>
     * @return The enterRoomSpecialEffect.
     */
    int getEnterRoomSpecialEffect();
  }
  /**
   * Protobuf type {@code LiveFansGroupState}
   */
  public static final class LiveFansGroupState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LiveFansGroupState)
      LiveFansGroupStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LiveFansGroupState.newBuilder() to construct.
    private LiveFansGroupState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LiveFansGroupState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LiveFansGroupState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.internal_static_LiveFansGroupState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.internal_static_LiveFansGroupState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState.Builder.class);
    }

    public static final int INTIMACYLEVEL_FIELD_NUMBER = 1;
    private int intimacyLevel_ = 0;
    /**
     * <code>uint32 intimacyLevel = 1;</code>
     * @return The intimacyLevel.
     */
    @java.lang.Override
    public int getIntimacyLevel() {
      return intimacyLevel_;
    }

    public static final int ENTERROOMSPECIALEFFECT_FIELD_NUMBER = 2;
    private int enterRoomSpecialEffect_ = 0;
    /**
     * <code>uint32 enterRoomSpecialEffect = 2;</code>
     * @return The enterRoomSpecialEffect.
     */
    @java.lang.Override
    public int getEnterRoomSpecialEffect() {
      return enterRoomSpecialEffect_;
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
      if (intimacyLevel_ != 0) {
        output.writeUInt32(1, intimacyLevel_);
      }
      if (enterRoomSpecialEffect_ != 0) {
        output.writeUInt32(2, enterRoomSpecialEffect_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (intimacyLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, intimacyLevel_);
      }
      if (enterRoomSpecialEffect_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, enterRoomSpecialEffect_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState) obj;

      if (getIntimacyLevel()
          != other.getIntimacyLevel()) return false;
      if (getEnterRoomSpecialEffect()
          != other.getEnterRoomSpecialEffect()) return false;
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
      hash = (37 * hash) + INTIMACYLEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getIntimacyLevel();
      hash = (37 * hash) + ENTERROOMSPECIALEFFECT_FIELD_NUMBER;
      hash = (53 * hash) + getEnterRoomSpecialEffect();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState prototype) {
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
     * Protobuf type {@code LiveFansGroupState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LiveFansGroupState)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.internal_static_LiveFansGroupState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.internal_static_LiveFansGroupState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState.newBuilder()
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
        intimacyLevel_ = 0;
        enterRoomSpecialEffect_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.internal_static_LiveFansGroupState_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.intimacyLevel_ = intimacyLevel_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.enterRoomSpecialEffect_ = enterRoomSpecialEffect_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState.getDefaultInstance()) return this;
        if (other.getIntimacyLevel() != 0) {
          setIntimacyLevel(other.getIntimacyLevel());
        }
        if (other.getEnterRoomSpecialEffect() != 0) {
          setEnterRoomSpecialEffect(other.getEnterRoomSpecialEffect());
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
                intimacyLevel_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                enterRoomSpecialEffect_ = input.readUInt32();
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

      private int intimacyLevel_ ;
      /**
       * <code>uint32 intimacyLevel = 1;</code>
       * @return The intimacyLevel.
       */
      @java.lang.Override
      public int getIntimacyLevel() {
        return intimacyLevel_;
      }
      /**
       * <code>uint32 intimacyLevel = 1;</code>
       * @param value The intimacyLevel to set.
       * @return This builder for chaining.
       */
      public Builder setIntimacyLevel(int value) {

        intimacyLevel_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 intimacyLevel = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIntimacyLevel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        intimacyLevel_ = 0;
        onChanged();
        return this;
      }

      private int enterRoomSpecialEffect_ ;
      /**
       * <code>uint32 enterRoomSpecialEffect = 2;</code>
       * @return The enterRoomSpecialEffect.
       */
      @java.lang.Override
      public int getEnterRoomSpecialEffect() {
        return enterRoomSpecialEffect_;
      }
      /**
       * <code>uint32 enterRoomSpecialEffect = 2;</code>
       * @param value The enterRoomSpecialEffect to set.
       * @return This builder for chaining.
       */
      public Builder setEnterRoomSpecialEffect(int value) {

        enterRoomSpecialEffect_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enterRoomSpecialEffect = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterRoomSpecialEffect() {
        bitField0_ = (bitField0_ & ~0x00000002);
        enterRoomSpecialEffect_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LiveFansGroupState)
    }

    // @@protoc_insertion_point(class_scope:LiveFansGroupState)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LiveFansGroupState>
        PARSER = new com.google.protobuf.AbstractParser<LiveFansGroupState>() {
      @java.lang.Override
      public LiveFansGroupState parsePartialFrom(
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

    public static com.google.protobuf.Parser<LiveFansGroupState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LiveFansGroupState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.LiveFansGroupStateOuterClass.LiveFansGroupState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LiveFansGroupState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LiveFansGroupState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030LiveFansGroupState.proto\"K\n\022LiveFansGr" +
      "oupState\022\025\n\rintimacyLevel\030\001 \001(\r\022\036\n\026enter" +
      "RoomSpecialEffect\030\002 \001(\rB<\n:tech.ordinary" +
      "road.live.chat.client.codec.kuaishou.pro" +
      "tobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LiveFansGroupState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LiveFansGroupState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LiveFansGroupState_descriptor,
        new java.lang.String[] { "IntimacyLevel", "EnterRoomSpecialEffect", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
