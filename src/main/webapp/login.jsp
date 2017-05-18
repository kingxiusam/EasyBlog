<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/2
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String context=request.getContextPath();
    request.setAttribute("context",context);
%>
<html lang="zh-CN"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta name="apple-itunes-app" content="app-id=432274380">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta name="description" content="一个真实的网络问答个人社区，帮助你寻找答案，分享知识。">
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <title>学习吧 - 分享 成长 进步 快乐</title>

    <link rel="shortcut icon" href="http://zenghuangdong.cn/images/huangdong.jpg" type="image/x-icon">

    <link rel="stylesheet" href="${context}/css/main.e87dad73.css">

    <script src="${context}/js/jquery-3.0.0.js"></script>
    <script src="${context}/js/login.js"></script>
    <%--设置你申请时获得的APPID--%>
    <script type="text/javascript" src="http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js" data-appid="APPID" data-redirecturi="REDIRECTURI" charset="utf-8"></script>
    <%--<style type="text/css">.CloseIcon-icon-2xww{transition:opacity .3s ease-out}.CloseIcon-icon-2xww:hover{opacity:.8}</style>--%>
    <%--<style type="text/css">.animations-fadeIn-1aFv{animation:animations-fadeIn-1aFv .3s ease-out both}@keyframes animations-fadeIn-1aFv{0%{opacity:0}to{opacity:1}}.animations-fadeOut-3XSQ{animation:animations-fadeOut-3XSQ .3s ease-out both}@keyframes animations-fadeOut-3XSQ{0%{opacity:1}to{opacity:0}}.animations-fadeInUp-3KKK{animation:animations-fadeInUp-3KKK .3s cubic-bezier(.25,.1,.35,1) both}@keyframes animations-fadeInUp-3KKK{0%{opacity:0;transform:translateY(20px)}to{opacity:1;transform:translateY(0)}}.animations-fadeOutDown-r_A_{animation:animations-fadeOutDown-r_A_ .3s cubic-bezier(.25,.1,.35,1) both}@keyframes animations-fadeOutDown-r_A_{0%{transform:translateY(0)}to{opacity:0;transform:translateY(20px)}}</style>--%>
    <%--<style type="text/css">.Modal-backdrop-2ksh{background-color:rgba(0,0,0,.65)}.Modal-backdrop-2ksh,.Modal-modalWrapper-56Mq{position:fixed;top:0;right:0;bottom:0;left:0;z-index:10010}.Modal-modalWrapper-56Mq{display:-ms-flexbox;display:flex;-ms-flex-align:center;align-items:center;-ms-flex-pack:center;justify-content:center}.Modal-modal-wf58{position:relative;z-index:10011;background:#fff;border-radius:2px}.Modal-content-3JxL{width:588px;max-height:calc(100vh - 24px * 2);overflow-x:hidden;overflow-y:auto;-webkit-overflow-scrolling:touch}.Modal-closeButton-3JkR{position:absolute;top:4px;right:-44px;padding:12px;width:40px;height:40px;cursor:pointer;box-sizing:border-box;background:none;outline:none;border:none}</style>--%>
    <%--<style type="text/css">.FeedbackButton-button-3waL{position:fixed;z-index:10000;bottom:40px;right:40px;width:40px;height:40px;cursor:pointer;border-radius:50%;background-color:#fff;border:none;outline:none;box-shadow:0 0 10px rgba(0,0,0,.15);font-weight:700;line-height:normal}.FeedbackButton-icon-1Rgw{display:inline-block;vertical-align:middle;width:18px;height:18px;background-image:url(data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMzUiIGhlaWdodD0iMzYiIHZpZXdCb3g9IjAgMCAzNSAzNiIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48dGl0bGU+R3JvdXAgNjwvdGl0bGU+PGcgZmlsbD0iIzAwOEZFQiIgZmlsbC1ydWxlPSJldmVub2RkIj48cGF0aCBkPSJNMTMgMTguM2MwLS40IDAtLjcuNC0xIC4yLS4yLjUtLjMuOC0uMy40IDAgLjcgMCAxIC40LjIuMi4zLjUuMyAxIDAgLjIgMCAuNS0uNC43IDAgLjQtLjQuNS0uOC41LS4zIDAtLjYgMC0uOC0uNC0uMyAwLS40LS40LS40LS43ek0xMCAxMC43di0xYy40LTEgMS41LTIuNyA0LjItMi43IDIgMCAzLjggMS40IDMuOCAzcy0xLjQgMi43LTIgMy4zYy0uOC42LTEgMS0xLjIgMS43LS4yLjYtLjYgMS0xLjMgMS0uMy0uMi0uNi0uMy0uNy0uNXYtLjhjMC0uMiAwLS43LjMtMS4ybDEuNC0xLjVjMS40LTEuMiAxLjYtMiAuOC0yLjgtLjUtLjQtMS42LS41LTIuMiAwLS44LjQtMSAxLTEuMiAxLjMtLjIuNS0uMyAxLTEuMyAxLS4zLS4yLS40LS40LS41LS44eiIvPjxwYXRoIGQ9Ik0yOS44IDEwLjJ2M2MxLjQgMS44IDIuMyA0IDIuMyA2LjMgMCAzLjgtMi4yIDctNS41IDl2My44bC0zLjctMi41LTMgLjNjLTIuOCAwLTQuMy0uOC02LjQtMi4yaC0zLjFDMTMgMzAuNCAxNS42IDMyIDIwIDMyYy44IDAgMS43IDAgMi42LS4ybDYgNHYtNi40YzMuNS0yLjQgNS43LTYgNS43LTEwIDAtMy42LTEuNy03LTQuNS05LjJ6TTE0LjQgMjUuNmM4IDAgMTMuMi02IDEzLjItMTNTMjEgMCAxNC40IDBDNi40IDAgMCA1LjcgMCAxMi43YzAgNCAxLjUgNy41IDQuNCAxMFYyOWw2LjMtMy42IDMuNy4yek0xNC4yIDJjNi41IDAgMTEuNSA1LjMgMTEuNSAxMUMyNS43IDE5IDIxIDI0IDE0LjQgMjRjLTEgMC0zLjYtLjMtNC41LS41TDYgMjUuN3YtNGMtMi43LTIuMi00LTUtNC04LjZDMiA3IDcgMiAxNCAyeiIvPjwvZz48L3N2Zz4=);background-repeat:no-repeat;background-size:contain}.FeedbackButton-button-3waL:hover .FeedbackButton-icon-1Rgw{background-image:url(data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMzUiIGhlaWdodD0iMzYiIHZpZXdCb3g9IjAgMCAzNSAzNiIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48dGl0bGU+R3JvdXAgMTE8L3RpdGxlPjxnIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+PHBhdGggZD0iTTI5LjQgMTNjMCAyLS4zIDguMi01IDExLjQtNC4zIDMtOSAzLjMtMTEuMyAzLjNoLTNjMi44IDIuNyA2LjYgNC44IDEyLjIgNCAxIDAgNi4zIDQgNi4zIDRWMjljMy41LTIuMyA1LjMtNS4yIDUuNi05LjUuMy0zLjctMS42LTctNC41LTkuNXYzem0tMTUgMTIuNmM4IDAgMTMuMi02IDEzLjItMTNTMjEgMCAxNC40IDBDNi40IDAgMCA1LjcgMCAxMi43YzAgNCAxLjUgNy41IDQuNCAxMFYyOWw2LjMtMy42IDMuNy4zeiIgZmlsbD0iIzAwOEZFQiIvPjxwYXRoIGQ9Ik0xMyAxOC4zYzAtLjQgMC0uNy40LTFzLjUtLjMuOC0uM2MuNCAwIC43IDAgMSAuNC4yLjIuMy41LjMgMSAwIC4yIDAgLjUtLjQuNyAwIC40LS40LjUtLjguNS0uMyAwLS42IDAtLjgtLjQtLjMgMC0uNC0uNC0uNC0uN3ptLTMtNy42di0xYy40LTEgMS40LTIuNyA0LjItMi43IDIgMCAzLjggMS40IDMuOCAzcy0xLjQgMi43LTIgMy4zYy0uOC42LTEgMS0xLjIgMS43LS4yLjYtLjYgMS0xLjMgMS0uMy0uMi0uNi0uMy0uNy0uNXYtLjhjMC0uMiAwLS43LjMtMS4ybDEuNC0xLjVjMS40LTEuMiAxLjYtMiAuOC0yLjgtLjUtLjQtMS42LS41LTIuMiAwLS44LjQtMSAxLTEuMiAxLjMtLjIuNS0uMyAxLTEuMyAxLS4zLS4yLS40LS40LS41LS44eiIgZmlsbD0iI0ZGRiIvPjwvZz48L3N2Zz4=)}</style>--%>
    <%--<style type="text/css">.DrawingExample-svg-30WA{position:absolute;top:30px;right:0;left:0;margin:auto;transform:rotate(-44deg)}.DrawingExample-ellipse-26bv{stroke-dasharray:520;transform-origin:center;animation:DrawingExample-drawingExample-3Bm3 .6s linear both}@keyframes DrawingExample-drawingExample-3Bm3{0%{stroke-dashoffset:520}50%{stroke-dashoffset:1000;opacity:1}to{stroke-dashoffset:1000;opacity:0}}</style>--%>
    <%--<style type="text/css">.Spinner-spinner-2PGn{position:absolute;width:30px;height:30px;top:50%;left:50%;margin:-15px 0 0 -15px;animation:Spinner-rotate-RMMJ .8s linear infinite}.Spinner-spinner-2PGn .Spinner-circle-teFy{stroke:#4197ff;stroke-dasharray:187;stroke-dashoffset:46.75;transform-origin:center}@keyframes Spinner-rotate-RMMJ{0%{transform:rotate(0deg)}to{transform:rotate(1turn)}}</style>--%>
    <%--<style type="text/css">.FeedbackForm-form-1uUg{padding:40px 24px 32px;width:100%;font-size:14px;line-height:1.5;font-family:HelveticaNeue-Light,Helvetica,PingFangSC-Light,Hiragino Sans GB,Microsoft YaHei,Arial,sans-serif;color:#404040;box-sizing:border-box}.FeedbackForm-header-3hQI{margin-bottom:26px;text-align:center}.FeedbackForm-title-2uCC{font-size:24px;font-weight:500;line-height:33px;font-family:Helvetica,PingFang SC,Hiragino Sans GB,Microsoft YaHei,Arial,sans-serif}.FeedbackForm-inputBox-15yJ{display:block;padding:12px;width:100%;height:auto;font-size:15px;border:1px solid #e7eaf1;border-radius:3px;box-sizing:border-box;resize:none;outline:none;color:inherit;transition:box-shadow .15s ease-out;overflow:auto}.FeedbackForm-inputBox-15yJ::-webkit-input-placeholder{color:#9aaabf;transition:color .15s ease-out}.FeedbackForm-inputBox-15yJ::-moz-placeholder{color:#9aaabf;transition:color .15s ease-out}.FeedbackForm-inputBox-15yJ:-ms-input-placeholder{color:#9aaabf;transition:color .15s ease-out}.FeedbackForm-inputBox-15yJ::placeholder{color:#9aaabf;transition:color .15s ease-out}.FeedbackForm-inputBox-15yJ:hover::-webkit-input-placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ:hover::-moz-placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ:hover:-ms-input-placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ:hover::placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ:focus{box-shadow:0 0 5px #e7eaf1}.FeedbackForm-inputBox-15yJ:focus::-webkit-input-placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ:focus::-moz-placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ:focus:-ms-input-placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ:focus::placeholder{color:rgba(154,170,191,.8)}.FeedbackForm-inputBox-15yJ.FeedbackForm-isWarning-2ds-{border-color:#f75659}.FeedbackForm-inputBox-15yJ.FeedbackForm-isWarning-2ds-::-webkit-input-placeholder{color:#f75659}.FeedbackForm-inputBox-15yJ.FeedbackForm-isWarning-2ds-::-moz-placeholder{color:#f75659}.FeedbackForm-inputBox-15yJ.FeedbackForm-isWarning-2ds-:-ms-input-placeholder{color:#f75659}.FeedbackForm-inputBox-15yJ.FeedbackForm-isWarning-2ds-::placeholder{color:#f75659}.FeedbackForm-inputBox-15yJ.FeedbackForm-isWarning-2ds-:focus{box-shadow:none}.FeedbackForm-screenShot--Gsn{overflow:hidden;box-sizing:border-box;transition:max-height .3s ease,opacity .3s ease}.FeedbackForm-screenShotLabel-2Sgh{padding-top:22px;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.FeedbackForm-canvasContainer-mrde{margin-top:8px;position:relative;background-color:#f6f7f9}.FeedbackForm-canvas-tSGI{display:block;max-width:100%;cursor:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABIAAAASCAYAAABWzo5XAAAABGdBTUEAALGPC/xhBQAAARpJREFUOBGdkr1KA0EUhTcxEkSQQIpAihQWPoedD2BnIVsZQiBVEkiR7SwtBDsJqXwBLQwEgoWNjY2FjYUQ38Ei5Oc7sBeGLTKze+Djzsyecxh2N4ryq0zkHpYQQ2H1SW5TNsxukaZzQsewACvTvIBg3eFUaABHMEv3OruBIN3icm8wZl+FZ3iBQ/AqweGW2FrlKlChV0McFsxOvaegm/T2lLzzTC/dqzaO7A1s/8GzE28Dhhj0f1jQnZ+c18CrKxxrcMO2/uK87m3AcAkrsKA7vzlvQJAmuNywrX84bwY1YBrBATyCFWj+QguCJKNCU1DZQ7r/Y55CsK5x2i2eWFcggTPIJd3Eiv5Zd3KlU3OJOQd9lVd4A5Xl1g4YG2GGhwRfegAAAABJRU5ErkJggg==) 0 17,default;cursor:-webkit-image-set(url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABIAAAASCAYAAABWzo5XAAAABGdBTUEAALGPC/xhBQAAARpJREFUOBGdkr1KA0EUhTcxEkSQQIpAihQWPoedD2BnIVsZQiBVEkiR7SwtBDsJqXwBLQwEgoWNjY2FjYUQ38Ei5Oc7sBeGLTKze+Djzsyecxh2N4ryq0zkHpYQQ2H1SW5TNsxukaZzQsewACvTvIBg3eFUaABHMEv3OruBIN3icm8wZl+FZ3iBQ/AqweGW2FrlKlChV0McFsxOvaegm/T2lLzzTC/dqzaO7A1s/8GzE28Dhhj0f1jQnZ+c18CrKxxrcMO2/uK87m3AcAkrsKA7vzlvQJAmuNywrX84bwY1YBrBATyCFWj+QguCJKNCU1DZQ7r/Y55CsK5x2i2eWFcggTPIJd3Eiv5Zd3KlU3OJOQd9lVd4A5Xl1g4YG2GGhwRfegAAAABJRU5ErkJggg==) 1x,url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACQAAAAkCAYAAADhAJiYAAAABGdBTUEAALGPC/xhBQAAAn9JREFUWAnFlz1IV2EUxs2+ixCCrCCrIaiGGnLIRdBacqkhtCEbqqVaoqmacpIma6rFHHITh1pKMKFaInATkb4hKChKIwj7rt8D74XDy3tfKM69Hng4zz3nvc9zfH3/93//DQ31xWqsBsEnMAU6wILFSpwnwB+Db/BDoPZYjuMYsMMU/Af1nron2o7hh5KBNNhP0AtqjV24vQPFzsT5F70jVU7UiPhNcNyY7IC/AfEwxfUsvcVmvRtdhNIQkNFvcAoUsQ3yGhRDxLmpWOiZryUMzxqDrfCXiTXjZo0bvZIwKnbhvHHZBH9q1s7Am03fhV42BsUQcb5knDbAp8EzsNHUXWgfKrF52XW/cVwH1265xgXUyszL6gOuExixc/8xjIZ8C9YbHRd6GpWyHcjV33PfTpcJjMgJuJ4xOeNU7yP37DY6LvQoKnrUpwxzNb12tLpMYES64foyzBmnep+5p83ouNCDqHwHKcNc7Qv3tLtMYEQOwPVClTNO9ea5Z7/RcaH7UJFwyjBX0x/Q5TKBEdFWa8tzxqme3gTdX0/3IqrDmDLM1XTodfhdYw9qcyBnnOrpcdDrOglienDpAZYyzNX0oDwJ3GMUxZxxWe+M+yRBcBX53j8OpS9Z9ziM4tKguoJ8B5Tthq1fDPe4p+co3gbLgrLyLWDNY94X1rqnFmN8F64dUiwBIyAeRNd6Za0sjqFsTXWGdJYU+q00DGz/qhpVxg3EraH4Q7AmmDaSB4Hq10Ot0vQimMVDPaLeFJz1A1DvQsqVxmbU40Hs9ST9tZVOYMT1r+gw1zF9ReEx2BI3qrrWp6jTiH+FPwD6pI2BJ6DW0HkYBzNAQ9wH82DB4i/kUnkzGX+skQAAAABJRU5ErkJggg==) 2x) 0 17,default}.FeedbackForm-canvas-tSGI.FeedbackForm-isCapturing-3UFp{display:none}.FeedbackForm-checkLabelWrapper-3B7w{margin-top:12px}.FeedbackForm-checkLabel-2VTb{cursor:pointer;color:#9aaabf;transition:color .15s ease-out;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.FeedbackForm-checkLabel-2VTb:hover{color:rgba(154,170,191,.8)}.FeedbackForm-checkLabel-2VTb input{margin-right:.5em;vertical-align:1px}.FeedbackForm-actions-dJ87{margin-top:40px;text-align:center}.FeedbackForm-submitButton-1oKQ{display:inline-block;min-width:220px;padding:8px 1em;background-color:#0f88eb;border:1px solid #0f88eb;border-radius:3px;font:inherit;color:#fff;transition:background-color .15s ease-out,opacity .15s ease-out;cursor:pointer;outline:none}.FeedbackForm-submitButton-1oKQ[disabled]{opacity:.8;cursor:default}.FeedbackForm-submitButton-1oKQ:hover{background-color:#0d79d1}.FeedbackForm-submitButton-1oKQ:active{opacity:.8}.FeedbackForm-successMask-34go{display:-ms-flexbox;display:flex;-ms-flex-pack:center;justify-content:center;-ms-flex-align:center;align-items:center;position:absolute;top:0;left:0;width:100%;height:100%;background-color:#fff}.FeedbackForm-successTitle-1Y6p{font-size:24px;font-weight:500;line-height:33px;font-family:Helvetica,PingFang SC,Hiragino Sans GB,Microsoft YaHei,Arial,sans-serif;text-align:center}.FeedbackForm-successSubtitle-A_aP{margin-top:10px;font-size:18px;line-height:33px;text-align:center}</style>--%>
</head>
<body style="height: auto;width: auto">
<img src="${context}/images/bg.jpg"  style="position: absolute;left:0px;top:0px;width:100%;height:100%;z-index: -1">
<div class="index-main" >
    <div class="index-main-body" style="position: fixed;top: 0px;left: 0px;right: 0px;margin: auto;">
        <div class="index-header">

            <h1 class="logo">学&nbsp&nbsp习&nbsp&nbsp吧</h1>
       <img src="images/title_picture.png">
            <h2 class="subtitle">分享&nbsp&nbsp&nbsp成长&nbsp&nbsp&nbsp进步&nbsp&nbsp&nbsp快乐</h2>
        </div>

        <div class="desk-front sign-flow clearfix sign-flow-simple">

            <div class="index-tab-navs">
                <div class="navs-slider" data-active-index="1">
                    <a href="register.jsp" class="">注册</a>
                    <a href="#" class="active">登录</a>
                    <span class="navs-slider-bar"></span>
                </div>
                <span id="qqLoginBtn"></span>
                <script type="text/javascript">
                    QC.Login({
                        btnId:"qqLoginBtn"    //插入按钮的节点id
                    });
                </script>
            </div>


            <div class="view view-signin" data-za-module="SignInForm" style="display: block;">
                <form method="POST" novalidate="novalidate"/>
                    <input type="hidden" name="_xsrf" value="527ae7bdeb664821becfe1152275aca9">
                    <div class="group-inputs">

                        <div class="account input-wrapper">

                            <input type="text" name="userName" id="username" aria-label="姓名" placeholder="姓名" required="" class="username">
                        </div>
                        <div class="verification input-wrapper">
                            <input type="password" name="passWord" id="password" aria-label="密码" class="password" placeholder="密码" required=""><button type="button" class="send-code-button">获取验证码</button>
                        </div>

                        <div class="input-wrapper captcha-module" data-type="en">
                            <input name="captcha" placeholder="验证码" required="" data-rule-required="true" data-msg-required="请填写验证码">
                            <div class="captcha-container">

                                <img class="js-refreshCaptcha captcha" width="120" height="30" data-tooltip="s$t$看不清楚？换一张" alt="验证码">
                            </div>
                        </div>

                    </div>
                    <div class="button-wrapper command">
                        <button class="sign-button submit" id="submit" type="button" onclick="myconfirm()">登录</button>
                    </div>
                <div id="UserResult"></div>
                <div id="PasswordResult"></div>

                    <div class="signin-misc-wrapper clearfix">

                        <button type="button" class="signin-switch-button">手机验证码登录</button>

                        <a class="unable-login" href="https://www.zenghuangdong.cn/#">无法登录？</a>
                    </div>

                    <%--<div class="social-signup-wrapper" data-za-module="SNSSignIn">--%>
                        <%--<span class="name js-toggle-sns-buttons">社交帐号登录</span>--%>

                        <%--<div class="sns-buttons">--%>
                            <%--<a title="微信登录" class="js-bindwechat" href="https://www.zhihu.com/#"><i class="sprite-index-icon-wechat"></i></a>--%>
                            <%--<a title="微博登录" class="js-bindweibo" href="https://www.zhihu.com/#"><i class="sprite-index-icon-weibo"></i></a>--%>
                            <%--<a title="QQ 登录" class="js-bindqq" href="https://www.zhihu.com/#"><i class="sprite-index-icon-qq"></i></a>--%>
                        <%--</div>--%>


                    <%--</div>--%>

                </form>

            </div>
            <div class="view view-signup selected" data-za-module="SignUpForm" style="display: none;">
                <form class="zu-side-login-box" action="${context}/email/subscribe.html" id="sign-form-1" autocomplete="off" method="POST" novalidate="novalidate">
                    <input type="password" hidden="">
                    <input type="hidden" name="_xsrf" value="527ae7bdeb664821becfe1152275aca9">
                    <div class="group-inputs">


                        <div class="name input-wrapper">
                            <input required="" type="text" name="fullname" aria-label="姓名" placeholder="姓名">
                        </div>
                        <div class="email input-wrapper">

                            <input required="" type="text" class="account" name="phone_num" aria-label="手机号（仅支持中国大陆）" placeholder="手机号（仅支持中国大陆）">

                        </div>

                        <div class="input-wrapper">
                            <input required="" type="password" name="password" aria-label="密码" placeholder="密码（不少于 6 位）" autocomplete="off">
                        </div>

                        <div class="Captcha input-wrapper" data-type="cn" data-za-module="Captcha">
                            <div class="Captcha-operate">
                                <input type="hidden" name="captcha" required="" data-rule-required="true" data-msg-required="请点击图中所有倒立的文字" value="">
                                <input type="hidden" name="captcha_type" value="cn" required="">
                                <label class="Captcha-prompt">请点击图中所有倒立的文字</label>
                                <span class="Captcha-refresh js-refreshCaptcha sprite-index-icon-refresh"></span>
                            </div>
                            <div class="Captcha-imageConatiner">
                                <img class="Captcha-image" alt="验证码">
                            </div>
                        </div>

                        <div class="UserResult"></div>

                    </div>
                    <div class="button-wrapper command">
                        <button class="sign-button submit" type="submit">注册学习吧</button>
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
    <a target="_blank" href="http://www.zenghuangdong.cn/backmanager/roundtable">学习吧圆桌</a>
    <span class="dot">·</span>
    <a target="_blank" href="http://www.zenghuangdong.cn/backmanager/roundtable" data-za-c="explore" data-za-a="visit_explore" data-za-l="home_bottom_explore">发现</a>
    <span class="dot">·</span>



    <a href="https://www.zenghuangdong.cn/backmanager/signin" class="footer-mobile-show">使用机构帐号登录</a>

    <span class="dot footer-mobile-show">·</span>

    <a href="http://www.zenghuangdong.cn/backmanager/contact.jsp" class="footer-mobile-show">联系我</a>
    <span class="dot">·</span>
    <br>
    <span><a href="http://www.miitbeian.gov.cn/" style="color: #0d79d1">粤ICP备 17033983 号</a></span>
    <span class="dot">·</span>


</div>

</body></html>
