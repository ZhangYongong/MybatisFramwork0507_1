<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="bootstrap-treeview.js"></script>
    <script type="text/javascript" src="bootstrap-treeview.js"></script>
    <link rel="stylesheet" type="text/css" href="bootstrap-treeview.css">
    <link rel="stylesheet" type="text/css" href="bootstrap-treeview.min.css">
    <script type="text/javascript">
        $(document).ready(function(){
            $("#treeTable").treetable({
                expandable : true,
                initialState:"expanded",
                //expandable : true
                clickableNodeNames:true,//点击节点名称也打开子节点.
                indent : 30//每个分支缩进的像素数。
            });
        });
    </script>
</head>
<body>
<div>
    <table id="treeTable" style="width:800px">
        <tr>
            <td>名字</td>
            <td>URL</td>
            <td>操作<td>
        </tr>
        <tr data-tt-id="a">
            <td>a</td>
            <td>a.jsp</td>
            <td><button>edit</button> <td>
        </tr>
        <tr data-tt-id="a1" data-tt-parent-id="a">
            <td>a1</td>
            <td>a1.jsp</td>
            <td><button>edit</button> <td>
        </tr>
        <tr data-tt-id="b">
            <td>b</td>
            <td>b.jsp</td>
            <td><button>edit</button> <td>
        </tr>
        <tr data-tt-id="b1" data-tt-parent-id="b">
            <td>b1</td>
            <td>b1.jsp</td>
            <td><button>edit</button> <td>
        </tr>
    </table>
</div>
</body>
</html>