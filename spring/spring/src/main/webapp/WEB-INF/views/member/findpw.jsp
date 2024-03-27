<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.container-spinner{
	position: fixed; top:0; bottom:0; left:0; right:0;
	background: rgba(0,0,0,0.3);
	display: none;
	text-align: center; color : white;
	line-height: 100vh
}
</style>
</head>
<body>
<h1>���ã��</h1>
<div class="form-group">
	<label for="id">���̵�</label>
	<input type="text" class="form-control" id="id" name="id">
</div>
<button class="btn btn-outline-success col-12 btn-find">���ã��</button>
<div class="container-spinner">
	ã�� ��
	<span class="spinner-border text-danger"></span>
</div>
<script type="text/javascript">
$('.btn-find').click(function(){
	//���̵� ������(������ ����)
	let obj = {
		id: $('[name=id]').val()
	}
	//������ ����
	$.ajax({
		async : true, //�񵿱� : true(�񵿱�), false(����)
		url : '<c:url value="/find/pw"/>', 
		type : 'post', 
		data : obj, 
		dataType : "json", 
		success : function (data){
			if(data.result){
				alert("�� ����� �̸��Ϸ� ���۵ƽ��ϴ�.");
			}else{
				alert("���Ե� ȸ���� �ƴϰų� �̸����� �߸��ƽ��ϴ�.");
			}
			$(".container-spinner").hide();
		}, 
		error : function(jqXHR, textStatus, errorThrown){

		}
	});
})
</script>
</body>
</html>