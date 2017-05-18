/**
 * Created by Administrator on 2017/3/23.
 */
function filter() {
    var mail_input=document.getElementById("u_mail").value;
    var sender_name=document.getElementById("senderName").value;
    if(mail_input==""){
        alert("尊敬的用户："+sender_name+"你的邮箱输入不能为空");
        return false;
    }else {
        $.ajax({
                async:false,
                type:"post",
                data:{input:mail_input},
                url:'http://www.zenghuangdong.cn/backmanager/email/filter.html',
                success:function (data) {
                    if (data=="success"){
                        alert(data+"订阅成功");
                        window.location.href='http://www.zenghuangdong.cn/backmanager/email/subscribe.html?email='+mail_input+'&username='+sender_name;
                    }
                    if(data=="fail"){
                        alert(data+"该用户邮箱已订阅");
                        $mail_input.val("");
                    }
                },
                error:function () {
                    alert("网络错误");
                }
            }

        );
    }
}



function topFilter() {
    var email_input=document.getElementById("mail").value;
    var sender_name=document.getElementById("sName").value;
    if(email_input==""){
        alert("尊敬的用户："+sender_name+"你的邮箱输入不能为空");
        return false;
    }else {
        $.ajax({
                async:false,
                type:"post",
                data:{input:email_input},
                url:'http://www.zenghuangdong.cn/backmanager/email/filter.html',
                success:function (data) {
                    if (data=="success"){
                        alert(data+"订阅成功");
                        window.location.href='http://www.zenghuangdong.cn/backmanager/email/subscribe.html?email='+email_input+'&username='+sender_name;
                    }
                    if(data=="fail"){
                        alert(data+"该用户邮箱已订阅");
                        $email_input.val("");
                    }
                },
                error:function () {
                    alert("网络错误");
                }
            }

        );
    }
}