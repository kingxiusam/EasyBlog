function myconfirm(){
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;
    if(username==""||password==""){
        $("#UserResult").html('<font color=\"red\">用户名和密码不能为空！</font>');
        return false;
    }else {
        $.ajax({
            async:false,
            type:'post',
            data:{userName:username,passWord:password},
            url:'http://www.zenghuangdong.cn/backmanager/user/login.html',
            success:function (data) {
                if(data=="true"){//如果返回的信息说明提交的信息正确
                    window.location.href='http://www.zenghuangdong.cn/backmanager/user/person.html?id='+Math.random()+"&userName="+username;//正确登录后页面跳转至

                }//如果返回的信息说明提交的信息错误
                if(data=="userNameError"){//判断是用户名还是密码错误，提示相应信息
                    $("#UserResult").html('<font color=\"red\">用户名不存在</font>');
                    $username.val("");
                    document.getElementById("password").val("");
                    // alert("出错了！！:用户名不存在");

                }
                if(data=="passWordError"){
                    $("#PasswordResult").html('<font color=\"red\">密码错误</font>');
                    $password.val("");
                    // alert("出错了！！:密码错误");

                }
            },
            error:function (data) {
                alert(data+"请求失败,网络错误");
            }

        });
    }

}

//判断是否敲击了Enter键
$(document).keyup(function(event){
    if(event.keyCode ==13){
        $("#submit").trigger("click");
    }
});




function confirm(){
    var username=document.getElementById("userName").value;
    var password=document.getElementById("inputPassword").value;
    if(username==""||password==""){
        $("#UserResult").html('<font color=\"red\">用户名和密码不能为空！</font>');
        return false;
    }else {
        $.ajax({
            async:false,
            type:'post',
            data:{userName:username,passWord:password},
            url:'http://www.zenghuangdong.cn/backmanager/user/login.html',
            success:function (data) {
                if(data=="true"){//如果返回的信息说明提交的信息正确
                    window.location.href='http://www.zenghuangdong.cn/backmanager/user/index.html';//正确登录后页面跳转至

                }//如果返回的信息说明提交的信息错误
                if(data=="userNameError"){//判断是用户名还是密码错误，提示相应信息
                    $("#UserResult").html('<font color=\"red\">用户名不存在</font>');
                    $username.val("");
                    document.getElementById("password").val("");
                    // alert("出错了！！:用户名不存在");

                }
                if(data=="passWordError"){
                    $("#PasswordResult").html('<font color=\"red\">密码错误</font>');
                    $password.val("");
                    // alert("出错了！！:密码错误");

                }
            },
            error:function (data) {
                alert(data+"请求失败,网络错误");
            }

        });
    }

}