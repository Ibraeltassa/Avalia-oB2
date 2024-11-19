package com.empresa.iot;

public class GlobalConfig {
    // Instância única da classe
    private static volatile GlobalConfig instance;

    // Atributos de configuração global
    private String deviceName;
    private String networkAddress;

    // Construtor privado para evitar instâncias externas
    private GlobalConfig() {
        this.deviceName = "Default Device";
        this.networkAddress = "192.168.0.1";
    }

    // Método público para acessar a instância única
    public static GlobalConfig getInstance() {
        if (instance == null) {
            synchronized (GlobalConfig.class) {
                if (instance == null) {
                    instance = new GlobalConfig();
                }
            }
        }
        return instance;
    }

    // Getters e Setters para as configurações
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getNetworkAddress() {
        return networkAddress;
    }

    public void setNetworkAddress(String networkAddress) {
        this.networkAddress = networkAddress;
    }
}
