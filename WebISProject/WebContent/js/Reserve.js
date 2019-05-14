var email = document.getElementById("myVal").value;
var bookTable = document.getElementById("reserveTable");
var bookRequest = new XMLHttpRequest();
bookRequest.open('GET', 'http://localhost:8080/WebISProject/ReserveServlet/'+email);
bookRequest.onload = function(){
	var bookData = JSON.parse(bookRequest.responseText);
	renderHTML(bookData);
};
bookRequest.send();

function renderHTML(data){
	var htmlString = "";
	for(i = 0; i < data.length; i++){
		htmlString += "<form class='tr' method='post' action='ReserveServlet'><span class='td'><input type='text' value="+data[i].isbn+" name='isbn' readonly/></span>"
        htmlString += "<span class='td'><input type='text' value="+data[i].bookcopy+" name='bookcopy' readonly/></span><span class='td'><input type=submit name='delete' value='Delete'/></span></form>"
	}
	bookTable.insertAdjacentHTML('beforeend', htmlString);
}