<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<!-- jquery validtaion -->	
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/jquery.validate.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/additional-methods.min.js"></script>
	<title>스프링 - 회원가입</title>
</head>
<body>
<form action="<c:url value="/signup"/>" method="post">
	
	<div class="form-group">
	<label for="id">아이디</label>	
	<input type="text" class="from-control" id="id" name="me_id">
	
	</div>

</form>
<script type="text/javascript">
function idCheckDup(){
	$("#id-error2").text("");
	$("#id-error2").hide();
	//입력된 아이디를 가져옴
	let id =$('[name=me_id]').val();	//변수에 name=me_id인 값을 가져옴
	let obj = {
			id:id
	}
	if(!idRegex.text(id)){
		return false;
	}
	let result = false;
	
	asnync : false;

}
</script>
</body>
</html>