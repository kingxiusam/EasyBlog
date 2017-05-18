<#import "spring.ftl" as s/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>学习吧管理后台</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="<@s.url'/plugins/bootstrap/css/bootstrap.css'/>"rel="stylesheet" media="screen" />
    <link href="<@s.url'/plugins/jquery/page/page.css'/>" rel="stylesheet" type="text/css" />
    <link href="<@s.url'/plugins/jquery/msgbox/msgbox.css'/>" rel="stylesheet" type="text/css" />
    <script src="<@s.url'/plugins/jquery/jquery-1.10.2.js'/>"></script>
    <script src="<@s.url'/plugins/bootstrap/js/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<@s.url'/plugins/jquery/page/jquery.myPagination5.0.js'/>"></script>
    <script type="text/javascript" src="<@s.url'/plugins/jquery/msgbox/msgbox.js'/>"></script>
    <script type="text/javascript" src="<@s.url'/plugins/jquery/time.js'/>"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries-->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="progress progress-striped active">
    <div class="progress-bar progress-bar-primary" id="processbar" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width:0%">
        <span id="status">80% 完成</span>
    </div>
</div>

<script type="text/javascript">

    var breaker=100;
    var turn=100;
    var progress=0;
    var timer = setInterval(function(){
        progress=progress+turn;
        $("#status").html(progress+"% 完成");
        $("#processbar").attr("style", "width:"+progress+"%");
        if (progress>=100) {
            clearInterval(timer);
        }
    }, breaker);
</script>

<div class="row">
    <div class="col-sm-6 col-md-3">
        <div class="thumbnail">
            <img src="/wp-content/uploads/2014/06/kittens.jpg"
                 alt="">
            <div class="caption">
                <h3>发表帖子</h3>
                <p>编辑帖子</p>
                <p>
                <p>
                    <a href="<@s.url'/manager/kindEdit.html'/>" class="btn btn-primary" role="button">
                        进入
                    </a>

                </p>
                </p>
            </div>
        </div>
    </div>
</div>

</body>
</html>