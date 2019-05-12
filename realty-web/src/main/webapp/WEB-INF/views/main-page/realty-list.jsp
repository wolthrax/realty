<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <div class="realty-list">

            <c:forEach var = "realtyPreview" items ="${realtyPreviewList}" varStatus= "movieLoopIndex">
                <div class="card">
                    <div class="card-img">
                        <img src="data:image/jpg;base64, ${realtyPreview.previewImage}">
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
