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
// source: SCWebCurrentRedPackFeed.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class SCWebCurrentRedPackFeedOuterClass {
  private SCWebCurrentRedPackFeedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SCWebCurrentRedPackFeedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SCWebCurrentRedPackFeed)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    java.util.List<tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo> 
        getRedPackList();
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo getRedPack(int index);
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    int getRedPackCount();
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder> 
        getRedPackOrBuilderList();
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder getRedPackOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code SCWebCurrentRedPackFeed}
   */
  public static final class SCWebCurrentRedPackFeed extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SCWebCurrentRedPackFeed)
      SCWebCurrentRedPackFeedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SCWebCurrentRedPackFeed.newBuilder() to construct.
    private SCWebCurrentRedPackFeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SCWebCurrentRedPackFeed() {
      redPack_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SCWebCurrentRedPackFeed();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.internal_static_SCWebCurrentRedPackFeed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.internal_static_SCWebCurrentRedPackFeed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed.Builder.class);
    }

    public static final int REDPACK_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo> redPack_;
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    @java.lang.Override
    public java.util.List<tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo> getRedPackList() {
      return redPack_;
    }
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder> 
        getRedPackOrBuilderList() {
      return redPack_;
    }
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    @java.lang.Override
    public int getRedPackCount() {
      return redPack_.size();
    }
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo getRedPack(int index) {
      return redPack_.get(index);
    }
    /**
     * <code>repeated .WebRedPackInfo redPack = 1;</code>
     */
    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder getRedPackOrBuilder(
        int index) {
      return redPack_.get(index);
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
      for (int i = 0; i < redPack_.size(); i++) {
        output.writeMessage(1, redPack_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < redPack_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, redPack_.get(i));
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed other = (tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed) obj;

      if (!getRedPackList()
          .equals(other.getRedPackList())) return false;
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
      if (getRedPackCount() > 0) {
        hash = (37 * hash) + REDPACK_FIELD_NUMBER;
        hash = (53 * hash) + getRedPackList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed prototype) {
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
     * Protobuf type {@code SCWebCurrentRedPackFeed}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SCWebCurrentRedPackFeed)
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.internal_static_SCWebCurrentRedPackFeed_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.internal_static_SCWebCurrentRedPackFeed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed.class, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed.newBuilder()
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
        if (redPackBuilder_ == null) {
          redPack_ = java.util.Collections.emptyList();
        } else {
          redPack_ = null;
          redPackBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.internal_static_SCWebCurrentRedPackFeed_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed build() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed result = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed result) {
        if (redPackBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            redPack_ = java.util.Collections.unmodifiableList(redPack_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.redPack_ = redPack_;
        } else {
          result.redPack_ = redPackBuilder_.build();
        }
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed.getDefaultInstance()) return this;
        if (redPackBuilder_ == null) {
          if (!other.redPack_.isEmpty()) {
            if (redPack_.isEmpty()) {
              redPack_ = other.redPack_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRedPackIsMutable();
              redPack_.addAll(other.redPack_);
            }
            onChanged();
          }
        } else {
          if (!other.redPack_.isEmpty()) {
            if (redPackBuilder_.isEmpty()) {
              redPackBuilder_.dispose();
              redPackBuilder_ = null;
              redPack_ = other.redPack_;
              bitField0_ = (bitField0_ & ~0x00000001);
              redPackBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRedPackFieldBuilder() : null;
            } else {
              redPackBuilder_.addAllMessages(other.redPack_);
            }
          }
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
                tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo m =
                    input.readMessage(
                        tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.parser(),
                        extensionRegistry);
                if (redPackBuilder_ == null) {
                  ensureRedPackIsMutable();
                  redPack_.add(m);
                } else {
                  redPackBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo> redPack_ =
        java.util.Collections.emptyList();
      private void ensureRedPackIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          redPack_ = new java.util.ArrayList<tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo>(redPack_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder> redPackBuilder_;

      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public java.util.List<tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo> getRedPackList() {
        if (redPackBuilder_ == null) {
          return java.util.Collections.unmodifiableList(redPack_);
        } else {
          return redPackBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public int getRedPackCount() {
        if (redPackBuilder_ == null) {
          return redPack_.size();
        } else {
          return redPackBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo getRedPack(int index) {
        if (redPackBuilder_ == null) {
          return redPack_.get(index);
        } else {
          return redPackBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder setRedPack(
          int index, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo value) {
        if (redPackBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRedPackIsMutable();
          redPack_.set(index, value);
          onChanged();
        } else {
          redPackBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder setRedPack(
          int index, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder builderForValue) {
        if (redPackBuilder_ == null) {
          ensureRedPackIsMutable();
          redPack_.set(index, builderForValue.build());
          onChanged();
        } else {
          redPackBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder addRedPack(tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo value) {
        if (redPackBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRedPackIsMutable();
          redPack_.add(value);
          onChanged();
        } else {
          redPackBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder addRedPack(
          int index, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo value) {
        if (redPackBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRedPackIsMutable();
          redPack_.add(index, value);
          onChanged();
        } else {
          redPackBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder addRedPack(
          tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder builderForValue) {
        if (redPackBuilder_ == null) {
          ensureRedPackIsMutable();
          redPack_.add(builderForValue.build());
          onChanged();
        } else {
          redPackBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder addRedPack(
          int index, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder builderForValue) {
        if (redPackBuilder_ == null) {
          ensureRedPackIsMutable();
          redPack_.add(index, builderForValue.build());
          onChanged();
        } else {
          redPackBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder addAllRedPack(
          java.lang.Iterable<? extends tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo> values) {
        if (redPackBuilder_ == null) {
          ensureRedPackIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, redPack_);
          onChanged();
        } else {
          redPackBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder clearRedPack() {
        if (redPackBuilder_ == null) {
          redPack_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          redPackBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public Builder removeRedPack(int index) {
        if (redPackBuilder_ == null) {
          ensureRedPackIsMutable();
          redPack_.remove(index);
          onChanged();
        } else {
          redPackBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder getRedPackBuilder(
          int index) {
        return getRedPackFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder getRedPackOrBuilder(
          int index) {
        if (redPackBuilder_ == null) {
          return redPack_.get(index);  } else {
          return redPackBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder> 
           getRedPackOrBuilderList() {
        if (redPackBuilder_ != null) {
          return redPackBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(redPack_);
        }
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder addRedPackBuilder() {
        return getRedPackFieldBuilder().addBuilder(
            tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder addRedPackBuilder(
          int index) {
        return getRedPackFieldBuilder().addBuilder(
            index, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WebRedPackInfo redPack = 1;</code>
       */
      public java.util.List<tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder> 
           getRedPackBuilderList() {
        return getRedPackFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder> 
          getRedPackFieldBuilder() {
        if (redPackBuilder_ == null) {
          redPackBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfo.Builder, tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.WebRedPackInfoOrBuilder>(
                  redPack_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          redPack_ = null;
        }
        return redPackBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SCWebCurrentRedPackFeed)
    }

    // @@protoc_insertion_point(class_scope:SCWebCurrentRedPackFeed)
    private static final tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed();
    }

    public static tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SCWebCurrentRedPackFeed>
        PARSER = new com.google.protobuf.AbstractParser<SCWebCurrentRedPackFeed>() {
      @java.lang.Override
      public SCWebCurrentRedPackFeed parsePartialFrom(
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

    public static com.google.protobuf.Parser<SCWebCurrentRedPackFeed> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SCWebCurrentRedPackFeed> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebCurrentRedPackFeedOuterClass.SCWebCurrentRedPackFeed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SCWebCurrentRedPackFeed_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SCWebCurrentRedPackFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SCWebCurrentRedPackFeed.proto\032\024WebRedP" +
      "ackInfo.proto\";\n\027SCWebCurrentRedPackFeed" +
      "\022 \n\007redPack\030\001 \003(\0132\017.WebRedPackInfoB<\n:te" +
      "ch.ordinaryroad.live.chat.client.codec.k" +
      "uaishou.protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.getDescriptor(),
        });
    internal_static_SCWebCurrentRedPackFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SCWebCurrentRedPackFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SCWebCurrentRedPackFeed_descriptor,
        new java.lang.String[] { "RedPack", });
    tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.WebRedPackInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
