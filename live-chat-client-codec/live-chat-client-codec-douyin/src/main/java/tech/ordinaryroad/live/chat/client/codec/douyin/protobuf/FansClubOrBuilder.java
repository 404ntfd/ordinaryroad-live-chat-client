// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

public interface FansClubOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FansClub)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.FansClubData data = 1;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.FansClubData data = 1;</code>
   * @return The data.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.FansClubData getData();
  /**
   * <code>.FansClubData data = 1;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.FansClubDataOrBuilder getDataOrBuilder();

  /**
   * <code>map&lt;int32, .FansClubData&gt; preferData = 2;</code>
   */
  int getPreferDataCount();
  /**
   * <code>map&lt;int32, .FansClubData&gt; preferData = 2;</code>
   */
  boolean containsPreferData(
      int key);
  /**
   * Use {@link #getPreferDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.FansClubData>
  getPreferData();
  /**
   * <code>map&lt;int32, .FansClubData&gt; preferData = 2;</code>
   */
  java.util.Map<java.lang.Integer, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.FansClubData>
  getPreferDataMap();
  /**
   * <code>map&lt;int32, .FansClubData&gt; preferData = 2;</code>
   */
  /* nullable */
tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.FansClubData getPreferDataOrDefault(
      int key,
      /* nullable */
tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.FansClubData defaultValue);
  /**
   * <code>map&lt;int32, .FansClubData&gt; preferData = 2;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.FansClubData getPreferDataOrThrow(
      int key);
}
