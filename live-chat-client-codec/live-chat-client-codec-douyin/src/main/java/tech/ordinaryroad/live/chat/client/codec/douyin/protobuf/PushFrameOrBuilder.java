// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

public interface PushFrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PushFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 seqId = 1;</code>
   * @return The seqId.
   */
  long getSeqId();

  /**
   * <code>uint64 logId = 2;</code>
   * @return The logId.
   */
  long getLogId();

  /**
   * <code>uint64 service = 3;</code>
   * @return The service.
   */
  long getService();

  /**
   * <code>uint64 method = 4;</code>
   * @return The method.
   */
  long getMethod();

  /**
   * <code>repeated .HeadersList headersList = 5;</code>
   */
  java.util.List<tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.HeadersList> 
      getHeadersListList();
  /**
   * <code>repeated .HeadersList headersList = 5;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.HeadersList getHeadersList(int index);
  /**
   * <code>repeated .HeadersList headersList = 5;</code>
   */
  int getHeadersListCount();
  /**
   * <code>repeated .HeadersList headersList = 5;</code>
   */
  java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.HeadersListOrBuilder> 
      getHeadersListOrBuilderList();
  /**
   * <code>repeated .HeadersList headersList = 5;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.HeadersListOrBuilder getHeadersListOrBuilder(
      int index);

  /**
   * <code>string payloadEncoding = 6;</code>
   * @return The payloadEncoding.
   */
  java.lang.String getPayloadEncoding();
  /**
   * <code>string payloadEncoding = 6;</code>
   * @return The bytes for payloadEncoding.
   */
  com.google.protobuf.ByteString
      getPayloadEncodingBytes();

  /**
   * <code>string payloadType = 7;</code>
   * @return The payloadType.
   */
  java.lang.String getPayloadType();
  /**
   * <code>string payloadType = 7;</code>
   * @return The bytes for payloadType.
   */
  com.google.protobuf.ByteString
      getPayloadTypeBytes();

  /**
   * <code>bytes payload = 8;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}
