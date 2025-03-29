package cn.langya.bjd_api.data;

import lombok.Data;

/**
 * Leaderboard 数据存储类
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class LeaderboardData {
    private boolean banned; // 玩家是否被封禁
    private LeaderboardEntry result;  // 竞技场战绩数据
}

