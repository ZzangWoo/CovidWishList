<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 id="title">Hello World</h1>
	<input type="text" id="testText1" />
	<input type="text" id="testText2" />
	<button type="button" id="testButton">테스트버튼</button>
	
	<script type="text/javascript" src="/resources/js/jquery/jquery-2.2.4.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
		    $("#testButton").click(function() {
		    	var data = {
		    			"test1" : $("#testText1").val(),
		    			"test2" : $("#testText2").val()
		    	};
		    	
		    	$.ajax({
		    		type: "POST",
		    		url: "/test/testProc",
		    		data: data,
		    		success: function (response) {
		    			console.log(response);
		    		}
		    	});
		    	
		    });
		})
	</script>
</body>
</html>