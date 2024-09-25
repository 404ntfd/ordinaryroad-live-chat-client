// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

public interface EffectConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EffectConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 type = 1;</code>
   * @return The type.
   */
  long getType();

  /**
   * <code>.Image icon = 2;</code>
   * @return Whether the icon field is set.
   */
  boolean hasIcon();
  /**
   * <code>.Image icon = 2;</code>
   * @return The icon.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Image getIcon();
  /**
   * <code>.Image icon = 2;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageOrBuilder getIconOrBuilder();

  /**
   * <code>uint64 avatarPos = 3;</code>
   * @return The avatarPos.
   */
  long getAvatarPos();

  /**
   * <code>.Text text = 4;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>.Text text = 4;</code>
   * @return The text.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Text getText();
  /**
   * <code>.Text text = 4;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.TextOrBuilder getTextOrBuilder();

  /**
   * <code>.Image textIcon = 5;</code>
   * @return Whether the textIcon field is set.
   */
  boolean hasTextIcon();
  /**
   * <code>.Image textIcon = 5;</code>
   * @return The textIcon.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Image getTextIcon();
  /**
   * <code>.Image textIcon = 5;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageOrBuilder getTextIconOrBuilder();

  /**
   * <code>uint32 stayTime = 6;</code>
   * @return The stayTime.
   */
  int getStayTime();

  /**
   * <code>uint64 animAssetId = 7;</code>
   * @return The animAssetId.
   */
  long getAnimAssetId();

  /**
   * <code>.Image badge = 8;</code>
   * @return Whether the badge field is set.
   */
  boolean hasBadge();
  /**
   * <code>.Image badge = 8;</code>
   * @return The badge.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Image getBadge();
  /**
   * <code>.Image badge = 8;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageOrBuilder getBadgeOrBuilder();

  /**
   * <code>repeated uint64 flexSettingArrayList = 9;</code>
   * @return A list containing the flexSettingArrayList.
   */
  java.util.List<java.lang.Long> getFlexSettingArrayListList();
  /**
   * <code>repeated uint64 flexSettingArrayList = 9;</code>
   * @return The count of flexSettingArrayList.
   */
  int getFlexSettingArrayListCount();
  /**
   * <code>repeated uint64 flexSettingArrayList = 9;</code>
   * @param index The index of the element to return.
   * @return The flexSettingArrayList at the given index.
   */
  long getFlexSettingArrayList(int index);

  /**
   * <code>.Image textIconOverlay = 10;</code>
   * @return Whether the textIconOverlay field is set.
   */
  boolean hasTextIconOverlay();
  /**
   * <code>.Image textIconOverlay = 10;</code>
   * @return The textIconOverlay.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Image getTextIconOverlay();
  /**
   * <code>.Image textIconOverlay = 10;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageOrBuilder getTextIconOverlayOrBuilder();

  /**
   * <code>.Image animatedBadge = 11;</code>
   * @return Whether the animatedBadge field is set.
   */
  boolean hasAnimatedBadge();
  /**
   * <code>.Image animatedBadge = 11;</code>
   * @return The animatedBadge.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Image getAnimatedBadge();
  /**
   * <code>.Image animatedBadge = 11;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageOrBuilder getAnimatedBadgeOrBuilder();

  /**
   * <code>bool hasSweepLight = 12;</code>
   * @return The hasSweepLight.
   */
  boolean getHasSweepLight();

  /**
   * <code>repeated uint64 textFlexSettingArrayList = 13;</code>
   * @return A list containing the textFlexSettingArrayList.
   */
  java.util.List<java.lang.Long> getTextFlexSettingArrayListList();
  /**
   * <code>repeated uint64 textFlexSettingArrayList = 13;</code>
   * @return The count of textFlexSettingArrayList.
   */
  int getTextFlexSettingArrayListCount();
  /**
   * <code>repeated uint64 textFlexSettingArrayList = 13;</code>
   * @param index The index of the element to return.
   * @return The textFlexSettingArrayList at the given index.
   */
  long getTextFlexSettingArrayList(int index);

  /**
   * <code>uint64 centerAnimAssetId = 14;</code>
   * @return The centerAnimAssetId.
   */
  long getCenterAnimAssetId();

  /**
   * <code>.Image dynamicImage = 15;</code>
   * @return Whether the dynamicImage field is set.
   */
  boolean hasDynamicImage();
  /**
   * <code>.Image dynamicImage = 15;</code>
   * @return The dynamicImage.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Image getDynamicImage();
  /**
   * <code>.Image dynamicImage = 15;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.ImageOrBuilder getDynamicImageOrBuilder();

  /**
   * <code>map&lt;string, string&gt; extraMap = 16;</code>
   */
  int getExtraMapCount();
  /**
   * <code>map&lt;string, string&gt; extraMap = 16;</code>
   */
  boolean containsExtraMap(
      java.lang.String key);
  /**
   * Use {@link #getExtraMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getExtraMap();
  /**
   * <code>map&lt;string, string&gt; extraMap = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getExtraMapMap();
  /**
   * <code>map&lt;string, string&gt; extraMap = 16;</code>
   */
  /* nullable */
java.lang.String getExtraMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; extraMap = 16;</code>
   */
  java.lang.String getExtraMapOrThrow(
      java.lang.String key);

  /**
   * <code>uint64 mp4AnimAssetId = 17;</code>
   * @return The mp4AnimAssetId.
   */
  long getMp4AnimAssetId();

  /**
   * <code>uint64 priority = 18;</code>
   * @return The priority.
   */
  long getPriority();

  /**
   * <code>uint64 maxWaitTime = 19;</code>
   * @return The maxWaitTime.
   */
  long getMaxWaitTime();

  /**
   * <code>string dressId = 20;</code>
   * @return The dressId.
   */
  java.lang.String getDressId();
  /**
   * <code>string dressId = 20;</code>
   * @return The bytes for dressId.
   */
  com.google.protobuf.ByteString
      getDressIdBytes();

  /**
   * <code>uint64 alignment = 21;</code>
   * @return The alignment.
   */
  long getAlignment();

  /**
   * <code>uint64 alignmentOffset = 22;</code>
   * @return The alignmentOffset.
   */
  long getAlignmentOffset();
}
