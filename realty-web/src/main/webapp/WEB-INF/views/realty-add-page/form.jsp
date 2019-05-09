<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>

        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/other/radio-button-style.css"/>">

    </head>
    <body>
        <div id="fields">
            <form>
                <table>
                    <tr>
                        <td></td>
                        <td>
                            <div class="toggle">
                                <input id="sale" type="radio" name="isSale" value="true" checked="checked" />
                                <label for="sale">Аренда</label>
                                <input id="rent" type="radio" name="isSale" value="false"/>
                                <label for="rent">Продажа</label>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <div class="toggle">
                                <c:forEach var = "houseType" items ="${houseTypeList}" varStatus= "loopIndex">
                                    <input id="houseType_id_${loopIndex.index}" type="radio" name="houseTypeId" value="${houseType.id}" checked="checked" />
                                    <label for="houseType_id_${loopIndex.index}">${houseType.value}</label>
                                </c:forEach>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>Материал стен</td>
                        <td>
                            <div class="toggle">
                                <c:forEach var = "wallMaterial" items ="${wallMaterialList}" varStatus= "loopIndex">
                                    <input id="wallMaterial_id_${loopIndex.index}" type="radio" name="wallMaterialId" value="${wallMaterial.id}" checked="checked" />
                                    <label for="wallMaterial_id_${loopIndex.index}">${wallMaterial.value}</label>
                                </c:forEach>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <div class="toggle">
                                <input id="repair" type="radio" name="repair" value="true" checked="checked" />
                                <label for="repair">C ремонтом</label>
                                <input id="not_repair" type="radio" name="repair" value="false"/>
                                <label for="not_repair">Без отделки</label>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>Выделенное<br>парковочное место</td>
                        <td>
                            <div class="toggle">
                                <c:forEach var = "parkingType" items ="${parkingTypeList}" varStatus= "loopIndex">
                                    <input id="parkingType_id_${loopIndex.index}" type="radio" name="parkingTypeId" value="${parkingType.id}" checked="checked" />
                                    <label for="parkingType_id_${loopIndex.index}">${parkingType.value}</label>
                                </c:forEach>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="floor">Этаж</label></td>
                        <td>
                            <input id="floor" type="text" name="floor" value="">
                        </td>
                    </tr>
                    <tr>
                        <td><label for="floorNumber">Этажей в доме</label></td>
                        <td>
                            <input id="floorNumber" type="text" name="floorNumber" value="">
                        </td>
                    </tr>
                    <tr>
                        <td>Кухня совмещена<br>с жилой</td>
                        <td>
                            <div class="toggle">
                                <input id="kitchen_with_hall" type="radio" name="kitchen_with_hall" value="true" checked="checked" />
                                <label for="kitchen_with_hall">Да</label>
                                <input id="not_kitchen_with_hall" type="radio" name="kitchen_with_hall" value="false"/>
                                <label for="not_kitchen_with_hall">Нет</label>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="area">Площадь</label></td>
                        <td>
                            <input id="area" type="text" name="area" value="">
                            <label for="living_area">Общая:</label>
                            <input id="living_area" type="text" name="livingArea" value="">
                            <label for="kitchen_area">Кухня:</label>
                            <input id="kitchen_area" type="text" name="kitchenArea" value="">м<sup>2</sup>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="сeiling_height">Высота постройки</label></td>
                        <td>
                            <input id="сeiling_height" type="text" name="floor" value="">м
                        </td>
                    </tr>
                    <tr>
                        <td><label for="year_construction">Год постройки</label></td>
                        <td>
                            <input id="year_construction" type="text" name="year" value="">
                        </td>
                    </tr>
                    <tr>
                        <td><label for="price">Цена</label></td>
                        <td>
                            <div class="toggle">
                                <c:forEach var = "currency" items ="${currencyList}" varStatus= "loopIndex">
                                    <input id="currency_id_${loopIndex.index}" type="radio" name="currencyId" value="${currency.id}" checked="checked" />
                                    <label for="currency_id_${loopIndex.index}">${currency.value}</label>
                                </c:forEach>
                            </div>
                            <input id="price" type="text" name="price" value="">
                        </td>
                    </tr>
                    <tr>
                        <td>Описание</td>
                        <td>
                            <textarea name="description" ></textarea>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
