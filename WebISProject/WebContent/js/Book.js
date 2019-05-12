var bookTable = document.getElementById("bookTable");
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
		htmlString += "<tr> <td>" + data[i].title + "</td> <td>" + data[i].author + "</td> <td>";
		htmlString += "<input type='text' value="+data[i].Isbn+" name='isbn' readonly></td>" + "<td> <input type='text' value="+data[i].bookcopy+" name='bookcopy' readonly></td>";
		htmlString += '<td> <input type=submit value="Reserve"></td></tr>';
	}
	bookTable.insertAdjacentHTML('beforeend', htmlString);
}