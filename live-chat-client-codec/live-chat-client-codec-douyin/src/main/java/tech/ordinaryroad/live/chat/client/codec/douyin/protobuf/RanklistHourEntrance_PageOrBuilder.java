// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

public interface RanklistHourEntrance_PageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RanklistHourEntrance_Page)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Content of the page
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * Content of the page
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * Background color of the page
   * </pre>
   *
   * <code>string background_color = 2;</code>
   * @return The backgroundColor.
   */
  java.lang.String getBackgroundColor();
  /**
   * <pre>
   * Background color of the page
   * </pre>
   *
   * <code>string background_color = 2;</code>
   * @return The bytes for backgroundColor.
   */
  com.google.protobuf.ByteString
      getBackgroundColorBytes();

  /**
   * <pre>
   * Number of times the page is shown (or similar)
   * </pre>
   *
   * <code>int64 show_times = 3;</code>
   * @return The showTimes.
   */
  long getShowTimes();

  /**
   * <pre>
   * Type of the content
   * </pre>
   *
   * <code>int32 content_type = 4;</code>
   * @return The contentType.
   */
  int getContentType();
}
