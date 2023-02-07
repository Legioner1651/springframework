//package example.service;
//
//import example.api.WeatherApi;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
////@Service
//public class WeatherService {
//    private final WeatherApi weatherApi;
//
//    public String whatWhetherToday(String city) {
//        long temperature = weatherApi.getTemperature(city).longValue();
//        if (temperature < -30) {
//            return "Жутко холодно";
//        }
//        if (temperature < -20) {
//            return "Очеь холодно";
//        }
//        if (temperature < -10) {
//            return "Холодно";
//        }
//        if (temperature < 0) {
//            return "Ниже 0";
//        }
//        if (temperature < 10) {
//            return "Прохладно";
//        }
//        if (temperature < 20) {
//            return "Нормально";
//        }
//        if (temperature < 30) {
//            return "Тепло";
//        }
//        if (temperature < 40) {
//            return "Очень жарко";
//        }
//        return "Духовка!";
//    }
//}
