package com.inaction.consul.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    /**
     * Redis当前连接数
     */
    private Integer connections;

    /**
     * Redis Master地址
     */
    private String masterHost;

    /**
     * Redis Slave地址
     */
    private String slaveHost;

    /**
     * Redis Sentinel集群
     */
    private String sentinelCluster;

    public Integer getConnections() {
        return connections;
    }

    public void setConnections(Integer connections) {
        this.connections = connections;
    }

    public String getMasterHost() {
        return masterHost;
    }

    public void setMasterHost(String masterHost) {
        this.masterHost = masterHost;
    }

    public String getSlaveHost() {
        return slaveHost;
    }

    public void setSlaveHost(String slaveHost) {
        this.slaveHost = slaveHost;
    }

    public String getSentinelCluster() {
        return sentinelCluster;
    }

    public void setSentinelCluster(String sentinelCluster) {
        this.sentinelCluster = sentinelCluster;
    }

    @Override
    public String toString() {
        return "RedisProperties{" +
                "connections=" + connections +
                ", masterHost='" + masterHost + '\'' +
                ", slaveHost='" + slaveHost + '\'' +
                ", sentinelCluster='" + sentinelCluster + '\'' +
                '}';
    }
}