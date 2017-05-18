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

        <div class="container">
            <a href="<@s.url'/user/exit.html'/>" class="btn btn-link pull-right"
               role="button">Exit</a>
            <h1 class="page-header">后台管理之中心</h1>
        <div class="row">
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="/wp-content/uploads/2014/06/kittens.jpg"
                         alt="">
                    <div class="caption">
                        <h3>用户管理</h3>
                        <p>对用户进行管理，用户权限控制</p>
                        <p>
                            <a href="<@s.url'/manager/user.html'/>" class="btn btn-primary" role="button">
                                进入
                            </a>

                        </p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="/wp-content/uploads/2014/06/kittens.jpg"
                         alt="">
                    <div class="caption">
                        <h3>帖子管理</h3>
                        <p>对帖子进行管理，可修改帖子详情</p>
                        <p>
                            <a href="<@s.url'/manager/post.html'/>" class="btn btn-primary" role="button">
                                进入
                            </a>

                        </p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="/wp-content/uploads/2014/06/kittens.jpg"
                         alt="">
                    <div class="caption">
                        <h3>系统日志</h3>
                        <p>查看系统用户登录日志</p>
                        <p>
                            <a href="<@s.url'/manager/log.html'/>" class="btn btn-primary" role="button">
                                查看
                            </a>

                        </p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="/wp-content/uploads/2014/06/kittens.jpg"
                         alt="">
                    <div class="caption">
                        <h3>用户订阅邮箱管理</h3>
                        <p>可对订阅学习吧的用户邮箱进行管理</p>
                        <p>
                            <a href="<@s.url'/manager/email.html'/>" class="btn btn-primary" role="button">
                                进入
                            </a>

                        </p>
                    </div>
                </div>
            </div>
        </div>



            <div class="row">
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail">
                        <img src="/wp-content/uploads/2014/06/kittens.jpg"
                             alt="">
                        <div class="caption">
                            <h3>文件操作</h3>
                            <p>可上传文件到系统，从系统中下载文件</p>
                            <p>
                                <button  data-target="#uploadwin" data-toggle="modal" class="btn btn-primary" role="button">
                                    上传
                                </button>
                                <button  data-target="#downloadwin" data-toggle="modal" class="btn btn-default" role="button">
                                    下载
                                </button>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal fade" id="downloadwin" tabindex="-1" role="dialog"
                 aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <form class="form-horizontal" action="<@s.url'/file/downLoadFile.html'/>" role="form" method="post" enctype="multipart/form-data">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal"aria-hidden="true">&times;</button>
                                <h4 class="modal-title" id="myModalLabel">文件下载</h4>
                            </div>
                            <div class="modal-body">

                                <div class="form-group">

                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">取消</button>
                                    <button type="submit" class="btn btn-primary">下载</button>
                                </div>
                            </div>

                    </form>
                </div>
            </div>




        </div>


            <div class="modal fade" id="uploadwin" tabindex="-1" role="dialog"
                 aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <form class="form-horizontal" action="<@s.url'/file/upLoadFile.html'/>" role="form" method="post" enctype="multipart/form-data">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal"aria-hidden="true">&times;</button>
                                <h4 class="modal-title" id="myModalLabel">文件上传</h4>
                            </div>
                            <div class="modal-body">

                                <div class="form-group">
                                    <label class="col-xs-2 control-label">帖子类型</label>
                                    <div class="col-xs-10">
                                        <input type="text" class="form-control" id="" name="postType">
                                    </div>
                                 </div>
                                <div class="form-group">
                                    <label class="col-xs-2 control-label">帖子标题</label>
                                    <div class="col-xs-10">
                                        <input type="text" class="form-control" id="" name="postTitle">
                                    </div>
                                </div>

                                <input type="file" class="form-control" style="height: auto" id="filename" name="file">
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">取消</button>
                                    <button type="submit" class="btn btn-primary">上传</button>
                                </div>
                            </div>

                    </form>
                </div>

            </div>


        </body>

</html>