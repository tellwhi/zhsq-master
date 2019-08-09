<%--
  Created by IntelliJ IDEA.
  User: Monster
  Date: 2018/12/13
  Time: 00:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>任务列表</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <!-- web路径：
    不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
    以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
            http://localhost:3306/crud
     -->
    <script type="text/javascript"
            src="${APP_PATH }/static/js/jquery-3.3.1.min.js"></script>
    <link
            href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 搭建显示页面 -->
<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <!-- 按钮 -->
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="call_add_modal_btn">新增</button>
            <button class="btn btn-danger" id="call_delete_all_btn">删除</button>
        </div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="calls_table">
                <thead>
                <tr>
                    <th>
                        <input type="checkbox" id="check_all"/>
                    </th>
                    <th>#</th>
                    <th>任务名</th>
                    <th>任务金额</th>
                    <th>发布时间</th>
                    <th>截止时间</th>
                    <th>发布人</th>
                    <th>任务描述</th>
                    <th>任务地点</th>
                    <th>任务状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>

    <!-- 显示分页信息 -->
    <div class="row">
        <!--分页文字信息  -->
        <div class="col-md-6" id="page_info_area"></div>
        <!-- 分页条信息 -->
        <div class="col-md-6" id="page_nav_area">
        </div>
    </div>
