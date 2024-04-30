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
// source: CSPing.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class CSPingOuterClass {
  private CSPingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CSPingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CSPing)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string echoData = 1;</code>
     * @return The echoData.
     */
    java.lang.String getEchoData();
    /**
     * <code>string echoData = 1;</code>
     * @return The bytes for echoData.
     */
    com.google.protobuf.ByteString
        getEchoDataBytes();

    /**
     * <code>.ClientId clientId = 2;</code>
     * @return The enum numeric value on the wire for clientId.
     */
    int getClientIdValue();
    /**
     * <code>.ClientId clientId = 2;</code>
     * @return The clientId.
     */
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId getClientId();

    /**
     * <code>string deviceId = 3;</code>
     * @return The deviceId.
     */
    java.lang.String getDeviceId();
    /**
     * <code>string deviceId = 3;</code>
     * @return The bytes for deviceId.
     */
    com.google.protobuf.ByteString
        getDeviceIdBytes();

    /**
     * <code>string appVer = 4;</code>
     * @return The appVer.
     */
    java.lang.String getAppVer();
    /**
     * <code>string appVer = 4;</code>
     * @return The bytes for appVer.
     */
    com.google.protobuf.ByteString
        getAppVerBytes();
  }
  /**
   * Protobuf type {@code CSPing}
   */
  public static final class CSPing extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CSPing)
      CSPingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CSPing.newBuilder() to construct.
    private CSPing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CSPing() {
      echoData_ = "";
      clientId_ = 0;
      deviceId_ = "";
      appVer_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CSPing();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.internal_static_CSPing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.internal_static_CSPing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing.Builder.class);
    }

    public static final int ECHODATA_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object echoData_ = "";
    /**
     * <code>string echoData = 1;</code>
     * @return The echoData.
     */
    @java.lang.Override
    public java.lang.String getEchoData() {
      java.lang.Object ref = echoData_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        echoData_ = s;
        return s;
      }
    }
    /**
     * <code>string echoData = 1;</code>
     * @return The bytes for echoData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEchoDataBytes() {
      java.lang.Object ref = echoData_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        echoData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTID_FIELD_NUMBER = 2;
    private int clientId_ = 0;
    /**
     * <code>.ClientId clientId = 2;</code>
     * @return The enum numeric value on the wire for clientId.
     */
    @java.lang.Override public int getClientIdValue() {
      return clientId_;
    }
    /**
     * <code>.ClientId clientId = 2;</code>
     * @return The clientId.
     */
    @java.lang.Override public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId getClientId() {
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId result = tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId.forNumber(clientId_);
      return result == null ? tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId.UNRECOGNIZED : result;
    }

    public static final int DEVICEID_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object deviceId_ = "";
    /**
     * <code>string deviceId = 3;</code>
     * @return The deviceId.
     */
    @java.lang.Override
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      }
    }
    /**
     * <code>string deviceId = 3;</code>
     * @return The bytes for deviceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APPVER_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object appVer_ = "";
    /**
     * <code>string appVer = 4;</code>
     * @return The appVer.
     */
    @java.lang.Override
    public java.lang.String getAppVer() {
      java.lang.Object ref = appVer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appVer_ = s;
        return s;
      }
    }
    /**
     * <code>string appVer = 4;</code>
     * @return The bytes for appVer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAppVerBytes() {
      java.lang.Object ref = appVer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appVer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(echoData_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, echoData_);
      }
      if (clientId_ != tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId.NONE.getNumber()) {
        output.writeEnum(2, clientId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deviceId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appVer_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, appVer_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(echoData_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, echoData_);
      }
      if (clientId_ != tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId.NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, clientId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deviceId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appVer_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, appVer_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing) obj;

      if (!getEchoData()
          .equals(other.getEchoData())) return false;
      if (clientId_ != other.clientId_) return false;
      if (!getDeviceId()
          .equals(other.getDeviceId())) return false;
      if (!getAppVer()
          .equals(other.getAppVer())) return false;
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
      hash = (37 * hash) + ECHODATA_FIELD_NUMBER;
      hash = (53 * hash) + getEchoData().hashCode();
      hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
      hash = (53 * hash) + clientId_;
      hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceId().hashCode();
      hash = (37 * hash) + APPVER_FIELD_NUMBER;
      hash = (53 * hash) + getAppVer().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing prototype) {
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
     * Protobuf type {@code CSPing}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CSPing)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.internal_static_CSPing_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.internal_static_CSPing_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing.newBuilder()
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
        echoData_ = "";
        clientId_ = 0;
        deviceId_ = "";
        appVer_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.internal_static_CSPing_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.echoData_ = echoData_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.clientId_ = clientId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.deviceId_ = deviceId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.appVer_ = appVer_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing.getDefaultInstance()) return this;
        if (!other.getEchoData().isEmpty()) {
          echoData_ = other.echoData_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.clientId_ != 0) {
          setClientIdValue(other.getClientIdValue());
        }
        if (!other.getDeviceId().isEmpty()) {
          deviceId_ = other.deviceId_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getAppVer().isEmpty()) {
          appVer_ = other.appVer_;
          bitField0_ |= 0x00000008;
          onChanged();
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
                echoData_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                clientId_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                deviceId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                appVer_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private java.lang.Object echoData_ = "";
      /**
       * <code>string echoData = 1;</code>
       * @return The echoData.
       */
      public java.lang.String getEchoData() {
        java.lang.Object ref = echoData_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          echoData_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string echoData = 1;</code>
       * @return The bytes for echoData.
       */
      public com.google.protobuf.ByteString
          getEchoDataBytes() {
        java.lang.Object ref = echoData_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          echoData_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string echoData = 1;</code>
       * @param value The echoData to set.
       * @return This builder for chaining.
       */
      public Builder setEchoData(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        echoData_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string echoData = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEchoData() {
        echoData_ = getDefaultInstance().getEchoData();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string echoData = 1;</code>
       * @param value The bytes for echoData to set.
       * @return This builder for chaining.
       */
      public Builder setEchoDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        echoData_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int clientId_ = 0;
      /**
       * <code>.ClientId clientId = 2;</code>
       * @return The enum numeric value on the wire for clientId.
       */
      @java.lang.Override public int getClientIdValue() {
        return clientId_;
      }
      /**
       * <code>.ClientId clientId = 2;</code>
       * @param value The enum numeric value on the wire for clientId to set.
       * @return This builder for chaining.
       */
      public Builder setClientIdValue(int value) {
        clientId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ClientId clientId = 2;</code>
       * @return The clientId.
       */
      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId getClientId() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId result = tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId.forNumber(clientId_);
        return result == null ? tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId.UNRECOGNIZED : result;
      }
      /**
       * <code>.ClientId clientId = 2;</code>
       * @param value The clientId to set.
       * @return This builder for chaining.
       */
      public Builder setClientId(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.ClientId value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        clientId_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ClientId clientId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        clientId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object deviceId_ = "";
      /**
       * <code>string deviceId = 3;</code>
       * @return The deviceId.
       */
      public java.lang.String getDeviceId() {
        java.lang.Object ref = deviceId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          deviceId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string deviceId = 3;</code>
       * @return The bytes for deviceId.
       */
      public com.google.protobuf.ByteString
          getDeviceIdBytes() {
        java.lang.Object ref = deviceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string deviceId = 3;</code>
       * @param value The deviceId to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        deviceId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string deviceId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeviceId() {
        deviceId_ = getDefaultInstance().getDeviceId();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string deviceId = 3;</code>
       * @param value The bytes for deviceId to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        deviceId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object appVer_ = "";
      /**
       * <code>string appVer = 4;</code>
       * @return The appVer.
       */
      public java.lang.String getAppVer() {
        java.lang.Object ref = appVer_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          appVer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string appVer = 4;</code>
       * @return The bytes for appVer.
       */
      public com.google.protobuf.ByteString
          getAppVerBytes() {
        java.lang.Object ref = appVer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appVer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string appVer = 4;</code>
       * @param value The appVer to set.
       * @return This builder for chaining.
       */
      public Builder setAppVer(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        appVer_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string appVer = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppVer() {
        appVer_ = getDefaultInstance().getAppVer();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string appVer = 4;</code>
       * @param value The bytes for appVer to set.
       * @return This builder for chaining.
       */
      public Builder setAppVerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        appVer_ = value;
        bitField0_ |= 0x00000008;
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


      // @@protoc_insertion_point(builder_scope:CSPing)
    }

    // @@protoc_insertion_point(class_scope:CSPing)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CSPing>
        PARSER = new com.google.protobuf.AbstractParser<CSPing>() {
      @java.lang.Override
      public CSPing parsePartialFrom(
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

    public static com.google.protobuf.Parser<CSPing> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSPing> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.CSPingOuterClass.CSPing getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CSPing_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CSPing_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014CSPing.proto\032\016ClientId.proto\"Y\n\006CSPing" +
      "\022\020\n\010echoData\030\001 \001(\t\022\033\n\010clientId\030\002 \001(\0162\t.C" +
      "lientId\022\020\n\010deviceId\030\003 \001(\t\022\016\n\006appVer\030\004 \001(" +
      "\tB<\n:tech.ordinaryroad.live.chat.client." +
      "codec.kuaishou.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.getDescriptor(),
        });
    internal_static_CSPing_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CSPing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CSPing_descriptor,
        new java.lang.String[] { "EchoData", "ClientId", "DeviceId", "AppVer", });
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ClientIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
