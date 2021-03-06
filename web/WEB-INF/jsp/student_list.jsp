<%--
  Created by IntelliJ IDEA.
  User: 郑悦恺
  Date: 2019/12/4
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <script src="<%=request.getContextPath()%>/resources/jquery-3.4.1.js" charset="utf-8"></script>
</head>
<body>

<div id='saveDiv' style="display : none">

    <div style="width: 80%; margin: 20px auto">
        <br>

        <form class="layui-form layui-form-pane" lay-filter="dataFrm" id="dataFrm">
            <div class="layui-form-item">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-block">
                    <input type="text" name="name_ss" autocomplete="off" placeholder="请输入" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">年级</label>
                <div class="layui-input-block">
                    <%--<input type="text" name="grade_ss" autocomplete="off" placeholder="请输入" class="layui-input">--%>
                    <select name="grade_ss" lay-verify="required" placeholder="请输入" lay-search="">
                        <%--<option value="">直接选择或搜索选择</option>--%>
                        <option value="大一">大一</option>
                        <option value="大二">大二</option>
                        <option value="大三">大三</option>
                        <option value="大四">大四</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">班级</label>
                <div class="layui-input-block">
                    <%--<input type="text" name="class_name" autocomplete="off" placeholder="请输入" class="layui-input">--%>
                    <select id="class_name" name="class_name" lay-filter="class_name">
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">老师</label>
                <div class="layui-input-block">
                    <%--<input type="text" name="teacher_name" autocomplete="off" placeholder="请输入" class="layui-input">--%>
                    <select id="teacher_name" name="teacher_name" lay-filter="teacher_name">
                    </select>
                </div>
            </div>

            <div class="layui-form-item" pane="">
                <label class="layui-form-label">性别</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex_ss" value="1" title="男" checked="">
                    <input type="radio" name="sex_ss" value="0" title="女">
                </div>
            </div>
            <div class="layui-form-item">
                <button class="layui-btn" lay-submit="" lay-filter="doSubmit1">提交</button>
            </div>
        </form>
    </div>

</div>

<div id='updateDiv' style="display : none">

    <div style="width: 80%; margin: 20px auto">
        <form class="layui-form layui-form-pane" lay-filter="dataFrm2" id="dataFrm2">

            <div class="layui-form-item">
                <label class="layui-form-label">ID</label>
                <div class="layui-input-block">
                    <input type="text" readonly="readonly" name="s_id" autocomplete="off" placeholder="请输入"
                           class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-block">
                    <input type="text" name="s_name" autocomplete="off" placeholder="请输入" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">年级</label>
                <div class="layui-input-block">
                    <input type="text" name="grade" autocomplete="off" placeholder="请输入" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">老师</label>
                <div class="layui-input-block">
                    <input type="text" readonly="readonly" name="teacher_id" autocomplete="off" placeholder="请输入"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">班级</label>
                <div class="layui-input-block">
                    <input type="text" readonly="readonly" name="class_id" autocomplete="off" placeholder="请输入"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item" pane="">
                <label class="layui-form-label">性别</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="1" title="男" checked="">
                    <input type="radio" name="sex" value="0" title="女">
                </div>
            </div>
            <div class="layui-form-item">
                <button class="layui-btn" lay-submit="" lay-filter="doSubmit2">提交</button>
            </div>
        </form>
    </div>


</div>


<div class="layui-card-body ">
    <form class="layui-form layui-col-space5" method="post">
        <div class="layui-inline layui-show-xs-block">
            <input class="layui-input" autocomplete="off" placeholder="开始日" readonly name="start" id="start"
                   lay-key="1">
        </div>
        <div class="layui-inline layui-show-xs-block">
            <input class="layui-input" autocomplete="off" placeholder="截止日" readonly name="end" id="end" lay-key="2">
        </div>
        <div class="layui-inline layui-show-xs-block">
            <input type="text" name="username" placeholder="请输入用户名" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-inline layui-show-xs-block">
            <%--lay-submit=""  lay-filter="sreach"   --%>
            <button class="layui-btn" id="doSearch" lay-submit="" lay-filter="doSearch"><i class="layui-icon"></i>
            </button>
        </div>
    </form>
</div>

<table class="layui-hide" id="test" lay-filter="test"></table>
<%--表格--%>
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
        <button class="layui-btn layui-btn-sm" lay-event="addStu">添加</button>
        <%--<button class="layui-btn layui-btn-sm" lay-event="addStu">查找</button>--%>
    </div>
