// Show Back to Top Button

let topButton = document.getElementById("topBtn");

window.onscroll = function () {

    if (document.body.scrollTop > 300 || document.documentElement.scrollTop > 300) {

        topButton.style.display = "block";

    } else {

        topButton.style.display = "none";

    }

};

// Scroll to Top

function topFunction() {

    window.scrollTo({

        top:0,

        behavior:"smooth"

    });

}