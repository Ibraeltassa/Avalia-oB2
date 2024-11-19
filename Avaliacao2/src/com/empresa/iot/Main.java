package com.empresa.iot;

public class Main {
    public static void main(String[] args) {
        // Acessando a instância única de GlobalConfig
        GlobalConfig config = GlobalConfig.getInstance();

        // Exibindo as configurações iniciais
        System.out.println("Device Name: " + config.getDeviceName());
        System.out.println("Network Address: " + config.getNetworkAddress());

        // Modificando as configurações
        config.setDeviceName("Sensor XYZ");
        config.setNetworkAddress("10.0.0.42");

        // Obtendo a instância novamente para verificar a consistência
        GlobalConfig sameConfig = GlobalConfig.getInstance();
        System.out.println("Updated Device Name: " + sameConfig.getDeviceName());
        System.out.println("Updated Network Address: " + sameConfig.getNetworkAddress());
    }
}
