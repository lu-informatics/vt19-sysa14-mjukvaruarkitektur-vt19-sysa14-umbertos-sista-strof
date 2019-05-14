var bookTable = document.getElementById("table");
var bookRequest = new XMLHttpRequest();
bookRequest.open('GET', 'http://localhost:8080/WebISProject/BookServlet/');
bookRequest.onload = function(){
	var bookData = JSON.parse(bookRequest.responseText);
	renderHTML(bookData);
};
bookRequest.send();

function renderHTML(data){
	var htmlString = "";
	for(i = 0; i < data.length; i++){
		 htmlString += "<div class='tr'><span class='td'> Title: "+data[i].title+"</span><span class='td'> Author: "+data[i].author+"</span></div>";
		htmlString += "<form class='tr' method='post' action='ReserveServlet'><span class='td'>ISBN: <span class='td'><input type='text' value="+data[i].Isbn+" name='isbn' readonly/></span>"
        htmlString += "<span class='td'><input type='text' value="+data[i].bookcopy+" name='bookcopy' readonly/></span><span class='td'><input type=submit name='create' value='Reserve'/></span></form>"
	}
	bookTable.insertAdjacentHTML('beforeend', htmlString);
	}

document.getElementById("search").onclick = function search(){
	document.getElementById("table").innerHTML = "";
	var searchText = document.getElementById("bookText").value;
	var bookRequest = new XMLHttpRequest();
	bookRequest.open('GET', 'http://localhost:8080/WebISProject/BookServlet/'+searchText);
	bookRequest.onload = function(){
		var bookData = JSON.parse(bookRequest.responseText);
		renderHTML(bookData);
	};
	bookRequest.send();
};

