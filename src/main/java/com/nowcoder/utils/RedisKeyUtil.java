package com.nowcoder.utils;

public class RedisKeyUtil {
    private final static String SPLIT = ":";
    private final static String BUZ_LIKE = "LIKE";
    private final static String BUZ_DISLIKE = "DISLIKE";
    private final static String BUZ_EVENT = "EVENT";

    public static String getEventQueueKey() {
        return BUZ_EVENT;
    }

    public static String getLikeKey(int entityType, int entityId) {
        return BUZ_LIKE + SPLIT + String.valueOf(entityType) + SPLIT + String.valueOf(entityId);
    }

    public static String getDisLikeKey(int entityType, int entityId) {
        return BUZ_DISLIKE + SPLIT + String.valueOf(entityType) + SPLIT + String.valueOf(entityId);
    }
}
