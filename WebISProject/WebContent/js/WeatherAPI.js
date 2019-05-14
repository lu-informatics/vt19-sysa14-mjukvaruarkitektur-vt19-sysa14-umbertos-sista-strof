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
}