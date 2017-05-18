<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/2
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String context=request.getContextPath();
    request.setAttribute("context",context);
%>
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="description" content="曾煌东的个人博客，zenghuangdong,分享成长快乐">

    <title>学习吧 - 分享 成长 进步 快乐</title>
    <script src="js/ga.js"></script>
    <%--<script src="js/instant.14757a4a.js"></script>--%>
    <script type="text/javascript" src="<%=context%>/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=context%>/js/jquery.validate.min.js"></script>
    <script type="text/javascript">
        $(function(){
            var validate = $("#sign-form-1").validate({
                //debug: true, //调试模式取消submit的默认提交功能
                //errorClass: "label.error", //默认为错误的样式类为：error
                focusInvalid: false, //当为false时，验证无效时，没有焦点响应
                onkeyup: false,
                submitHandler: function(form){   //表单提交句柄,为一回调函数，带一个参数：form
                    confirm("确认要提交表单？");
                    form.submit();   //提交表单
                },

                rules:{
                    userName:{
                        required:true
                    },
                    phoneNumber:{
                        required:true,
                        minlength:11,
                        isMobile:true
                    },
                    passWord:{
                        required:true,
                        minlength:6
                    },
                    confirm_password:{
                        equalTo:"#passWord"
                    }
                },

                messages:{
                    userName:{
                        required:"必填"
                    },
                    phoneNumber:{
                        required:"必填",
                        minlength : "手机号码不能小于11个字符",
                        isMobile :"请正确填写您的手机号码"
                    },
                    password:{
                        required: "不能为空",
                        minlength:"输入的密码长度不能少于6个字符"
                    },
                    confirm_password:{
                        equalTo:"两次密码输入不一致"
                    }
                }

            });

        });

    </script>
    <link rel="stylesheet" href="css/main.e87dad73.css">


