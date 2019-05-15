var bookTable = document.getElementById("table");
var bookRequest = new XMLHttpRequest();
bookRequest.open('GET', 'http://localhost:8080/WebISProject/BookServlet/');
bookRequest.onload = function(){
	var bookData = JSON.parse(bookRequest.responseText);
	if(isEmpty(bookData)) {
	    renderEmptyHTML(bookData);
	} 
	else {
		renderHTML(bookData);
	}
};
bookRequest.send();

function renderHTML(data){
	var htmlString = "";
	for(i = 0; i < data.length; i++){
		htmlString += "<form id='tr' method='post' action='ReserveServlet'><span class='td'><input type='text' id='inputText' value='Title: "+data[i].title+" Author: "+data[i].author+" ISBN: "+data[i].Isbn+"' readonly/></span><span class='td'><input type='text' value="+data[i].Isbn+" name='isbn' readonly hidden/></span>"
        htmlString += "<span class='td'><input type='text' value="+data[i].bookcopy+" name='bookcopy' readonly hidden/></span><span class='td'><input type=submit id='inputButton' name='create' value='Reserve'/></span></form>"
	}
	bookTable.insertAdjacentHTML('beforeend', htmlString);
	}

function renderEmptyHTML(data){
	var htmlString = "<div class='tr'><span class='td'> Not Titles Found</span></div>";
	bookTable.insertAdjacentHTML('beforeend', htmlString);
	}

document.getElementById("search").onclick = function search(){
	document.getElementById("table").innerHTML = "";
	var searchText = document.getElementById("bookText").value;
	var bookRequest = new XMLHttpRequest();
	bookRequest.open('GET', 'http://localhost:8080/WebISProject/BookServlet/'+searchText);
	bookRequest.onload = function(){
		var bookData = JSON.parse(bookRequest.responseText);
		if(isEmpty(bookData)) {
		    renderEmptyHTML(bookData);
		} 
		else {
			renderHTML(bookData);
		}
	};
	bookRequest.send();
};

function isEmpty(obj) {
    for(var key in obj) {
        if(obj.hasOwnProperty(key))
            return false;
    }
    return true;
}

