let bar = document.getElementById("bar");
let nav = document.getElementById("navbar");
let close = document.getElementById("close");

if (bar) {
  bar.addEventListener("click", () => {
    nav.classList.add("active");
  });
}
if (close) {
  close.addEventListener("click", () => {
    nav.classList.remove("active");
  });
}

function login_btn() {
  document.location.href = "login.html";
}

function login_btn_login_page() {
  document.location.href = "index.html";
}

function register_btn_login_page() {
  document.location.href = "index.html";
}

bannerHome = document.querySelector(".banner-2");
bannerHome.addEventListener("click", () => {
  document.location.href = "products.html";
});

explore = document.querySelector("#explore");
explore.addEventListener("click", () => {
  document.location.href = "products.html";
});
