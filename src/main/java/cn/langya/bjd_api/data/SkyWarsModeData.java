package cn.langya.bjd_api.data;

import lombok.Data;

import java.util.Map;

/**
 * SkyWars 模式数据存储类
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class SkyWarsModeData {
    private int kills;
    private int projectileKills;
    private Map<String, Integer> use_item;
    private int game;
    private Map<String, Integer> special_item;
    private int lose;
    private int win;
    private int deaths;
    private SkyWarsEffect effect;
}
