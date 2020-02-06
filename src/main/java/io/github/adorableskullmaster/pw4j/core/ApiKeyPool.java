package io.github.adorableskullmaster.pw4j.core;

import io.github.adorableskullmaster.pw4j.PoliticsAndWar;
import io.github.adorableskullmaster.pw4j.PoliticsAndWarAPIException;

import java.util.Arrays;
import java.util.HashMap;

public class ApiKeyPool {
    private String[] apiKeyPool;
    private Integer[] usageStats;
    private int nextIndex;

    public ApiKeyPool(String[] apiKeyPool) {
        this.apiKeyPool = apiKeyPool;
        usageStats = new Integer[apiKeyPool.length];
        Arrays.fill(usageStats,0);
        this.nextIndex = 0;

        if(apiKeyPool.length == 0)
            throw new PoliticsAndWarAPIException("No API Key provided. Make sure apiKeyPool array is not empty");
    }

    public String getNextApiKey() {
        if(nextIndex == apiKeyPool.length)
            nextIndex = 0;

        usageStats[nextIndex] += 1;
        return apiKeyPool[nextIndex++];
    }

    public HashMap<String, Integer> getStats() {
        HashMap<String,Integer> stats = new HashMap<>();

        for(int i = 0; i < apiKeyPool.length; i++)
            stats.put(apiKeyPool[i],usageStats[i]);

        return stats;
    }
}
