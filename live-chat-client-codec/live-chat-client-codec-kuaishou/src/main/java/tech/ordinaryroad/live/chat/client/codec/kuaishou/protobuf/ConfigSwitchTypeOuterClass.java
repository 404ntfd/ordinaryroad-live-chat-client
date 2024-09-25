// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConfigSwitchType.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class ConfigSwitchTypeOuterClass {
  private ConfigSwitchTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ConfigSwitchType}
   */
  public enum ConfigSwitchType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>HIDE_BARRAGE = 1;</code>
     */
    HIDE_BARRAGE(1),
    /**
     * <code>HIDE_SPECIAL_EFFECT = 2;</code>
     */
    HIDE_SPECIAL_EFFECT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>HIDE_BARRAGE = 1;</code>
     */
    public static final int HIDE_BARRAGE_VALUE = 1;
    /**
     * <code>HIDE_SPECIAL_EFFECT = 2;</code>
     */
    public static final int HIDE_SPECIAL_EFFECT_VALUE = 2;


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
    public static ConfigSwitchType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConfigSwitchType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return HIDE_BARRAGE;
        case 2: return HIDE_SPECIAL_EFFECT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConfigSwitchType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConfigSwitchType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConfigSwitchType>() {
            public ConfigSwitchType findValueByNumber(int number) {
              return ConfigSwitchType.forNumber(number);
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
      return tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.ConfigSwitchTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConfigSwitchType[] VALUES = values();

    public static ConfigSwitchType valueOf(
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

    private ConfigSwitchType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ConfigSwitchType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ConfigSwitchType.proto*J\n\020ConfigSwitch" +
      "Type\022\013\n\007UNKNOWN\020\000\022\020\n\014HIDE_BARRAGE\020\001\022\027\n\023H" +
      "IDE_SPECIAL_EFFECT\020\002B<\n:tech.ordinaryroa" +
      "d.live.chat.client.codec.kuaishou.protob" +
      "ufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
