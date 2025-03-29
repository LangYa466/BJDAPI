package cn.langya;

import cn.langya.bjd_api.*;
import cn.langya.bjd_api.data.*;

public class Main {
    public static void main(String[] args) {
        try {
            ApiClient apiClient = new ApiClient("your-secret-key");

            // 初始化服务
            PlayerDataService playerService = new PlayerDataService(apiClient);
            LeaderboardService leaderboardService = new LeaderboardService(apiClient);

            // 获取起床战争数据
            BedWarsData bedWarsData = playerService.getBedWarsData("irkt", "all");
            System.out.println("Player: " + bedWarsData.getName() + ", Banned: " + bedWarsData.isBanned());

            // 获取空岛战争数据
            SkyWarsData skyWarsData = playerService.getSkyWarsData("irkt", "all");
            System.out.println("SkyWars Solo Wins: " + skyWarsData.getSkywars().get("solo").getWin());

            // 获取村庄守卫战数据
            VillageDefenseData villageData = playerService.getVillageDefenseData("irkt");
            System.out.println("Highest Wave: " + villageData.getResult().getHighestWave());

            // 获取竞技场数据
            ArenaPvpData arenaData = playerService.getArenaPvpData("");
            System.out.println("Global ELO: " + arenaData.getResult().getGlobalElo());

            // 获取排名数据
            LeaderboardData leaderboardData = leaderboardService.getLeaderboard("arenapvp");
            System.out.println("Leaderboard Type: " + leaderboardData.getResult().getGametype());
            System.out.println("Top Player: " + leaderboardData.getResult().getUsername() +
                    " | Rank: " + leaderboardData.getResult().getRank() +
                    " | Score: " + leaderboardData.getResult().getScore());

            // 获取特定玩家的排名
            LeaderboardData userLeaderboardData = leaderboardService.getUserLeaderboard("irkt");
            System.out.println("xsvf's Rank: " + userLeaderboardData.getResult().getRank() +
                    " | Score: " + userLeaderboardData.getResult().getScore());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
