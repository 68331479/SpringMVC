<%--
  Created by IntelliJ IDEA.
  User: LDeng
  Date: 2020/3/16
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/jquery-3.4.1.js"></script>

    <script>
        function a1(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"username":$("#username").val()},
                success:function(data){
                    if(data=='ok'){
                        $("#userInfo").css("color","green");
                    }else{
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                    console.log(data);
                }
            })

        }

        function a2(){

            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"password":$("#password").val()},
                success:function(data){
                    if(data=='ok'){
                        $("#pwdInfo").css("color","green");
                    }else{
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                    console.log(data);
                }
            })
        }

    </script>


</head>
<body>
    <p>
        用户名:<input type="text" id="username" onblur="a1()">
        <span id="userInfo"></span>
        密码：<input type="password" id="password" onblur="a2()">
        <span id="pwdInfo"></span>
    </p>

</body>
</html>