</head>
<body style="height: auto;width: auto">
<img src="images/bg.jpg"  style="position: absolute;left:0px;top:0px;width:100%;height:100%;z-index: -1">
<div class="index-main">
    <div class="index-main-body"  style="position: fixed;top: 0px;left: 0px;right: 0px;margin: auto;">
        <div class="index-header">

            <h1 class="logo">学&nbsp&nbsp习&nbsp&nbsp吧</h1>
            <img src="images/title_picture.png">
            <h2 class="subtitle">分享&nbsp&nbsp&nbsp成长&nbsp&nbsp&nbsp进步&nbsp&nbsp&nbsp快乐</h2>
        </div>

        <div class="desk-front sign-flow clearfix sign-flow-simple">

            <div class="index-tab-navs">
                <div class="navs-slider" data-active-index="0">
                    <a href="#" class="active">注册</a>
                    <a href="login.jsp" class="">登录</a>
                    <span class="navs-slider-bar"></span>
                </div>
            </div>


            <%--<div class="view view-signin" data-za-module="SignInForm" style="display: none;">--%>
                <%--<form method="post" action="${context}/login/doLogin.html" />--%>
                <%--<input type="hidden" name="_xsrf" value="527ae7bdeb664821becfe1152275aca9">--%>
                <%--<div class="group-inputs">--%>

                    <%--<div class="account input-wrapper">--%>

                        <%--<input type="text" name="userName" id="username" aria-label="姓名" placeholder="姓名" required="" class="username">--%>
                    <%--</div>--%>
                    <%--<div class="verification input-wrapper">--%>
                        <%--<input type="password" name="passWord" id="password" aria-label="密码" class="password" placeholder="密码" required="">--%>
                        <%--<button type="button" class="send-code-button">获取验证码</button>--%>
                    <%--</div>--%>

                    <%--<div class="input-wrapper captcha-module" data-type="en">--%>
                        <%--<input name="captcha" placeholder="验证码" required="" data-rule-required="true" data-msg-required="请填写验证码">--%>
                        <%--<div class="captcha-container">--%>

                            <%--<img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张" alt="验证码">--%>
                        <%--</div>--%>
                    <%--</div>--%>

                <%--</div>--%>
                <%--<div class="button-wrapper command">--%>
                    <%--<button class="sign-button submit" type="submit">登录</button>--%>
                    <%--&lt;%&ndash;<input type="button" value="登录" class="sign-button submit" onclick="confirm()">&ndash;%&gt;--%>
                <%--</div>--%>
                <%--<div id="PasswordResult"></div><div id="UserResult"></div>--%>
                <%--<div class="signin-misc-wrapper clearfix">--%>

                    <%--<button type="button" class="signin-switch-button">手机验证码登录</button>--%>

                    <%--<a class="unable-login" href="#">无法登录？</a>--%>
                <%--</div>--%>

                <%--<div class="social-signup-wrapper" data-za-module="SNSSignIn">--%>
                    <%--<span class="name js-toggle-sns-buttons">社交帐号登录</span>--%>

                    <%--<div class="sns-buttons">--%>
                        <%--<a title="微信登录" class="js-bindwechat" href="#"><i class="sprite-index-icon-wechat"></i></a>--%>
                        <%--<a title="微博登录" class="js-bindweibo" href="#"><i class="sprite-index-icon-weibo"></i></a>--%>
                        <%--<a title="QQ 登录" class="js-bindqq" href="#"><i class="sprite-index-icon-qq"></i></a>--%>
                    <%--</div>--%>


                <%--</div>--%>

                <%--</form>--%>



            <%--</div>--%>
            <div class="view view-signup selected" data-za-module="SignUpForm">
                <form  action="${context}/user/register.html"  id="sign-form-1"  method="POST">

                    <div class="group-inputs">


                        <div class="name input-wrapper">
                            <input  type="text" name="userName" id="userName" aria-label="姓名" placeholder="姓名">
                        </div>
                        <div class="email input-wrapper">

                            <input  type="text" class="phoneNumber" name="phoneNumber" id="phoneNumber"  placeholder="手机号">

                        </div>

                        <div class="input-wrapper">
                            <input required="" type="password" name="passWord" id="passWord"  placeholder="密码（不少于 6 位）" autocomplete="off">
                        </div>
                        <div class="input-wrapper">
                            <input required="" type="password" name="confirm_password" id="confirm_password"  placeholder="确认密码" autocomplete="off">
                        </div>
                        <%--<div class="input-wrapper captcha-module" data-type="en">--%>
                            <%--<input  name="captcha" placeholder="验证码" required="" data-rule-required="true" data-msg-required="请填写验证码">--%>
                            <%--<div class="captcha-container">--%>

                                <%--<img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张" alt="验证码">--%>
                            <%--</div>--%>
                        <%--</div>--%>

                    </div>
                    <c:if test="${!empty operationMsg}">
                        <div style="color:red">${operationMsg}</div>
                    </c:if>
                    <div class="button-wrapper command">
                        <input class="sign-button submit" type="submit" value="注册"/>
                    </div>
                </form>

                <p class="agreement-tip">点击「注册」按钮，即代表你同意<a href="https://www.zenghuangdong.cn/terms" target="_blank">《学习吧协议》</a></p>





            </div>
        </div>
    </div>

</div>
<div class="footer" style="position: fixed;bottom: 0px;left: 0px;right: 0px;margin: auto;">

    <span>© 2017 学习吧</span>
    <span class="dot">·</span>
    <a target="_blank" href="https://www.zenghuangdong.cn/roundtable">学习吧圆桌</a>
    <span class="dot">·</span>
    <a target="_blank" href="https://www.zenghuangdong.cn/explore" data-za-c="explore" data-za-a="visit_explore" data-za-l="home_bottom_explore">发现</a>
    <span class="dot">·</span>



    <a href="https://zenghuangdong.cn/org/signin" class="footer-mobile-show">使用机构帐号登录</a>

    <span class="dot footer-mobile-show">·</span>

    <a href="http://zenghuangdong.cn/backmanager/contact.jsp" class="footer-mobile-show">联系我</a>
    <span class="dot">·</span>
    <br>
    <span><a href="http://www.miitbeian.gov.cn/" style="color: #0d79d1">粤ICP备 17033983 号</a></span>
    <span class="dot">·</span>

