var globalProductList = [];
var wishlistChange = "true";

function sendData(productObject, product) {
	
	var location = "/views/responsive/cms/wishlistcomponent.jsp";
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var response = this.responseText;
			var productList = [];
			var responseJson = JSON.parse(response);
			for (var i = 0; i < responseJson.length; i++) {
				var obj = responseJson[i];
				if (product == obj.code) {
					$(productObject).addClass("wishListProd");

				} else {
					$(productObject).removeClass("wishListProd");

				}
			}
			window.location='/views/responsive/cms/wishlistcomponent.jsp';
		}
	}
	xhttp.open("POST", "wishlist/processcode", false);
	xhttp.send(product);
}

function checkproduct() {
	var xhttp = new XMLHttpRequest();
	var productList = [];
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var response = this.responseText;
			var responseJson = JSON.parse(response);
			for (var i = 0; i < responseJson.length; i++) {
				var obj = responseJson[i];
				productList.push(obj.code);
			}
		}
	}
	xhttp.open("GET", "wishlist/getProducts", false);
	xhttp.send();

	var heartBtns = document.getElementsByClassName("carousel__item--code");
	for (i = 0; i < heartBtns.length; i++) {
		var heartData = heartBtns[i].innerHTML;
		for (j = 0; j < productList.length; j++) {
			if (productList[j] == heartData) {
				$(heartBtns[i]).parent().siblings(".wishlistcomponentbutton")
						.addClass("wishListProd");
			}
		}
	}
}