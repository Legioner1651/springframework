//package example.api;
//
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.api.ApIsApi;
//import io.swagger.client.auth.ApiKeyAuth;
//import io.swagger.client.model.InlineResponse200;
//import jdk.nashorn.internal.ir.annotations.Ignore;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//
//// learn more about whether api https://github.com/weatherapicom/java
//@Service
//public class WeatherApi {
//    public BigDecimal getTemperature(String city) {
//        ApiClient defaultClient = Configuration.getDefaultApiClient();
//
//        // Configure API key authorization: ApiKeyAuth
//        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
//        // Если истечет пробный период - можно зарегистрироваться на сайте и обновить ключ аутентификации
//        ApiKeyAuth.setApiKey("32eec07d2b1549138b283622231801");
//        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//        //ApiKeyAuth.setApiKeyPrefix("Token");
//
//        ApIsApi apiInstance = new ApIsApi();
//        String q = city; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
//        String lang = "ru"; // String | Returns 'condition:text' field in API in the desired language.<br /> Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
//        try {
//            InlineResponse200 result = apiInstance.realtimeWeather(q, lang);
//            System.out.println(result);
//            return result.getCurrent().getTempC();
//        } catch (ApiException e) {
//            System.err.println("Exception when calling ApIsApi#realtimeWeather");
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
