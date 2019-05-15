var email = document.getElementById("myVal").value;
var bookTable = document.getElementById("reserveTable");
var bookRequest = new XMLHttpRequest();
bookRequest.open('GET', 'http://localhost:8080/WebISProject/ReserveServlet/'+email);
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
		htmlString += "<form class='tr' method='post' action='ReserveServlet'><span class='td'><input type='text' id='inputText' value='ISBN: "+data[i].isbn+" COPY: "+data[i].bookcopy+"' readonly/></span><span class='td'><input type='text' value="+data[i].isbn+" name='isbn' readonly hidden/></span>"
        htmlString += "<span class='td'><input type='text' value="+data[i].bookcopy+" name='bookcopy' readonly hidden/></span><span class='td'><input type=submit id=inputButton name='delete' value='Delete'/></span></form>"
	}
	bookTable.insertAdjacentHTML('beforeend', htmlString);
}

function renderEmptyHTML(data){
	var htmlString = "<div class='tr'><span class='td'> Not Titles Found</span></div>";
	bookTable.insertAdjacentHTML('beforeend', htmlString);
	}

function isEmpty(obj) {
    for(var key in obj) {
        if(obj.hasOwnProperty(key))
            return false;
    }
    return true;
}