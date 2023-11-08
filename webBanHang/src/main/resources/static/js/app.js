var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]'))
var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
    return new bootstrap.Popover(popoverTriggerEl)
})
$(()=> {
    $('[data-bs-toggle="tooltip"]').tooltip();
})

function trans(element, rate) {
    var parent = element;
    while (!parent.classList.contains('container')) {
        parent = parent.parentElement;
    }
    var difference = window.pageYOffset - parent.offsetTop;
    if (difference > -500) {
        var velocity = difference * rate;
        element.style.transform = 'translate3d(0px, ' + velocity + 'px,0px)';
    }

};
window.addEventListener('scroll', function (e) {
    var scrolled = window.pageYOffset;
    try {
        var elements = document.querySelectorAll('.scroll-vertical-up-md');
        for (var i = 0; i < elements.length; i++) {
            trans(elements[i], -0.5);
        }

    } catch (error) {

    }

    try {
        var elements = document.querySelectorAll('.scroll-vertical-up-sm');
        for (var i = 0; i < elements.length; i++) {
            trans(elements[i], -0.3);
        }

    } catch (error) {

    }
    try {
        var elements = document.querySelectorAll('.scroll-vertical-up-lg');
        for (var i = 0; i < elements.length; i++) {
            trans(elements[i], -0.8);
        }

    } catch (error) {

    }
});