</div>



<script type="text/json" class="json-inline" data-name="disabled_components">["back_to_top"]</script>
<script type="text/json" class="json-inline" data-name="current_user">["","","","-1","",0,0]</script>
<script type="text/json" class="json-inline" data-name="env">["zhihu.com","comet.zhihu.com",false,null,false,false]</script>

<script type="text/json" class="json-inline" data-name="ga_vars">{"user_created":0,"now":1485010788000,"abtest_mask":"------------------------------","user_attr":[0,0,0,"-","-"],"user_hash":0}</script>

<script src="js/vendor.cb14a042.js"></script>
<script src="js/base.b0c2ea7f.js"></script>

<script src="js/common.72b772f9.js"></script>
<script src="js/page-index.f2d7487f.js"></script>
<meta name="entry" content="ZH.entrySignPage" data-module-id="page-index">


<input type="hidden" name="_xsrf" value="527ae7bdeb664821becfe1152275aca9">

<div id="zh-hovercard"></div><div id="zh-tooltip"></div>
<script type="text/template" class="register-template">
    <div class="title register">
        <h1>加入知论</h1>
        <h2>与世界分享你的知识、经验和见解</h2>
    </div>
    <div class="view register SignupForm" data-za-module="SignUpForm">
        <form action="" method="POST">
            <div class="input-wrapper">
                <input type="text" name="fullname" aria-label="姓名" placeholder="姓名" required>
            </div>
            <div class="input-wrapper">


                <input type="text" name="phone_num" class="account" data-is-domestic="true" aria-label="手机号（仅支持中国大陆）" placeholder="手机号（仅支持中国大陆）" required>


            </div>
            <div class="input-wrapper toggle-password">
                <input type="password" hidden>
                <input type="password" name="password" aria-label="密码" placeholder="密码（不少于 6 位）" required>
                <span class="z-ico-show-password"></span>
            </div>
            <div class="input-wrapper captcha-module" data-type="en" >
                <input id="captcha" name="captcha" placeholder="验证码" required data-rule-required="true" data-msg-required="请填写验证码">
                <div class="captcha-container">

                    <img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张"  alt="验证码">
                </div>
            </div>
            <div class="actions">

                <button class="submit blue-button">注册</button>

            </div>
            <div class="sns clearfix">
                <span>已有帐号？<a href="#" class="switch-to-login">登录</a></span>
            </div>
        </form>
    </div>
</script>
<script type="text/template" class="phone-verification-template">
    <div class="title verification">
        <h1>验证手机</h1>
        <h2>请输入你收到的 6 位数短信验证码</h2>
    </div>
    <div class="view verification">
        <form>
            <div class="input-wrapper">
                <input type="text" name="phone_num" aria-label="手机号" placeholder="手机号" required>
            </div>
            <div class="input-wrapper verification-code">
                <input type="text" name="verification_code" aria-label="验证码" placeholder="6 位数验证码" maxlength="6" required>
                <button type="button" class="send-code">重发验证码</button>
            </div>
            <div class="submit-wrapper">
                <button class="submit blue-button">进入学习吧</button>
            </div>
        </form>
    </div>
