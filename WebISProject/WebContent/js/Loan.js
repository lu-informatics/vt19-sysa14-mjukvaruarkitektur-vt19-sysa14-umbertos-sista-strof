var email = document.getElementById("myVal").value;
var bookTable = document.getElementById("loanTable");
var bookRequest = new XMLHttpRequest();
bookRequest.open('GET', 'http://localhost:8080/WebISProject/LoaningServlet/'+email);
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
		
		htmlString += "<tr>" + "<td>" + data[i].isbn + "</td>" + "<td>" + data[i].bookcopy + "</td>" + "<td>" + data[i].endTime + "</td> </tr>";
	}
	bookTable.insertAdjacentHTML('beforeend', htmlString);
}

function renderEmptyHTML(data){
	var htmlString = "<tr> <td> You have no loans </td> </tr>";
	bookTable.insertAdjacentHTML('beforeend', htmlString);
}

function isEmpty(obj) {
    for(var key in obj) {
        if(obj.hasOwnProperty(key))
            return false;
    }
    return true;
}