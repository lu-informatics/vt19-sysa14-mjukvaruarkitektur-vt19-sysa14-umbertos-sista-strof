$(document).ready(function(){
$.ajax({method: "GET", url: "http://api.ipstack.com/check?access_key=43f6666d7d548d06deeb2189ff7546c5", 
error: ajaxReturn_Error,
success: ajaxReturn_Success
})
function ajaxReturn_Success(result, status, xhr) {
	ParseJsonFile(result);
}
function ajaxReturn_Error(result, status, xhr) {
console.log("Ajax-api-stack: "+status);
}
});

function ParseJsonFile(result){
	var lat = result.latitude;
	var long = result.longitude;
	var city = result.city;
	var ipNbr = result.ip;
	$("#city").text(city);
	$("#ipNbr").text(ipNbr);
	$.ajax({method: "GET",url: "http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+long+"&units=metric&APPID=41e401ef51f4c02cae06dcfb2b0bb36f", 
		error: ajaxWeatherReturn_Error, 
		success: ajaxWeatherReturn_Success
		})
		function ajaxWeatherReturn_Success(result, status, xhr) {
		$("#weather").text(result.weather[0].main);
		$("#degree").text(result.main.temp+" \u2103");
		
	}
		

		function ajaxWeatherReturn_Error(result, status, xhr) {
			alert("Error i OpenWeaterMap Ajax");
			console.log("Ajax-find movie: "+status);
			}
	
}