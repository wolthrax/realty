<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Map</title>
        <script src="http://api-maps.yandex.ru/2.1/?lang=ru_RU" type="text/javascript"></script>

        <script>
            var realtyMap;
            ymaps.ready(init);

            function init () {
                // Создание экземпляра карты и его привязка к контейнеру с
                // заданным id ("map").
                realtyMap = new ymaps.Map('map', {
                    // При инициализации карты обязательно нужно указать
                    // её центр и коэффициент масштабирования.
                    center: [53.9000000, 27.5666700],
                    zoom: 12,
                    controls: []
                });

                var searchControl = new ymaps.control.SearchControl({
                    options: {
                        provider: 'yandex#map'
                    }
                });

                realtyMap.controls.add("zoomControl", {
                    position: {top: 60, left: 15}
                });

                realtyMap.controls.add(searchControl);

                searchControl.events.add('resultselect', function(e) {
                    var index = e.get('index');
                    searchControl.getResult(index).then(function(res) {
                        console.info(res.geometry.getCoordinates()); // получаем координаты найденной точки
                    });
                });
                //
                // var html  = '<div class="popup">';
                // html +=     '<img src="http://blog.karmanov.ws/files/APIYaMaps1/min_image.png" alt="" />';
                // html +=     '<div class="popup-text">';
                // html +=         '<p>The Victoria Tower Gardens</p>';
                // html +=         '<p>Millbank</p>';
                // html +=         '<p>City of London </p>';
                // html +=         '<p>SW1P 3SF</p>';
                // html +=         '<p>United Kingdom</p>';
                // html +=         '<p>020 7641 5264</p>';
                // html +=     '</div>';
                // html += '</div>';
                //
                //
                //
                //
                // var myPlacemark1 = new ymaps.Placemark([53.9000000, 27.5666700],
                //     {
                //         balloonContent: html
                //     },
                //     { iconLayout: 'default#image',
                //         iconImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_marker.png',
                //         iconImageSize: [10, 16],
                //         iconImageOffset: [0, 0],
                //         balloonLayout: "default#imageWithContent",
                //         balloonContentSize: [289, 151],
                //         balloonImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_popup.png',
                //         balloonImageOffset: [0, 0],
                //         balloonImageSize: [289, 151],
                //         balloonShadow: true });
                //
                // var myPlacemark2 = new ymaps.Placemark([53.8000000, 27.4666700],
                //     {
                //         balloonContent: html
                //     },
                //     { iconLayout: 'default#image',
                //         iconImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_marker.png',
                //         iconImageSize: [10, 16],
                //         iconImageOffset: [0, 0],
                //         balloonLayout: "default#imageWithContent",
                //         balloonContentSize: [289, 151],
                //         balloonImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_popup.png',
                //         balloonImageOffset: [0, 0],
                //         balloonImageSize: [289, 151],
                //         balloonShadow: true });
                //
                // realtyMap.geoObjects.add(myPlacemark1);
                // realtyMap.geoObjects.add(myPlacemark2);
            }
        </script>

    </head>
    <body>
        <div class="map" id="map"></div>
    </body>
</html>
