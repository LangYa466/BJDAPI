package cn.langya.bjd_api.data;

import lombok.Data;

import java.util.Map;

/**
 * SkyWars 数据存储类
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class SkyWarsData {
    private String _id;
    private String name;
    private boolean banned;
    private Map<String, SkyWarsModeData> skywars;
}