</script>

<%--操作--%>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script src="<%=request.getContextPath()%>/resources/layui/layui.js" charset="utf-8"></script>

<script>
    layui.use(['jquery', 'layer', 'form', 'table', 'laydate'], function () {
        var $ = layui.jquery;
        var table = layui.table;
        var layer = layui.layer;
        var form = layui.form;
        var laydate = layui.laydate;


        //绑定时间选择器
        laydate.render({
            elem: '#start'
        });
        laydate.render({
            elem: '#end'
        });


        //动态添加下拉框     同时可以设置默认值
        $.ajax({
            url: 'student_select',
            dataType: 'json',
            // type:'post',
            success: function (data) {
                // console.log("获取成功");
                // console.log(data);
                $("#class_name").append(new Option("请选择班级", ""));
                $.each(data, function (index, item) {
                    // console.log(item);
                    //option  第一个参数是页面显示的值，第二个参数是传递到后台的值
                    $('#class_name').append(new Option(item.name, item.id));//往下拉菜单里添加元素
                    //设置value（这个值就可以是在更新的时候后台传递到前台的值）为2的值为默认选中
                    // $('#selectId').val(2);
                })
                // form.render(); //更新全部表单内容
                form.render('select'); //刷新表单select选择框渲染
            }
        });


        form.on('select(class_name)', function (data) {
            var value = data.value;  //select选中的值
            $.ajax({
                url: "student_select2",
                data: {class_id: value},
                dataType: "json",
                type: 'post',
                success: function (resultData) {
                    if (resultData != null) {
                        //清空赋值
                        $("#teacher_name").empty();
                        // console.log(resultData);
                        $("#teacher_name").append(new Option("请选择老师", ""));
                        $.each(resultData, function (index, item) {
                            //赋值
                            $('#teacher_name').append(new Option(item.name, item.id));
                        });
                    } else {
                        $("#project").append(new Option("暂无数据", ""));
                    }
                    layui.form.render("select");
                }
            })
        })
        layui.form.render("select");


        var tableIns = table.render({
            elem: '#test'
            , id: 'tableReload'//重载数据表格
            , url: 'http://localhost:8079/ssm_02/student_list'
            , toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            , defaultToolbar: ['filter', 'exports', 'print', { //学生信息
                title: '提示'
                , layEvent: 'LAYTABLE_TIPS'
                , icon: 'layui-icon-tips'
            }]
            , title: '用户数据表'
            , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            , cols: [[
                {type: 'checkbox', align: 'center', fixed: 'left'}
                , {field: 's_id', align: 'center', title: 'ID', fixed: 'left', unresize: true, sort: true}
                , {field: 's_name', align: 'center', title: '用户名', edit: 'text'}
                , {
                    field: 'sex', align: 'center', title: '性别', templet: function (d) {
                        return d.sex == '1' ? '男' : '女';
                    }
                }
                , {field: 'grade', align: 'center', title: '年级',}
                , {
                    title: '班级', align: 'center', templet: function (d) {
                        return d.aClass.name;
                    }
                }
                , {
                    title: '老师', align: 'center', templet: function (d) {
                        return d.teacher.name;
                    }
                }
                , {
                    field: 'createDate',
                    title: '创建时间',
                    width: 195,
                    align: 'center',
                    templet: "<div>{{layui.util.toDateString(d.aClass.createDate, 'yyyy年MM月dd日 HH:mm:ss')}}</div>"
                }
                , {fixed: 'right', title: '操作', align: 'center', toolbar: '#barDemo', width: 150}
            ]]
            , page: true
        });

        //头工具栏事件
        table.on('toolbar(test)', function (obj) {
            var checkStatus = table.checkStatus(obj.config.id);
            switch (obj.event) {
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：' + data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选' : '未全选');
                    break;
                case 'addStu':
                    // layer.open({
                    //     type: 1,
                    //     title: '添加用户信息',
                    //     shadeClose: true,
                    //     shade: false,
                    //     maxmin: false, //开启最大化最小化按钮
                    //     area: ['893px', '600px'],
                    //     content: $("#info").html()
                    // });
                    console.log("add");
                    openAddUser();
                    break;
                //自定义头工具栏右侧图标 - 提示
                case 'LAYTABLE_TIPS':
                    layer.alert('这是工具栏右侧自定义的一个图标按钮');
                    break;
            }
        });
        var url;
        var mainIndex;

        //打开添加页面
        function openAddUser() {
            mainIndex = layer.open({
                type: 1,
                title: '添加用户',
                content: $("#saveDiv"),
                area: ['600px', '450px'],
                success: function (index) {
                    //清空表单数据
                    $("#dataFrm")[0].reset();

                    $("#teacher_name").empty();
                    // url="user/addUser.action";
                }
            });
        }

        //添加
        form.on("submit(doSubmit1)", function (obj) {
            //序列化表单数据
            var params = $("#dataFrm").serialize();
            console.log(params);
            $.post("http://localhost:8079/ssm_02/student_add", params, function (obj) {
                layer.msg(obj);
                //关闭弹出层
                // layer.close(mainIndex);
                //刷新数据 表格
                tableIns.reload();
            })
        });

        //更新
        form.on("submit(doSubmit2)", function (obj) {
            //序列化表单数据
            var params = $("#dataFrm2").serialize();
            // console.log(params);
            $.post("http://localhost:8079/ssm_02/student_update", params, function (obj) {
                layer.msg(obj);
                //关闭弹出层
                // layer.close(mainIndex);
                //刷新数据 表格
                tableIns.reload();
            })
        });

        //edit


        table.on('edit(test)', function(obj){ //注：edit是固定事件名，test是table原始容器的属性 lay-filter="对应的值"
            console.log(obj.value); //得到修改后的值
            console.log(obj.field); //当前编辑的字段名
            var value = obj.value;
            // console.log(obj.data); //所在行的所有相关数据
            console.log(obj.data.s_id); //所在行的所有相关数据
            var id = obj.data.s_id;
            $.post("update_name", {
                s_name: value, s_id: id
            },function (resout) {
                console.log(resout);
            })
        });



//         table.on('edit(s_name)', function (obj) {
//             console.log(obj.value);
// //得到修改后的值
//             console.log(obj.field);
// //当前编辑的字段名
//             console.log(obj.data); //所在行的所有相关数据
//             var data = obj.data;
//             var CommodityDetailID =
//                 data.CommodityDetailID;
//             var value = obj.value;
//             // $.post("/OtherAffiairs/Adjustment/Savesession", {
//             //     CommodityDetailID: CommodityDetailID, value: value
//             // }, function (msg) {
//             //     if (msg.State == true) {
//             //         Adjustment =
//             //             layuiTable.reload("Adjustment", {
//             //                 url:
//             //                     "/OtherAffiairs/Adjustment/SessionShop"
//             //             })
//             //     }
//             // })
//         })


        //查询
        form.on('submit(doSearch)', function (data) {
            // layer.msg(JSON.stringify(data.field));//表格数据序列化
            var formData = data.field;
            // console.log(formData);
            // console.log(formData.url);
            var name = formData.username,
                url = formData.url,

                icon = formData.icon,
                parent_id = formData.parent_id;
            //数据表格重载
            table.reload('tableReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                , where: {//这里传参  向后台
                    name: name
                    // ,
                    // url:url
                }
                , url: 'student_search'//后台做模糊搜索接口路径
                , method: 'post'
            });
            return false;//false：阻止表单跳转  true：表单跳转
        });


        //监听行工具事件
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            console.log(data.s_id);
            if (obj.event === 'del') {
                layer.confirm('真的删除么' + data.s_id, function (index) {
                    $.post("http://localhost:8079/ssm_02/student_delete", {id: data.s_id}
                        , function (result) {
                            layer.msg(result.msg);
                            obj.del();
                        }
                    );
                    // obj.del();
                    layer.close(index);
                });
            } else if (obj.event === 'edit') {
                // layer.prompt({
                //     formType: 2
                //     , value: data.email
                // }, function (value, index) {
                //     obj.update({
                //         email: value
                //     });
                //     layer.close(index);
                // });

                openUpdateUser(data);
            }
        });

        function openUpdateUser(data) {
            mainIndex = layer.open({
                type: 1,
                title: '修改用户',
                content: $("#updateDiv"),
                area: ['600px', '450px'],
                success: function (index) {
                    form.val("dataFrm2", data);
                    // url="/update";
                }
            });
        }

    });
</script>

</body>
</html>