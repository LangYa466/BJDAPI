package cn.langya.bjd_api.data;

import lombok.Data;

/**
 * VillageDefenseData 存储游戏中玩家的防御数据。
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class VillageDefenseData {
    private boolean banned;
    private VillageDefenseResult result;
    private int ttl;
}

