/**
 * Created by Administrator on 2017/4/3.
 */
function countNum(url,id) {
    var urlAdress=url;
    var contentId=id;
    if (urlAdress!=""){
        window.location.href='http://www.zenghuangdong.cn/backmanager/single/countNum_'+contentId+'.html?url='+urlAdress;
    }else {
        alert("对不起，该链接已失效或不存在！！");
    }
}


function delConfirm() {
    if (!confirm('你确定要删除吗?')){
        window.event.returnValue=false;
    }
}