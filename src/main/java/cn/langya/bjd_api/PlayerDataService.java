package cn.langya.bjd_api;

import cn.langya.bjd_api.data.ArenaPvpData;
import cn.langya.bjd_api.data.BedWarsData;
import cn.langya.bjd_api.data.SkyWarsData;
import cn.langya.bjd_api.data.VillageDefenseData;
import com.google.gson.Gson;

/**
 * @author LangYa466
 * @since 3/29/2025
 */
public class PlayerDataService {
    private final ApiClient apiClient;
    private final Gson gson;

    public PlayerDataService(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.gson = new Gson();
    }

    public BedWarsData getBedWarsData(String username, String subtype) throws Exception {
        String jsonBody = String.format("{\"username\":\"%s\",\"gametype\":\"bedwars\",\"subtype\":\"%s\"}", username, subtype == null ? "all" : subtype);
        String response = apiClient.post("/gamestats", jsonBody);
        return gson.fromJson(response, BedWarsData.class);
    }

    public SkyWarsData getSkyWarsData(String username, String subtype) throws Exception {
        String jsonBody = String.format("{\"username\":\"%s\",\"gametype\":\"skywars\",\"subtype\":\"%s\"}", username, subtype == null ? "all" : subtype);
        String response = apiClient.post("/gamestats", jsonBody);
        return gson.fromJson(response, SkyWarsData.class);
    }

    public VillageDefenseData getVillageDefenseData(String username) throws Exception {
        String jsonBody = String.format("{\"username\":\"%s\",\"gametype\":\"vdefense\"}", username);
        String response = apiClient.post("/gamestats", jsonBody);
        return gson.fromJson(response, VillageDefenseData.class);
    }

    public ArenaPvpData getArenaPvpData(String username) throws Exception {
        String jsonBody = String.format("{\"username\":\"%s\",\"gametype\":\"arenapvp\"}", username);
        String response = apiClient.post("/gamestats", jsonBody);
        return gson.fromJson(response, ArenaPvpData.class);
    }
}