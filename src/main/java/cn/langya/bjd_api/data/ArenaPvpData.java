package cn.langya.bjd_api.data;

import lombok.Data;

/**
 * PVP 数据存储类
 * @author LangYa466
 * @since 3/29/2025
 */
@Data
public class ArenaPvpData {
    private boolean banned;
    private ArenaPvpResult result;
    private int ttl;
}

