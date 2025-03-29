package cn.langya.bjd_api.data;

import lombok.Data;

import java.util.Map;

/**
 * BedWars 模式数据存储类
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class BedWarsModeData {
    private Map<String, Integer> use_item;
    private int bed_destory;
    private int game;
    private Map<String, Integer> upgrade;
    private int final_kills;
    private int lose;
    private int bed_lose;
    private int win;
    private int deaths;
}
