"use strict";

// service worker registration - remove if you're not going to use it

if ("serviceWorker" in navigator) {
   window.addEventListener("load", function() {
      navigator.serviceWorker.register("serviceworker.js").then(
         function(registration) {
            // Registration was successful
            console.log("ServiceWorker registration successful with scope: ", registration.scope);
         },
         function(err) {
            // registration failed :(
            console.log("ServiceWorker registration failed: ", err);
         }
      );
   });
}

const a = 11;
const apiLink = "http://localhost:8080/eaton/device/1";
const cardHeader = document.querySelector(".card__title-js");
const card = document.querySelector(".card");

// console.log(apiLink.toString());

// const content = apiLink;

// cardHeader.innerHTML('tttt');

card.addEventListener('click', e => {
   // const tt = cardHeader.innerHTML;
   // console.log(tt);
   // if(tt !== "new") {
   //    cardHeader.innerHTML = "new";
   // } else {
   //    cardHeader.innerHTML = "old";
   // }

   let test = new XMLHttpRequest();
   test.open('GET', apiLink, true);

   test.onload = function() {
      console.log('in');
      let data = JSON.parse(this.response);
      cardHeader.innerHTML = data.name;
   };

   test.send();
});