</div>
<script type="text/javascript">


    function timestampToTime(timestamp) {
        var date = new Date(timestamp * 1000);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
        var Y = date.getFullYear() + '-';
        var M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
        var D = date.getDate() + ' ';
        var h = date.getHours() + ':';
        var m = date.getMinutes() + ':';
        var s = date.getSeconds();
        return Y+M+D+h+m+s;
    }


    var totalRecord,currentPage;
    //1、页面加载完成以后，直接去发送ajax请求,要到分页数据
    $(function(){
        //去首页
        to_page(1);
    });



    function to_page(pn){
        $.ajax({
            url:"${APP_PATH}/call/calls",
            data:"pn="+pn,
            type:"GET",
            success:function(result){
                //console.log(result);
                //1、解析并显示员工数据
                build_emps_table(result);
                //2、解析并显示分页信息
                build_page_info(result);
                //3、解析显示分页条数据
                build_page_nav(result);
            }
        });
    }

    function build_emps_table(result){
        //清空table表格
        $("#calls_table tbody").empty();
        var calls = result.extend.pageInfo.list;
        $.each(calls,function(index,item){
            var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
            var callIdTd = $("<td></td>").append(item.callId);
            var callTitleTd = $("<td></td>").append(item.callTitle);
            var callMoneyTd = $("<td></td>").append(item.callMoney);
            var subTimeTd = $("<td></td>").append(timestampToTime(item.subTime/1000));
            var endTimeTd = $("<td></td>").append(timestampToTime(item.endTime/1000));
            var subNameTd = $("<td></td>").append(item.subName);
            var callDespTd = $("<td></td>").append(item.callDesp);
            var callAddressTd = $("<td></td>").append(item.callAddress);
            var callNowTd = $("<td></td>").append(item.callNow);
            /**
             <button class="">
             <span class="" aria-hidden="true"></span>
             编辑
             </button>
             */
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
            //为编辑按钮添加一个自定义的属性，来表示当前员工id
            editBtn.attr("edit-id",item.callId);
            var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
            //为删除按钮添加一个自定义的属性来表示当前删除的员工id
            delBtn.attr("del-id",item.callId);
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
            //var delBtn =
            //append方法执行完成以后还是返回原来的元素
            $("<tr></tr>").append(checkBoxTd)
                .append(callIdTd)
                .append(callTitleTd)
                .append(callMoneyTd)
                .append(subTimeTd)
                .append(endTimeTd)
                .append(subNameTd)
                .append(callDespTd)
                .append(callAddressTd)
                .append(callNowTd)
                .append(btnTd)
                .appendTo("#calls_table tbody");
        });
    }
    //解析显示分页信息
    function build_page_info(result){
        $("#page_info_area").empty();
        $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
            result.extend.pageInfo.pages+"页,总"+
            result.extend.pageInfo.total+"条记录");
        totalRecord = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }
    //解析显示分页条，点击分页要能去下一页....
    function build_page_nav(result){
        //page_nav_area
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");

        //构建元素
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if(result.extend.pageInfo.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else{
            //为元素添加点击翻页的事件
            firstPageLi.click(function(){
                to_page(1);
            });
            prePageLi.click(function(){
                to_page(result.extend.pageInfo.pageNum -1);
            });
        }



        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        if(result.extend.pageInfo.hasNextPage == false){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else{
            nextPageLi.click(function(){
                to_page(result.extend.pageInfo.pageNum +1);
            });
            lastPageLi.click(function(){
                to_page(result.extend.pageInfo.pages);
            });
        }



        //添加首页和前一页 的提示
        ul.append(firstPageLi).append(prePageLi);
        //1,2，3遍历给ul中添加页码提示
        $.each(result.extend.pageInfo.navigatepageNums,function(index,item){

            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if(result.extend.pageInfo.pageNum == item){
                numLi.addClass("active");
            }
            numLi.click(function(){
                to_page(item);
            });
            ul.append(numLi);
        });
        //添加下一页和末页 的提示
        ul.append(nextPageLi).append(lastPageLi);

        //把ul加入到nav
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }

    <%--//清空表单样式及内容--%>
    <%--function reset_form(ele){--%>
        <%--$(ele)[0].reset();--%>
        <%--//清空表单样式--%>
        <%--$(ele).find("*").removeClass("has-error has-success");--%>
        <%--$(ele).find(".help-block").text("");--%>
    <%--}--%>
    $("#call_add_modal_btn").click(function(){
        alert("没写 别点了")
    });
    $(document).on("click",".edit_btn",function() {
        alert("也没写 别点了")
    });
//    //点击新增按钮弹出模态框。
//    $("#call_add_modal_btn").click(function(){
//        //清除表单数据（表单完整重置（表单的数据，表单的样式））
//        reset_form("#callAddModal form");
//
//        //弹出模态框
//        $("#callAddModal").modal({
//            backdrop:"static"
//        });
//    });


    <%--//校验表单数据--%>
    <%--function validate_add_form(){--%>
        <%--//1、拿到要校验的数据，使用正则表达式--%>
        <%--var callName = $("#callName_add_input").val();--%>
        <%--var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;--%>
        <%--if(!regName.test(callName)){--%>
            <%--//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");--%>
            <%--show_validate_msg("#callName_add_input", "error", "用户名可以是2-5位中文或者6-16位英文和数字的组合");--%>
            <%--return false;--%>
        <%--}else{--%>
            <%--show_validate_msg("#callName_add_input", "success", "");--%>
        <%--};--%>

        <%--//2、校验邮箱信息--%>
        <%--var email = $("#email_add_input").val();--%>
        <%--var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;--%>
        <%--if(!regEmail.test(email)){--%>
            <%--//alert("邮箱格式不正确");--%>
            <%--//应该清空这个元素之前的样式--%>
            <%--show_validate_msg("#email_add_input", "error", "邮箱格式不正确");--%>
            <%--/* $("#email_add_input").parent().addClass("has-error");--%>
            <%--$("#email_add_input").next("span").text("邮箱格式不正确"); */--%>
            <%--return false;--%>
        <%--}else{--%>
            <%--show_validate_msg("#email_add_input", "success", "");--%>
        <%--}--%>
        <%--return true;--%>
    <%--}--%>

    <%--//显示校验结果的提示信息--%>
    <%--function show_validate_msg(ele,status,msg){--%>
        <%--//清除当前元素的校验状态--%>
        <%--$(ele).parent().removeClass("has-success has-error");--%>
        <%--$(ele).next("span").text("");--%>
        <%--if("success"==status){--%>
            <%--$(ele).parent().addClass("has-success");--%>
            <%--$(ele).next("span").text(msg);--%>
        <%--}else if("error" == status){--%>
            <%--$(ele).parent().addClass("has-error");--%>
            <%--$(ele).next("span").text(msg);--%>
        <%--}--%>
    <%--}--%>



    <%--//点击保存，保存员工。--%>
    <%--$("#call_save_btn").click(function(){--%>
        <%--//1、模态框中填写的表单数据提交给服务器进行保存--%>
        <%--//1、先对要提交给服务器的数据进行校验--%>
        <%--if(!validate_add_form()){--%>
            <%--return false;--%>
        <%--};--%>
        <%--//1、判断之前的ajax用户名校验是否成功。如果成功。--%>
        <%--if($(this).attr("ajax-va")=="error"){--%>
            <%--return false;--%>
        <%--}--%>

        <%--//2、发送ajax请求保存员工--%>
        <%--$.ajax({--%>
            <%--url:"${APP_PATH}/call",--%>
            <%--type:"POST",--%>
            <%--data:$("#callAddModal form").serialize(),--%>
            <%--success:function(result){--%>
                <%--//alert(result.msg);--%>
                <%--if(result.code == 100){--%>
                    <%--//员工保存成功；--%>
                    <%--//1、关闭模态框--%>
                    <%--$("#callAddModal").modal('hide');--%>

                    <%--//2、来到最后一页，显示刚才保存的数据--%>
                    <%--//发送ajax请求显示最后一页数据即可--%>
                    <%--to_page(totalRecord);--%>
                <%--}else{--%>
                    <%--//显示失败信息--%>
                    <%--//console.log(result);--%>
                    <%--//有哪个字段的错误信息就显示哪个字段的；--%>
                    <%--if(undefined != result.extend.errorFields.email){--%>
                        <%--//显示邮箱错误信息--%>
                        <%--show_validate_msg("#email_add_input", "error", result.extend.errorFields.email);--%>
                    <%--}--%>
                    <%--if(undefined != result.extend.errorFields.callName){--%>
                        <%--//显示员工名字的错误信息--%>
                        <%--show_validate_msg("#callName_add_input", "error", result.extend.errorFields.callName);--%>
                    <%--}--%>
                <%--}--%>
            <%--}--%>
        <%--});--%>
    <%--});--%>

    <%--//1、我们是按钮创建之前就绑定了click，所以绑定不上。--%>
    <%--//1）、可以在创建按钮的时候绑定。    2）、绑定点击.live()--%>
    <%--//jquery新版没有live，使用on进行替代--%>
    <%--$(document).on("click",".edit_btn",function(){--%>
        <%--//alert("edit");--%>
        <%--getCall($(this).attr("edit-id"));--%>
        <%--//3、把员工的id传递给模态框的更新按钮--%>
        <%--$("#call_update_btn").attr("edit-id",$(this).attr("edit-id"));--%>
        <%--$("#callUpdateModal").modal({--%>
            <%--backdrop:"static"--%>
        <%--});--%>
    <%--});--%>

    <%--function getCall(id){--%>
            <%--$.ajax({--%>
                <%--url:"${APP_PATH}/call/"+id,--%>
                <%--type:"GET",--%>
                <%--success:function(result){--%>
                    <%--//console.log(result);--%>
                    <%--var callData = result.extend.call;--%>
                    <%--$("#callName_update_static").text(callData.callId);--%>
<%--//                    $("#email_update_input").val(callData.email);--%>
<%--//                    $("#empUpdateModal input[name=gender]").val([empData.gender]);--%>
<%--//                    $("#empUpdateModal select").val([empData.dId]);--%>
                <%--}--%>
            <%--});--%>
    <%--}--%>

    <%--//点击更新，更新员工信息--%>
    <%--$("#call_update_btn").click(function(){--%>

        <%--$.ajax({--%>
            <%--url:"${APP_PATH}/call/"+$(this).attr("edit-id"),--%>
            <%--type:"PUT",--%>
            <%--data:$("#callUpdateModal form").serialize(),--%>
            <%--success:function(result){--%>
                <%--//alert(result.msg);--%>
                <%--//1、关闭对话框--%>
                <%--$("#callUpdateModal").modal("hide");--%>
                <%--//2、回到本页面--%>
                <%--to_page(currentPage);--%>
            <%--}--%>
        <%--});--%>
    <%--});--%>

    //单个删除
    $(document).on("click",".delete_btn",function(){
        //1、弹出是否确认删除对话框
        var callName = $(this).parents("tr").find("td:eq(2)").text();
        var callId = $(this).attr("del-id");
        //alert($(this).parents("tr").find("td:eq(1)").text());
        if(confirm("确认删除【"+callName+"】吗？")){
            //确认，发送ajax请求删除即可
            $.ajax({
                url:"${APP_PATH}/call/"+callId,
                type:"DELETE",
                success:function(result){
                    alert(result.msg);
                    //回到本页
                    to_page(currentPage);
                }
            });
        }
    });

    //完成全选/全不选功能
    $("#check_all").click(function(){
        //attr获取checked是undefined;
        //我们这些dom原生的属性；attr获取自定义属性的值；
        //prop修改和读取dom原生属性的值
        $(".check_item").prop("checked",$(this).prop("checked"));
    });

    //check_item
    $(document).on("click",".check_item",function(){
        //判断当前选择中的元素是否5个
        var flag = $(".check_item:checked").length==$(".check_item").length;
        $("#check_all").prop("checked",flag);
    });

    //点击全部删除，就批量删除
    $("#call_delete_all_btn").click(function(){
        //
        var callNames = "";
        var del_idstr = "";
        $.each($(".check_item:checked"),function(){
            //this
            callNames += $(this).parents("tr").find("td:eq(2)").text()+",";
            //组装员工id字符串
            del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
        });
        //去除callNames多余的,
        callNames = callNames.substring(0, callNames.length-1);
        //去除删除的id多余的-
        del_idstr = del_idstr.substring(0, del_idstr.length-1);
        if(confirm("确认删除【"+callNames+"】吗？")){
            //发送ajax请求删除
            $.ajax({
                url:"${APP_PATH}/call/"+del_idstr,
                type:"DELETE",
                success:function(result){
                    alert(result.msg);
                    //回到当前页面
                    to_page(currentPage);
                }
            });
        }
    });
</script>
</body>
</html>