</script>
<%--<script type="text/template" class="login-template">--%>
    <%--<div class="LoginForm">--%>
        <%--<div class="title login">--%>
            <%--<h1>登录学习吧</h1>--%>
            <%--<h2>与世界分享你的知识、经验和见解</h2>--%>
        <%--</div>--%>
        <%--<div class="view login" data-za-module="SignInForm">--%>
            <%--<form method="POST" action="<c:url value="${context}/login/doLogin.html"/>">--%>
                <%--<div class="input-wrapper">--%>
                    <%--<input type="text" name="account" class="account" aria-label="手机号或邮箱" placeholder="手机号或邮箱" required>--%>
                <%--</div>--%>
                <%--<div class="input-wrapper toggle-password">--%>
                    <%--<input type="password" name="password" aria-label="密码" placeholder="密码" required>--%>
                    <%--<span class="z-ico-show-password"></span>--%>
                <%--</div>--%>
                <%--<div class="input-wrapper captcha-module" data-type="en" >--%>
                    <%--<input id="cap" name="captcha" placeholder="验证码" required data-rule-required="true" data-msg-required="请填写验证码">--%>
                    <%--<div class="captcha-container">--%>

                        <%--<img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张"  alt="验证码">--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="actions">--%>

                    <%--<button class="submit blue-button">登录</button>--%>

                <%--</div>--%>
                <%--<div class="sns clearfix">--%>
                    <%--<label class="remember-me"><input type="checkbox" name="remember_me" checked value="true">记住我</label>--%>
                    <%--<span class="middot">·</span>--%>
                    <%--<button class="unable-login" type="button">无法登录？</button>--%>
                    <%--<button type="button" class="js-show-sns-buttons is-visible">社交帐号登录</button>--%>
                    <%--<div class="sns-buttons">--%>
                        <%--<button type="button" class="wechat"><span class="ico sprite-global-icon-wechat-gray"></span>微信</button>--%>
                        <%--<button type="button" class="weibo"><span class="ico sprite-global-icon-weibo-gray"></span>微博</button>--%>
                        <%--<button type="button" class="qq"><span class="ico sprite-global-icon-qq-gray"></span>QQ</button>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</form>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</script>--%>
<script type="text/template" class="login-sms-verification-template">
    <div class="title">
        <h1>为保护你的帐号安全，请验证手机</h1>
        <h2>短信验证码已发送至以下号码</h2>
    </div>
    <div class="view">
        <form>
            <div class="input-wrapper">
                <input type="text" name="phone_num" aria-label="手机号" placeholder="手机号" required disabled>
            </div>
            <div class="input-wrapper verification-code">
                <input type="text" name="verification_code" aria-label="验证码" placeholder="6 位数验证码" maxlength="6" required>
                <button type="button" class="send-code">重发验证码</button>
            </div>
            <div class="submit-wrapper">
                <button class="submit blue-button">登录</button>
            </div>
        </form>
    </div>
</script>
<script type="text/template" class="unable-login-template">

    <div class="title start">
        <h1>无法登录</h1>
        <h2>我们提供两种方式帮助你重新登录学习吧</h2>
    </div>
    <div class="view start" data-za-module="UnableSignInForm">
        <button class="blue-button reset-password">找回密码</button>
        <button class="blue-button sms-login">使用手机验证码登录</button>
    </div>
    <div class="title reset-password-verification">
        <h1>找回密码</h1>
        <h2>

            验证码将会发送至你的注册邮箱或手机

        </h2>
    </div>
    <div class="view reset-password-verification" data-za-module="RecoverPasswordForm">
        <form>
            <div class="input-wrapper">
                <input type="text" name="account" class="account" aria-label="手机号或邮箱" placeholder="手机号或邮箱" required>
            </div>
            <div class="input-wrapper captcha-module" data-type="en" >
                <input id="capt" name="captcha" placeholder="验证码" required data-rule-required="true" data-msg-required="请填写验证码">
                <div class="captcha-container">

                    <img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张"  alt="验证码">
                </div>
            </div>
            <div class="submit-wrapper">
                <button class="submit blue-button">获取验证码</button>
            </div>
        </form>
    </div>
    <div class="title reset-password">
        <h1>重设密码</h1>
        <h2>

            验证码将会发送至你的注册邮箱或手机

        </h2>
    </div>
    <div class="view reset-password" data-za-module="ResetPasswordForm">
        <form action="/resetpassword/email">
            <div class="input-wrapper">
                <input type="text" name="account" class="account" aria-label="手机号或邮箱" placeholder="手机号或邮箱" required>
            </div>
            <div class="input-wrapper toggle-password">
                <input type="password" hidden>
                <input type="password" name="password" aria-label="新密码" placeholder="新密码" required>
                <span class="z-ico-show-password"></span>
            </div>
            <div class="input-wrapper verification-code">
                <input type="text" name="verification_code" aria-label="邮箱收到的" placeholder="邮箱收到的 6 位数验证码" maxlength="6" required>
                <button type="button" class="send-code">重发验证码</button>
            </div>
            <div class="submit-wrapper">
                <button class="submit blue-button">重设密码</button>
            </div>
        </form>
    </div>
    <div class="title sms-login-verification">
        <h1>登录学习吧</h1>
        <h2>验证码将会发送至你的手机</h2>
    </div>
    <div class="view sms-login-verification" data-za-module="SMSVerificationForm">
        <form>
            <div class="input-wrapper">
                <input type="text" name="phone_num" aria-label="手机号" placeholder="手机号" required>
            </div>
            <div class="input-wrapper captcha-module" data-type="en" >
                <input id="" name="captcha" placeholder="验证码" required data-rule-required="true" data-msg-required="请填写验证码">
                <div class="captcha-container">

                    <img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张"  alt="验证码">
                </div>
            </div>
            <div class="submit-wrapper">
                <button class="submit blue-button">获取验证码</button>
            </div>
        </form>
    </div>
    <div class="title sms-login">
        <h1>登录学习吧</h1>
        <h2>输入你收到的 6 位数短信验证码</h2>
    </div>
    <div class="view sms-login" data-za-module="SMSSignInForm">
        <form>
            <div class="input-wrapper">
                <input type="text" name="phone_num" aria-label="手机号" placeholder="手机号" required>
            </div>
            <div class="input-wrapper verification-code">
                <input type="text" name="verification_code" aria-label="验证码" placeholder="6 位数验证码" maxlength="6" required>
                <button type="button" class="send-code">重发验证码</button>
            </div>
            <div class="submit-wrapper">
                <button class="submit blue-button">登录学习吧</button>
            </div>
        </form>
    </div>
