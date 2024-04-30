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
// source: SocketMessage.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class SocketMessageOuterClass {
  private SocketMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SocketMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SocketMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PayloadType payloadType = 1;</code>
     * @return The enum numeric value on the wire for payloadType.
     */
    int getPayloadTypeValue();
    /**
     * <code>.PayloadType payloadType = 1;</code>
     * @return The payloadType.
     */
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType getPayloadType();

    /**
     * <code>.SocketMessage.CompressionType compressionType = 2;</code>
     * @return The enum numeric value on the wire for compressionType.
     */
    int getCompressionTypeValue();
    /**
     * <code>.SocketMessage.CompressionType compressionType = 2;</code>
     * @return The compressionType.
     */
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType getCompressionType();

    /**
     * <code>bytes payload = 3;</code>
     * @return The payload.
     */
    com.google.protobuf.ByteString getPayload();
  }
  /**
   * Protobuf type {@code SocketMessage}
   */
  public static final class SocketMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SocketMessage)
      SocketMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SocketMessage.newBuilder() to construct.
    private SocketMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SocketMessage() {
      payloadType_ = 0;
      compressionType_ = 0;
      payload_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SocketMessage();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.internal_static_SocketMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.internal_static_SocketMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.Builder.class);
    }

    /**
     * Protobuf enum {@code SocketMessage.CompressionType}
     */
    public enum CompressionType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>NONE = 1;</code>
       */
      NONE(1),
      /**
       * <code>GZIP = 2;</code>
       */
      GZIP(2),
      /**
       * <code>AES = 3;</code>
       */
      AES(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>NONE = 1;</code>
       */
      public static final int NONE_VALUE = 1;
      /**
       * <code>GZIP = 2;</code>
       */
      public static final int GZIP_VALUE = 2;
      /**
       * <code>AES = 3;</code>
       */
      public static final int AES_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CompressionType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CompressionType forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return NONE;
          case 2: return GZIP;
          case 3: return AES;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CompressionType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CompressionType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CompressionType>() {
              public CompressionType findValueByNumber(int number) {
                return CompressionType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final CompressionType[] VALUES = values();

      public static CompressionType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private CompressionType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SocketMessage.CompressionType)
    }

    public static final int PAYLOADTYPE_FIELD_NUMBER = 1;
    private int payloadType_ = 0;
    /**
     * <code>.PayloadType payloadType = 1;</code>
     * @return The enum numeric value on the wire for payloadType.
     */
    @java.lang.Override public int getPayloadTypeValue() {
      return payloadType_;
    }
    /**
     * <code>.PayloadType payloadType = 1;</code>
     * @return The payloadType.
     */
    @java.lang.Override public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType getPayloadType() {
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType result = tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType.forNumber(payloadType_);
      return result == null ? tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType.UNRECOGNIZED : result;
    }

    public static final int COMPRESSIONTYPE_FIELD_NUMBER = 2;
    private int compressionType_ = 0;
    /**
     * <code>.SocketMessage.CompressionType compressionType = 2;</code>
     * @return The enum numeric value on the wire for compressionType.
     */
    @java.lang.Override public int getCompressionTypeValue() {
      return compressionType_;
    }
    /**
     * <code>.SocketMessage.CompressionType compressionType = 2;</code>
     * @return The compressionType.
     */
    @java.lang.Override public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType getCompressionType() {
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType result = tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType.forNumber(compressionType_);
      return result == null ? tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType.UNRECOGNIZED : result;
    }

    public static final int PAYLOAD_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 3;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
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
      if (payloadType_ != tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType.UNKNOWN.getNumber()) {
        output.writeEnum(1, payloadType_);
      }
      if (compressionType_ != tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType.UNKNOWN.getNumber()) {
        output.writeEnum(2, compressionType_);
      }
      if (!payload_.isEmpty()) {
        output.writeBytes(3, payload_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (payloadType_ != tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, payloadType_);
      }
      if (compressionType_ != tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, compressionType_);
      }
      if (!payload_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, payload_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage) obj;

      if (payloadType_ != other.payloadType_) return false;
      if (compressionType_ != other.compressionType_) return false;
      if (!getPayload()
          .equals(other.getPayload())) return false;
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
      hash = (37 * hash) + PAYLOADTYPE_FIELD_NUMBER;
      hash = (53 * hash) + payloadType_;
      hash = (37 * hash) + COMPRESSIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + compressionType_;
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage prototype) {
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
     * Protobuf type {@code SocketMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SocketMessage)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.internal_static_SocketMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.internal_static_SocketMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.newBuilder()
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
        payloadType_ = 0;
        compressionType_ = 0;
        payload_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.internal_static_SocketMessage_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.payloadType_ = payloadType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.compressionType_ = compressionType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.payload_ = payload_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.getDefaultInstance()) return this;
        if (other.payloadType_ != 0) {
          setPayloadTypeValue(other.getPayloadTypeValue());
        }
        if (other.compressionType_ != 0) {
          setCompressionTypeValue(other.getCompressionTypeValue());
        }
        if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
          setPayload(other.getPayload());
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
                payloadType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                compressionType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                payload_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

      private int payloadType_ = 0;
      /**
       * <code>.PayloadType payloadType = 1;</code>
       * @return The enum numeric value on the wire for payloadType.
       */
      @java.lang.Override public int getPayloadTypeValue() {
        return payloadType_;
      }
      /**
       * <code>.PayloadType payloadType = 1;</code>
       * @param value The enum numeric value on the wire for payloadType to set.
       * @return This builder for chaining.
       */
      public Builder setPayloadTypeValue(int value) {
        payloadType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.PayloadType payloadType = 1;</code>
       * @return The payloadType.
       */
      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType getPayloadType() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType result = tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType.forNumber(payloadType_);
        return result == null ? tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType.UNRECOGNIZED : result;
      }
      /**
       * <code>.PayloadType payloadType = 1;</code>
       * @param value The payloadType to set.
       * @return This builder for chaining.
       */
      public Builder setPayloadType(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.PayloadType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        payloadType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PayloadType payloadType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPayloadType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        payloadType_ = 0;
        onChanged();
        return this;
      }

      private int compressionType_ = 0;
      /**
       * <code>.SocketMessage.CompressionType compressionType = 2;</code>
       * @return The enum numeric value on the wire for compressionType.
       */
      @java.lang.Override public int getCompressionTypeValue() {
        return compressionType_;
      }
      /**
       * <code>.SocketMessage.CompressionType compressionType = 2;</code>
       * @param value The enum numeric value on the wire for compressionType to set.
       * @return This builder for chaining.
       */
      public Builder setCompressionTypeValue(int value) {
        compressionType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.SocketMessage.CompressionType compressionType = 2;</code>
       * @return The compressionType.
       */
      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType getCompressionType() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType result = tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType.forNumber(compressionType_);
        return result == null ? tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.SocketMessage.CompressionType compressionType = 2;</code>
       * @param value The compressionType to set.
       * @return This builder for chaining.
       */
      public Builder setCompressionType(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage.CompressionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        compressionType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SocketMessage.CompressionType compressionType = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCompressionType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        compressionType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes payload = 3;</code>
       * @return The payload.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <code>bytes payload = 3;</code>
       * @param value The payload to set.
       * @return This builder for chaining.
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        payload_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bytes payload = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPayload() {
        bitField0_ = (bitField0_ & ~0x00000004);
        payload_ = getDefaultInstance().getPayload();
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


      // @@protoc_insertion_point(builder_scope:SocketMessage)
    }

    // @@protoc_insertion_point(class_scope:SocketMessage)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SocketMessage>
        PARSER = new com.google.protobuf.AbstractParser<SocketMessage>() {
      @java.lang.Override
      public SocketMessage parsePartialFrom(
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

    public static com.google.protobuf.Parser<SocketMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SocketMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SocketMessageOuterClass.SocketMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SocketMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SocketMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SocketMessage.proto\032\021PayloadType.proto" +
      "\"\271\001\n\rSocketMessage\022!\n\013payloadType\030\001 \001(\0162" +
      "\014.PayloadType\0227\n\017compressionType\030\002 \001(\0162\036" +
      ".SocketMessage.CompressionType\022\017\n\007payloa" +
      "d\030\003 \001(\014\";\n\017CompressionType\022\013\n\007UNKNOWN\020\000\022" +
      "\010\n\004NONE\020\001\022\010\n\004GZIP\020\002\022\007\n\003AES\020\003B<\n:tech.ord" +
      "inaryroad.live.chat.client.codec.kuaisho" +
      "u.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.getDescriptor(),
        });
    internal_static_SocketMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SocketMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SocketMessage_descriptor,
        new java.lang.String[] { "PayloadType", "CompressionType", "Payload", });
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.PayloadTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
