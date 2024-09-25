// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

public interface ImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string urlListList = 1;</code>
   * @return A list containing the urlListList.
   */
  java.util.List<java.lang.String>
      getUrlListListList();
  /**
   * <code>repeated string urlListList = 1;</code>
   * @return The count of urlListList.
   */
  int getUrlListListCount();
  /**
   * <code>repeated string urlListList = 1;</code>
   * @param index The index of the element to return.
   * @return The urlListList at the given index.
   */
  java.lang.String getUrlListList(int index);
  /**
   * <code>repeated string urlListList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the urlListList at the given index.
   */
  com.google.protobuf.ByteString
      getUrlListListBytes(int index);

  /**
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <code>uint64 height = 3;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>uint64 width = 4;</code>
   * @return The width.
   */
  long getWidth();

  /**
   * <code>string avgColor = 5;</code>
   * @return The avgColor.
   */
  java.lang.String getAvgColor();
  /**
   * <code>string avgColor = 5;</code>
   * @return The bytes for avgColor.
   */
  com.google.protobuf.ByteString
      getAvgColorBytes();

  /**
   * <code>uint32 imageType = 6;</code>
   * @return The imageType.
   */
  int getImageType();

  /**
   * <code>string openWebUrl = 7;</code>
   * @return The openWebUrl.
   */
  java.lang.String getOpenWebUrl();
  /**
   * <code>string openWebUrl = 7;</code>
   * @return The bytes for openWebUrl.
   */
  com.google.protobuf.ByteString
      getOpenWebUrlBytes();

  /**
   * <code>.ImageContent content = 8;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>.ImageContent content = 8;</code>
   * @return The content.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageContent getContent();
  /**
   * <code>.ImageContent content = 8;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageContentOrBuilder getContentOrBuilder();

  /**
   * <code>bool isAnimated = 9;</code>
   * @return The isAnimated.
   */
  boolean getIsAnimated();

  /**
   * <code>.NinePatchSetting FlexSettingList = 10;</code>
   * @return Whether the flexSettingList field is set.
   */
  boolean hasFlexSettingList();
  /**
   * <code>.NinePatchSetting FlexSettingList = 10;</code>
   * @return The flexSettingList.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.NinePatchSetting getFlexSettingList();
  /**
   * <code>.NinePatchSetting FlexSettingList = 10;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.NinePatchSettingOrBuilder getFlexSettingListOrBuilder();

  /**
   * <code>.NinePatchSetting TextSettingList = 11;</code>
   * @return Whether the textSettingList field is set.
   */
  boolean hasTextSettingList();
  /**
   * <code>.NinePatchSetting TextSettingList = 11;</code>
   * @return The textSettingList.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.NinePatchSetting getTextSettingList();
  /**
   * <code>.NinePatchSetting TextSettingList = 11;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.NinePatchSettingOrBuilder getTextSettingListOrBuilder();
}
