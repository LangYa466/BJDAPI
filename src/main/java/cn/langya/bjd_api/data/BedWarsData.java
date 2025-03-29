package cn.langya.bjd_api.data;

import lombok.Data;

import java.util.Map;

/**
 * BedWars 数据存储类
 *
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class BedWarsData {
    private String _id;
    private String name;
    private boolean banned;
    private Map<String, BedWarsModeData> bedwars;
}

