    var btns=document.getElementsByClassName("nav-item");
    var b=document.getElementsByClassName("nav-link");
    var curlocation = location.href;
    
    for (var i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function() {
            var current = document.getElementsByClassName("active");
            current[0].className = current[0].className.replace(" active", "");
            this.className += " active";
        });
        btns[i].classList.remove("active");
        if(b[i].href == curlocation){
            btns[i].classList.add("active");
        }
    }
    var cur = document.getElementsByClassName("active");
    if(cur[0]==null)
    {
        btns[0].classList.add("active");
    }
