<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/nhan-vien/add" method="post" modelAttribute="nv">
    MA:<form:input path="id" value="${nv.ma}"/>
    <br/>
    HO:<form:input path="ho" value="${nv.ho}"/>
    <br/>
    TEN DEM:<form:input path="tenDem" value="${nv.tenDem}"/>
    <br/>
    TEN:<form:input path="ten" value="${nv.ten}"/>
    <br/>
    GIOI TINH:
    <form:radiobutton path="gioiTinh" value="true"/>Nam
    <form:radiobutton path="gioiTinh" value="false"/>Nữ
    <br/>
    MA CHUC VU:
    <form:select path="chucVu">
        <c:forEach items="${ dsChucVu }" var="cv">
            <option value="${ cv.ma}">${ cv.ten}</option>
        </c:forEach>
    </form:select>
    <br/>
    MA CUA HANG:
    <form:select path="cuaHang">
        <c:forEach items="${ dsCuaHang }" var="ch">
            <option value="${ ch.id }">${ ch.ten }</option>
        </c:forEach>
    </form:select>
    <br/>
    NAM SINH:<form:input path="ngaySinh"/>
    <br/>
    <form:button type="submit">ADD</form:button>
</form:form>
<table>
    <tr>
        <th>#</th>
        <th>MA</th>
        <th>HO VA TEN</th>
        <th>GIOI TINH</th>
        <th> CHUC VU</th>
        <th> CUA HANG</th>
        <th>NAM SINH</th>
        <th colspan="3">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="nv" varStatus="stt">
        <tr>
            <td>${stt.index+1}</td>
            <td>${nv.ma}</td>
            <td>${nv.ho} ${nv.tenDem} ${nv.ten} </td>
            <td>${nv.gioiTinh?"Nam":"Nữ"}</td>
            <td>${nv.cuaHang.ten}</td>
            <td>${nv.chucVu.ten}</td>
            <td>${nv.ngaySinh}</td>
            <td>
                <button><a href="/nhan-vien/view-update/${nv.ma}">UPDATE</a></button>
                <button><a href="/nhan-vien/delete/${nv.ma}">delete</a></button>
                <button><a href="/nhan-vien/detail/${nv.ma}">detail</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>