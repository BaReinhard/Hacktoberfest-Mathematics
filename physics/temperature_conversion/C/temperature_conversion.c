#include <stdio.h>
#include <math.h>


// Program for converting temperature between Celsius, Kelvin and Fahrenheit
// Created by Damir Zeric (https://github.com/Dankmir)


float CelsiusToKelvin(float celsiusTemperature) {
	return (celsiusTemperature + 273.15);
}
float KelvinToCelsius(float kelvinTemperature) {
	return (kelvinTemperature - 273.15);
}
float CelsiusToFahrenheit(float celsiusTemperature) {
	return (celsiusTemperature*1.8 + 32);
}
float FahrenheitToCelsius(float fahrenheitTemperature) {
	return ((fahrenheitTemperature - 32)/1.8);
}
float KelvinToFahrenheit(float kelvinTemperature) {
	return(kelvinTemperature*1.8 - 459.67);
}
float FahrenheitToKelvin(float fahrenheitTemperature) {
	return ((fahrenheitTemperature + 459.67)/1.8);
}

void main() {
	// Temperatures we will use for conversion
	float celsius = 32;
	float kelvin = 318;
	float celToKelv, kelToCel, celToFah, fahToCel, kelToFah, fahToKel;

	// Here are some examples of converting temperatures

	celToKelv = CelsiusToKelvin(celsius);
	printf("%.2f celsius is %.2f kelvin\n", celsius, celToKelv);
	
	kelToCel = KelvinToCelsius(celToKelv);
	printf("%.2f kelvin is %.2f celsius\n", celToKelv, kelToCel);

	celToFah = CelsiusToFahrenheit(celsius);
	printf("%.2f celsius is %.2f fahrenheit\n", celsius, celToFah);

	fahToCel = FahrenheitToCelsius(celToFah);
	printf("%.2f fahrenheit is %.2f celsius\n", celToFah, fahToCel);

	kelToFah = KelvinToFahrenheit(kelvin);
	printf("%.2f kelvin is %.2f fahrenheit\n", kelvin, kelToFah);

	fahToKel = FahrenheitToKelvin(kelToFah);
	printf("%.2f fahrenheit is %.2f kelvin\n", kelToFah, fahToKel);
}