package com.folksdev.weather.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//final diyip new leyerek nesne oluşturabilirz ama onun için de getter setter gerekiyor
//public static String API_URL;//static olduğu için yml dan okuyamaz ama bunun bir yöntemi var.Setter tanımlamak oradan proje çalışınca okuyup metoda atacak.
// valueWithSetter Injection design pattern kullanıldı.
public class Constants {

    public static String API_URL;

    public static String API_KEY;

    public static String ACCESS_KEY_PARAM = "?access_key=";

    public static String QUERY_KEY_PARAM = "&query==";


    @Value("${weather-stack.api-url}")

    public void setApiUrl(String apiUrl) {
        Constants.API_URL = apiUrl;
    }
    @Value("${weather-stack.api-key}")
    public void setApiKey(String apiKey) {
        Constants.API_KEY = apiKey;
    }
}
