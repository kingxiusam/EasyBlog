/**
 * Created by Administrator on 2017/5/7.
 */

    $(function(){
        var validate = $("#messageForm").validate({
            //debug: true, //调试模式取消submit的默认提交功能
            //errorClass: "label.error", //默认为错误的样式类为：error
            focusInvalid: false, //当为false时，验证无效时，没有焦点响应
            onkeyup: false,
            submitHandler: function(form){   //表单提交句柄,为一回调函数，带一个参数：form
                confirm("确认要提交评论吗？");
                form.submit();   //提交表单
            },

            rules:{
                name:{
                    required:true
                },
                email:{
                    required:true,
                    email:true

                },
                website:{
                    url:true
                },

                message:{
                    required:true
                }

            },

            messages:{
                name:{
                    required:"必填"
                },
                email:{
                    required:"必填",
                    email:"请输入正确格式的电子邮件"
                },
                website:{

                    url:"请输入合法的网址"
                },
                message:{
                    required:"必填"
                }
            }

        });

    });

