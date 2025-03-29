package cn.langya.bjd_api;

import cn.langya.bjd_api.data.LeaderboardData;
import com.google.gson.Gson;

/**
 * @author LangYa466
 * @since 3/29/2025
 */
public class LeaderboardService {
    private final ApiClient apiClient;
    private final Gson gson;

    public LeaderboardService(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.gson = new Gson();
    }

    public LeaderboardData getLeaderboard(String lbType) throws Exception {
        String jsonBody = String.format("{\"lb_type\":\"%s\"}", lbType);
        String response = apiClient.post("/leaderboard", jsonBody);
        return gson.fromJson(response, LeaderboardData.class);
    }

    public LeaderboardData getUserLeaderboard(String username) throws Exception {
        String jsonBody = String.format("{\"username\":\"%s\"}", username);
        String response = apiClient.post("/leaderboard", jsonBody);
        return gson.fromJson(response, LeaderboardData.class);
    }
}