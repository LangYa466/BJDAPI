package cn.langya.bjd_api.data;

import lombok.Data;

/**
 * VillageDefenseResult 存储玩家在游戏中的表现统计数据。
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class VillageDefenseResult {
    private int wins;
    private int kills;
    private int highestWave;
    private int level;
    private int gamesPlayed;
    private int nextLevelExp;
    private String name;
    private int loses;
    private int exp;
    private String uuid;
    private int deaths;
}
