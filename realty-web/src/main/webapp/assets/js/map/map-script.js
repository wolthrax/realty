var myMap;

// Дождёмся загрузки API и готовности DOM.
ymaps.ready(init);

function init () {
    // Создание экземпляра карты и его привязка к контейнеру с
    // заданным id ("map").
    myMap = new ymaps.Map('map', {
        // При инициализации карты обязательно нужно указать
        // её центр и коэффициент масштабирования.
        center: [53.9000000, 27.5666700], // Нижний Новгород
        zoom: 12,
        controls: []
    });

    myMap.controls.add("zoomControl", {
        position: {top: 15, left: 15}
    });

    var html  = '<div class="popup">';
    html +=     '<img src="http://blog.karmanov.ws/files/APIYaMaps1/min_image.png" alt="" />';
    html +=     '<div class="popup-text">';
    html +=         '<p>The Victoria Tower Gardens</p>';
    html +=         '<p>Millbank</p>';
    html +=         '<p>City of London </p>';
    html +=         '<p>SW1P 3SF</p>';
    html +=         '<p>United Kingdom</p>';
    html +=         '<p>020 7641 5264</p>';
    html +=     '</div>';
    html += '</div>';

    var myPlacemark1 = new ymaps.Placemark([53.9000000, 27.5666700],
        {
            balloonContent: html
        },
        { iconLayout: 'default#image',
            iconImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_marker.png',
            iconImageSize: [10, 16],
            iconImageOffset: [0, 0],
            balloonLayout: "default#imageWithContent",
            balloonContentSize: [289, 151],
            balloonImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_popup.png',
            balloonImageOffset: [0, 0],
            balloonImageSize: [289, 151],
            balloonShadow: true });

    var myPlacemark2 = new ymaps.Placemark([53.8000000, 27.4666700],
        {
            balloonContent: html
        },
        { iconLayout: 'default#image',
            iconImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_marker.png',
            iconImageSize: [10, 16],
            iconImageOffset: [0, 0],
            balloonLayout: "default#imageWithContent",
            balloonContentSize: [289, 151],
            balloonImageHref: 'http://blog.karmanov.ws/files/APIYaMaps1/min_popup.png',
            balloonImageOffset: [0, 0],
            balloonImageSize: [289, 151],
            balloonShadow: true })

    myMap.geoObjects.add(myPlacemark1);
    myMap.geoObjects.add(myPlacemark2);
}