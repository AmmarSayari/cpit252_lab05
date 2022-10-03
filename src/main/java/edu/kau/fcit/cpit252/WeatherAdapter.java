package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;

public class WeatherAdapter implements WeatherGeo{

    private WeatherCity weatherCity;
    private GeoLocation geoLocation;

    public WeatherAdapter(WeatherCity weatherCity){

        this.weatherCity = weatherCity;
        this.geoLocation = new GeoLocation();
    }

    @Override
    public String getWeatherInfo(double latitude, double longitude) {

        String cityName = this.geoLocation.search(latitude,longitude);
        return this.weatherCity.getWeatherInfo(cityName);
    }
}
