package cn.langya.bjd_api.data;

import lombok.Data;

import java.util.List;

/**
 * Leaderboard 条目数据存储类
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class LeaderboardEntry {
    private int rank; // 排名
    private String username; // 玩家昵称
    private int score; // 玩家得分
    private String gametype; // 游戏类型 如: arenapvp
    private List<String> achievements; // 玩家成就
}