</script>
<script type="text/template" class="oauth-register-template">
    <div class="title register">
        <h1>注册新帐号</h1>
        <h2>请填写你的真实姓名</h2>
    </div>
    <div class="view register">
        <form>
            <div class="input-wrapper">
                <input type="text" name="fullname" aria-label="姓名" placeholder="姓名" class="js-name" required>
            </div>
            <div class="input-wrapper captcha-module" data-type="en" >
                <input name="captcha" placeholder="验证码" required data-rule-required="true" data-msg-required="请填写验证码">
                <div class="captcha-container">

                    <img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张"  alt="验证码">
                </div>
            </div>
            <div class="submit-wrapper">
                <button class="submit blue-button full-width">注册</button>
            </div>
            <div class="switch-wrapper">
                <a href="#" class="switch-to-login">使用已有帐号登录</a></span>
            </div>
        </form>
    </div>
    <div class="title bound">
        <h1>登录知论</h1>
        <h2>该微博曾绑定过以下帐号</h2>
    </div>
    <div class="view bound">
        <img src="" width="50px" height="50px">
        <span class="name"></span>
        <button class="blue-button bind-login">绑定此帐号并登录</button>
        <button class="button register">不绑定，用微博创建新帐号</button>
    </div>
    <div class="title registered">
        <h1>微博邮箱已注册知论</h1>
        <h2>已注册至如下帐号</h2>
    </div>
    <div class="view registered">
        <img src="" width="50px" height="50px">
        <span class="name"></span>
        <button class="blue-button bind-login">绑定此帐号并登录</button>
        <button class="button register">不绑定，用微博创建新帐号</button>
    </div>
    <div class="title bind-login">
        <h1>登录知论</h1>
        <h2>与世界分享你的知识、经验和见解</h2>
    </div>
    <div class="view bind-login">
        <form>
            <div class="input-wrapper">
                <input type="text" name="account" class="account" aria-label="手机号或邮箱" placeholder="手机号或邮箱" required disabled>
            </div>
            <div class="input-wrapper toggle-password">
                <input type="password" name="password" aria-label="密码" placeholder="密码" required>
                <span class="z-ico-show-password"></span>
            </div>
            <div class="actions">
                <button class="unable-login" type="button">无法登录？</button>
                <button class="submit blue-button">绑定并登录</button>
            </div>
        </form>
    </div>
</script>


</body>
</html>