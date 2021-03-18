<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍页面</title>
    <%--BootStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h1>书籍展示</h1>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bookName">书籍名称:</label>
            <input type="text" class="form-control" name="bookName" id="bookName" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量:</label>
            <input type="text" class="form-control" name="bookCounts" id="bookCounts"required>
        </div>
        <div class="form-group">
            <label for="detail">书籍详情:</label>
            <input type="text" class="form-control" name="detail" id="detail"required>
        </div>
        <div class="from-group">
            <input type="submit" class="form-control"  value="添加">
        </div>
    </form>

</div>

</body>
</html>
